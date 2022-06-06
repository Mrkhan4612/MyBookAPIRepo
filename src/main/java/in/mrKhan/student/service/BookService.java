package in.mrKhan.student.service;

import in.mrKhan.student.model.Book;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BookService {
    public Book insertBookInfo(Book book);
    public Book getBookInfo(int id);
    public List<Book> getAllBookInfo();
    public void deleteBookById(int id);
    public String updateBookInfo(@RequestBody Book book);
}
