package maayan;

public class Food
{
    private int code;
    private String name;
    private String[] ingredients;
    private int ingredientCount;

    // פעולה בונה המקבלת קוד מנה ושם מנה ומאתחלת את אוסף המרכיבים להיות ריק
    public Food(int code, String name) 
    {
        this.code = code;
        this.name = name;
        this.ingredients = new String[15];
        this.ingredientCount = 0;
    }

    // פעולה בונה מעתיקה (Copy Constructor)
    public Food(Food other) 
    {
        this.code = other.code;
        this.name = other.name;
        this.ingredients = new String[15];
        this.ingredientCount = other.ingredientCount;
        for (int i = 0; i < other.ingredientCount; i++) 
        {
            this.ingredients[i] = other.ingredients[i];
        }
    }

    // פעולות get לכל התכונות
    public int getCode()
    {
        return this.code;
    }

    public String getName() 
    {
        return this.name;
    }

    public String[] getIngredients()
    {
        String[] currentIngredients = new String[this.ingredientCount];
        for (int i = 0; i < this.ingredientCount; i++) 
        {
            currentIngredients[i] = this.ingredients[i];
        }
        return currentIngredients;
    }

    public int getIngredientCount() 
    {
        return this.ingredientCount;
    }

    // פעולות set לקוד המנה ושם המנה
    public void setCode(int code)
    {
        this.code = code;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // פעולה המקבלת מרכיב ומוסיפה אותו למנה (עד 15 מרכיבים)
    public boolean addIngredient(String ingredient) 
    {
        if (this.ingredientCount < 15) 
        {
            this.ingredients[this.ingredientCount] = ingredient;
            this.ingredientCount++;
            return true;
        }
        return false;
    }

    // פעולה לתיאור העצם
    @Override
    public String toString()
    {
        String str = "קוד מנה: " + this.code + ", שם מנה: " + this.name + ", מרכיבים: ";
        if (this.ingredientCount == 0) 
        {
            str += "אין מרכיבים";
        } 
        else
        {
            for (int i = 0; i < this.ingredientCount; i++) 
            {
                str += this.ingredients[i] + (i < this.ingredientCount - 1 ? ", " : "");
            }
        }
        return str;
    }
}