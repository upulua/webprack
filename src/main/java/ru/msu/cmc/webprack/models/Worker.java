package ru.msu.cmc.webprack.models;

import lombok.*;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "worker")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Worker implements CommonEntity<Long>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "worker_id")
    private Long id;

    @Column(nullable = false, name = "name")
    @NonNull
    private String name;

    @Column(name = "education")
    private String education;

    @Column(nullable = false, name = "start_date")
    @NonNull
    private Long start;

    @Column(name = "address")
    private String address;

    @Column(nullable = false, name = "director")
    @NonNull
    private Long director;
}
