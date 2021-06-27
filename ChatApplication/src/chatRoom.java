
public class chatRoom {
static Window1 win1;
static Window2 win2;
static Server server;

	public chatRoom() {
		server = new Server();
		server.setLocationRelativeTo(null);
		server.setVisible(true);
	}
	public static void createRoom() {
		win1 = new Window1();
		win2 = new Window2();
		win1.setLocation(500,200);
		win2.setLocation(900,200);
		win1.setVisible(true);
		win2.setVisible(true);
		server.setVisible(false);
	}
	public static void main(String args[]) {
		chatRoom nchat = new chatRoom();
		
	}
}
