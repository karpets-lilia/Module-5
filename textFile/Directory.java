package textFile;

import java.util.ArrayList;

public class Directory {
    private String directoryName;
    private String directoryPath;
    public ArrayList<File> files ;

    Directory(String directoryName, String directoryPath) {
        this.files = new ArrayList<File>();
        this.directoryName = directoryName;
        this.directoryPath = directoryPath;
    }
    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }
    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public String getDirectoryPath() {
        return directoryPath;
    }

    public File createFile(String fileType, int size, String name, String content) {
        if (fileType == "docs") {
            File textFile = new TextFile(name, size, fileType, content);
            files.add(textFile);
            System.out.println("file " + name + " is saved");
            return textFile;
        } else if (fileType == "mp4") {
            File videoFile = new VideoFile(name, size, fileType, content);
            files.add(videoFile);
            System.out.println("file " + name + " is saved");
            return videoFile;
        } else if (fileType == "jpeg") {
            File imageFile = new ImageFile(name, size, fileType, content);
            files.add(imageFile);
            System.out.println("file " + name + " is saved");
            return imageFile;
        } else {
            return new File("different file type", 1, null,null);
        }
    }

    public void deleteFile(String fileName) {
        System.out.println("Size before: " + files.size());
        for(int i = 0; i < files.size(); i++) {
            if (fileName == files.get(i).getFileName()) {
                files.remove(files.get(i));
                System.out.println("File was deleted");
            } else {
                System.out.println("File is not found");
            }
        }
        System.out.println("Size after: " + files.size());
    }
}
