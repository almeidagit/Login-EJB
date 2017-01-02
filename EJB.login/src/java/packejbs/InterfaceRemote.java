package packejbs;

import javax.ejb.Remote;

@Remote
public interface InterfaceRemote {
    
    public boolean validando(String login, String senha);
    
}
