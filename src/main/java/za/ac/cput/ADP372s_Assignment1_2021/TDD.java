package za.ac.cput.ADP372s_Assignment1_2021;

/**
 * Student Name: Lefu Kumeke
 * Student Number: 218147856
 */

public class TDD {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TDD{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private String id,name;

}
