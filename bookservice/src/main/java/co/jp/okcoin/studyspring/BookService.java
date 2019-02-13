package co.jp.okcoin.studyspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class BookService {

    /*
    @Bean
    @RefreshScope
    public Book book(Environment env) {
        String name = env.getProperty("book.name");
        String auth = env.getProperty("book.auth");
        String createDate = env.getProperty("book.createDate", "1970/01/01");

        Book theBook = new Book();
        theBook.setName(name);
        theBook.setAuth(auth);
        theBook.setCreateDate(createDate);

        return theBook;
    }
    */

    @Value("${book.name}")
    private String name;

    @Value("${book.auth}")
    private String auth;

    @Value("${book.createDate}")
    private String createDate;

    public Book getBook() {
        Book theBook = new Book();
        theBook.setName(name);
        theBook.setAuth(auth);
        theBook.setCreateDate(createDate);

        return theBook;
    }

}
