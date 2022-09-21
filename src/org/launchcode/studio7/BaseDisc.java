package org.launchcode.studio7;

public abstract class BaseDisc {
    private int storageCapacity;
    private int discSpeed;
    private String dataType;
    private String name;
    private String contents;
    //or could do private ArrayList<String> contents = new ArrayList<>();
    private String discType;

    public BaseDisc(int storageCapacity, int discSpeed, String dataType, String name, String contents, String discType) {
        this.storageCapacity = storageCapacity;
        this.discSpeed = discSpeed;
        this.dataType = dataType;
        this.name = name;
        this.contents = contents;
        this.discType = discType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getDiscSpeed() {
        return discSpeed;
    }

    public void setDiscSpeed(int discSpeed) {
        this.discSpeed = discSpeed;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void reportInfo() {
        System.out.println("Disc type: " + this.discType +
        "\n" + "Disc Name: " + this.name +
        "\n" + "Disc Contents: " + this.contents);

        //or could do toString method
        //or could do:
        //public String getDiscInfo() {
        //return "Name: " + this.name etc.
    }




}
