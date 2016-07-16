package th.co.hoyhiew.hoyhiewapplication;

/**
 * Created by raPhat on 7/16/16 AD.
 */
public class Food {
    private String name;
    private String description;
    private int kcal;

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", kcal=" + kcal +
                '}';
    }
}
