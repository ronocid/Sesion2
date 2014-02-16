
package sesion2;


public class Participantes {
    private int id;
    private String nombre;
    private String username;
    private String password;
    private String comentarios;

    public Participantes() {
    }

    public Participantes(int id, String nombre, String username, String password, String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.comentarios = comentarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getComentarios() {
        return comentarios;
    }
    
    
}
