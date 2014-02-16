
package sesion2;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class ParticipantesDataSource implements JRDataSource{

    private List<Participantes> listaParticipantes = new ArrayList<Participantes>();
    private int indiceParticipante=-1;
    
    public void addParticipantes(Participantes participante){
        this.listaParticipantes.add(participante);
    }
    
    @Override
    public boolean next() throws JRException {
       return ++indiceParticipante<listaParticipantes.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor= null;
        if("nombre".equals(jrf.getName())){
            valor=listaParticipantes.get(indiceParticipante).getNombre();
        }else if("username".equals(jrf.getName())){
            valor=listaParticipantes.get(indiceParticipante).getUsername();
        }else if("password".equals(jrf.getName())){
            valor=listaParticipantes.get(indiceParticipante).getPassword();
        }else if("comentarios".equals(jrf.getName())){
            valor=listaParticipantes.get(indiceParticipante).getComentarios();
        }
        return valor;
    }
    
    
}
