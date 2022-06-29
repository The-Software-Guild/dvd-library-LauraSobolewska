package com.sg.DVDLibrary.dto;

public class DVD {
    private final String DVDID;
    private String filmTitle;
    private String releaseDate;
    private String directorName;
    private String MPAARating;
    private String studio;
    private String userRating;

    public DVD(String DVDID) {
        this.DVDID = DVDID;
    }

    public DVD(String DVDID,
               String filmTitle,
               String releaseDate,
               String MPAARating,
               String directorName,
               String studio,
               String userRating) {

        this.DVDID = DVDID;
        this.filmTitle = filmTitle;
        this.releaseDate = releaseDate;
        this.MPAARating = MPAARating;
        this.directorName = directorName;
        this.studio = studio;
        this.userRating = userRating;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public String getDVDID() {
        return DVDID;
    }

    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getUserRating(){
        return userRating;
    }
    public void setUserRating(String userRating){
        this.userRating = userRating;
    }
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(String MPAARating) {
        this.MPAARating = MPAARating;
    }
    public String getDirectorName() {
        return directorName;
    }
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

}
