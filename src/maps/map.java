package maps;

import java.util.*;

public class map {


    public static void main(String[] args) {

        /*
        assign ediyoruz ki mappi buraya aktarabilelim
         */

        Map<Integer, String> liste=Depo.myMap();//classin ismi ile cagir

        urunYazdirma(liste);

    }

    public static void urunYazdirma(Map<Integer, String> liste) {

        System.out.println("Urune dair bilgiler");
        System.out.println("=====================");

        //1.adim listedeki key degerlerine ulasmak
        Set<Integer> keySet=liste.keySet();
        System.out.println(keySet);//[1000, 1001, 1002, 1003, 1004, 1005]

        //2.adim listedeki value
        Collection<String> valueSet=liste.values();
        System.out.println(valueSet);

        //buraya kadar olusturduklarimizla hala index'e ulasamiyoruz. bu nedenle List lazim bize

        List<Integer> keyList=new ArrayList<>();
        keyList.addAll(keySet);
        System.out.println(keyList);//[1000, 1001, 1002, 1003, 1004, 1005]

        /*
        for (Integer each: keySet) {
           keyList.add(each);
        }
        System.out.println(keyList);//[1000, 1001, 1002, 1003, 1004, 1005]

         */

        List<String> valueList=new ArrayList<>();
        valueList.addAll(valueSet);

        //outer Array-keyler olusturacak bu nedenle int

        int outerArrayboyut=valueList.size();

        //inner Array-value String

        String ilkValue=valueList.get(0);
        System.out.println(ilkValue);//un, Hekimoglu, 0, cuval, null

        //ilkValue String oldugu icin onu array hale getirildik

        String ilkValueArray[]=ilkValue.split(", ");
        int innnerArrayBoyut=ilkValueArray.length;

        //MDA olusturacam

        String valueMDA[][]=new String [outerArrayboyut][innnerArrayBoyut];

        for (int i = 0; i < outerArrayboyut; i++) {
            String temp[]=valueList.get(i).split(", ");//listten gelen bilgileri array olarak buna atadik
            for (int j = 0; j < innnerArrayBoyut; j++) {
                valueMDA[i][j]=temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDA));

        System.out.println("Urunlere dair bilgiler");
        System.out.println("========================");

        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + " ");
            for (int j = 0; j < innnerArrayBoyut; j++) {
                System.out.print(valueMDA[i][j] + " ");

            }
            System.out.println("");
        }//outer



    }
}
