class Animal{
    public void eating(){
        System.out.println("Animal are eating food");
        
    }
    public void running(){
        System.out.println("Animal are running every day");
    }
}
class Tiger extends Animal{
    public void eating(){
        System.out.println("Tigers  are hunte to eating food");
        
    }
    public void running(){
        System.out.println("Tiger's are running to hunt food every day");
    }


}
class Monkey extends Animal{
    public void eating(){
        System.out.println("Monkey are eating vegeterain food");
        
    }
    public void running(){
        System.out.println("Monkey are running on trees every day");
    }

}
class Forest {
    public void permit(Animal animal){
        animal.eating();
        animal.running();
    }
}

public class Task3 {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        Monkey m=new Monkey();
        Forest f=new Forest();
        f.permit(t);
        f.permit(m);
    }
    
}
