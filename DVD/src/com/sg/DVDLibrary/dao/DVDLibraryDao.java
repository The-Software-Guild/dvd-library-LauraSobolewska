package com.sg.DVDLibrary.dao;

import com.sg.DVDLibrary.dto.DVD;

import java.util.List;

public interface DVDLibraryDao {

    DVD addDVD(String DVDID, DVD dvd)
            throws DVDLibraryDaoException;

    List<DVD> getAllDVDs()
            throws DVDLibraryDaoException;

    DVD getDVD(String DVDID)
            throws DVDLibraryDaoException;

    DVD findDVD(String DVDID)
        throws DVDLibraryDaoException;

    DVD removeDVD(String DVDID)
            throws DVDLibraryDaoException;

    DVD editFilmTitle(String DVDID, String filmTitle) throws DVDLibraryDaoException;

    DVD editDVDReleaseDate(String DVDID, String filmTitle) throws DVDLibraryDaoException;

    DVD editDVDMPAARating(String DVDID, String filmTitle) throws DVDLibraryDaoException;

    DVD editDVDDirectorName(String DVDID, String filmTitle) throws DVDLibraryDaoException;

    DVD editDVDStudio(String DVDID, String filmTitle) throws DVDLibraryDaoException;

    DVD editDVDUserRating(String DVDID, String filmTitle) throws DVDLibraryDaoException;

    DVD editDVDTitle(String dvdid, String newValue) throws DVDLibraryDaoException;
}