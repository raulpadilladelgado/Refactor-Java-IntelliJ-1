package signatureChange;

public class AuthenticationService {
    public boolean isAuthenticated(Id id) {
        return id.getId() == 12345;
    }
}
