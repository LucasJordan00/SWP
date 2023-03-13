package Models;

public abstract class mitarbeiter {

    private String _name;
    private double _kennz;
    private double _gehalt;

    public String get_name() {
        return this._name;
    }
    public void set_name(String name) {
        this._name = name;
    }

    public double get_kennzahl(){

        return this._kennz;
    }

    public mitarbeiter(String _name, double _kennz, double _gehalt) {
        this._kennz = _kennz;
        this._name = _name;
        this._gehalt = _gehalt;
    }

    public void set_kennzahl(double kennzahl) {
        this._kennz = kennzahl;
    }
    public double get_gehalt(){

        return this._gehalt;
    }
    public void set_gehalt(double gehalt){

        this._gehalt = gehalt;
    }


    @Override
    public String toString(){
        return this._gehalt + " " + this._name + " " +this._kennz;
    }
}
