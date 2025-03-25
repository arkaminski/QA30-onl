package HomeWork.HW6.Task2;

public class RAM {
    private String name;
    private int size;
    public RAM(){
        name = "RAM1";
        size = 0;
    }
    public RAM(String name, int size){
        this.name = name;
        this.size = size;
    }
    public void allInfo(){
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
    }
}
