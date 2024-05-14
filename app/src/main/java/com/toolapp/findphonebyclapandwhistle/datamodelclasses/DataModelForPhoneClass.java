package com.toolapp.findphonebyclapandwhistle.datamodelclasses;

public class DataModelForPhoneClass {
    private int backgroundCardColor;

    public DataModelForPhoneClass(int backgroundCardColor, int imageMask, int imageIconFinder, String txtViewIconName, String txtViewIconDesc) {
        this.backgroundCardColor = backgroundCardColor;
        this.imageMask = imageMask;
        this.imageIconFinder = imageIconFinder;
        this.txtViewIconName = txtViewIconName;
        this.txtViewIconDesc = txtViewIconDesc;
    }

    public int getBackgroundCardColor() {
        return backgroundCardColor;
    }

    public void setBackgroundCardColor(int backgroundCardColor) {
        this.backgroundCardColor = backgroundCardColor;
    }

    public int getImageMask() {
        return imageMask;
    }

    public void setImageMask(int imageMask) {
        this.imageMask = imageMask;
    }

    public int getImageIconFinder() {
        return imageIconFinder;
    }

    public void setImageIconFinder(int imageIconFinder) {
        this.imageIconFinder = imageIconFinder;
    }

    public String getTxtViewIconName() {
        return txtViewIconName;
    }

    public void setTxtViewIconName(String txtViewIconName) {
        this.txtViewIconName = txtViewIconName;
    }

    public String getTxtViewIconDesc() {
        return txtViewIconDesc;
    }

    public void setTxtViewIconDesc(String txtViewIconDesc) {
        this.txtViewIconDesc = txtViewIconDesc;
    }

    private int imageMask;
    private int imageIconFinder;
    private String txtViewIconName;
    private String txtViewIconDesc;
}
