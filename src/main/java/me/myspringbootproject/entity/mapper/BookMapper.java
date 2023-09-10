package me.myspringbootproject.entity.mapper;

import me.myspringbootproject.dto.BookDTO;
import me.myspringbootproject.entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book toEntity(BookDTO dto);

    BookDTO toDTO(Book entity);

    List<Book> toEntity(List<BookDTO> dtos);

    List<BookDTO> toDTO (List<Book> entities);
}
