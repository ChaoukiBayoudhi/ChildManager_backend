package tn.esb.bi.ChildManager.Domains;

import lombok.*;
import tn.esb.bi.ChildManager.Enumerations.TaskState;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data //remplace @Getter, @Setter, @RequiredArgsConstructor, @EqualsAndHashCode, @ToString
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = "photo")
@Entity
@Table(name="child_tab")

public class Task {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    private double duration;
    @NonNull
    private LocalDate startDate;
    @NonNull
    private LocalDate endDate;
    private TaskState state;
    private String type;

    public Task(@NonNull String name, double duration, @NonNull LocalDate startDate, @NonNull LocalDate endDate, TaskState state, String type) {
        this.name = name;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = state;
        this.type = type;
    }
}
