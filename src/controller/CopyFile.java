package controller;

import common.Algorithms;
import common.Library;
import view.Menu;
import model.Entity;

public class CopyFile extends Menu<Entity> {
    static String[] mc = {"Count Word In File", "Find File By Word", "Exit"};

    protected Library library;
    protected Algorithms algorithm;
    protected Entity s;

    public CopyFile() {
        super("============ Word Program =========", mc);
        library = new Library();
        algorithm = new Algorithms();
        s = new Entity();
    }

    @Override
    public void execute(int n) {
        String path;
        String word;
        switch (n) {
            case 1:
                System.out.print("Enter Path: ");
                path = library.inputString();
                System.out.print("Enter Word: ");
                word = library.inputString();
                int count = algorithm.countWordInFile(path, word);
                System.out.println("Count: " + count);
                break;
            case 2:
                System.out.print("Enter Path: ");
                path = library.inputString();
                System.out.print("Enter Word: ");
                word = library.inputString();
                algorithm.getFileNameContainsWordInDirectory(path, word);
                break;
            case 3:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }

    
}
