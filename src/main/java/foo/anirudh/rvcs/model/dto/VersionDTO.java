package foo.anirudh.rvcs.model.dto;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VersionDTO implements Serializable {
    private String id;
    private String commitHash;
    private String message;
    private String author;
    private String latexCode;
    private DocumentDTO document;
}
