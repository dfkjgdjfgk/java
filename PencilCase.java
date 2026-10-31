public class PencilCase 
{
    private String color;
    private Pen[] pens;
    private Pencil[] pencils;
    private Eraser[] erasers;

    private int numPens;
    private int numPencils;
    private int numErasers;

    // פעולה בונה
    public PencilCase(String color)
    {
        this.color = color;
        pens = new Pen[5];
        pencils = new Pencil[12];
        erasers = new Eraser[3];

        numPens = 0;
        numPencils = 0;
        numErasers = 0;
    }

    // הוספת עט
    public void addPen(Pen pen)
    {
        if (numPens < 5) 
        {
            pens[numPens] = pen;
            numPens++;
        }
    }

    // הוספת עיפרון
    public void addPencil(Pencil pencil) 
    {
        if (numPencils < 12)
        {
            pencils[numPencils] = pencil;
            numPencils++;
        }
    }

    // הוספת מחק
    public void addEraser(Eraser eraser)
    {
        if (numErasers < 3)
        {
            erasers[numErasers] = eraser;
            numErasers++;
        }
    }

    // תיאור הקלמר
    public String toString() 
    {
        return "Color: " + color +
               "\nPens: " + numPens +
               "\nPencils: " + numPencils +
               "\nErasers: " + numErasers;
    }

    // חישוב המחיר הכולל
    public double getTotalPrice() 
    {
        double sum = 0;

        for (int i = 0; i < numPens; i++)
        {
            sum += pens[i].getPrice();
        }

        for (int i = 0; i < numPencils; i++) 
        {
            sum += pencils[i].getPrice();
        }

        for (int i = 0; i < numErasers; i++) 
        {
            sum += erasers[i].getPrice();
        }

        return sum;
    }

    // החזרת צבע הקלמר
    public String getColor() 
    {
        return color;
    }
}