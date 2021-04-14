public class LedTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("change volume");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("change channel");
    }
}