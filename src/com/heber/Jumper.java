package com.heber;

public class Jumper {
    private int level;
    private static int MAXLEVEL=4;
    private static int MINLEVEL=1;
    public Jumper() {
        level=MINLEVEL;
    }
    public Jumper(int level) {
        if (level>=MINLEVEL && level<=MAXLEVEL)
        this.level=level;
        else
            this.level=MINLEVEL;
    }
    public void setLevel(int level) {
        this.level=level;
    }
    public int doJump(){
        if (level<MAXLEVEL)
            setLevel(level+1);
        return this.level;

    }
    public int doFall(){
        if (level>MINLEVEL)
            setLevel(level-1);
        return this.level;
    }
    public int getLevel(){
        return this.level;
    }
}
