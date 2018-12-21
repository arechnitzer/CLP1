                  /*  File:  tangentB.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class tangentB extends Template {

     static {templateClass = new tangentB() ; }

     public void setup() {
          filePrefix = "tangentB" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 2.0 ;   
          xmin = -0.1 ;
          xmax =  1.0 ;
          ymin = -0.1 ;
          ymax =  1.0 ;
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
          String Blue = "1 1 0 0 setcmykcolor  " ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          double x0 = 0.15 ; double y0 = Math.sqrt(2*x0-x0*x0)-0.2 ;
          double r = 0.02 ;

          fEnv("lineWidth", 0.4) ;
          fTeXlabel(xmax, -0.03, "tr", "$x$", "x") ;
          fTeXlabel(-0.02, ymax, "tr", "$y$", "y") ;
          fLine(xmin,0, xmax, 0) ;
          fLine(0, ymin,0, ymax) ;
          fTeXlabel( x0+0.01 , y0-0.02 , "tl", "$\\big(a,f(a)\\big)$") ;
          fTeXlabel(xmax+0.02, 0.82, "cl", "$y=f(x)$") ;

          fEnv("lineWidth", 1.0) ;
          fCurve("y=sqrt(2*x-x*x)-0.2" , 0, 0, xmax, OPEN) ;
          double m = (1-x0)/(y0+0.2) ;  double b = y0-m*x0 ;
          canvas.append( new fPsWrite(Blue+"\n")) ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;
          fTeXlabel(x0+(ymax-y0)/m + 0.02 , ymax+0.02, "lc", "$y=f(a)+f'(a)\\,(x-a)$") ;
          fEnv("lineWidth", 3.0) ;
          double x1 = 0.4 ;  double y1 = y0+m*(x1-x0) ;
          fTeXlabel( x1-0.02 , y1+0.02 , "br", "$(x,y)$") ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fLine(x0, y0,  x1, y1) ;
          fDisk(x0,y0,r,r, FILLED) ;
          fDisk(x1,y1,r,r, FILLED) ;


     }
}
