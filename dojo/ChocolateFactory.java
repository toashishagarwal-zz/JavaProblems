package dojo;

public class ChocolateFactory {
    public static int calculateChocolates(int amount, int pricePerUnit, int noOfWrappers) {
        int noOfChocolates = amount / pricePerUnit;
        int freeChocolates = 0;
        int moreChocolates = noOfChocolates;
        int i=0, j=0;
        if(moreChocolates >= noOfWrappers) {
            while(moreChocolates % noOfWrappers >= 0) {
                i = moreChocolates / noOfWrappers;
                j = moreChocolates % noOfWrappers;
                freeChocolates += i;
                if (i + j >= noOfWrappers) {
                    moreChocolates = i + j;
                } else {
                    break;
                }
            }  
        }
        return noOfChocolates + freeChocolates;
    }
}
