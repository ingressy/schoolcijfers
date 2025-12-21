package obj;
/** object for a grade */
public class Note {
    /** name of a grade*/
    private String name;
    /** grade of a grade */
    private int notenpunkte;
    /** typ of grade */
    private String typ;
    /** subjet of grade */
    private Fach fach;
    /** school year of grade */
    private Schuljahr schuljahr;

    /**
     * Creates a new Grade object
     * @param name the name of the grade
     * @param notenpunkte the grade
     * @param typ the typ of the grade
     * @param fach the subject of the grade
     * @param schuljahr the school year of the grade
     */
    public Note(String name, int notenpunkte, String typ, Fach fach, Schuljahr schuljahr) {
        this.name = name;
        this.notenpunkte = notenpunkte;
        this.typ = typ;
        this.fach = fach;
        this.schuljahr = schuljahr;
    }

}
