import composition.*;
public class CompositionMain {

    public static void main(String[] args){
        Folder app = new Folder("app",
                new Folder[] {
                        new Folder("config"),
                        new Folder("controllers"),
                        new Folder("library"),
                        new Folder("migrations"),
                        new Folder("models"),
                        new Folder("views")});

        Folder sourceFiles = new Folder("Source Files",
                new Folder[] {
                        new Folder(".phalcon"),
                        app,
                        new Folder("cache"),
                        new Folder("public"),
                },
                new File[] {
                        new File(".htaccess"),
                        new File(".htrouter.php"),
                        new File("index.html")
                });

        Folder php_demo1 = new Folder("php_demo1",
                new Folder[] {
                        sourceFiles,
                        new Folder("Include Path"),
                },
                new File[] {
                        new File("Remote Files")
                });

        System.out.println(php_demo1);
    }
}
