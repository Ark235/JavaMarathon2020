package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username; /** имя пользователя */
    private List<User> subscriptions; /** список пользователей, на которых подписан наш юзер */
    private boolean isSubscribed;
    private boolean isFriend;

    /** конструктор. Здесь инициализируем поле "подписки" пустым списком **/
    public User(String username) {
        subscriptions = new ArrayList<>();
        this.username = username;
    }

    /** получаем имя пользователя из поля username **/
    public String getUsername() {
        return username;
    }

    /** получаем список пользователей, на которых подписан юзер, из поля "подписки" */
    public List<User> getSubscriptions() {
        return subscriptions;
    }

    /** метод для подписки юзера на пользователя "user" */
    public void subscribe(User user) {
    user.isSubscribed = true;
    subscriptions.add(user);
    }

    /** должен возвращать true, если пользователь подписан на пользователя user, и false
     * - если не подписан */
    public boolean isSubscribed(User user) {
        return user.isSubscribed;
    }

    /** должен возвращать true, если пользователь user в друзьях, и false
     * - если нет */
    public boolean isFriend(User user) {
        if (user.isSubscribed && isSubscribed) {
            isFriend = true;
        }
        return isFriend;
    }

    /** отправляет сообщение с текстом text пользователю user. Здесь должен
     * использоваться статический метод из MessageDatabase */
    public void sendMessage(User user, String text) {
    MessageDatabase.addNewMessage(this,user,text);
    }

    /** переопределенный toString, возвращает строковое представление пользователя (Имя) */
    @Override
    public String toString() {
        return username;
    }
}
