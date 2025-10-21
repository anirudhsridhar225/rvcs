package foo.anirudh.rvcs.model.object;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name="versions")
public class Version {
    @Id
    @UuidGenerator
    @Column(columnDefinition = "UUID", updatable = false, unique = true, nullable = false)
    private String id;

    @Column(name = "commit_message", nullable = false, updatable = true)
    private String message;

    @Column(name = "commit_author", nullable = false, updatable = false)
    private String author;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "document_id", nullable = false)
    private Document document;

    @Column(name = "commit_hash", nullable = false, updatable = false, unique = true)
    private String commitHash;

    @Lob
    @Column(name = "latex_code", columnDefinition = "TEXT", nullable = false, updatable = true)
    private String latexCode;

    public Version() {}

    public Version(String message, String latexCode) {
        this.message = message;
        this.latexCode = latexCode;
    }

    //getters and setters
    public String getCommitHash() {
        return commitHash;
    }
}