package Sim6.Homework;

public class Notebook {
    private final String brand;
    private final String model;
    private final double price;
    private final double screenSize;
    private final int ram;
    private final int harddisk;
    private final String processor;
    private final String videocard;
    private final String OS_name;

    public Notebook(String brand, String model, double price, double screen_size,
                  int ram, int harddisk, String processor, String videocard, String OS_name) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screen_size;
        this.ram = ram;
        this.harddisk = harddisk;
        this.processor = processor;
        this.videocard = videocard;
        this.OS_name = OS_name;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getHarddisk() {
        return harddisk;
    }

    public String getProcessor() {
        return processor;
    }

    public String getVideocardCard() {
        return videocard;
    }

    public String getOS_name() {
        return OS_name;
    }
}
