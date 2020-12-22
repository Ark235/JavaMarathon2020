package day13;

import java.util.Date;

public class Message {
    private User sender; /** отправитель сообщения */
    private User receiver; /** получатель сообщения */
    private String text; /** текст сообщения */
    private Date date; /** дата отправки сообщения */

    /** конструктор. принимает на вход
     отправителя, получателя и дату. Назначает текущее время - время создания объекта Message */
    public Message(User sender, User receiver, String text) {
        this.date = new Date();
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    /** получаем имя отправителя из поля sender */
    public User getSender() {
        return sender;
    }

    /** получаем имя получателя из поля receiver */
    public User getReceiver() {
        return receiver;
    }

    /** получаем текст сообщения из поля text */
    public String getText() {
        return text;
    }

    /** получаем дату отправки сообщения из поля date */
    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "FROM: " + sender +
                "TO: " + receiver +
                "ON: " + date +
                ", " + text + '\'' +
                '}';
    }
}
