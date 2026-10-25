package maayan;

import java.util.Scanner;

public class TestCircle {

    // 6.1 פעולה חיצונית המקבלת מערך מעגלים ואובייקט Circle ומוסיפה אותו למקום הפנוי הראשון במערך
    public static boolean addCircle(Circle[] circleArr, Circle c) {
        for (int i = 0; i < circleArr.length; i++) {
            if (circleArr[i] == null) {
                circleArr[i] = c;
                return true; // ההוספה הצליחה
            }
        }
        return false; // המערך מלא
    }

    // 6.2 פעולה חיצונית הקולטת נתוני שתי נקודות (מרכז ונקודה על ההיקף), מחשבת את הרדיוס ומחזירה מעגל
    public static Circle readCircle() {
        Scanner in = new Scanner(System.in);

        System.out.println("הכנס שיעורי נקודת המרכז (x1, y1):");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.println("הכנס שיעורי נקודה על המעגל (x2, y2):");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        // חישוב הרדיוס לפי המרחק בין שתי הנקודות
        double radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        Point center = new Point(x1, y1);
        return new Circle(center, radius);
    }

    // 6.3 פעולה חיצונית המקבלת מערך מעגלים ומחזירה את המעגל בעל השטח הגדול ביותר
    public static Circle getMaxAreaCircle(Circle[] circleArr) {
        if (circleArr == null || circleArr.length == 0) {
            return null;
        }

        Circle maxCircle = null;
        double maxArea = -1;

        for (Circle c : circleArr) {
            if (c != null) {
                double currentArea = c.getArea();
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                    maxCircle = c;
                }
            }
        }

        return maxCircle;
    }

    // 6.4 פעולה ראשית המפעילה את הפעולות ומדפיסה תוצאות
    public static void main(String[] args) {
        // יצירת מערך מעגלים בגודל 5
        Circle[] circleArr = new Circle[5];

        // קליטת מעגל מהמשתמש והוספתו למערך
        System.out.println("--- קליטת מעגל ראשון ---");
        Circle c1 = readCircle();
        addCircle(circleArr, c1);

        // יצירת מעגלים נוספים לבדיקה והוספתם למערך
        Circle c2 = new Circle(new Point(0, 0), 3.0);
        Circle c3 = new Circle(new Point(1, 1), 7.5);

        addCircle(circleArr, c2);
        addCircle(circleArr, c3);

        // מציאת המעגל בעל השטח הגדול ביותר
        Circle maxCircle = getMaxAreaCircle(circleArr);

        // הדפסת התוצאות
        if (maxCircle != null) {
            System.out.println("\nהמעגל בעל השטח הגדול ביותר הוא:");
            System.out.println(maxCircle);
            System.out.println("שטח המעגל: " + maxCircle.getArea());
        } else {
            System.out.println("המערך ריק או שלא נמצאו מעגלים.");
        }
    }
}