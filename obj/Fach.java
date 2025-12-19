package obj;
/** object form a subject*/
public class Fach {
    /** name of the subject*/
    private final String name;
    /** name of the teacher*/
    private String lehrer;
    /** school year form the subject */
    private final Schuljahr schuljahr;
    /** weighting of oral and written grades */
    private final double gewichtung;
    /** average grade form this subject */
    private double durchschnitt;
    /** only half a year? */
    private boolean nureinHalbjahr;
    /** which half year? */
    private byte halbjahr;

    /**
     * Creates a new subject
     * @param name the name of the subject
     * @param lehrer the name of the teacher
     * @param schuljahr the schoolyear
     * @param gewichtung  the weighting of oral and written grades
     */
    public Fach(String name, String lehrer, Schuljahr schuljahr, double gewichtung) {
        this.name = name;
        this.lehrer = lehrer;
        this.schuljahr = schuljahr;
        this.gewichtung = gewichtung;
    }

    /**
     * Creates a new subject for only a half year
     * @param name the name of the subject
     * @param lehrer the name of the teacher
     * @param schuljahr the schoolyear
     * @param gewichtung the weighting of oral and written grades
     * @param nureinHalbjahr half year subject
     * @param halbjahr which half year
     */
    public Fach(String name, String lehrer, Schuljahr schuljahr, double gewichtung, boolean nureinHalbjahr, byte halbjahr) {
        this.name = name;
        this.lehrer = lehrer;
        this.schuljahr = schuljahr;
        this.gewichtung = gewichtung;
        this.nureinHalbjahr = nureinHalbjahr;
        this.halbjahr = halbjahr;
    }

    /**
     * @return a String of data from the object
     */
    @Override
    public String toString () {
        return name +" " + lehrer+" " +schuljahr+" " +gewichtung+" " +nureinHalbjahr+" " +halbjahr;
    }

    /**
     * @return the name of the subject
     */
    public String getNamefromsubject() {
        return name;
    }

    /**
     * @return the name of the teacher form this subject
     */
    public String getLehrer() {
        return lehrer;
    }

    /**
     * @return the school year form the subject
     */
    public Schuljahr getSchuljahrfromsubject() {
        return schuljahr;
    }

    /**
     * @return the weighting of oral and written grades
     */
    public  double getGewichtung() {
        return gewichtung;
    }

    /**
     * @return the average grade form this subject
     */
    public double getDurchschnitt() {
        return durchschnitt;
    }

    /**
     * @return true or false whether half year subject
     */
    public boolean getnureinhalbjahr() {
        return nureinHalbjahr;
    }

    /**
     * @return which half year
     */
    public  byte getHalbjahr() {
        return halbjahr;
    }
}
