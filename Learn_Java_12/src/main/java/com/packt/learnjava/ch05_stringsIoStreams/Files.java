package com.packt.learnjava.ch05_stringsIoStreams;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Files {
    public static void main(String... args) throws Exception {

//        createFile1();
//        createFile2();
//        list1();
        
//        miMetodoCrearFile();
    }

    private static void createFile1() {
        File f = new File("NameOnly.txt");
        try {
            f.createNewFile();
            f.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createFile2() {
        String path = "demo1" + File.separator + "demo2" + File.separator;
        String fileName = "FileName.txt";
        File f = new File(path + fileName);
        //File f = new File(path, fileName);
        //File f = new File(new File(path), fileName);
        //URI uri = new File(path + fileName).toURI();
        //File f = new File(uri);
        try {
            new File(path).mkdirs();
            f.createNewFile();
            f.delete();
            path = StringUtils.substringBeforeLast(path, File.separator);
            while (new File(path).delete()) {
                path = StringUtils.substringBeforeLast(path, File.separator);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void list1() {
        String path1 = "demo1" + File.separator;
        String path2 = "demo2" + File.separator;
        String path = path1 + path2;
        File f1 = new File(path + "file1.txt");
        File f2 = new File(path + "file2.txt");
        File dir1 = new File(path1);
        File dir = new File(path);
        System.out.println("path: " + path);
        System.out.println("path1: " + path1);
        try {
            dir.mkdirs();
            f1.createNewFile();
            f2.createNewFile();

            System.out.print("\ndir1.list(): ");
            for(String d: dir1.list()){ //Returns names of the files and directories in the directory
                System.out.print(d + " ");
            }
            System.out.print("\ndir1.listFiles(): ");
            for(File f: dir1.listFiles()){ // Returns File objects that represent the files and directories in the directory
                System.out.print(f + " ");
            }
            System.out.print("\ndir.list(): ");
            for(String d: dir.list()){
                System.out.print(d + " ");
            }
            System.out.print("\ndir.listFiles(): ");
            for(File f: dir.listFiles()){
                System.out.print(f + " ");
            }
            System.out.print("\nFile.listRoots(): ");
            for(File f: File.listRoots()){ //Lists the available filesystem roots
                System.out.print(f + " ");
            }
            System.out.println();
            System.out.println();
            f1.delete();
            f2.delete();
            path = StringUtils.substringBeforeLast(path, File.separator);
            while (new File(path).delete()) {
                path = StringUtils.substringBeforeLast(path, File.separator);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void miMetodoCrearFile () throws IOException {
    	
    	Path currentWorkingDirectory = FileSystems.getDefault().getPath("").toAbsolutePath();
    	
    	String path = "src" +File.separator+"main"+File.separator+"java"+File.separator+"com" + File.separator + "packt" + File.separator + "learnjava" + File.separator + "ch05_stringsIoStreams" + File.separator;
    	
    	String nameFile = "MiArchivo.txt";
    	String pathname = path + nameFile;
    	System.out.println(  pathname );
    	File file = new File( pathname );
    	
    	//crea un archivo en la carpeta actual
    	if (!file.exists()) {
    		file.createNewFile();
    	}
    	
    	System.out.println("Creando nuevo directorio...");
    	String currentPath = "src" +File.separator+"main"+File.separator+"java"; 
    	String newPath = File.separator+"com" + File.separator + "edu" + File.separator + "prueba" + File.separator;
    	//crea el nuevo directorio
    	new File(currentPath + newPath).mkdirs();
    	
    	File file2 = new File( currentPath + newPath + "MiArchivo2.txt" );
    	if (!file2.exists()) {
    		file2.createNewFile();
    	}
    	
    	//borramos el archivo
    	file2.delete();
    	System.out.println("borramos el archivo");
    	
    	//borramos el directorio
    	while (newPath.length() > 0) {
    		newPath = StringUtils.substringBeforeLast(newPath, File.separator);
    		new File(currentPath + newPath).delete();
        }
    	System.out.println("borramos el directorio");
    
    }

}

