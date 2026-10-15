import java.util.Scanner;

public class TestSoldier 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // מערך שמכיל 20 חיילים
        Soldier[] soldiers = new Soldier[20];

        double hight = 0;
        String name = "";

        // קליטת השם והגובה של כל אחד מ-20 החיילים
        for (int i = 0; i < 20; i++) 
        {
            System.out.println("Enter your name: ");
            name = input.nextLine();

            System.out.println("Enter your height: ");
            hight = input.nextDouble();

            // יצירת אובייקט Soldier ושמירתו במערך
            soldiers[i] = new Soldier(name, hight);

            // מעבר לשורה הבאה כדי למנוע בעיות בקליטת השם הבא
            input.nextLine();
        }

        // בדיקה מי נשאר הלילה
        whoStaysTonight(soldiers);
        
        input.close();
    }
    public static void whoStaysTonight(Soldier[] soldiers) 
    {
        // בדיקה אם החייל הראשון נמוך מהחייל שאחריו
        if (soldiers[0].gethight() < soldiers[1].gethight()) 
        {
            System.out.println(soldiers[0].getname() + " stays tonight");
        }
        // בדיקה אם החייל האחרון נמוך מהחייל שלפניו
        if (soldiers[soldiers.length - 1].gethight() < soldiers[soldiers.length - 2].gethight())
        {
            System.out.println(soldiers[soldiers.length - 1].getname()+ " stays tonight");
        }

        // בדיקה של החיילים שנמצאים באמצע המערך
        // מתחילים מ-1 כדי לא לחרוג מגבולות המערך
        for (int i = 1; i < soldiers.length - 1; i++) 
        {
            // בדיקה אם החייל נמוך משני החיילים שלידו
            if (soldiers[i].gethight() < soldiers[i + 1].gethight()&& soldiers[i].gethight() < soldiers[i - 1].gethight()) 
            {
                System.out.println(soldiers[i].getname() + " stays tonight");
            }
        }
    }
}