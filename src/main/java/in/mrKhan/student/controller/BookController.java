package in.mrKhan.student.controller;

import in.mrKhan.student.model.Book;
import in.mrKhan.student.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public Book save(@RequestBody Book book)
    {
        return bookService.insertBookInfo(book);
    }

    @PutMapping("/update")
    public String update(@RequestBody Book book)
    {
        return bookService.updateBookInfo(book);
    }

    @GetMapping("/book/{id}")
    public Book getBookInfo(@PathVariable int id)
    {
        return bookService.getBookInfo(id);
    }
    @GetMapping("/book")
    public List<Book> getAllBookInfo()
    {
        return bookService.getAllBookInfo();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBookByid(@PathVariable int id)
    {
        bookService.deleteBookById(id);
    }

}
