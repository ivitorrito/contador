package counter;

public class Maquinas {

    String NSerie;
    String Modelo;
    String Total;
    String Color;
    String ColorPrint;
    String Negro;
    String NegroPrint;

    Maquinas(String NSerie, String Modelo, String Total, String Color, String ColorPrint, String Negro, String NegroPrint) {

        this.NSerie = NSerie;
        this.Modelo = Modelo;
        this.Total = Total;
        this.Color = Color;
        this.ColorPrint = ColorPrint;
        this.Negro = Negro;
        this.NegroPrint = NegroPrint;
    }

    public String getNSerie() {
        return NSerie;
    }

    public void setNSerie(String NSerie) {
        this.NSerie = NSerie;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
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
