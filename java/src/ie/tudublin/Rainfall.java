package ie.tudublin;

import processing.data.TableRow;

public class Rainfall {
    private float year;
    private float values;

    public Rainfall(){

    }

    public Rainfall(TableRow row){
        
    }

    public float getYear() {
        return year;
    }

    public void setYear(float year) {
        this.year = year;
    }

    public float getValues() {
        return values;
    }

    public void setValues(float values) {
        this.values = values;
    }
}
