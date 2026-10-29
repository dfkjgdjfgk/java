import java.util.Arrays;

public class Food {
    private int code;
    private String name;
    private String[] ingredients;
    private int ingredientsCount;

    // פעולה בונה המקבלת קוד ושם ומאתחלת אוסף ריק
    public Food(int code, String name) {
        this.code = code;
        this.name = name;
        this.ingredients = new String[15]; // מקסימום 15 מרכיבים
        this.ingredientsCount = 0;
    }

    
    // פעולה בונה מעתיקה
    public Food(Food other) {
        this.code = other.code;
        this.name = other.name;
        this.ingredientsCount = other.ingredientsCount;
        this.ingredients = new String[15];
        for (int i = 0; i < other.ingredientsCount; i++) {
            this.ingredients[i] = other.ingredients[i];
        }
    }

    // פעולות get
    public int getCode() { return this.code; }
    public String getName() { return this.name; }
    public int getIngredientsCount() { return this.ingredientsCount; }
    
    // מחזירה העתק של מערך המרכיבים המלאים בלבד
    public String[] getIngredients() {
        return Arrays.copyOf(this.ingredients, this.ingredientsCount);
    }

    // פעולות set
    public void setCode(int code) { this.code = code; }
    public void setName(String name) { this.name = name; }

    // פעולה להוספת מרכיב למנה
    public boolean addIngredient(String ingredient) {
        if (this.ingredientsCount < 15) {
            this.ingredients[this.ingredientsCount] = ingredient;
            this.ingredientsCount++;
            return true;
        }
        return false; // המערך מלא
    }

    // פעולה לתיאור העצם
    @Override
    public String toString() {
        String ingList = "";
        for (int i = 0; i < ingredientsCount; i++) {
            ingList += ingredients[i] + (i < ingredientsCount - 1 ? ", " : "");
        }
        return "קוד: " + code + ", שם: " + name + " [מרכיבים: " + (ingList.isEmpty() ? "אין" : ingList) + "]";
    }
}
