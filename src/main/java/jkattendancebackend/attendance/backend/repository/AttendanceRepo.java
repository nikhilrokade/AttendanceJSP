package jkattendancebackend.attendance.backend.repository;

import jkattendancebackend.attendance.backend.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepo extends JpaRepository<UserDetails, Integer> {

}
