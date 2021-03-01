package ie.tudublin;

import processing.data.TableRow;

public class Star {




    public Star(TableRow row){
        //Constructor chaining
        this
        (
            row.getInt("Hab?") == 1 ? true : false,
            row.getString("Display Name"),
            row.getFloat("Distance"),
            row.getFloat("Xg"),
            row.getFloat("XYg"),
            row.getFloat("Zg"),
            row.getFloat("AbsMag")
        );
    }
    
}
