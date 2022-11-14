package jkattendancebackend.attendance.backend.service;

import jkattendancebackend.attendance.backend.bean.Details;
import jkattendancebackend.attendance.backend.entity.UserDetails;
import jkattendancebackend.attendance.backend.repository.AttendanceRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepo attendanceRepo;

    public Boolean saveUserDetails(Details beanDetails){
        try{
            if(Objects.nonNull(beanDetails.getPhoneNumber())){
                Optional<UserDetails> userData = attendanceRepo.findById(beanDetails.getPhoneNumber());
                UserDetails getUserData = userData.get();
                getUserData.setPhoneNumber(beanDetails.getPhoneNumber());
                getUserData.setUserName(beanDetails.getUserName());
                getUserData.setEmailId(beanDetails.getEmailId());
                getUserData.setPassWord(beanDetails.getPassWord());
                attendanceRepo.save(getUserData);
                return true;
            }else {
                UserDetails newUser = new UserDetails();
                newUser.setPhoneNumber(beanDetails.getPhoneNumber());
                newUser.setUserName(beanDetails.getUserName());
                newUser.setEmailId(beanDetails.getEmailId());
                newUser.setPassWord(beanDetails.getPassWord());
                attendanceRepo.save(newUser);
                return true;
            }
        }catch (Exception userException){
            return false;
        }
    }


//Get User Details by serial
    public UserDetails getUserDetails(int detailsOfUsers){
        return attendanceRepo.findById(detailsOfUsers).orElse(null);
    }

    public Boolean deleteUserData(int id){
        try {
            UserDetails deleteDetails = attendanceRepo.getReferenceById(id);
            Optional<UserDetails> numberId = attendanceRepo.findById(id);
            if(numberId.isPresent()){
                attendanceRepo.delete(deleteDetails);
                return true;

            }else {
                return false;
            }
        }catch (Exception deleteMethod){
            return false;
        }
    }

}
