package Composition;

public class CompositeHouse {
    private Kitchen mykitchen;
    private Bedroom myBedroom;
    private Parlour myParlour;
    private Art baking;

    public CompositeHouse(Kitchen mykitchen, Bedroom myBedroom, Parlour myParlour, Art baking) {
        this.mykitchen = mykitchen;
        this.myBedroom = myBedroom;
        this.myParlour = myParlour;
        this.baking = baking;
    }



    public CompositeHouse(Kitchen mykitchen, Bedroom myBedroom, Parlour myParlour) {
//        this(mykitchen, myBedroom, myParlour, lightbake);
    }
}
