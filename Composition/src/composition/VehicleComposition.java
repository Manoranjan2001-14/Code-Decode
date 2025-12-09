package composition;

public class VehicleComposition {
    private Engine engine;

    public VehicleComposition(){
        this.engine = new Engine();
    }

    public void startVehicle(){
        engine.Start();
        System.out.println("Vehicle started");
    }

    public void stopVehicle(){
        engine.Stop();
        System.out.println("Stop Vehicle");
    }
}
