package me.myspringbootproject.service.impl;

import lombok.RequiredArgsConstructor;
import me.myspringbootproject.dto.BookDTO;
import me.myspringbootproject.entity.Book;
import me.myspringbootproject.entity.mapper.BookMapper;
import me.myspringbootproject.repository.BookRepository;
import me.myspringbootproject.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    @Override
    public BookDTO save(BookDTO dto) {
        Book entity = bookMapper.toEntity(dto);
        return bookMapper.toDTO(bookRepository.save(entity));
    }

    @Override
    public BookDTO update(BookDTO dto) {
        Book entity = bookMapper.toEntity(dto);
        return bookMapper.toDTO(bookRepository.save(entity));
    }

    @Override
    public BookDTO get(Long id) {
        Book entity = bookRepository.findById(id).get();
        return bookMapper.toDTO(entity);
    }

    @Override
    public List<BookDTO> delete(Long id) {

        Book entity = bookRepository.findById(id).get();
        bookRepository.delete(entity);
        return list();
    }

    @Override
    public List<BookDTO> list() {
        return bookMapper.toDTO(bookRepository.findAll());
    }
}
