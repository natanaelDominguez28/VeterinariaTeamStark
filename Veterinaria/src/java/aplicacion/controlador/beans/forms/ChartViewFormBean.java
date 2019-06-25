/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.DateAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;


/**
 *
 * @author Jorge_Openix
 */
@ManagedBean
@RequestScoped
public class ChartViewFormBean implements Serializable{
    private LineChartModel dateModel;

    /**
     * Creates a new instance of ChartViewFormBean
     */
    public ChartViewFormBean() {
        
        createDateModel();
    }
    
    
    private void createDateModel() {
        dateModel = new LineChartModel();
        /*LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");
 
        series1.set("2014-01-01", 51);
        series1.set("2014-01-06", 22);
        series1.set("2014-01-12", 65);
        series1.set("2014-01-18", 74);
        series1.set("2014-01-24", 24);
        series1.set("2014-01-30", 51);*/
 
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");
 
        series2.set("2019-01-01", 32);
        series2.set("2019-01-06", 73);
        series2.set("2019-02-12", 24);
        series2.set("2019-02-18", 12);
        series2.set("2019-03-24", 74);
        series2.set("2019-03-30", 62);
 
        //dateModel.addSeries(series1);
        dateModel.addSeries(series2);
 
        dateModel.setTitle("Zoom for Details");
        dateModel.setZoom(true);
        dateModel.getAxis(AxisType.Y).setLabel("Values");
        DateAxis axis = new DateAxis("Dates");
        axis.setTickAngle(-50);
        axis.setMax("2019-04-01");
        axis.setTickFormat("%b %#d, %y");
 
        dateModel.getAxes().put(AxisType.X, axis);
    }

    public LineChartModel getDateModel() {
        return dateModel;
    }

    public void setDateModel(LineChartModel dateModel) {
        this.dateModel = dateModel;
    }
    
    
}
