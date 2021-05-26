package textFile;

public class File {
       private String fileName;
       private int size;
       private String fileExtension;
       private String content;

        File(String fileName, int size, String fileExtension, String content) {
            this.fileName = fileName;
            this.size = size;
            this.fileExtension = fileExtension;
            this.content = content;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFileName() {
            return fileName;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public void setFileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
        }

        public String getFileExtension() {
            return fileExtension;
        }

        public void setContent(String content) {
             this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void openFile() {
            System.out.println(content);
        }

        public void renameFile(String newFileName) {
            fileName = newFileName;
            System.out.println("Новое имя: " + fileName);
        }

        public void addContent(String additionalContent) {
            content += " " + additionalContent;
        }

}
