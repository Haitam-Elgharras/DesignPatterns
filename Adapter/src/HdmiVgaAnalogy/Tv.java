package HdmiVgaAnalogy;

public class Tv implements Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("TV is displaying: " + new String(data));
    }
}
