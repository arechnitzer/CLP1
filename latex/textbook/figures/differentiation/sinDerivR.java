                  /*  File:  sinDerivR.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class sinDerivR extends Template {

     static {templateClass = new sinDerivR() ; }

     public void setup() {
          filePrefix = "sinDerivR" ;    
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0*1.5 ;      // in inches
          ysize = 1.0*1.5 ;   // in inches. 
          xmin = -5 ;
          xmax = 105 ;
          ymin = -5 ;
          ymax = 50 ;
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
          double x = 90*Math.cos(angle) ; double xp = -3*Math.sin(angle) ;
          double y = 90*Math.sin(angle) ; double yp =  3*Math.cos(angle) ;
          fEnv("lineWidth", 0.5) ;
          fLine(0, 0, x, y) ;
          fLine(0, 0, 90, 0) ;
          fTeXlabel(20*Math.cos(angle/2), 20*Math.sin(angle/2)+0.25, "cc", "$h$") ;
          fTeXlabel(x-4, y/2, "cr", "$\\sin h$") ;
          fEnv("lineWidth", 1.5) ;
          fLine(x, 0, x, y) ;
          fEllipticalArc(0, 0, 90, 90, 0, angleDeg, OPEN) ;
          fTeXlabel(92.5*Math.cos(angle/2)+1.5, 92.5*Math.sin(angle/2), "cc", "$h$") ;
          fTeXlabel(0.5*x+1.2*xp, 0.5*y+1.2*yp, "cc", "$1$") ;
          fTeXlabel(0.5*x, -3, "cc", "$\\cos h$") ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          fEnv("useColorPs", "true") ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("psFillColor", Red) ;
          fEnv("lineWidth", 0.5) ;
          fEllipticalArc(0, 0, 93.5, 93.5, 0, angleDeg/2-2.5, OPEN) ;
          fEllipticalArc(0, 0, 93.5, 93.5, angleDeg/2+2, angleDeg, OPEN) ;
          fArrowhead(93.5*Math.cos(0.025), 93.5*Math.sin(0.025), -90) ;
          fArrowhead(93.5*Math.cos(angle-0.025), 93.5*Math.sin(angle-0.025), angleDeg+90);
          fEllipticalArc(0, 0, 24, 24, 1, angleDeg-1, OPEN) ;
          fArrowhead(24*Math.cos(0.08), 24*Math.sin(0.08), -90) ;
          fArrowhead(24*Math.cos(angle-0.08), 24*Math.sin(angle-0.08), angleDeg+90) ;
          fArrow(x-3, 0.5, x-3, y-1) ;
          fArrow(x-3, y-5, x-3, 0.5) ;
          fArrow(0.47*x+xp, 0.47*y+yp, xp , yp) ;
          fArrow(0.53*x+xp, 0.53*y+yp, x+xp , y+yp) ;
          fArrow(0.4*x, -3.7, 0, -3.7) ;
          fArrow(0.6*x, -3.7, x, -3.7) ;


          
     }
}
