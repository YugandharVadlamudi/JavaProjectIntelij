package observertwoexample;

public class MainClass {
    public static void main(String[] args) {
        MessageSubscribeOne subscribeOne = new MessageSubscribeOne();
        MessageSubscribeTwo subscribeTwo = new MessageSubscribeTwo();
        MessagePublish publish = new MessagePublish();
        publish.addObserver(subscribeOne);
        publish.addObserver(subscribeTwo);
        MessageModel messageModel=new MessageModel();
        messageModel.message = "Hell";
        publish.notifyObserver(messageModel);
        messageModel.message = "dell";
        publish.removeObserver(subscribeTwo);
        publish.notifyObserver(messageModel);
    }
}
