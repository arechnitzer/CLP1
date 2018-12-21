                  /*  File:  snell.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class snell extends Template {

     static {templateClass = new snell() ; }

     public void setup() {
          filePrefix = "snell" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.0;   
          ysize = 2.0 ;   
          xmin = -2 ;
          xmax = 2 ;
          ymin = -1 ;
          ymax = 1 ;
          topmargin = 0.1 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          double x1 = -0.8 ;
          double y1 = 0.5 ;
          double x2 = 0.8 ;
          double y2 = -0.5 ;
          double x = 0.3 ;
          fEnv("psFillGray", 0.7) ;
          {
              double[] xlist = { -1.0, 1.0, 1.0, -1.0} ;
              double[] ylist = { 0.0, 0.0, -0.6, -0.6} ;
              fPolygon(xlist, ylist, 4, FILLED) ;
          }
          fLine(x1, y1, x, 0.0) ;
          fLine(x2, y2, x, 0.0) ;

          fTeXlabel(x1-0.05,y1, "rc", "$P$") ;
          fTeXlabel(x2+0.05,y2, "lc", "$Q$") ;
          fTeXlabel(x+0.05,0.05, "bl", "$O$") ;
          fEnv("lineWidth", 0.2) ;
          fLine(x, y1, 0.3, 0.0) ;
          fLine(x, y2, 0.3, 0.0) ;
          fLine(x1, y1, x1, 0.0) ;
          fLine(x2, y2, x2, 0.0) ;
          fTeXlabel(x1+0.05,y1-0.1, "lt", "$\\theta_i$") ;
          fTeXlabel(x2,y2+0.15, "br", "$\\theta_r$") ;
          fTeXlabel(x-0.02, 0.10, "br", "$\\theta_i$") ;
          fTeXlabel(x+0.02,-0.15, "tl", "$\\theta_r$") ;


     }
}
