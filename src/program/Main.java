package program;

import exceptions.FileNotExistsException;
import util.FileFinder;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String path = "D:\\IntelliJ IDEA Community Edition 2019.2.1\\ComplexJava";
        String fileName = "ComplexJava.iml";
        boolean needChild = false;

        /*boolean needChild = false;
        String path = null;
        String fileName = null;
        if(args.length == 4){
            needChild = args[0].equals("-r");
            if(args[1].equals("-d"))
                path = args[2];
            fileName = args[3];
        }
        else if(args.length == 3){

        }
        else if(args.length == 1){

        }
        else {

        }*/

        try {
            FileFinder finder = new FileFinder();
            ArrayList<File> files = finder.searchFile(path, fileName, needChild);
            for (File file : files)
                System.out.println(file);
        } catch (FileNotExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}
