package jkattendancebackend.attendance.backend.controller;

import antlr.collections.List;
import jkattendancebackend.attendance.backend.bean.Details;
import jkattendancebackend.attendance.backend.entity.UserDetails;
import jkattendancebackend.attendance.backend.service.AttendanceImp;
import jkattendancebackend.attendance.backend.service.AttendanceService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/attendance")
public class AttendanceAppController {

    @Autowired
  private AttendanceService attendanceService;


    @GetMapping("/")
    public UserDetails getRegister(@PathVariable int id){
        return attendanceService.getUserDetails(id);
    }

    @PostMapping("/save")
    public Boolean saveUser(@RequestBody Details saveUserDetailsIn){
        return attendanceService.saveUserDetails(saveUserDetailsIn);
    }



    @DeleteMapping("/deleteUser")
    public Boolean deleteUserDetails(@PathVariable int id){
        return attendanceService.deleteUserData(id);
    }

}
