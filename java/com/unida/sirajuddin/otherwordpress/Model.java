package com.unida.sirajuddin.otherwordpress;

import android.widget.ImageView;

public class Model {

    public static final int IMAGE_TYPE = 1 ;
    public String title,subtitle,Image;
    public int type;


    public Model(int mtype, String title, String subtitle, String image) {
        this.title = title;
        this.subtitle = subtitle;
        this.type = mtype;
        this.Image = image;
    }
}
