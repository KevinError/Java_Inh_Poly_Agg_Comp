package composition;

import polymorphism.Ship;

import java.util.List;

public class Folder {
    private File[] subfiles;
    private Folder[] subfolders;
    private String nameFolder;

    public Folder(String nameFolder, Folder[] folders, File[] files){
        this.subfiles = files;
        this.subfolders = folders;
        this.nameFolder = nameFolder;
    }

    public Folder(String nameFolder, File[] files){
        this.subfiles = files;
        this.nameFolder = nameFolder;
        this.subfolders = null;
    }

    public Folder(String nameFolder, Folder[] folders){
        this.subfolders = folders;
        this.nameFolder = nameFolder;
        this.subfiles = null;
    }

    public Folder(String nameFolder){
        this.nameFolder = nameFolder;
        this.subfolders = null;
        this.subfiles = null;
    }
    public File[] getSubfiles() {
        return subfiles;
    }

    public void setSubfiles(File[] subfiles) {
        this.subfiles = subfiles;
    }

    public Folder[] getSubfolders() {
        return subfolders;
    }

    public void setSubfolders(Folder[] subfolders) {
        this.subfolders = subfolders;
    }

    public String getNameFolder() {
        return nameFolder;
    }

    public void setNameFolder(String nameFolder) {
        this.nameFolder = nameFolder;
    }

    @Override
    public String toString() {
        String files = "";
        String folders = "";
        if (subfiles != null){
            files += ", Files: ";
            for (File file: subfiles){
                files = files + " " + file.toString();
            }
        }
        if (subfolders != null) {
            folders += ", Sub Folders: ";
            for (Folder folder: subfolders){
                folders = folders + "Sub Folder of " + this.nameFolder + ": " + folder.toString();
            }
        }
        return "Name of folder: " + this.nameFolder +
                files + ", \n" + folders;
    }
}
