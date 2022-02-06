package web;

import dao.SingerService;
import entity.Singer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest/singer")
public class SingerController {
    private final Logger logger = LoggerFactory.getLogger(SingerController.class);

    @Autowired
    private SingerService singerService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/listdata")
    public Singers singers() {
        return new Singers(singerService.findAll());
    }

    @GetMapping(value = "/{id}")
    public Singer show(@PathVariable("id") Long id) {
        return singerService.findById(id);
    }

    @PostMapping
    public Singer create(@RequestBody Singer singer) {
        return singerService.save(singer);
    }

    @PutMapping(value = "{id}")
    public void update(@RequestBody Singer singer, @PathVariable("id") Long id) {
        singer.setId(id);
        singerService.save(singer);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Long id) {
        singerService.delete(id);
    }
}
