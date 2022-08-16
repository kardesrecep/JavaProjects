package day34_Inheritance;

public class Toyota {
    protected String marka="Toyota";
    protected String model="Model belirtilmedi";
    protected String yakit="Yakit belirtilmedi";
    protected void motor(){
        System.out.println("Toyota cevreci motorlar kullanir");
    }
    protected void aku(){
        System.out.println("Toyota modele gore aku kullanir");

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }
}
