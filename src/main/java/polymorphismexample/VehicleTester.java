package polymorphismexample;

public class VehicleTester {
    public static void main(String[] args){
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car();
        vehicles[1]=new Boat();
        vehicles[2]=new Plane();
        for(int i=0;i<3;i++){
            Vehicle vehicle=vehicles[i];
            vehicle.speed();
        }



    }

}
