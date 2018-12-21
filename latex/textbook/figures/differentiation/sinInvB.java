                  /*  File:  sinInvB.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class sinInvB extends Template {

     static {templateClass = new sinInvB() ; }

     public void setup() {
          filePrefix = "sinInvB" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 2.0 ;   
          xmin = -2.2*Math.PI ;
          xmax = 2.2*Math.PI ;
          ymin = -1.5 ;
          ymax = 1.5 ;
          topmargin = 0.0 ;
          bottommargin = 0.0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fTeXlabel(xmax+0.2, 0, "cl", "$Y$") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$") ;
          fLine(Math.PI/2,0, Math.PI/2, -0.07) ;
          fTeXlabel(Math.PI/2, -0.1, "tc", "${\\ts\\frac{\\pi}{2}}$") ;
          fLine(-Math.PI/2,0, -Math.PI/2, -0.07) ;
          fTeXlabel(-Math.PI/2, -0.1, "tr", "${\\ts-\\frac{\\pi}{2}}\\hskip-4pt$") ;
          fTeXlabel(xmax+0.2, Math.sin(xmax), "cl", "$y=\\sin(Y)$") ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y = sin(x)", 0, xmin, xmax, OPEN) ;
          String Blue = "1 1 0 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Blue+"\n")) ;
          fEnv("lineWidth", 2.0) ;
          fCurve("y = sin(x)", 0, -Math.PI/2, Math.PI/2, OPEN) ;
          fEnv("lineWidth", 1.0) ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fLine(xmin, 0.3, xmax, 0.3) ;
          fTeXlabel(xmin-0.2, 0.3, "cr", "$y=0.3$") ;
          double rx = 0.15 ;  double ry = rx/ysize*ymax/xmax*xsize ;
          fDisk(Math.asin(0.3), 0.3, rx, ry, FILLED) ;
          fLine(xmin, -1.2, xmax, -1.2) ;
          fTeXlabel(xmin-0.2, -1.2, "cr", "$y=-1.2$") ;


     }
}
