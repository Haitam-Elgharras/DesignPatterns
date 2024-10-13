package HdmiVgaAnalogy;

public class VideoProjector implements Vga {
    @Override
    public void print(String message) {
        System.out.println("VideoProjector: " + message);
    }
}
