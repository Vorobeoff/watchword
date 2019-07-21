package ru.sparrow.watchword.backend.entity;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "public", name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "full_name")
    private String fullName;

    private String nickname;

    private String password;

    //@ElementCollection(fetch = FetchType.EAGER)
    //Collection<GrantedAuthority> authorities;

    @Column(name = "account_non_expired")
    boolean accountNonExpired;

    @Column(name = "account_non_locked")
    boolean accountNonLocked;

    @Column(name = "credentials_non_expired")
    boolean credentialsNonExpired;

    boolean enabled;
}

