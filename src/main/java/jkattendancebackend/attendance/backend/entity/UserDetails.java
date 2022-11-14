package jkattendancebackend.attendance.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "userdetails")
public class UserDetails {

    @Id
    @Column(name = "phonenumber")
    private int phoneNumber;

    @Column(name = "username")
    private String userName;

    @Column(name = "emailid")
    private String emailId;

    @Column(name="password")
    private String passWord;
}
