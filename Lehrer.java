package Models;

public class Lehrer extends mitarbeiter {

    private String _klasse;

    public String get_klasse() {

        return _klasse;
    }

    public void set_klasse(String _klasse) {

        this._klasse = _klasse;
    }

    public Lehrer( String _name, double _kennz, double _gehalt , String _klasse) {
        super(_name, _kennz, _gehalt);
        this._klasse = _klasse;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this._klasse;
    }
}
