package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(int storageCapacity, int discSpeed, String dataType, String name, String contents, String discType) {
        super(storageCapacity, discSpeed, dataType, name, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD spin speed: " + this.getDiscSpeed() + this.getDataType());
    }

    @Override
    public void storeData() {
        System.out.println("DVD data storage capacity: " + this.getStorageCapacity() + this.getDataType());
    }

    @Override
    public void laserBurned() {

    }

    @Override
    public void laserRead() {

    }

    @Override
    public void playSound() {
        System.out.println(this.getName() + " makes the sound 'Bzzz'");
    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
