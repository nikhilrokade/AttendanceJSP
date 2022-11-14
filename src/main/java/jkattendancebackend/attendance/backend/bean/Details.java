package jkattendancebackend.attendance.backend.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Details {

    private Integer phoneNumber;

    private String userName;

    private String emailId;

    private String passWord;
}
