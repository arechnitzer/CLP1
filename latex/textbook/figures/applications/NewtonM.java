                  /*  File: NewtonM.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class NewtonM extends Template {

     static {templateClass = new NewtonM() ; }

     public void setup() {
          filePrefix = "NewtonM" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 6.0*0.35*1.3 ;   
          ysize = 4.0*0.2*1.3 ;   
          xmin = -0.1 ;
          xmax = 2 ;
          ymin = -0.3 ;
          ymax = 0.7 ;
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
          fTeXlabel(xmax, -0.05, "tr", "$x$", "x") ;
          fTeXlabel(-0.05, ymax, "tr", "$y$", "y") ;
          fCurve("y=0.4+x-x*x", 0, xmin, xmax, OPEN) ;
          fTeXlabel(-0.12, 0.4, "tr", "$y=f(x)$") ;

          double x_1 = 0.9;
          double y_1 = 0.4+x_1-x_1*x_1 ;
          double x_2 = x_1 - y_1/(1-2*x_1) ;
          fLine(x_1,0, x_1,-0.07) ;
          fTeXlabel(x_1, -0.1, "tc", "$x_1$") ; 
          fLine(x_2,0, x_2,-0.07) ;
          fTeXlabel(x_2+0.03, -0.1, "tc", "$x_2$") ; 
          fTeXlabel(1.95, -0.3, "lc", "$y=F(x)$") ; 
          
          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 1.0) ;
          fCurve("y=0.4+0.9-0.9*0.9 + (1-2*0.9)*(x-0.9)", 0, -3, 3, OPEN) ;

          double r=0.025 ; double R = r*(ymax-ymin)/(xmax-xmin)*xsize/ysize ;
          fDisk(x_1, y_1, r, R, FILLED) ;
          fTeXlabel(x_1,y_1+0.03, "bl", "$\\big(x_1,f(x_1)\\big)$") ;





     }
}
