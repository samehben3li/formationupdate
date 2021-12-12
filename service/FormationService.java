package tn.isima.formationupdate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.isima.formationupdate.exception.UserNotFoundException;
import tn.isima.formationupdate.model.Formation;
import tn.isima.formationupdate.repo.FormationRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class FormationService {
    private final FormationRepo formationRepo;

    @Autowired
    public FormationService(FormationRepo formationRepo) {
        this.formationRepo = formationRepo;
    }

    public Formation addFormation(Formation formation) {
        formation.setFormationCode(UUID.randomUUID().toString());
        return formationRepo.save(formation);
    }

    public List<Formation> findAllFormations() {
        return formationRepo.findAll();
    }

    public Formation updateFormation(Formation formation) {
        return formationRepo.save(formation);
    }

    public Formation findFormationById(Long id) {
        return formationRepo.findFormationById(id)
                .orElseThrow(() -> new FormationNotFoundException("Formation by id " + id + " was not found"));
    }


}
