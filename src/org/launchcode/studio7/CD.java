package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(int storageCapacity, int discSpeed, String dataType, String name, String contents, String discType) {
        super(storageCapacity, discSpeed, dataType, name, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("CD disc spin rate: " + this.getDiscSpeed() + this.getDataType());
    }

    @Override
    public void storeData() {
        System.out.println("CD data storage capacity: " + this.getStorageCapacity() + this.getDataType());
    }

    @Override
    public void laserBurned() {

    }

    @Override
    public void laserRead() {

    }

    @Override
    public void playSound() {
        System.out.println(this.getName() + " makes the sound 'Hummm'");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
