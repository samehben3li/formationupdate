package tn.isima.formationupdate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.isima.formationupdate.model.Formation;

import java.util.Optional;

public interface FormationRepo extends JpaRepository<Formation, Long> {
    void deleteFormationById(Long id);

    Optional<Formation> findFormationById(Long id);
}
