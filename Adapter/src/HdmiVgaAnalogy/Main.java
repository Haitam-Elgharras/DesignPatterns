package HdmiVgaAnalogy;

public class Main {
    public static void main(String[] args) {
        // Create a UniteCentral object
        UniteCentral uniteCentral = new UniteCentral();

        // Standard implementation with VideoProjector
        System.out.println("Using Video Projector:");
        VideoProjector videoProjector = new VideoProjector();
        uniteCentral.setVga(videoProjector);
        uniteCentral.print("Hello, In the Video Projector!"); // This will show the message on Video Projector Because it's connected to VGA port right now

        // Now using the HDMI adapter to connect UniteCentral with TV
        System.out.println("\nUsing HDMI to VGA Adapter:");
        Tv tv = new Tv();

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(tv); // Set the HDMI component as TV

        // Set the adapter as the VGA port
        uniteCentral.setVga(hdmiVgaAdapter);
        uniteCentral.print("Hello, TV!"); // This will show the message on TV
    }
}