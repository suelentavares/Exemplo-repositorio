
import java.util.ArrayList;
import java.util.List;

public class Cadrastro {
    private List<Usuario> listaUsuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNome() + " cadastrado com sucesso!");
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
