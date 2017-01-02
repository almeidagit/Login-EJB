package packejbs;
import javax.ejb.Stateless;

@Stateless
public class ClassEJB implements InterfaceRemote  {

    @Override
    public boolean validando(String login, String senha) {
    
        return login.equals("adm") && senha.equals(login);
    }
    
    
}
