package com.campusdual.classroom;

public class TVRemote {

   public int channel;
   public int volume;
   public boolean on;
   public String color;

    public TVRemote(String color) {
        this.channel = 0;
        this.volume = 20;
        this.on = false;
        this.color = color;
    }



    public boolean turnOn() {
       return this.on = true;

    }

    public boolean turnOff() {
       return this.on = false;
    }
    public void changeChannel(){
        this.channel++;
    }

    public void channelUp() {
            this.channel++;
    }

    public void channelDown() {
        if (checkMinValue(this.channel))
            this.channel--;
        }



    public void volumeUp() {
            this.volume++;

    }

    public void volumeDown() {
        if (checkMinValue(this.volume)) {
            this.volume--;
        }

    }
    public int getChannel(){
        return this.channel;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }
    public int getVolume(){
        return this.volume;
        }
    public void setVolume(int volume){
        this.volume = volume;

    }

    public String getColor() {
        return this.color;
    }

    public boolean isOn(){
        return this.on;
    }
    public void setOn(boolean on ){
        this.on = on;
    }


    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }

}
