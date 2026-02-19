class AeroPlane{
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
class CargoPlane extends AeroPlane{
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
class FighterPlane extends AeroPlane{
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

public class Task1{
    public static void main(String[] args) {
       
    //  AeroPlane cp=new CargoPlane();
    CargoPlane cp=new CargoPlane();
    //  cp.takeOff();
    //  cp.landing();
    //  cp.fly();
    //  AeroPlane fp=new FighterPlane();
    FighterPlane fp=new FighterPlane();
    //  fp.takeOff();
    //  fp.landing();
    //  fp.fly();
    AeroPlane  aeroPlane;
    aeroPlane=cp;
    cp.fly();
    cp.takeOff();
    cp.landing();
    System.out.println("*********************");
    aeroPlane=fp;
    fp.landing();
    fp.fly();
    fp.takeOff();
        
    }
    
}
