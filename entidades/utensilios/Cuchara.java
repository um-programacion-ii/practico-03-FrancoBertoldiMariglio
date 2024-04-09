package entidades.utensilios;

import entidades.utensilios.Utensilio;

public class Cuchara extends Utensilio {

    public Cuchara() {
        super(5);
    }

    public Cuchara(int vidaUtil) {
        super(vidaUtil);
    }

    @Override
    public void lavar() {
        this.setVidaUtil(5);
    }
}
