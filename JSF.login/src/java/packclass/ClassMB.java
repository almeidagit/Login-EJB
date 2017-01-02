package packclass;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import packejbs.InterfaceRemote;

@ManagedBean
public class ClassMB {
    
    private String login;
    private String senha;
    
    @EJB    
    
    private InterfaceRemote ejb;
    
    public String validador() {
        if (ejb.validando(login, senha)) {
            
            return "principal";
        } else {
            
            FacesMessage fm = new FacesMessage("erro ao logar");
            FacesContext.getCurrentInstance().addMessage("msg", fm);
            
            return null;
        }
        
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
