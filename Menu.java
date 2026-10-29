import java.util.Arrays;

public class Menu {
    private String menuName;
    private Food[] foods;
    private int foodsCount;

    // פעולה בונה המקבלת שם תפריט ומאתחלת מערך מנות ריק
    public Menu(String menuName) {
        this.menuName = menuName;
        this.foods = new Food[22]; // מקסימום 22 מנות
        this.foodsCount = 0;
    }

    // פעולה להוספת מנה לתפריט
    public boolean addFood(Food food) {
        if (this.foodsCount < 22) {
            this.foods[this.foodsCount] = new Food(food); // שימוש בבנאי מעתיק לשמירה על אנקפסולציה
            this.foodsCount++;
            return true;
        }
        return false;
    }

    // פעולות get/set לשם התפריט
    public String getMenuName() { return this.menuName; }
    public void setMenuName(String menuName) { this.menuName = menuName; }

    // פעולת get לאוסף המנות (מחזירה העתק של המנות הנוכחיות)
    public Food[] getFoods() {
        return Arrays.copyOf(this.foods, this.foodsCount);
    }

    public int getFoodsCount() { return this.foodsCount; }

    // פעולה לתיאור העצם
    @Override
    public String toString() {
        String result = "תפריט: " + menuName + "\nמנות בתפריט:\n";
        if (foodsCount == 0) result += "אין מנות בתפריט זה.";
        for (int i = 0; i < foodsCount; i++) {
            result += "- " + foods[i].toString() + "\n";
        }
        return result;
    }

    // פעולה המדפיסה קודי מנות שאינן מכילות את המרכיב החסר f
    public void printCodesWithoutIngredient(String f) {
        System.out.println("מנות ללא המרכיב '" + f + "':");
        for (int i = 0; i < foodsCount; i++) {
            boolean containsIngredient = false;
            String[] currentIngredients = foods[i].getIngredients();
            
            for (String ing : currentIngredients) {
                if (ing.equals(f)) {
                    containsIngredient = true;
                    break;
                }
            }
            
            if (!containsIngredient) {
                System.out.println("קוד מנה: " + foods[i].getCode());
            }
        }
    }
}
