import java.util.Random;

public class TestMenu {

    // ג. פעולה ראשית הבודקת את הפעולות
    public static void main(String[] args) {
        System.out.println("--- בדיקת מחלקה Food ---");
        Food f1 = new Food(101, "סלט אבוקדו");
        f1.addIngredient("אבוקדו");
        f1.addIngredient("פלפל אדום");
        f1.addIngredient("בצל סגול");
        f1.addIngredient("מיץ לימון");
        System.out.println(f1);

        Food f2 = new Food(102, "צ'יפס");
        f2.addIngredient("תפוח אדמה");
        f2.addIngredient("שמן");
        f2.addIngredient("מלח");
        System.out.println(f2);

        System.out.println("\n--- בדיקת מחלקה Menu ---");
        Menu menu1 = new Menu("תפריט בוקר");
        menu1.addFood(f1);
        menu1.addFood(f2);
        System.out.println(menu1);

        // בדיקת הדפסת מנות ללא מרכיב מסוים (למשל, ללא "אבוקדו")
        menu1.printCodesWithoutIngredient("אבוקדו");

        System.out.println("\n--- בדיקת פעולות חיצוניות (סעיפים ד' ו-ה') ---");
        // ד. יצירת מערך של 10 תפריטים
        Menu[] globalMenus = createTenMenus();
        
        // ה. הדפסת המנות עם מספר המרכיבים המקסימלי
        printMaxIngredientsFoods(globalMenus);
    }

    // ד. פעולה חיצונית הבונה ומחזירה מערך של 10 תפריטים
    public static Menu[] createTenMenus() {
        Menu[] menus = new Menu[10];
        Random rand = new Random();

        for (int i = 0; i < menus.length; i++) {
            menus[i] = new Menu("תפריט מספר " + (i + 1));
            
            // נוסיף מספר אקראי של מנות לכל תפריט לצורך הבדיקה
            int numFoods = rand.nextInt(5) + 1; // בין 1 ל-5 מנות
            for (int j = 0; j < numFoods; j++) {
                int code = (i + 1) * 100 + j;
                Food f = new Food(code, "מנה אקראית " + code);
                
                // נוסיף מספר אקראי של מרכיבים
                int numIngs = rand.nextInt(6) + 1; // בין 1 ל-6 מרכיבים
                for (int k = 0; k < numIngs; k++) {
                    f.addIngredient("מרכיב" + k);
                }
                menus[i].addFood(f);
            }
        }
        return menus;
    }

    // ה. פעולה חיצונית המקבלת מערך תפריטים ומדפיסה את המנות בעלות מספר המרכיבים המקסימלי
    public static void printMaxIngredientsFoods(Menu[] menus) {
        if (menus == null || menus.length == 0) return;

        int maxIngredients = -1;

        // שלב ראשון: מציאת מספר המרכיבים המקסימלי הקיים בכל התפריטים
        for (Menu m : menus) {
            if (m != null) {
                for (Food f : m.getFoods()) {
                    if (f.getIngredientsCount() > maxIngredients) {
                        maxIngredients = f.getIngredientsCount();
                    }
                }
            }
        }

        System.out.println("\nהמנות בעלות מספר המרכיבים המקסימלי (" + maxIngredients + " מרכיבים):");
        
        // שלב שני: הדפסת כל המנות שעונות על הקריטריון המקסימלי
        for (Menu m : menus) {
            if (m != null) {
                for (Food f : m.getFoods()) {
                    if (f.getIngredientsCount() == maxIngredients) {
                        System.out.println("קוד: " + f.getCode() + ", שם המנה: " + f.getName() + " (נמצא ב: " + m.getMenuName() + ")");
                    }
                }
            }
        }
    }
}
