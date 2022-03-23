package diagram;

public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("Yulia", "Hello Friend", "How are you?");
        std.sendMessage("Ariana Grande", "Hai Sist", "you did well. Are there any plans to hold a concert in Indonesia?");
        
        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("", "Secret", "Don't tell anyone!");
        mail.sendMessage("Selena", "Gift", "Ticket Concert");
        mail.disconnect();
        mail.sendMessage("Hannie", "Gift", "Ticket Concert");
    }
}
