                  /*  File:  mvtd.java    */


import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;


public class mvtd extends Template {

     static {templateClass = new mvtd() ; }

     public void setup() {
          filePrefix = "mvtd" ;    // used as the prefix for any ps or lbl files
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1*1.5 ;      // in inches
          ysize = 0.6*1.5 ;   // in inches. 
          xmin = -10 ;
          xmax = 90 ;
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
          double b = 80 ;
          double r = 1.3 ;
          fLine(0,0, b, 40) ;
          fEnv("lineWidth", 1.5) ;
          fLine(0, 0,  b/2, 0) ;
          fLine(b, 40,  b/2, 40) ;
          fEnv("lineWidth", 0.5) ;
          fDisk(0, 0, r, r, FILLED) ;
          fDisk(b/2, 0, r, r, FILLED) ;
          fDisk(b, 40, r, r, FILLED) ;
          fEnv("psFillGray", 1.0) ;
          fDisk(b/2, 40, r, r, FILLED+CLOSED) ;
          fTeXlabel(-2, -1, "tr", "$(a,f(a))$") ;
          fTeXlabel(b+2, 40, "tl", "$(b,f(b))$") ;
          fLine(xmin, 0, xmax, 0) ;
          fLine(0, ymin, 0, ymax) ;

     }
}
