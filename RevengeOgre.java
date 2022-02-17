public class RevengeOgre extends BadOgre{ //vytvoril som novu class a v nej som "prepisal" povodnu funkciu revenge


    @Override
    void revenge(Knight knight) {
        if (mad){
             stab(knight);
        }
    }
    void stab(Knight knight){
        knight.energy -= 20;
    }
}
