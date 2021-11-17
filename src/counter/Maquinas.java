package counter;

public class Maquinas {

    static String NSerie;
    static String Modelo;
    String Total;
    String Color;
    String ColorPrint;
    String Negro;
    String NegroPrint;

    Maquinas(String NSerie, String Modelo, String Total, String Color, String ColorPrint, String Negro, String NegroPrint) {

        Maquinas.NSerie = NSerie;
        Maquinas.Modelo = Modelo;
        this.Total = Total;
        this.Color = Color;
        this.ColorPrint = ColorPrint;
        this.Negro = Negro;
        this.NegroPrint = NegroPrint;
    }

   

    public static String getNSerie() {
        return NSerie;
    }

    public void setNSerie(String NSerie) {
        Maquinas.NSerie = NSerie;
    }

    public static String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        Maquinas.Modelo = Modelo;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getColorPrint() {
        return ColorPrint;
    }

    public void setColorPrint(String ColorPrint) {
        this.ColorPrint = ColorPrint;
    }

    public String getNegro() {
        return Negro;
    }

    public void setNegro(String Negro) {
        this.Negro = Negro;
    }

    public String getNegroPrint() {
        return NegroPrint;
    }

    public void setNegroPrint(String NegroPrint) {
        this.NegroPrint = NegroPrint;
    }

}
