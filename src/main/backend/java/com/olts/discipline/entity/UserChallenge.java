package com.olts.discipline.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * OLTS on 16.09.2017.
 */
@Data
@EqualsAndHashCode(exclude = {"originalChallenge", "originalChallenge"})
@ToString(exclude={"id", "challengeUser", "originalChallenge"})
@Entity
@Table(name = "challenge")
public class UserChallenge implements Serializable {
    private static final long serialVersionUID = 3836314309380176978L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int votes;

    @Column(name = "completed_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date completedDate;

    @Column(name = "accepted_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date acceptedDate;

    @Column(name = "updated_when")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updatedWhen;

    @ManyToOne
    @JoinColumn(name = "originalChallenge", nullable = false)
    private Challenge originalChallenge;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User challengeUser;

    private @Version
    @JsonIgnore
    Long version;
}