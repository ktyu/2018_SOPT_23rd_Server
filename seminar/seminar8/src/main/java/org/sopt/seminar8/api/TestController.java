package org.sopt.seminar8.api;

import lombok.extern.slf4j.Slf4j;
import org.sopt.seminar8.domain.Item;
import org.sopt.seminar8.repository.ItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
public class TestController {

    private final ItemRepository itemRepository; // final 을 붙여주는게 좋다. 마이바티스에 매퍼도 마찬가지.
                                                 // Why? -> 관례기도하고 final을 붙여줌으로써 null 값이 들어가면 컴파일 타임에 에러를 잡을수 있음(생성자 DI 과정에서 터짐)

    public TestController(final ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("jpa")
    public ResponseEntity jpaTest() {
        try {

            final Item item = new Item(1,"test");
            log.info("------jpa insert data-------");
            itemRepository.save(item);


            log.info("------jpa findOne data-------");
            Optional<Item> content = itemRepository.findById(1);

            log.info(content.toString());



            log.info("------jpa findAll data-------");
            Iterable<Item> contentList = itemRepository.findAll();

            log.info(contentList.toString());



            log.info("------jpa delete data-------");
            itemRepository.delete(item);

            return new ResponseEntity(HttpStatus.OK);

        } catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}