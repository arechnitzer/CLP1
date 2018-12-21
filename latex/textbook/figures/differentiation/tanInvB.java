                  /*  File:  tanInvB.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class tanInvB extends Template {

     static {templateClass = new tanInvB() ; }

     public void setup() {
          filePrefix = "tanInvB" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 2.0 ;   
          xmin = -1.9*Math.PI ;
          xmax = 1.9*Math.PI ;
          ymin = -2.0 ;
          ymax = 2.0 ;
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
          fLine(Math.PI/2,0, Math.PI/2, -0.14) ;
          fTeXlabel(Math.PI/2, -0.2, "tc", "${\\ts\\frac{\\pi}{2}}$") ;
          fLine(-Math.PI/2,0, -Math.PI/2, -0.14) ;
          fTeXlabel(-Math.PI/2, -0.2, "tr", "${\\ts-\\frac{\\pi}{2}}\\hskip-4pt$") ;
          fTeXlabel(3*Math.PI/2-0.3, ymax, "tl", "$y=\\tan(Y)$") ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y = tan(x)", 0, -Math.PI/2+0.01, Math.PI/2-0.01, OPEN) ;
          fCurve("y = tan(x)", 0, -3*Math.PI/2+0.01, -Math.PI/2-0.01, OPEN) ;
          fCurve("y = tan(x)", 0, -5*Math.PI/2+0.01, -3*Math.PI/2-0.01, OPEN) ;
          fCurve("y = tan(x)", 0,  Math.PI/2+0.01, 3*Math.PI/2-0.01, OPEN) ;
          fCurve("y = tan(x)", 0,  3*Math.PI/2+0.01, 5*Math.PI/2-0.01, OPEN) ;
          String Blue = "1 1 0 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Blue+"\n")) ;
          fEnv("lineWidth", 2.0) ;
          fCurve("y = tan(x)", 0, -Math.PI/2+0.01, Math.PI/2-0.01, OPEN) ;
          fEnv("lineWidth", 1.0) ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fLine(xmin, 0.8, xmax, 0.8) ;
          fTeXlabel(xmin-0.2, 0.8, "cr", "$y=0.8$") ;
          double rx = 0.13 ;  double ry = rx/ysize*ymax/xmax*xsize ;
          fDisk(Math.atan(0.8), 0.8, rx, ry, FILLED) ;


     }
}
