package uz.pdp.yurakamri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.yurakamri.entity.HelpAndUsers;
import uz.pdp.yurakamri.entity.Ketmon;
import uz.pdp.yurakamri.entity.Region;
import uz.pdp.yurakamri.entity.RequestUsers;
import uz.pdp.yurakamri.entity.enums.Role;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestUsersRepository extends JpaRepository<RequestUsers, Integer> {
    Optional<RequestUsers> findByBuffer(Long chatid);
    Optional<RequestUsers> findByUsersAndActive (Ketmon user,boolean active);
    List<RequestUsers> findByUsers (Ketmon user);
    List<RequestUsers> findByAnswerAndRegion_Name (boolean answer, String region);
    List<RequestUsers> findByStatus (boolean status);
    List<RequestUsers> findByAnswer (boolean answer);

}