import java.util.List;

public class Server {
    private String adressIP;
    private int ram;
    private int numCPU;
    private List<Hardrive> drives;

    public Server(String adressIP, int ram, int numCPU) {
        this.adressIP = adressIP;
        this.ram = ram;
        this.numCPU = numCPU;
        this.drives = new List<>();
    }
}
