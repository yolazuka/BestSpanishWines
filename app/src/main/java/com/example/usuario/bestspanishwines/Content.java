package com.example.usuario.bestspanishwines;

/**
 * Created by Usuario on 7/6/17.
 */

public class Content {

    /** Name of the Winery */
    private String mWineryName;

    /** Name of the Wine*/
    private String mWineName;

    /** Description of the Winery */
    private String mDescription;

    /** Geographical Area where the Winery is located */
    private String mArea;

    /** Address of the Winary */
    private String mLocation;

    /** Image resource ID for the Winery */
    private int mImageResourceId;

    /**
     * Create a new com.example.usuario.bestspanishwines.Content object.
     *
     * @param wineryName is the name of the Current Winery
     * @param wineName is the name of the specific Wine
     * @param description is the description of the Winery
     * @param area is the geographical Area where the Winery is located
     * @param location is the address of the Winery
     * @param imageResourceId is the image of each Winery
     */
    public Content(String wineryName, String wineName, String description, String area, String location, int imageResourceId) {
        mWineryName = wineryName;
        mWineName = wineName;
        mDescription = description;
        mArea = area;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the Winary Name
     */
    public String getWineryName() {
        return mWineryName;
    }

    /**
     * Get the Wine name
     */
    public String getWineName() {
        return mWineName;
    }

    /**
     * Get the description of the winery
     */
    public String getDescription() {return mDescription;}

    /**
     * Get the geographica area where the Winery is located
     */
    public String getArea() {return mArea;}

    /**
     * Get the address of the Winery
     */
    public String getLocation() {return mLocation;}

    /**
     * Return the image resource ID of the Winery.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}

