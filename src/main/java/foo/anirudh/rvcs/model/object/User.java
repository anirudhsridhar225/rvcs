package foo.anirudh.rvcs.model.object;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {
    @Id
    @UuidGenerator
    @Column(columnDefinition = "UUID", updatable = false, unique = true, nullable = false)
	private String id;

    @Column(name = "username", nullable = false, unique = true, length = 80)
	private String username;

    @Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;

    @Column(name = "password_hash", nullable = false, length = 128)
    private String password;
}
