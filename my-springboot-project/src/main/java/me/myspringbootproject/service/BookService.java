package me.myspringbootproject.service;


import me.myspringbootproject.dto.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO save(BookDTO dto);

    BookDTO update(BookDTO dto);

    BookDTO get(Long id);

    List<BookDTO> delete(Long id);

    List<BookDTO> list();
}
