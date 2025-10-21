package foo.anirudh.rvcs.model.dto;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDTO implements Serializable {
    private String id;
    private String title;
    private String description;
}
