// Location.java
// author: GuanYu Huang
// This is for Project Silence Space Locator.
// This Project belongs to Group 18, CS440 Fall 2023.
//
// Description:
// This file defines a structure called "Location", representing a geographical location.
// This class provides methods to set and retrieve attributes, and a 'toString()' method.


package com.example.silentspaceslocator;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Location implements Parcelable {
    private String _name;
    private double _latitude;
    private double _longitude;
    private String _address;
    private String _city;
    private String _state;
    private String _country;
    private String _postalCode;

    // Constructors
    public Location() {
    }

    public Location(String name, double latitude, double longitude, String address, String city, String state, String country, String postalCode) {
        this._name = name;
        this._latitude = latitude;
        this._longitude = longitude;
        this._address = address;
        this._city = city;
        this._state = state;
        this._country = country;
        this._postalCode = postalCode;
    }

    protected Location(Parcel in) {
        _name = in.readString();
        _latitude = in.readDouble();
        _longitude = in.readDouble();
        _address = in.readString();
        _city = in.readString();
        _state = in.readString();
        _country = in.readString();
        _postalCode = in.readString();
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

    // Getters and Setters
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public double getLatitude() {
        return _latitude;
    }

    public void setLatitude(double latitude) {
        this._latitude = latitude;
    }

    public double getLongitude() {
        return _longitude;
    }

    public void setLongitude(double longitude) {
        this._longitude = longitude;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        this._address = address;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        this._city = city;
    }

    public String getState() {
        return _state;
    }

    public void setState(String state) {
        this._state = state;
    }

    public String getCountry() {
        return _country;
    }

    public void setCountry(String country) {
        this._country = country;
    }

    public String getPostalCode() {
        return _postalCode;
    }

    public void setPostalCode(String postalCode) {
        this._postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + _name + '\'' +
                ", latitude=" + _latitude +
                ", longitude=" + _longitude +
                ", address='" + _address + '\'' +
                ", city='" + _city + '\'' +
                ", state='" + _state + '\'' +
                ", country='" + _country + '\'' +
                ", postalCode='" + _postalCode + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) { // need this to pass data between activities
        dest.writeString(_name);
        dest.writeDouble(_latitude);
        dest.writeDouble(_longitude);
        dest.writeString(_address);
        dest.writeString(_city);
        dest.writeString(_state);
        dest.writeString(_country);
        dest.writeString(_postalCode);
    }
}

