package croexe.springframework.springpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }
}
