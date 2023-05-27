package Day60.ProjectIO;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.nio.file.attribute.FileTime;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the directory (For example C:\\Users\\yourComputerName\\Downloads)");
        String inputPath = scanner.nextLine();

        try { // encapsulate entire code in a try catch method
            Path dirPath = Paths.get(inputPath);
            if (!Files.isDirectory(dirPath)) {
                System.out.println("Invalid, not a directory path.");
                return;
            }

            boolean exit = false;

            while (!exit) {
                System.out.println("File Manager Menu:");
                System.out.println("1. Display directory contents"); // 1. Display the contents of a specified directory, including file names, file sizes, and last modified dates
                System.out.println("2. Copy file");                  // 2. Copy, move, and delete files within the specified directory
                System.out.println("3. Move file");                  // 2. Copy, move, and delete files within the specified directory
                System.out.println("4. Delete file");                // 2. Copy, move, and delete files within the specified directory
                System.out.println("5. Create directory");           // 3. Create and delete directories within the specified directory
                System.out.println("6. Delete directory");           // 3. Create and delete directories within the specified directory
                System.out.println("7. Search files by name or extension"); // 4. Search for files within the specified directory based on file name or extension
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();     // int choice = Integer.parseInt(input.nextLine()); //convert string to int
                scanner.nextLine();                 // int scanner requires you to consume a newline after


                switch (choice) {   // 5. Implement a user interface (CLI or GUI) to allow users to select options and display the results
                    case 1: // "1. Display directory contents"
                        displayDirectoryContents(dirPath);
                        break;
                    case 2: // 2. Copy file
                        String sourceFilePath = getInput(scanner, "Enter source file path: ");
                        String targetFilePath = getInput(scanner, "Enter destination file path: ");
                        copyFile(sourceFilePath, targetFilePath);
                        break;
                    case 3: // 3. Move file
                        String sourcePath = getInput(scanner, "Enter source file path: ");
                        String targetPath = getInput(scanner, "Enter destination file path: ");
                        moveFile(sourcePath, targetPath);
                        break;
                    case 4: // 4. Delete file
                        String filePathToDelete = getInput(scanner, "Enter file path to delete: ");
                        deleteFile(filePathToDelete);
                        break;
                    case 5: // 5. Create directory
                        String directoryPathToCreate = getInput(scanner, "Enter directory path to create: ");
                        createDirectory(directoryPathToCreate);
                        break;
                    case 6: // 6. Delete directory
                        String directoryPathToDelete = getInput(scanner, "Enter directory path to delete: ");
                        deleteDirectory(directoryPathToDelete);
                        break;
                    case 7: // 7. Search files by name or extension
                        String searchQuery = getInput(scanner, "Enter search query (case sensitive on purpose!): ");
                        searchFilesByName(dirPath, searchQuery);
                        break;
                    case 0: // 0. Exit
                        exit = true; // to leave the program
                        break;
                    default: // for when user enters anything outside 0-7
                        System.out.println("Invalid choice. Please try again.");
                }
            }

            System.out.println("Exiting File Manager. Goodbye!");
        } catch (InvalidPathException e) { //
            System.out.println("Invalid directory path: " + inputPath);
        } finally {
            scanner.close();
        }
    }

    private static String getInput(Scanner scanner, String prompt) { // getInput method created due to repeated lines
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static void displayDirectoryContents(Path directoryPath) {
        //Display the contents of a specified directory, including file names, file sizes, and last modified dates
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath)) {
            for (Path path : directoryStream) { // loop thru path
                BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class); // You can read the file's attributes using the Files.readAttributes() method, which returns an instance of BasicFileAttributes:
                String fileName = path.getFileName().toString(); // file names
                long fileSize = attributes.size();               // file sizes, // Get the size of the file in bytes
                FileTime creationTime = attributes.creationTime();  // Get the creation time of the file
                long creationTimeMillis = creationTime.toInstant().toEpochMilli(); // https://stackoverflow.com/questions/28304751/how-to-convert-filetime-to-string-with-dateformat
                String formattedCreationTime = creationTime.toString(); // convert it from bytes to legible format https://stackoverflow.com/questions/28304751/how-to-convert-filetime-to-string-with-dateformat
                System.out.println("File: " + fileName + " | Size: " + fileSize + " bytes | Last Modified: " + formattedCreationTime);
            }
        } catch (IOException e) {
            System.out.println("Error displaying the directory contents: " + e.getMessage());
        }
    }

    private static void copyFile(String sourceFilePath, String targetFilePath) {
        try {
            Path sourcePath = Paths.get(sourceFilePath);
            Path targetPath = Paths.get(targetFilePath);
            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying the file: " + e.getMessage());
        }
    } // Other throws are UnsupportedOperationException. FileAlreadyExistsException, DirectoryNotEmptyException, SecurityException, LinkPermission

    private static void moveFile(String sourceFilePath, String targetFilePath) {
        try {
            Path sourcePath = Paths.get(sourceFilePath);
            Path targetPath = Paths.get(targetFilePath);
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.out.println("Error moving the file: " + e.getMessage());
        }
    } // Other throws are UnsupportedOperationException, FileAlreadyExistsException, DirectoryNotEmptyException, AtomicMoveNotSupportedException, SecurityException


    private static void deleteFile(String filePath) {
        try {
            Path path = Paths.get(filePath);
            Files.delete(path);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting the file: " + e.getMessage());
        }
    } // Other throws are NoSuchFileException, DirectoryNotEmptyException, SecurityException

    private static void createDirectory(String directoryPath) {
        try {
            Path path = Paths.get(directoryPath);
            Files.createDirectory(path);
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating the directory: " + e.getMessage());
        }
    } // Other throws are UnsupportedOperationException, FileAlreadyExistsException, SecurityException

    private static void deleteDirectory(String directoryPath) {
        try {
            Path path = Paths.get(directoryPath);
            Files.delete(path);                                                  // The delete(Path) method deletes the file or throws an exception if the deletion fails.
            System.out.println("The Directory has been deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting the directory: " + e.getMessage());
        }
    } // method deletes the file or throws an exception if the deletion fails. For example, if the file does not exist a NoSuchFileException is thrown.

    private static void searchFilesByName(Path directoryPath, String searchQuery) { // actually... no need for a seperate method to find the extension because it searches the entire file name and extension instead of just file name.
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directoryPath)) {
            System.out.println("Search Results:");
            for (Path inside : stream) {
                String fileName = inside.getFileName().toString();
                if (fileName.contains(searchQuery)) { //no .lowercase method on purpose
                    System.out.println(inside);
                }
            }
        } catch (IOException e) {
            System.out.println("Error searching the files: " + e.getMessage());
        }
    }
}

// everything gets an IOException catch since documentation suggests IOException suffices.


// copyFile() method - https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#move-java.nio.file.Path-java.nio.file.Path-java.nio.file.CopyOption...-
// Copy a file to a target file
// By default, the copy fails if the target file already exists or is a symbolic link, except if the source and target are the same file, in which case the method completes without copying the file.
//      public static Path copy(Path source,
//                        Path target,
//                        CopyOption... options)
//      throws IOException
// Usage Example: Suppose we want to copy a file into a directory, giving it the same file name as the source file:
//
//     Path source = ...
//     Path newdir = ...
//     Files.copy(source, newdir.resolve(source.getFileName());




// movefile() method -F
// or https://mkyong.com/java/how-to-rename-file-in-java/
//        public static Path move(Path source,Path target,CopyOption... options)
//              throws IOException
//   Alternatively, suppose we want to move a file to new directory, keeping the same file name, and replacing any existing file of that name in the directory:
//        Path source = ...
//        Path newdir = ...
//        Files.move(source, newdir.resolve(source.getFileName()), REPLACE_EXISTING);
//   REPLACE EXISTING = If the target file exists, then the target file is replaced if it is not a non-empty directory. If the target file exists and is a symbolic link, then the symbolic link itself, not the target of the link, is replaced.
//   Parameters:
//        source - the path to the file to move
//        target - the path to the target file (may be associated with a different provider to the source path)
//        options - options specifying how the move should be done



// deleteFile() method - https://docs.oracle.com/javase/tutorial/essential/io/delete.html
// The delete(Path) method deletes the file or throws an exception if the deletion fails.
//        try {
//        Files.delete(path);
//        } catch


// createDirectory() method - https://docs.oracle.com/javase/tutorial/essential/io/dirs.html
//        Path dir = ...;
//        Files.createDirectory(path);



// deleteDirectory() method - https://docs.oracle.com/javase/tutorial/essential/io/delete.html
//The delete(Path) method deletes the file or throws an exception if the deletion fails. For example, if the file does not exist a NoSuchFileException is thrown. You can catch the exception to determine why the delete failed as follows:
//
//        try {
//        Files.delete(path);
//        } catch (NoSuchFileException x) {
//        System.err.format("%s: no such" + " file or directory%n", path);
//        } catch (DirectoryNotEmptyException x) {
//        System.err.format("%s not empty%n", path);
//        } catch (IOException x) {
//        // File permission problems are caught here.
//        System.err.println(x);
//        }





// DisplayDirectoryContents() methods - https://www.baeldung.com/java-list-directory-files
// A directory stream was created to work well with the for-each construct to iterate over a directory's content.
// Example
//        public Set<String> listFilesUsingDirectoryStream(String dir) throws IOException {
//            Set<String> fileSet = new HashSet<>();
//            try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir))) {
//                for (Path path : stream) {
//                    if (!Files.isDirectory(path)) {
//                        fileSet.add(path.getFileName()
//                                .toString());
//                    }
//                }
//            }
//            return fileSet;
//        }




// searchfiles() -
// static Stream<Path> - Return a Stream that is lazily populated with Path by searching for files in a file tree rooted at a given starting file.
// Looping process ->  for (Path inside : stream)
