package tn.isima.formationdelete.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tn.isima.formationupdate.model.Formation;
import tn.isima.formationupdate.service.FormationService;

import java.util.List;

@RestController
@RequestMapping("/formation")
@CrossOrigin(origins = "*")
public class FormationResource {
    private final FormationService formationService;

    public FormationResource(FormationService formationService) {
        this.formationService = formationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Formation>> getAllFormations () {
        List<Formation> formations = formationService.findAllFormations();
        return new ResponseEntity<>(formations, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Formation> getFormationById (@PathVariable("id") Long id) {
        Formation formation = formationService.findFormationById(id);
        return new ResponseEntity<>(formation, HttpStatus.OK);
    }

   

    @PutMapping("/update")
    public ResponseEntity<Formation> updateFormation(@RequestBody Formation formation) {
        Formation updateFormation= formationService.updateFormation(formation);
        return new ResponseEntity<>(updateFormation, HttpStatus.OK);
    }

   
}
