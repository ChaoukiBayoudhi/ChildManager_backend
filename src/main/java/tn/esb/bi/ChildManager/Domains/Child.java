package tn.esb.bi.ChildManager.Domains;

//import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = "photo")
@Entity
@Table(name="child_tab")
public class Child {
    @Id
    @GeneratedValue
    private Long id;
    @EqualsAndHashCode.Include
    @NonNull
    @Column(unique = true)
    private String firstName;
    @NonNull
    @EqualsAndHashCode.Include
    private String lastName;
    //private SimpleDateFormat birthDate;
    @EqualsAndHashCode.Include
    @NonNull
    private LocalDate birthDate;
    private String studyYear;
    //private String photo; //pour stocker le chemin de la photo
    //ou bien
    private byte[] photo;//pour stocker la photo elle même
    @OneToMany(mappedBy="location")
    private Set<childLocation> locations = new HashSet<>();

    public Child(@NonNull String firstName, @NonNull String lastName, @NonNull LocalDate birthDate, String studyYear, byte[] photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studyYear = studyYear;
        this.photo = photo;
    }
}
