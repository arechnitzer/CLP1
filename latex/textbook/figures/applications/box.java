                  /*  File:  box.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class box extends Template {

     static {templateClass = new box() ; }

     public void setup() {
          filePrefix = "box" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0*0.6 ;   
          ysize = 2.0*0.6 ;   
          xmin = -5.5 ;
          xmax = 6.5 ;
          ymin = -4.0 ;
          ymax = 4.0 ;
          topmargin = 0 ;
          bottommargin = 0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("psFillGray", 0.7) ;
          {
              double[] xlist = { -4.0, -3.0, -3.0, -4.0} ;
              double[] ylist = { 3.0, 3.0, 2.0, 2.0} ;
              fPolygon(xlist, ylist, 4, 9) ;
          }
          {
              double[] xlist = { 5.0, 5.0, 4.0, 4.0} ;
              double[] ylist = { 3.0, 2.0, 2.0, 3.0} ;
              fPolygon(xlist, ylist, 4, 9) ;
          }
          {
              double[] xlist = { -4.0, -4.0, -3.0, -3.0} ;
              double[] ylist = { -3.0, -2.0, -2.0, -3.0} ;
              fPolygon(xlist, ylist, 4, 9) ;
          }
          {
              double[] xlist = { 5.0, 4.0, 4.0, 5.0} ;
              double[] ylist = { -3.0, -3.0, -2.0, -2.0} ;
              fPolygon(xlist, ylist, 4, 9) ;
          }
          {
              double[] xlist = { -4.0, 5.0, 5.0, -4.0} ;
              double[] ylist = { 3.0, 3.0, -3.0, -3.0} ;
              fPolygon(xlist, ylist, 4, 2) ;
          }

          fTeXlabel(-3.5, -3.3, "tc", "$x$", "x") ;
          fTeXlabel(-4.2, -2.5, "rc", "$x$", "x") ;
     }
}
