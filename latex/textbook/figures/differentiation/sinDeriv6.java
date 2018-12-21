                  /*  File:  sinDeriv6.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class sinDeriv6 extends Template {

     static {templateClass = new sinDeriv6() ; }

     public void setup() {
          filePrefix = "sinDeriv6" ;    // used as the prefix for any ps or lbl files written
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.5*1.1 ;      // in inches
          ysize = 1.5*1.1 ;   // in inches. This gives ysize/xsize ~ golden ratio.
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
          double angle = Math.PI/3.5 ;
          double angleDeg = 180*angle/Math.PI ; 
          double x = 80*Math.cos(angle) ;
          double y = 80*Math.sin(angle) ;
          fEnv("lineWidth", 0.5) ;
          fDisk(0,0,80,80, BOUNDARY) ;
          fLine(-100,0,100,0) ;
          fLine(0, -100,0,100) ;
          fLine(0, 0, x, y) ;
          fEllipticalArc(0, 0, 15, 15, 0, angleDeg, OPEN) ;
          fTeXlabel(25*Math.cos(angle/2), 25*Math.sin(angle/2), "cc", "$h$") ;
          fLine(x, 0, x, y) ;
          fEnv("lineWidth", 1) ;
          fLine(80, 0, x, y) ;
          fLine(0, 0, 80, 80*Math.tan(angle)) ;
          fLine(80, 0, 80, 80*Math.tan(angle)) ;
          fEllipticalArc(0, 0, 80, 80, 0, angleDeg, OPEN) ;
          fTeXlabel(-2,-2, "tr", "$O$") ;
          fTeXlabel(x,y+6, "bc", "$P$") ;
          fTeXlabel(80,80*Math.tan(angle)+1, "bl", "$Q$") ;
          fTeXlabel(82,-2, "tl", "$R$") ;
          fTeXlabel(x,-2, "tc", "$S$") ;

          
     }
}
