package textFile;
/*Создать обьект класса Текстовый файл, используя классы Файл, Директория. Методы:
создать, переименовать,вывести на консоль содержимое , дополнить, удалить.*/
public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Java", "dcc/ew");
        File newFile = directory.createFile("docs", 12,"doc","studies");
        System.out.println(newFile.getFileName());
        newFile.renameFile("work");
        System.out.println("Содержимое файла: " + newFile.getContent());
        String content1 = "lesson";
        newFile.addContent(content1);
        System.out.println("Дополненное:" + newFile.getContent());
        directory.deleteFile("work");
    }
}
