package foo.anirudh.rvcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import foo.anirudh.rvcs.model.object.Document;

public interface DocumentRepository extends JpaRepository<Document, String> {}