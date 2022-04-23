package maps;

import java.util.HashMap;
import java.util.Map;

public class Depo {



public static Map<Integer, String> myMap(){//map icin method olusturduk ki diger classtan cagirabilelim

    //1.adim map kuruyoruz
    Map<Integer, String> urunList = new HashMap<>();
    //id, isim, uretici, miktar, birim, raf giriliyor.


    //2.adim urun ekliyoruz
    urunList.put(1000, "un, Hekimoglu, 0, cuval, null");
    urunList.put(1001, "seker, AydinSeker, 8, cuval, 5");
    urunList.put(1002, "tuz, BillurTuz, 15, cuval, null");
    urunList.put(1003, "nisasta, Istanbul, 7, cuval, 9");
    urunList.put(1004, "bugday, Anadolu, 12, cuval, 1");
    urunList.put(1005, "cavdar, Ankara, 19, cuval, 3");


    //diger classta kullanmak icin return ediyoruz.

    return urunList;

}

}
