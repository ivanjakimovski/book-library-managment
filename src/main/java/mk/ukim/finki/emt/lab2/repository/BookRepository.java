package mk.ukim.finki.emt.lab2.repository;

import mk.ukim.finki.emt.lab2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
