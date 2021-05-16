package ie.tudublin;

import processing.data.TableRow;

public class Star2 {
    private String displayName;
    private float xG;
    private float yG;

    


    public Star2(String displayName, float xG, float yG) {
        this.displayName = displayName;
        this.xG = xG;
        this.yG = yG;
    }


    public Star2(TableRow row) {
        this(
            row.getString("Display Name"),
            row.getFloat("Xg"),
            row.getFloat("Yg")
        );
    }


    public String getDisplayName() {
        return displayName;
    }


    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    

    public float getxG() {
        return xG;
    }


    public void setxG(float xG) {
        this.xG = xG;
    }


    public float getyG() {
        return yG;
    }


    public void setyG(float yG) {
        this.yG = yG;
    }


    @Override
    public String toString() {
        return "Star2 [displayName=" + displayName + ", xG=" + xG + ", yG=" + yG + "]";
    }

    


    
}
