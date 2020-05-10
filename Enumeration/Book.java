public enum Book{
    // declare constants of enum type
    JHTP("Java how to program", "2012"),
    CHTP("C how to program", "2007"),
    CPPHTP("C++ how to program", "2017"),
    VBHTP("Visual Basic how to program", "2000"),
    CSHARPHTP("C# how to program", "2018");
    // instant fields
    private final String title;
    private final String copyrightYear;

    // enum constructor
    Book(String bookTitle, String year){
        title = bookTitle;
        copyrightYear = year;
    }

    // accessor for field copyrightYear
    public String getCopyrightYear(){
        return copyrightYear;
    }

    // accessor for field title
    public String getTitle(){
        return title;
    }
}
