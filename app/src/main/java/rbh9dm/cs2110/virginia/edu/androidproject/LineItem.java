package rbh9dm.cs2110.virginia.edu.androidproject;

import android.widget.RelativeLayout;

/**
 * Created by Student User on 2/3/2016.
 */
public class LineItem  {
    private String name; // name of the list item
    private String description; // description of the item
    private boolean complete; // Did we do it yet?

    public LineItem(String name, String description, boolean complete) {
        this.name = name;
        this.description = description;
        this.complete = complete;
    }

    public LineItem(String name, String description, int i) {
        this.name = name;
        this.description = description;
        this.complete = (i != 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String longDescription) {
        this.description = longDescription;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

}
