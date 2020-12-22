package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");

        u1.sendMessage(u2, "Привет!");
        u1.sendMessage(u2, "Как дела?");

        u2.sendMessage(u1, "Добрый день!");
        u2.sendMessage(u1, "Дела отлично!");
        u2.sendMessage(u1, "Как сам?");

        u3.sendMessage(u1, "Здравствуйте!");
        u3.sendMessage(u1, "Как там дела у u2?");
        u3.sendMessage(u1, "Он что-то молчит =)");

        u1.sendMessage(u3, "Здоров!");
        u1.sendMessage(u3, "Говорит, что все отлично =)");
        u1.sendMessage(u3, "Напиши ему еще разок");

        u3.sendMessage(u1, "Спасиб, сейчас напишу!)");

        MessageDatabase.showDialog(u1, u3);
    }
}
