                  /*  File:  sinDeriv3.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class sinDeriv3 extends Template {

     static {templateClass = new sinDeriv3() ; }

     public void setup() {
          filePrefix = "sinDeriv3" ;    // used as the prefix for any ps or lbl files written
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.5 ;      // in inches
          ysize = 1.5 ;   // in inches. This gives ysize/xsize ~ golden ratio.
          xmin = -100 ;
          xmax = 100 ;
          ymin = -100 ;
          ymax = 100 ;
          topmargin = 0 ;   // in inches
          bottommargin = 0 ;   // in inches
          leftmargin = 0 ;   // in inches
          rightmargin = 0 ;   // in inches
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;   
     }
     
     public  void prepareFigure(Figure canvas) {
          double angle = .05 ;
          double angleDeg = 180*angle/Math.PI ; 
          double x = 80*Math.cos(angle) ;
          double y = 80*Math.sin(angle) ;
          fScale(32,32) ;
          fTranslate(-x, -y/2) ;
          fEnv("lineWidth", 0.5) ;
          fDisk(0,0,80,80, BOUNDARY) ;
          fLine(-100,0,100,0) ;
          fLine(0, -100,0,100) ;
          fLine(0, 0, x, y) ;
          fTeXlabel(x-0.25, y/2, "cr", "$\\sin h$") ;
          fEnv("lineWidth", 1) ;
          fLine(x, 0, x, y) ;
          fEllipticalArc(0, 0, 80, 80, 0, angleDeg, OPEN) ;
          fTeXlabel(80.25*Math.cos(angle/2), 80.25*Math.sin(angle/2), "lc", "$h=0.05$") ;

          
     }
}
