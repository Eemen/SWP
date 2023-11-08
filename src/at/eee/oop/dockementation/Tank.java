package at.eee.oop.dockementation;

public class Tank {
    private int tankvolume;

    public Tank(int tankvolume) {
        this.tankvolume = tankvolume;
    }

    public int getTankvolume() {
        return tankvolume;
    }

    public void setTankvolume(int tankvolume) {
        if (tankvolume > 100) {
            this.tankvolume = 100;
        }else {
            this.tankvolume = tankvolume;
        }
    }
}

