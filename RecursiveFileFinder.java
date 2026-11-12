import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveFileFinder {
    
    public static void findSourceFiles(File directory, List<File> results) {
        if (directory == null || !directory.exists() || !directory.isDirectory()) {
            return;
        }

        File[] items = directory.listFiles();

        
        if (items == null) {
            return;
        }

        for (File item : items) {
            if (item.isDirectory()) 
                findSourceFiles(item, results);
            } else if (item.isFile()) {
                String name = item.getName().toLowerCase();

                if (name.endsWith(".java") || name.endsWith(".cpp")) {
                    results.add(item);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the directory path to search: ");
        String path = input.nextLine().trim();

        File startingDirectory = new File(path);

        if (!startingDirectory.exists() || !startingDirectory.isDirectory()) {
            System.out.println("The directory does not exist or is not a directory.");
            input.close();
            return;
        }

        List<File> foundFiles = new ArrayList<>();
        findSourceFiles(startingDirectory, foundFiles);

        if (foundFiles.isEmpty()) {
            System.out.println("No .java or .cpp files were found.");
        } else {
            System.out.println("Files found:");
            for (File file : foundFiles) {
                System.out.println(file.getAbsolutePath());
            }
            System.out.println("Total files found: " + foundFiles.size());
        }

        input.close();
    }
}
