package rest.entities;

import lombok.*;

//@Getter
//@Setter
@Data
//@RequiredArgsConstructor
//@NoArgsConstructor
public class Comment {
    private Integer Id;
    private Integer postId;
    private String name;
    private String email;
    private String body;


}
