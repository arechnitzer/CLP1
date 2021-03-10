                  /*  File: secant.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class secant extends Template {

     static {templateClass = new secant() ; }

     public void setup() {
          filePrefix = "secant" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.2*1.5 ;   
          ysize = 1.4*1.5 ;   
          xmin = 0.5 ;
          xmax = 1.7 ;
          ymin = -0.5 ;
          ymax = 0.9 ;
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
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;
          fTeXlabel(xmax, -0.05, "tr", "$x$", "x") ;

          double a = 0.95 ;
          double x_1 = 0.9;
          double y_1 = 0.4+x_1-a*x_1*x_1 ;
          double x_2 = 1.1 ;
          double y_2 = 0.4+x_2-a*x_2*x_2 ;
          double slope = (y_2-y_1)/(x_2-x_1) ;
          double c_n = (x_1*y_2-x_2*y_1)/(y_2-y_1) ;
          double X1 = x_1-0.3 ;  double Y1 = y_1 + slope*(X1-x_1) ;
          double X2 = c_n+0.2 ;  double Y2 =  slope*(X2-c_n) ;

          fLine(x_1,0, x_1,-0.07) ;
          fTeXlabel(x_1+0.01, -0.1, "tc", "$x_{n-1}$") ; 
          fLine(x_2,0, x_2,-0.07) ;
          fTeXlabel(x_2+0.01, -0.1, "tc", "$x_n$") ; 
          fLine(c_n,0, c_n,-0.07) ;
          fTeXlabel(c_n+0.04, -0.1, "tc", "$x_{n+1}$") ; 

          fEnv("useColorPs", "true") ;
          String Black = "0 0 0 1 setcmykcolor  " ;
          String Blue = "0 0.53333 0.8 setrgbcolor  " ;
          String Pink = "1 0.33333 0.66666 setrgbcolor  " ;
          String Orange = "0.93333 0.46666 0.2 setrgbcolor  " ;
          canvas.append( new fPsWrite(Blue+"\n")) ;

          fCurve("y=0.4+x-0.95*x*x", 0, xmin, xmax, OPEN) ;
          fTeXlabel(xmin-0.02, 0.4+xmin-xmin*xmin, "cr", "$y=f(x)$") ;
          
          canvas.append( new fPsWrite(Black+"\n")) ;
          fEnv("lineWidth", 1.0) ;
          fLine(X1,Y1, X2,Y2) ;
          fTeXlabel(X1, Y1+0.02, "bc", "$y=F(x)$") ; 


          double r=0.02 ; double R = r*(ymax-ymin)/(xmax-xmin)*xsize/ysize ;
          fDisk(x_1, y_1, r, R, FILLED) ;
          fTeXlabel(x_1+0.01,y_1+0.03, "bl", "$\\big(x_{n-1},f(x_{n-1})\\big)$") ;
          fDisk(x_2, y_2, r, R, FILLED) ;
          fTeXlabel(x_2+0.01,y_2+0.03, "bl", "$\\big(x_n,f(x_n)\\big)$") ;





     }
}
