package payroll;

//This class will render an HTTP 404
class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id){
        super("Could not find order "+id);
    }
}
