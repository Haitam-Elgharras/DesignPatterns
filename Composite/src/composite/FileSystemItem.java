package composite;

public abstract class FileSystemItem {
    protected String name ;
    protected int level ;
    public FileSystemItem(String name){
        this.name=name;
    }
    public abstract void print();
}
