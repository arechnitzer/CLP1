                  /*  File:  slopeC.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class slopeC extends Template {

     static {templateClass = new slopeC() ; }

     public void setup() {
          filePrefix = "slopeC" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.0 ;   
          ysize = 2.0 ;   
          xmin = -0.2 ;
          xmax =  3.8 ;
          ymin = -0.2 ;
          ymax =  9.8 ;
          topmargin = 0.3 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0.4 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          String Blue = "1 1 0 0 setcmykcolor  " ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          String Yellow = "0 0 1 0 setcmykcolor  " ;
          String Black = "0 0 0 1 setcmykcolor  " ;
          String Orange = "0 0.61 0.87 0 setcmykcolor  " ;

          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ;
          double x0 = 1.0 ; double y0 = 1.0 ;
          double r = 0.03 ;

          fEnv("lineWidth", 0.4) ;
          fTeXlabel(xmax, -0.2, "tr", "$x$", "x") ;
          fTeXlabel(-0.15/aspect, ymax, "tr", "$y$", "y") ;
          fLine(xmin,0, xmax, 0) ;
          fLine(0, ymin,0, ymax) ;

          fEnv("lineWidth", 1.0) ;
          fEnv("useColorPs", "true") ;
          canvas.append( new fPsWrite(Blue+"\n")) ;
          fCurve("y=x*x", 0, xmin, xmax, OPEN) ;
          fTeXlabel(Math.sqrt(ymax)-0.05, ymax, "cr", "$y=x^2$") ;
          fTeXlabel(x0,y0+0.3, "br", "$(x_0,y_0)$") ;

          fEnv("lineWidth", 0.5) ;
          double x1 = 2.5 ; double y1 = x1*x1 ;
          double m = (y1-y0)/(x1-x0) ;  double b = y0-m*x0 ;
          canvas.append( new fPsWrite(Orange+"\n")) ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;

          x1 = 2.0 ; y1 = x1*x1 ;
          m = (y1-y0)/(x1-x0) ; b = y0-m*x0 ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;

          x1 = 1.5 ; y1 = x1*x1 ;
          m = (y1-y0)/(x1-x0) ; b = y0-m*x0 ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;

          x1 = 1.25 ; y1 = x1*x1 ;
          m = (y1-y0)/(x1-x0) ; b = y0-m*x0 ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;

          fEnv("lineWidth", 1.0) ;
          m = 2*x0 ; b = y0-m*x0 ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fLine(xmin, m*xmin+b,  xmax, m*xmax+b) ;

          canvas.append( new fPsWrite(Black+"\n")) ;
          fEnv("useColorPs", "false") ;
          fEnv("lineWidth", 0.5) ;
          fEnv("psFillGray", 0.0) ;
          fDisk(x0,y0,r,r*aspect, FILLED) ;
          fEnv("psFillGray", 1.0) ;
          x1 = 2.5 ; y1 = x1*x1 ;
          fDisk(x1,y1,r,r*aspect, CLOSED+FILLED) ;
          x1 = 2.0 ; y1 = x1*x1 ;
          fDisk(x1,y1,r,r*aspect, CLOSED+FILLED) ;
          x1 = 1.5 ; y1 = x1*x1 ;
          fDisk(x1,y1,r,r*aspect, CLOSED+FILLED) ;
          x1 = 1.25 ; y1 = x1*x1 ;
          fDisk(x1,y1,r,r*aspect, CLOSED+FILLED) ;


     }
}
