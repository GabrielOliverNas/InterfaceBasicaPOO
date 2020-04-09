package classes;

public class Usuario implements IControle {

    private int volume;
    private int pause;
    private int play;
    private boolean ligado;

    public Usuario() {
        this.setLigado(false);
        this.setVolume(0);
    }

    public void status() {
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Volume: " + this.getVolume());

    }

    public void ligar() {
        if (this.getLigado()) {
            System.out.println("Controle já está ligado meu consagrado");
        } else {
            this.setLigado(true);
        }
    }

    public void mudo() {
        if (this.getLigado()) {
            if (this.getVolume() <= 0) {
                System.out.println("Volume já esta baixo! impossivel mutar");
            } else {
                this.setVolume(0);
            }
        } else {
            System.out.println("Controle desligado, impossivel mutar");
        }
    }

    @Override
    public void aumentarVolume() {
        if (this.getLigado()) {
            if (this.getVolume() >= 100) {
                System.out.println("Volume no máximo");
            } else {
                this.setVolume(this.getVolume() + 5);
            }
        } else {
            System.out.println("Impossivel de aumentar o volume controle está desligado");
        }
    }

    @Override
    public void abaixarVolume() {
        if (this.getLigado()) {
            if (this.getVolume() <= 0) {
                System.out.println("Volume está em zero");
            } else {
                this.setVolume(this.getVolume() - 5);
            }
        } else {
            System.out.println("Impossivel abaixar volume controle está desligado");
        }
    }

    @Override
    public void pausar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPause() {
        return pause;
    }

    public void setPause(int pause) {
        this.pause = pause;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
