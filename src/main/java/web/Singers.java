package web;

import entity.Singer;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class Singers implements Serializable {
    private List<Singer> singers;

    public Singers() {
    }
    public Singers(List<Singer> singers) {
        this.singers = singers;
    }
}
