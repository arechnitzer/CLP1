                  /*  File:  sinDeriv4.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class sinDeriv4 extends Template {

     static {templateClass = new sinDeriv4() ; }

     public void setup() {
          filePrefix = "sinDeriv4" ;    // used as the prefix for any ps or lbl files written
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.5 ;      // in inches
          ysize = 1.5 ;   // in inches. This gives ysize/xsize ~ golden ratio.
          xmin = -100 ;
          xmax = 100 ;
          ymin = -100 ;
          ymax = 100 ;
          topmargin = 0.05 ;   // in inches
          bottommargin = 0 ;   // in inches
          leftmargin = 0 ;   // in inches
          rightmargin = 0 ;   // in inches
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;   
     }
     
     public  void prepareFigure(Figure canvas) {
          double angle = .1 ;
          double angleDeg = 180*angle/Math.PI ; 
          double x = 80*Math.cos(angle) ;
          double y = 80*Math.sin(angle) ;
          fScale(16,16) ;
          fTranslate(-x, -y/2) ;
          fEnv("lineWidth", 0.5) ;
          fDisk(0,0,80,80, BOUNDARY) ;
          fLine(-100,0,100,0) ;
          fLine(0, -100,0,100) ;
          fLine(0, 0, x, y) ;
          fTeXlabel(x-0.5, y/2, "cr", "$\\sin h$") ;
          fEnv("lineWidth", 1) ;
          fLine(x, 0, x, y) ;
          fEllipticalArc(0, 0, 80, 80, 0, angleDeg, OPEN) ;
          fTeXlabel(80.5*Math.cos(angle/2), 80.5*Math.sin(angle/2), "lc", "$h=0.1$") ;

          
     }
}
