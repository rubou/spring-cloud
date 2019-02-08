package co.jp.okcoin.studyspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book-service")
public class BookRestApi {

    @Autowired
    private BookConfig bookConfig;

    @ResponseBody
    @RequestMapping(value = "/show", produces = "application/json")
    public Book getBook() {
        Book book = bookConfig.getBook();

        System.out.println("-------- book.name = " + book.getName());
        System.out.println("-------- book.auth = " + book.getAuth());
        return book;
    }
}
