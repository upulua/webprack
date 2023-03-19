package ru.msu.cmc.webprack.models;
import lombok.*;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "history")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class History implements CommonEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "history_id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "worker_id")
    @ToString.Exclude
    @NonNull
    private Worker worker;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id")
    @ToString.Exclude
    @NonNull
    private Position position;

    @Column(nullable = false, name = "start_date")
    @NonNull
    private Long start;

    @Column(nullable = false, name = "finish_date")
    @NonNull
    private Long finish;
}
