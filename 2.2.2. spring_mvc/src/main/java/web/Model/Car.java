package web.Model;

public class Car {
    private String brand;
    private String model;
    private Integer series;

    public Car (){}

    public Car(String brand, String model, Integer series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }

    public String getBrand(){return brand;}
    public String getModel(){return model;}
    public Integer getSeries(){return series;}

    public void setBrand(String brand){this.brand = brand;}
    public void setModel(String model){this.model = model;}
    public void setSeries(Integer series){this.series = series;}
}
