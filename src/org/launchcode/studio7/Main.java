package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD myCd = new CD(1000, 200, "rpm", "My CD", "Jack Johnson songs", "CD");

        DVD myDvd = new DVD (2000, 570, "rpm", "My DVD", "Titanic film", "DVD");

        myCd.spinDisc();
        myCd.storeData();
        myCd.playSound();
        myCd.reportInfo();

        myDvd.spinDisc();
        myDvd.storeData();
        myDvd.playSound();
        myDvd.reportInfo();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
