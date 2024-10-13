package HdmiVgaAnalogy;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi; // The HDMI component to adapt

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message) {
        hdmi.view(message.getBytes());
    }
}