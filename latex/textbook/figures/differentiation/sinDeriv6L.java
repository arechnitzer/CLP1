                  /*  File:  sinDeriv6L.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class sinDeriv6L extends Template {

     static {templateClass = new sinDeriv6L() ; }

     public void setup() {
          filePrefix = "sinDeriv6L" ;   
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;      // in inches
          ysize = 2.0 ;   // in inches. 
          xmin = -10 ;
          xmax = 100 ;
          ymin = -10 ;
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
          String Red = "0 1 1 0 setcmykcolor  " ;
          double angle = Math.PI/4.5 ;
          double angleDeg = 180*angle/Math.PI ; 
          double x = 90*Math.cos(angle) ;
          double y = 90*Math.sin(angle) ;
          fEnv("lineWidth", 0.5) ;
          fDisk(0,0,90,90, BOUNDARY) ;
          fLine(-100,0,100,0) ;
          fLine(0, -100,0,100) ;
          fLine(0, 0, x, y) ;
          fLine(x, 0, x, y) ;
          fEnv("lineWidth", 1) ;
          fLine(90, 0, x, y) ;
          fLine(0, 0, 90, 90*Math.tan(angle)) ;
          fLine(90, 0, 90, 90*Math.tan(angle)) ;
          fLine(0,0,90,0) ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEllipticalArc(0, 0, 90, 90, 0, angleDeg, OPEN) ;

          
     }
}
