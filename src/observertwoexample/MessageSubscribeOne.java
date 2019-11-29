package observertwoexample;

public class MessageSubscribeOne implements Observer {
    @Override
    public void update(MessageModel messageModel) {
        System.out.println("MessageSubscripitonone->messageModel = " + messageModel.message);
    }
}
