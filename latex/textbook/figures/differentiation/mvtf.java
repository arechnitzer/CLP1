                  /*  File:  mvtf.java    */


import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;


public class mvtf extends Template {

     static {templateClass = new mvtf() ; }

     public void setup() {
          filePrefix = "mvtf" ;    // used as the prefix for any ps or lbl files
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1*2.0 ;      // in inches
          ysize = 0.6*2.0 ;   // in inches. 
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
          double a = -10 ;
          double b = 40 ;
          double c = (a+b)*0.5 ;
          double r = 1.3 ;
          double s = 0.03 ;
          double m = 2*s*c ;
          double dx = 30 ;
          fDisk(a, s*a*a, r, r, FILLED) ;
          fDisk(b, s*b*b, r, r, FILLED) ;
          fDisk(c, s*c*c, r, r, FILLED) ;
          fLine(a, s*a*a, b, s*b*b) ;
          fLine(c-dx, s*c*c-m*dx, c+dx, s*c*c+m*dx) ;
          fTeXlabel(a-2, s*a*a, "br", "$(a,f(a))$") ;
          fTeXlabel(b+2, s*b*b, "cl", "$(b,f(b))$") ;
          fTeXlabel(c+5, s*c*c, "cl", "$(c,f(c))$") ;
          fLine(xmin, 0, xmax, 0) ;
          fLine(0, ymin, 0, ymax) ;
          fEnv("lineWidth", 1.2) ;
          fCurve("y=0.03*x*x", 0, a, b, OPEN) ;

     }
}
