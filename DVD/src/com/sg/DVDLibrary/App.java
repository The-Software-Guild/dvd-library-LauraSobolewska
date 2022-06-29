package com.sg.DVDLibrary;

import com.sg.DVDLibrary.controller.DVDLibraryController;
import com.sg.DVDLibrary.dao.DVDLibraryDaoFileImpl;
import com.sg.DVDLibrary.dao.DVDLibraryDao;
import com.sg.DVDLibrary.ui.DVDLibraryView;
import com.sg.DVDLibrary.ui.UserIO;
import com.sg.DVDLibrary.ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) {
        //UserIO myIo = new UserIOConsoleImpl();
        //DVDLibraryView myView = new DVDLibraryView(myIo);
        //DVDLibraryDao myDao = new DVDLibraryDaoFileImpl();
        DVDLibraryController controller = new DVDLibraryController();
        controller.run();
    }
}