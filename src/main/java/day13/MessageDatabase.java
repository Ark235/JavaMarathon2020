package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    /** метод "отправляет" новое сообщение от юзера u1 юзеру u2. То есть записывает
     * сообщение в нашу "БД" - messages */
    public static void addNewMessage(User u1, User u2, String text) {
    Message newMessage = new Message(u1, u2, text);
    messages.add(newMessage);
    }

    /** возвращает список всех сообщений в "БД" */
    public static List<Message> getMessages() {
        return messages;
    }

    /** выводит цепочку сообщений пользователей u1 и u2 */
    public static void showDialog(User u1, User u2) {
        for (int i = 0; i < messages.size(); i++) {
            Message messageText = messages.get(i);
            if (i % 2 == 0) {
                System.out.println(u1.getUsername() + ": " + messageText.getText());
            } else System.out.println(u2.getUsername() + ": " + messageText.getText());
        }
    }
}
