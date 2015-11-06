package dyly.bloomu.edu.gardenplannerapp;

import java.sql.Blob;

/**
 * Created by Dyly on 11/4/15.
 */
public class LayoutTableData {

    private int id;
    private Blob image;

    public LayoutTableData(){

        this.id = -1;
        this.image = null;
    }
    public LayoutTableData(int id, Blob image) {
        this.id = id;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

}
