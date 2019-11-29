package observertwoexample;

public class MessageSubscribeTwo implements Observer {
    @Override
    public void update(MessageModel messageModel) {
        System.out.println("MessageSubscripiontTwo.update->"+messageModel.message);
    }
}
