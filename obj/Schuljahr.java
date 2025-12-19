package obj;
/**
* object for a school year
*/
public class Schuljahr {
    /** name of the class form the school year, like Q1 or nine (grade levels form the german school system)*/
    private final String name;
    /** the date of the school year, like 2025/2026 */
    private final String schuljahr;
    /** the name of the school, like Berufliches Gymnasium Technik */
    private final String schule;

    /**
     * Creates a new {@code Schuljahr}.
     * @param name the name of the school class form this year
     * @param schuljahr the date of the school year
     * @param schule the name of the school
     */
    public Schuljahr(String name, String schuljahr, String schule) {
        this.name = name;
        this.schuljahr = schuljahr;
        this.schule = schule;
    }

    /**
     *
     * @return a String of Data from the object
     */
    @Override
    public String toString() {
        return name +" "+ schuljahr +" "+ schule;
    }

    /**
     * @return the name form the school class form this year
     */
    public String getname() {
       return name;
    }

    /**
     * @return the date form the school year
     */
    public String getschuljahr() {
        return schuljahr;
    }

    /**
     * @return the name form the school
     */
    public String getschule() {
        return schule;
    }
}
