package main.java.simple;

public class GiftBox {
    Sweet[] mSweets = new Sweet[0];
    private double totalWeight = 0;
    private double totalPrice = 0;
    private int unNum = 1;
    private Sweet[] weight;

    public void addSweet(Sweet sweet)
    {
        int oldItem = mSweets.length;
        Sweet[] newSweets = new Sweet[oldItem + 1];
        for (int i = 0; i < oldItem; i++)
        {
            newSweets[i]= mSweets[i];
            unNum ++;
        }
        newSweets[oldItem]=sweet;
        mSweets = newSweets;
            totalWeight += sweet.weight;
            totalPrice += sweet.price;
    }

    //public int delSweet(Sweet sweet, int s2, String nC)
    public int delSweet(Sweet sweet, int s2)
    {
        System.out.println("Вывод записи на удаление ");

        totalPrice = 0;
        totalWeight = 0;
        int s21 = 0;

        for(int i = 0; i < mSweets.length; i++) {
           if (i != (s2 - 1))
            {
                 s21++;
            }
        }
        System.out.println("Количество записей после удаления " + s21);

        Sweet[] strArray = new Sweet[s21];

        int j = 0;
        for(int i = 0; i < mSweets.length; i++) {
            if (i == s2 - 1)
            {}
                else
            {
                //totalWeight += sweet.weight;
                //totalPrice += sweet.price;
                strArray[j]= mSweets[i];
          //      strArray[j].description();

                j++;
            }
        }

        mSweets = strArray;

        totalWeight += sweet.weight;
        totalPrice += sweet.price;

      //  printItems();
        //return s2;
        return 1;
    }

    public void printItems()
    {
        for(int i = 0; i < mSweets.length; i++)
        {
            System.out.println(mSweets[i].description());

        }
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    //@Override
    public int getNumSweets() {
        return mSweets.length;
    }

    public int getUnNum() {
        return unNum;
    }
}