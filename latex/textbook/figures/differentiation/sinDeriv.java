                  /*  File:  sinDeriv.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class sinDeriv extends Template {

     static {templateClass = new sinDeriv() ; }

     public void setup() {
          filePrefix = "sinDeriv" ;    
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
          double angle = .4 ;
          double angleDeg = 180*angle/Math.PI ; 
          double x = 80*Math.cos(angle) ;
          double y = 80*Math.sin(angle) ;
          fEnv("lineWidth", 0.2) ;
          fDisk(0,0,80,80, BOUNDARY) ;
          fLine(-100,0,100,0) ;
          fLine(0, -100,0,100) ;
          fLine(0, 0, x, y) ;
          fEllipticalArc(0, 0, 15, 15, 0, angleDeg, OPEN) ;
          fTeXlabel(30*Math.cos(angle/2)+2, 30*Math.sin(angle/2), "cc", "$h$") ;
          fArrow(45, y+5, x, y/2) ;
          fTeXlabel(38, y+10, "cb", "$\\sin h$") ;
          fEnv("lineWidth", 1) ;
          fLine(x, 0, x, y) ;
          fEllipticalArc(0, 0, 80, 80, 0, angleDeg, OPEN) ;
          fTeXlabel(88*Math.cos(angle/2)+1, 88*Math.sin(angle/2), "cc", "$h$") ;
          fTeXlabel(40*Math.cos(angle+.25), 40*Math.sin(angle+.25), "cc", "$1$") ;

          
     }
}
