package dto;
public class DVD {
        private final String DVDID;
        public String filmTitle;
        public String releaseDate;
        public String MPAARating;
        public String filmDirector;
        public String studio;
        public String rating;

        public String getFilmTitle() {
            return this.filmTitle;
        }

        public void setFilmTitle(String title) {
            this.filmTitle = title;
        }

        public String getReleaseDate() {
            return this.releaseDate;
        }

        public static void setReleaseDate(String date) {
            this.releaseDate = date;
        }

        public String getMPAARating() {
            return this.MPAARating;
        }

        public static void setMPAARating(String MPAA) {
            this.MPAARating = MPAA;
        }

        public String getFilmDirector() {
            return this.filmDirector;
        }

        public static void setFilmDirector(String director) {
            this.filmDirector = director;
        }

        public String getStudio() {
            return this.studio;
        }

        public static void setStudio(String filmStudio) {
            this.studio = filmStudio;
        }

        public String getRating() {
            return this.rating;
        }

        public static void setRating(String filmRating) {
            this.rating = filmRating;
        }
    }
    DVD dvd = new DVD();
    ArrayList<DVD> DVDs = new ArrayList<>();

    public static void userInteraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add a DVD to the collection? Type Y or N");
        String stringAdd = scanner.nextLine();
        if (stringAdd.equals("Y")) {
            System.out.println("Enter the title of the DVD you'd like to add:");
            String stringFilmTitle = scanner.nextLine();
            System.out.println("Enter the release date of the film:");
            String stringReleaseDate = scanner.nextLine();
            System.out.println("Enter the MPAA rating of the film:");
            String stringMPAARating = scanner.nextLine();
            System.out.println("Enter the film director's name:");
            String stringFilmDirector = scanner.nextLine();
            System.out.println("Enter the name of the studio:");
            String stringStudio = scanner.nextLine();
            System.out.println("Enter the rating or review:");
            String stringRating = scanner.nextLine();
            DVD newDVD = new DVD();
            newDVD.setFilmTitle(stringFilmTitle);
            newDVD.setReleaseDate(stringReleaseDate);
            newDVD.setMPAARating(stringMPAARating);
            newDVD.setFilmDirector(stringFilmDirector);
            newDVD.setStudio(stringStudio);
            newDVD.setRating(stringRating);
            DVDs.add(newDVD);
        }
        System.out.println("Would you like to remove a DVD from the collection? Enter Y or N.");
        String stringRemove = scanner.nextLine();
        if (stringRemove.equals("Y")) {
            System.out.println("Enter the title of the DVD you'd like to remove.");
            String removeTitle = scanner.nextLine();
            if (DVDs.contains(removeTitle)) {
                DVDs.remove(removeTitle);
                System.out.println("DVD successfully removed from collection.");
            }
        }
        System.out.println("Would you like to edit the information for an existing DVD? Enter Y or N.");
        String stringEdit = scanner.nextLine();
        if (stringEdit.equals("Y")) {
            System.out.println("Enter the title of the DVD you'd like to edit:");
            String editTitle = scanner.nextLine();
            if (DVDs.contains(editTitle)) {
                System.out.println("Enter the release date of the film:");
                String newReleaseDate = scanner.nextLine();
                DVD.setReleaseDate(newReleaseDate);
                System.out.println("Enter the MPAA rating of the film:");
                String newMPAARating = scanner.nextLine();
                DVD.setMPAARating(newMPAARating);
                System.out.println("Enter the director of the film:");
                String newDirector = scanner.nextLine();
                DVD.setFilmDirector(newDirector);
                System.out.println("Enter the studio of the film:");
                String newStudio = scanner.nextLine();
                DVD.setStudio(newStudio);
                System.out.println("Enter the rating for the film:");
                String newRating = scanner.nextLine();
                DVD.setRating(newRating);
            } else {
                System.out.println("Sorry, that DVD isn't in the collection.");
            }
            System.out.println("Would you like to see the list of DVDs in the collection? Enter Y or N");
            String viewList = scanner.nextLine();
            if (viewList.equals("Y")) {
                for (DVD DVD : DVDs) {
                    System.out.println(DVD.getFilmTitle());
                }
            }
            System.out.println("Would you like to see the information for a DVD? Enter Y or N.");
            String viewInfo = scanner.nextLine();
            if (viewInfo.equals("Y")) {
                System.out.println("Enter the title of the DVD:");
                String infoTitle = scanner.nextLine();
                for (DVD DVD : DVDs) {
                    if (DVDs.contains(infoTitle)) {
                        System.out.println(DVD.getFilmTitle());//, DVD.filmDirector, DVD.MPAARating, DVD.studio, DVD.rating, DVD.releaseDate);                 }
                    }
                }

            }
        }
    }
        public static void main (String[]args){
            // write your code here
            userInteraction();
        }

}


