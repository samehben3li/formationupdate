package tn.isima.formationupdate.exception;

public class FormationNotFoundException extends RuntimeException {
    public FormationNotFoundException(String message) {
        super(message);
    }
}