package ie.atu.productv4;

public class TV extends Product{

    private String ScreenSize,Manufacture;

    public TV() {
        super();
        ScreenSize = "";
        Manufacture = "";
        count++;
    }

    public void setManufacture(String Manufacture) {
        this.Manufacture = Manufacture;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setScreenSize(String ScreenSize) {
        this.ScreenSize = ScreenSize;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + Manufacture+"\n"+ScreenSize;
    }
}

