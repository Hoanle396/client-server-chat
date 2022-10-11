package chat;

public class Client {

	public static void main(String[] args) {
		chat_client client = new chat_client("172.24.128.1");
		client.startRunning();
	}
}