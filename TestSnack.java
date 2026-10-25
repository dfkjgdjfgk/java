package maayan;

import java.util.Random;

public class TestSnack {

    // סעיף 2: ספירת חטיפים לפי דירוג בריאות
    // מחזיר מערך בגודל 6, כאשר אינדקסים 1-5 מייצגים את הדירוגים
    public static int[] countByRank(Snack[] S) {
        int[] counts = new int[6]; // אינדקס 0 נשאר ללא שימוש
        
        for (int i = 0; i < S.length; i++) {
            if (S[i] != null) {
                int r = S[i].getRank();
                if (r >= 1 && r <= 5) {
                    counts[r]++;
                }
            }
        }
        return counts;
    }

    // סעיף 3: ממוצע מחירים לחטיפים במשקל 15-20 גרם ובדירוג n
    public static double averagePrice(Snack[] S, int n) {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < S.length; i++) {
            if (S[i] != null) {
                if (S[i].getWeight() >= 15 && S[i].getWeight() <= 20 && S[i].getRank() == n) {
                    sum += S[i].getPrice();
                    count++;
                }
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }

    // סעיף 4: הדפסת שמות חטיפים שמחירם נמוך מ-price
    public static void printCheaperThan(Snack[] S, double price) {
        System.out.println("Snacks cheaper than " + price + "₪:");
        for (int i = 0; i < S.length; i++) {
            if (S[i] != null && S[i].getPrice() < price) {
                System.out.println("- " + S[i].getName());
            }
        }
    }

    // סעיף 5: הדפסת שמות חטיפים שמשקלם זהה למשקל של חטיף נוסף
    public static void printSameWeightSnacks(Snack[] S, Snack target) {
        if (target == null) return;
        System.out.println("Snacks with the same weight as " + target.getName() + " (" + target.getWeight() + "g):");
        for (int i = 0; i < S.length; i++) {
            if (S[i] != null && S[i].hasSameWeight(target)) {
                System.out.println("- " + S[i].getName());
            }
        }
    }

    // סעיף 6: פעולה ראשית והדגמה לכל הפעולות
    public static void main(String[] args) {
        Snack[] snacks = new Snack[200];
        Random rand = new Random();

        // אתחול המערך ב-200 חטיפים אקראיים להדגמה
        for (int i = 0; i < snacks.length; i++) {
            String name = "Snack_" + (i + 1);
            int weight = rand.nextInt(40) + 10; // משקל בין 10 ל-49 גרם
            double price = Math.round((rand.nextDouble() * 15 + 1) * 100.0) / 100.0; // מחיר בין 1 ל-16 ש"ח
            int rank = rand.nextInt(5) + 1; // דירוג 1-5

            snacks[i] = new Snack(name, weight, price, rank);
        }

        System.out.println("=== זימון פעולה מסעיף 2: ספירה לפי דירוגים ===");
        int[] rankCounts = countByRank(snacks);
        for (int r = 1; r <= 5; r++) {
            System.out.println("Rank " + r + ": " + rankCounts[r] + " snacks");
        }

        System.out.println("\n=== זימון פעולה מסעיף 3: ממוצע מחירים לחטיפים בדירוג 3 ובמשקל 15-20 גרם ===");
        double avg = averagePrice(snacks, 3);
        System.out.println("Average price for rank 3 (15-20g): " + avg + "₪");

        System.out.println("\n=== זימון פעולה מסעיף 4: חטיפים שמחירם נמוך מ-3.0 ש\"ח ===");
        printCheaperThan(snacks, 3.0);

        System.out.println("\n=== זימון פעולה מסעיף 5: חטיפים עם משקל זהה לחטיף לדוגמה ===");
        Snack sampleSnack = new Snack("SampleSnack", 18, 5.0, 3);
        printSameWeightSnacks(snacks, sampleSnack);
    }
}