                  /*  File:  mvte.java    */


import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;


public class mvte extends Template {

     static {templateClass = new mvte() ; }

     public void setup() {
          filePrefix = "mvte" ;    // used as the prefix for any ps or lbl files
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1*1.5 ;      // in inches
          ysize = 0.6*1.5 ;   // in inches. 
          xmin = -50 ;
          xmax = 50 ;
          ymin = -5 ;
          ymax = 55 ;
          topmargin = 0.0 ;   // in inches
          bottommargin = 0 ;   // in inches
          leftmargin = 0 ;   // in inches
          rightmargin = 0 ;   // in inches
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;   
     }
     
     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 0.5) ;
          double b = 40 ;
          double r = 1.3 ;
          fLine(-b,40, b, 40) ;
          fDisk(b, 40, r, r, FILLED) ;
          fDisk(-b, 40, r, r, FILLED) ;
          fDisk(0, 0, r, r, FILLED) ;
          fTeXlabel(-b-2, 40, "cr", "$(a,f(a))$") ;
          fTeXlabel(b+2, 40, "cl", "$(b,f(b))$") ;
          fLine(xmin, 0, xmax, 0) ;
          fLine(0, ymin, 0, ymax) ;
          fEnv("lineWidth", 1.5) ;
          fLine(-b, 40,  0, 0) ;
          fLine(0, 0,  b, 40) ;

     }
}
