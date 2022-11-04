package Task11_interfaces.Interf;

import Task11_interfaces.Book;
import Task11_interfaces.User;

// Администратор – находит и выдает книги и уведомляет о просрочках времени возврата.
public interface Administrator {
    public boolean findBookByName(String name, Book[] bookList);
    public void giveBook(Book book, User user);
    public void notificationOverdue(User user);
    public void notificatioReturnDate(User user);
}
