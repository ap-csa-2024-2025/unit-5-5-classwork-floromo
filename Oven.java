public class Oven
{
    private int maxTemp, currentTemp;

    public void setMaxTemp(int maxTemp){
        this.maxTemp = maxTemp;
        if (maxTemp > 500 || maxTemp < 0){
            this.maxTemp = 500;
        }
    }
    public int getMaxTemp(){
        return maxTemp;
    }

    public void setCurrentTemp(int currentTemp){
        if (currentTemp > maxTemp){
            this.currentTemp = maxTemp;
        } else if (currentTemp < 0){
            this.currentTemp = 0;
        } else{
            this.currentTemp = currentTemp;
        }
    }
    public int getCurrentTemp(){
        return currentTemp;
    }

    public void turnOff(){
        if (currentTemp > 0){
            this.currentTemp = 0;
        }
    }

    public boolean isOn(){
        return (currentTemp > 0);
    }

    public void preheat(int temp){
        if (temp > maxTemp){
            this.currentTemp = maxTemp;
        }
        if (temp > 0 && temp < maxTemp){
            this.currentTemp = temp
        }
    }

    public String toString(){
        return "New oven with a maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp;
    }
}
