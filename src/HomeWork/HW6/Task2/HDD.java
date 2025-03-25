package HomeWork.HW6.Task2;

public class HDD {
    private String name;
    private int size;
    private String type;

    public HDD(){
        name = "HDD1";
        size = 0;
        type = "Internal";
    }
    public HDD(String name, int size, boolean isInternal){
        this.name = name;
        this.size = size;
        if(isInternal){
            this.type = "Internal";
        }else {
            this.type = "External";
        }
    }
    public void allInfo(){
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Type: " + size);
    }
}
