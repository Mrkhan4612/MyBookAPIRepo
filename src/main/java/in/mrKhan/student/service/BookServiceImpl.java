package in.mrKhan.student.service;

import in.mrKhan.student.model.Book;
import in.mrKhan.student.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book insertBookInfo(Book book) {
       return bookRepo.save(book);
    }

    @Override
    public Book getBookInfo(int id) {
        return bookRepo.findById(id).get();
    }

    @Override
    public List<Book> getAllBookInfo() {
       return bookRepo.findAll();
    }

    @Override
    public void deleteBookById(int id) {
        bookRepo.deleteById(id);
    }

    @Override
    public String updateBookInfo(Book book) {
        if (bookRepo.findById(book.getId()).isPresent()) {
            bookRepo.save(book);
            return "record updated....";
        }else {
            return "record not found";
        }
    }
}
