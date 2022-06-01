package payroll;

//This class will render an HTTP 404
class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id){
        super("Could not find employee "+id);
    }
}
