package com.example.hotels.model;

public class Hotel {
    private String name;
    private String price;
    private String ImageSource;
    private String owner;
    private String ImageEnergySource;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }



    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;}


    public String getImageSource(){
        return ImageSource;
    }
    public void setImageSource (String ImageSource){
        this.ImageSource = ImageSource;}



        public String getOwner(){
            return owner;
        }
        public void setOwner(String owner){
                this.owner = owner; }

        public String getImageEnergySource(){
            return ImageEnergySource;
        }
        public void setImageEnergySource(String ImageEnergySource ){
                this.ImageEnergySource = ImageEnergySource;}

}
