package mk.ukim.finki.emt.lab2.service;

import mk.ukim.finki.emt.lab2.model.Author;
import mk.ukim.finki.emt.lab2.model.Book;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
}
