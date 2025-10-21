package foo.anirudh.rvcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import foo.anirudh.rvcs.model.object.Version;

import java.util.Optional;

public interface VersionRepository extends JpaRepository<Version, String> {
    Optional<Version> findByCommitHash(String commitHash);
}