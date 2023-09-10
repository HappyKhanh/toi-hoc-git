package me.myspringbootproject.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import me.myspringbootproject.dto.BookDTO;
import me.myspringbootproject.entity.Book;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-10T18:26:20+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.20 (Amazon.com Inc.)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toEntity(BookDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Book book = new Book();

        return book;
    }

    @Override
    public BookDTO toDTO(Book entity) {
        if ( entity == null ) {
            return null;
        }

        BookDTO bookDTO = new BookDTO();

        return bookDTO;
    }

    @Override
    public List<Book> toEntity(List<BookDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( dtos.size() );
        for ( BookDTO bookDTO : dtos ) {
            list.add( toEntity( bookDTO ) );
        }

        return list;
    }

    @Override
    public List<BookDTO> toDTO(List<Book> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BookDTO> list = new ArrayList<BookDTO>( entities.size() );
        for ( Book book : entities ) {
            list.add( toDTO( book ) );
        }

        return list;
    }
}
