class AeroPlane2{
    
    public void takeOff(){
        System.out.println("AeroPlane is ready to takeOff");
    }
    public void landing(){
        System.out.println("AeroPlane is ready to landing");
    }
    public void fly(){
        System.out.println("AeroPlane is flying");
    }


}
class CargoPlane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("CargoPlane is ready to takeOff and it's required to more space");
    }
    public void fly(){
        System.out.println("CargoPlane is flying");
    }
    public void landing(){
        System.out.println("CargoPlane is ready to landing");
    }

}
class FighterPlane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("FighterPlane is ready to takeOff and it's required to more space");
    }
    public void fly(){
        System.out.println("FighterPlane is flying");
    }
    public void landing(){
        System.out.println("FighterPlane is ready to landing");
    }

}
class PassengerPlane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("PassengerPlane is ready to takeOff and it's required to more space");
    }
    public void fly(){
        System.out.println("PassangerPlane is flying");
    }
    public void landing(){
        System.out.println("PassangerPlane is ready to landing");
    }

}
class Airport{
    public void permit(AeroPlane2 aeroPlane2){
        aeroPlane2.fly();
        aeroPlane2.landing();
        aeroPlane2.takeOff();
    }
}


public class Task2 {
    public static void main(String[] args) {
        CargoPlane2 cp=new CargoPlane2();
        FighterPlane2 fp=new FighterPlane2();
        PassengerPlane2 pp=new PassengerPlane2();


        Airport a=new Airport();
        a.permit(cp);
        a.permit(fp);
        a.permit(pp);
        
    }
    
}
