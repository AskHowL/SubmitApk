package com.example.submitapk;

import java.util.ArrayList;

public class CarData {
    public static String[][] data = new String[][]{
            {"0","Asus ROG Zephyrus S GX701", "Power and beauty", "https://img-us1.asus.com/A/show/AW000706/2019/0126/AM0000011/201901AM260000011_15490693802801770097894.jpg!t500x500"},
            {"1","MSI GS65 Stealth", "Thin. Beautiful. Powerful.", "https://images-na.ssl-images-amazon.com/images/I/61BHSPMo7FL._SL1000_.jpg"},
            {"2","Razer Blade","The sharpest Blade yet","https://images-na.ssl-images-amazon.com/images/I/61xwRm1JNcL._SX425_.jpg"},
            {"3","Lenovo Legion Y740","Style and muscle in one","https://www.pemmz.com/media/catalog/product/cache/5/thumbnail/1000x1000/040ec09b1e35df139433887a97daa66f/l/3/l3_5.jpg"},
            {"4","MSI GT75 Titan","The Big One","https://images-na.ssl-images-amazon.com/images/I/61a694IjlhL._SX425_.jpg"},
            {"5","Asus ROG G703GI","The behemoth","https://img-us1.asus.com/A/show/AW000706/2018/0406/AM0000001/201804AM060000001_15229524768442240068382.jpg!t500x500"}
    };

    public static ArrayList<Car> getListData(){
        Car Car = null;
        ArrayList<Car> list = new ArrayList<>();
        for (String[] aData : data) {
            Car = new Car();
            Car.setArrayNum(aData[0]);
            Car.setModel(aData[1]);
            Car.setDesc(aData[2]);
            Car.setImg(aData[3]);

            list.add(Car);
        }

        return list;
    }
}
