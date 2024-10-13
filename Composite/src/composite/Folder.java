package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem {
    private List<FileSystemItem> fileSystemItems = new ArrayList<>();
    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        String tab = "";
        for (int i =0 ; i<level;i++){
            tab=tab+"\t";

        }
        System.out.println(tab +"Folder : " + name);
        for (FileSystemItem c : fileSystemItems){
            c.print();
        }

    }
    public FileSystemItem add(FileSystemItem comp){
        comp.level=this.level +1;
        this.fileSystemItems.add(comp);
        return comp;
    }
}
