public class Diak {
    private String nev;
    private int jegy;
    private int elertPont;

    public Diak() {

    }

    public Diak(String nev, int elertPont) {
        this.nev = nev;
        this.elertPont = elertPont;
    }

    public Diak(String nev, int elertPont, int maxPont) {
        this.nev = nev;
        this.elertPont = elertPont;
        osztalyoz(maxPont);
    }

    public void kiir() {
        System.out.println(nev + " jegye: " + jegy + " (" + elertPont + " pont) - "
                +getErtekeles());
    }

    public void osztalyoz(int maxPont) {
        double szazalek = elertPont / (double) maxPont * 100;
        jegy = 5;
        if (szazalek<20) {
            jegy = 1;
        } else  if (szazalek<40) {
            jegy = 2;
        } else if (szazalek<60) {
            jegy = 3;
        } else  if (szazalek<80) {
            jegy = 4;
        }
    }

    public String getErtekeles() {
        switch (jegy) {
            case 1:
                return "elégtelen";
            case 2:
                return "elégséges";
            case 3:
                return "közepes";
            case 4:
                return "jó";
            case 5:
                return "jeles";
        }
        return "Hibás jegy!";
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getJegy() {
        return jegy;
    }

    public int getElertPont() {
        return elertPont;
    }

    public void setElertPont(int elertPont) {
        this.elertPont = elertPont;
    }
}
