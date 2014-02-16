
package sesion2;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;


public class Sesion2 {


    public static void main(String[] args) {
        ParticipantesDataSource datasource= new ParticipantesDataSource();
        for(int cont=1;cont<=10;cont++){
            Participantes p=new Participantes(cont,"Participante"+cont,"Usuario"+cont,"Pass"+cont,"Comentario"+cont);
            datasource.addParticipantes(p);
        }
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("report2.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null,datasource);
            
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reporte2PDF.pdf"));
            exporter.exportReport();
        } catch (JRException ex) {
            Logger.getLogger(Sesion2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
