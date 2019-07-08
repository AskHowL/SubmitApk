package com.example.submitapk;

import android.os.Parcel;
import android.os.Parcelable;

public class Car implements Parcelable {
    private String Model, Desc, ArrayNum, Img;


    protected Car(Parcel in) {
        Model = in.readString();
        Desc = in.readString();
        ArrayNum = in.readString();
        Img = in.readString();
    }


    public static final Parcelable.Creator<Car> CREATOR = new Parcelable.Creator<Car>() {
        @Override
        public Car createFromParcel(Parcel source) {
            return new Car(source);
        }
        @Override
        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

    public Car() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Model);
        parcel.writeString(this.Desc);
        parcel.writeString(this.ArrayNum);
        parcel.writeString(this.Img);
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getArrayNum() {
        return ArrayNum;
    }

    public void setArrayNum(String color) {
        ArrayNum = color;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }


}
