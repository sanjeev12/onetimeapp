package com.sabdakosh.san.onetimeapp;

/**
 * Created by DUDBC-GIS on 11/6/2017.
 */

public class List {

    private String ProjectName = "";
    private String Image = "";
    private String Url = "";
    private String Developer = "";
    private Boolean Like = null;

    /*********** Set Methods ******************/

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public void setDeveloper(String Developer) {
        this.Developer = Developer;
    }

    public void setLike(Boolean Like) {
        this.Like = Like;
    }

    /*********** Get Methods ****************/

    public String getProjectName() {
        return this.ProjectName;
    }

    public String getImage() {
        return this.Image;
    }

    public String getUrl() {
        return this.Url;
    }

    public String getDeveloper() {
        return this.Developer;
    }

    public boolean getLike() {
        return this.Like;
    }

}

