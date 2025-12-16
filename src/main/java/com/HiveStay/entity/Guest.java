package com.HiveStay.entity;

import com.HiveStay.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    //JoinColumn here because -> Guest is owning the new column
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer age;

//    @ManyToMany(mappedBy = "guests")
    // X -> @JoinTable -> will create a new table as it is already done in Booking class
//    private Set<Booking> bookings;
}
