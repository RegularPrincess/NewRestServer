package my.simple.web;

import my.simple.domain.RoomEntity;
import my.simple.domain.UserEntity;
import my.simple.service.interfaces.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jmfedorov on 31.03.17.
 */


@RestController
@RequestMapping("/app")
public class GreetingController {

    @Autowired
    private RoomService roomService;

//, @RequestParam(value="name", required=false, defaultValue="World") String name

    @RequestMapping(value = "/room/{id-room}", method = RequestMethod.GET)
    public RoomEntity greeting(@RequestAttribute(value = "id-room") int idRoom) {
        return roomService.getById(idRoom);
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
//    public List<Book> list() {
//        return getBooks();
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.POST, headers = "Content-type=application/json")
//    public Book add(@RequestBody Book book) {
//        saveBook(book);
//        return book;
//    }
//
//    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.PUT, headers = "Content-type=application/json")
//    public Book update(@PathVariable int bookId, @RequestBody Book book) {
//        book.setBookId(bookId);
//        saveBook(book);
//        return book;
//    }
//
//    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.GET, headers = "Accept=application/json")
//    public Book view(@PathVariable int bookId) throws NotFoundException {
//        return getBook(bookId);
//    }
}
