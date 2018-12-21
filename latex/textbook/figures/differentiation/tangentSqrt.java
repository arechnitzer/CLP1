                  /*  File:  tangentSqrt.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class tangentSqrt extends Template {

     static {templateClass = new tangentSqrt() ; }

     public void setup() {
          filePrefix = "tangentSqrt" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 2.0 ;   
          xmin = -0.05 ;
          xmax =  1.0 ;
          ymin = -0.05 ;
          ymax =  1.0 ;
          topmargin = 0.1 ;
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
          String Black = "0 0 0 1 setcmykcolor  " ;
          double r = 0.015 ;

          fEnv("lineWidth", 0.5) ;
          fTeXlabel(xmax, -0.03, "tr", "$x$", "x") ;
          fTeXlabel(-0.02, ymax, "tr", "$y$", "y") ;
          fLine(xmin,0, xmax, 0) ;
          fLine(0, ymin,0, ymax) ;
          fTeXlabel(xmax+0.02, ymax+0.02, "tl", "$y=\\sqrt{x}$") ;

          fEnv("useColorPs", "true") ;
          canvas.append( new fPsWrite(Blue+"\n")) ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y=sqrt(x)" , 0, 0, xmax, OPEN) ;


          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 0.5) ;

          double x0 = 0.6 ; double y0 = Math.sqrt(x0) ;
          double m = 0.5/Math.sqrt(x0) ;  double b = y0-m*x0 ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;
          fDisk(x0,y0,r,r, FILLED) ;

          x0 = 0.2 ;   y0 = Math.sqrt(x0) ;
          m = 0.5/Math.sqrt(x0) ;   b = y0-m*x0 ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;
          fDisk(x0,y0,r,r, FILLED) ;

          x0 = 0.02 ;   y0 = Math.sqrt(x0) ;
          m = 0.5/Math.sqrt(x0) ;   b = y0-m*x0 ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;
          fDisk(x0,y0,r,r, FILLED) ;



     }
}
