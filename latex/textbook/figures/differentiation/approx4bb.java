                  /*  File:  approx4bb.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class approx4bb extends Template {

     static {templateClass = new approx4bb() ; }

     public void setup() {
          filePrefix = "approx4bb" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 1.8*1.2;   
          ysize = 1.2*1.2 ;   
          xmin = -0.1 ;
          xmax = 1.7 ;
          ymin = -0.1;
          ymax = 1.1 ;
          topmargin = 0.2 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fEnv("lineWidth", 1.0) ;
          fCurve("y=(2-x)*x", 0, 0.0, xmax, 1) ;

          fEnv("lineWidth", 0.5) ;
          double x0 = 0.25 ; double y0 = (2-x0)*x0 ;
          double x1 = 1.25 ; double y1 = (2-x1)*x1 ;
          double slope = (y1-y0)/(x1-x0) ;
          double xm = 1-slope/2 ; double ym = (2-xm)*xm ;

          fLine(x0, 0.0, x0, -0.05) ;
          fTeXlabel(x0, -0.08, "tc", "$a$") ;
          fTeXlabel(x0+0.02, y0-0.02, "lt" , "$\\big(a,f(a)\\big)$") ;

          fLine(xm, 0.0, xm, -0.05) ;
          fDisk(xm, ym, .03, .03, FILLED) ;
          fTeXlabel(xm, -0.08, "tc", "$c$", "c") ;

          fTeXlabel(x1+0.02, y1+0.02, "lb" , "$\\big(x,f(x)\\big)$") ;
          fLine(x1, 0.0, x1, -0.05) ;
          fTeXlabel(x1, -0.08, "tc", "$x$", "x") ;

          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;
          fTeXlabel(xmax, -0.05, "tr", "$t$", "t") ;
          fTeXlabel(-0.03, ymax, "tr", "$y$", "y") ;

          fTeXlabel(xmax+0.02, (2-xmax)*xmax+0.02, "tl", "$y=f(t)$") ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          double xa = xm - 0.5 ; double ya = ym+slope*(xa-xm) ;
          double xb = xm + 0.5 ; double yb = ym+slope*(xb-xm) ;
          fLine(xa,ya,  xb,yb) ;
          fLine(x0,y0,  x1,y1) ;
          fDisk(x0, y0, .03, .03, FILLED) ;
          fDisk(x1, y1, .03, .03, FILLED) ;



     }
}
