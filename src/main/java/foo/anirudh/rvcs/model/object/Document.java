package foo.anirudh.rvcs.model.object;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "documents")
public class Document {
    @Id
    @UuidGenerator
    @Column(columnDefinition = "UUID", updatable = false, unique = true, nullable = false)
    private String id;

    @Column(name = "document_title", updatable = true, nullable = false)
    private String title;

    @Column(name = "document_description", updatable = true, nullable = false)
    private String description;

    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Version> versions = new ArrayList<>();
}
