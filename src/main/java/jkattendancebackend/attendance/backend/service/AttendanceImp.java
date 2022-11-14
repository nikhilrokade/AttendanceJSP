package jkattendancebackend.attendance.backend.service;

import antlr.collections.List;
import jkattendancebackend.attendance.backend.entity.UserDetails;

import java.util.Optional;

public interface AttendanceImp {

    public List findSupportUser();
    public void save(UserDetails details);
    public void delete(UserDetails details);
    public Optional<UserDetails> findSupportUser(Integer number);
    void update(UserDetails details);
}
