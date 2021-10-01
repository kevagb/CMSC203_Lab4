// Kevin Agbedi 9-29
public class Television {

    private final String MANUFACTURER ; //manufacturer of TV
    private final int SCREEN_SIZE ; //screen size of TV
    private boolean powerOn;    //power on/off button
    private int channel;    //channel
    private int volume;     //volume to increase/decrease

    //television class
    public Television(String manu,int screen){
        MANUFACTURER = manu;
        SCREEN_SIZE = screen;
        powerOn = false;
        volume = 20;
        channel = 2;       
    }

    //to return the current volume
    public int getVolume(){
        return volume;
    }
    //to return the current channel
    public int getChannel(){
        return channel;
    }
    //to return the manufacturer of the TV
    public String getManufacturer(){
        return MANUFACTURER;
    }
    //to return the screen-size
    public int getScreenSize(){
        return SCREEN_SIZE;
    }
    //to set the channel to a number
    public void setChannel(int ch){
        channel=ch;
    }
    //to set the TV power on or off
    public void power(){
        powerOn = !powerOn;
    }
    //to increase the TV volume by 1
    public void increaseVolume(){
        volume+=1;
    }
    //to decrease the TV volume by 1
    public void decreaseVolume(){
        volume-=1;
    }
} 