package composition;

import java.util.List;

public class Folder {
    private List<File> files;
    private List<Folder> folders;
    public Folder(List<File> files, List<Folder> folders){
        this.files = files;
        this.folders = folders;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    @Override
    public String toString() {
        return this.files.toString() + ", " + this.folders.toString();
    }
}
