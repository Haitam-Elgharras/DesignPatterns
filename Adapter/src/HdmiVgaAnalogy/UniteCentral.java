package HdmiVgaAnalogy;

public class UniteCentral {
    private Vga vgaPort; // VGA port

    // Setter for the VGA port
    public void setVga(Vga vgaPort) {
        this.vgaPort = vgaPort;
    }

    public void print(String message) {
        if (vgaPort != null) {
            vgaPort.print(message); // Use the connected VGA implementation
        } else {
            System.out.println("No device connected to VGA port.");
        }
    }
}