package br.com.hyper.entities;

import br.com.hyper.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUSTOMER")
@EqualsAndHashCode(callSuper = false)
public class CustomerEntity extends BaseEntity implements Serializable, UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_SEQ")
    @SequenceGenerator(name = "CUSTOMER_SEQ",sequenceName = "CUSTOMER_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "CUSTOMER_ID", nullable = false, unique = true)
    private String customerId;

    @Column(name = "AVATAR")
    private String avatar;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "COUNTRY", nullable = false)
    private String country;

    @Column(name = "BIRTH_DATE", nullable = false)
    private String birthDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SUBSCRIPTION_ID", nullable = false)
    private SubscriptionEntity subscription;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ROLE")
    private UserRole role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.role == UserRole.ADMIN) {
            return List.of(new SimpleGrantedAuthority("ADMIN"), new SimpleGrantedAuthority("CUSTOMER"), new SimpleGrantedAuthority("ARTIST"));
        } else if(this.role == UserRole.ARTIST) {
            return List.of(new SimpleGrantedAuthority("ARTIST"));
        }
        return List.of(new SimpleGrantedAuthority("CUSTOMER"));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
