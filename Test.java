
public class Test {
    public static void main(String[] args) {

        PencilCase case1 = new PencilCase("Blue");

        Pen pen1 = new Pen(5);
        Pen pen2 = new Pen(7);

        Pencil pencil1 = new Pencil(3);
        Pencil pencil2 = new Pencil(4);

        Eraser eraser1 = new Eraser(2);

        // בדיקת הוספת פריטים
        case1.addPen(pen1);
        case1.addPen(pen2);

        case1.addPencil(pencil1);
        case1.addPencil(pencil2);

        case1.addEraser(eraser1);

        // בדיקת toString
        System.out.println(case1);

        // בדיקת המחיר הכולל
        System.out.println("Total price: " + case1.getTotalPrice());

        // בדיקת צבע הקלמר
        System.out.println("Color: " + case1.getColor());
    }
}
