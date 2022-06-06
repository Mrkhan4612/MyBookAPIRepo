package in.mrKhan.student.repository;

import in.mrKhan.student.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BookRepo extends JpaRepository<Book, Serializable> {
}
