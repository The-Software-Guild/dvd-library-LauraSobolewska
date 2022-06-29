package com.sg.DVDLibrary.dao;

import com.sg.DVDLibrary.dto.DVD;

import java.io.*;
import java.util.*;

public class DVDLibraryDaoFileImpl implements DVDLibraryDao {

    public static final String DVD_FILE = "dvds.txt";
    public static final String DELIMITER = ",";
    private Map<String, DVD> dvds = new HashMap<>();

    @Override
    public DVD addDVD(String DVDID, DVD dvd) throws DVDLibraryDaoException {

        loadDVDsFromFile();
        DVD newDVD = dvds.put(DVDID, dvd);
        writeDVDsToFile();

        return newDVD;
    }

    @Override
    public List<DVD> getAllDVDs() throws DVDLibraryDaoException {
        loadDVDsFromFile();
        return new ArrayList<DVD>(dvds.values());
    }

    @Override
    public DVD getDVD(String dvdId) throws DVDLibraryDaoException {
        loadDVDsFromFile();
        return dvds.get(dvdId);
    }

    @Override
    public DVD findDVD(String filmTitle) {

        List<DVD> filteredDVDs = new ArrayList<>();

        for (DVD dvd : dvds.values()) {
            filteredDVDs.add(dvd);
        }
        return (DVD) filteredDVDs;
    }

    @Override
    public DVD removeDVD(String DVDID) throws DVDLibraryDaoException {
        loadDVDsFromFile();
        DVD removedDVD = dvds.remove(DVDID);
        writeDVDsToFile();
        return removedDVD;
    }

    @Override
    public DVD editFilmTitle(String DVDID, String filmTitle) throws DVDLibraryDaoException {
        return null;
    }

    @Override
    public DVD editDVDTitle(String DVDID, String filmTitle) throws DVDLibraryDaoException {
        DVD newDVD = getDVD(DVDID);
        newDVD.setFilmTitle(filmTitle);
        dvds.put(DVDID, newDVD);
        return newDVD;
    }

    @Override
    public DVD editDVDReleaseDate(String DVDID, String releaseDate) throws DVDLibraryDaoException {
        DVD newDVD = getDVD(DVDID);
        newDVD.setFilmTitle(releaseDate);
        dvds.put(DVDID, newDVD);
        return newDVD;
    }

    @Override
    public DVD editDVDMPAARating(String DVDID, String MPAARating) throws DVDLibraryDaoException {
        DVD newDVD = getDVD(DVDID);
        newDVD.setFilmTitle(MPAARating);
        dvds.put(DVDID, newDVD);
        return newDVD;
    }

    @Override
    public DVD editDVDDirectorName(String DVDID, String directorName) throws DVDLibraryDaoException {
        DVD newDVD = getDVD(DVDID);
        newDVD.setFilmTitle(directorName);
        dvds.put(DVDID, newDVD);
        return newDVD;
    }

    @Override
    public DVD editDVDStudio(String DVDID, String studio) throws DVDLibraryDaoException {
        DVD newDVD = getDVD(DVDID);
        newDVD.setFilmTitle(studio);
        dvds.put(DVDID, newDVD);
        return newDVD;
    }

    @Override
    public DVD editDVDUserRating(String DVDID, String userRating) throws DVDLibraryDaoException {

        DVD newDVD = getDVD(DVDID);
        newDVD.setFilmTitle(userRating);
        dvds.put(DVDID, newDVD);
        return newDVD;
    }

    private String marshallDVD(DVD dvd) {
        String DVDAsText = dvd.getDVDID() + DELIMITER;
        DVDAsText += dvd.getFilmTitle() + DELIMITER;
        DVDAsText += dvd.getReleaseDate() + DELIMITER;
        DVDAsText += dvd.getMPAARating() + DELIMITER;
        DVDAsText += dvd.getDirectorName() + DELIMITER;
        DVDAsText += dvd.getStudio() + DELIMITER;
        DVDAsText += dvd.getUserRating() + DELIMITER;

        return DVDAsText;
    }

    private DVD unmarshallDVD(String dvdAsText) {
        String[] dvdTokens = dvdAsText.split(DELIMITER);

        String DVDID = dvdTokens[0];
        DVD dvdFromFile = new DVD(DVDID);

        dvdFromFile.setFilmTitle(dvdTokens[1]);
        dvdFromFile.setReleaseDate(dvdTokens[2]);
        dvdFromFile.setMPAARating(dvdTokens[3]);
        dvdFromFile.setDirectorName(dvdTokens[4]);
        dvdFromFile.setStudio(dvdTokens[5]);
        dvdFromFile.setUserRating(dvdTokens[6]);
        return dvdFromFile;
    }


    private void loadDVDsFromFile() throws DVDLibraryDaoException {
        Scanner scanner;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(DVD_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryDaoException("Could not load DVD data into memory", e);
        }

        String currentLine;
        DVD currentDVD;
        while (scanner.hasNext()) {
            currentLine = scanner.nextLine();
            currentDVD = unmarshallDVD(currentLine);
            dvds.put(currentDVD.getDVDID(), currentDVD);
        }
        scanner.close();
    }

    // Write to file
    //
    private void writeDVDsToFile() throws DVDLibraryDaoException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(DVD_FILE));

        } catch (IOException e) {
            throw new DVDLibraryDaoException("Could not write DVD data to file", e);
        }

        String dvdAsText;
        List<DVD> dvdList = this.getAllDVDs();

        for (DVD dvd : dvdList) {

            dvdAsText = marshallDVD(dvd);
            out.println(dvdAsText);
            out.flush();
        }

        out.close();
    }

}
