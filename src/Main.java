public class Main {
    public static void main(String[] args) {

        land l1=new land("5858");

        l1.dial_no("5656");

        l1.receive_phone("5858");

        boolean answerCall=l1.is_ringing();

        if(answerCall)
        {
            l1.answer_phone();
        }

    }



}