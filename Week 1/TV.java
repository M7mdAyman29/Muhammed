
public class TV 
{
    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV() 
    {
        channel = 1;
        volumeLevel = 1;
        on = true;
    }

    public void TurnOn() 
    {
        on = true;
    }

    public void turnOff() 
    {
        on = false;
    }

    public void setChannel(int newChannel) 
    {
        channel = newChannel;
    }

    public void setVolume(int newVolume) 
    {
        volumeLevel = newVolume;
    }

    public void channelUp() 
    {
        if (channel == 120)
            channel = 1;
        else
            channel++;
    }

    public void channelDown()
    {
        if (channel == 1)
            channel = 120;
        else
            channel--;
    }

    public void volumeUp() 
    {
        if (volumeLevel != 7)
            volumeLevel++;
    }

    public void volumeDown() 
    {
        if (volumeLevel != 1)
            volumeLevel--;
    }
}