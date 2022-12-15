import java.util.Objects;

public class land implements phone{

    private boolean poweron;
    private String number;
    private boolean isRinging;

    public land(String num)
    {
        this.number = num;
    }

    @Override
    public void power_ON() {
        poweron=true;
    }

    @Override
    public void dial_no(String no) {

        System.out.println("Dialing the phone: "+no);

    }

    @Override
    public boolean answer_phone() {
        if(isRinging)
        {
            System.out.println("Answering the phone: ");
            isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean is_ringing() {
        if(isRinging)
        {
            System.out.println("The phone is Ringing: "+number);
            return true;
        }
        return false;
    }

    @Override
    public boolean receive_phone(String no) {

        if(no.equals(number))
        {
            System.out.println("Receiving call: "+number);
            isRinging=true;
            return true;
        }
        return false;
    }
}
