                  /*  File:  sketch3b.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class sketch3b extends Template {

     static {templateClass = new sketch3b() ; }

     public void setup() {
          filePrefix = "sketch3b" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 4.0*0.7 ;   
          ysize = 2.5*0.7 ;   
          xmin = -5.0 ;
          xmax = 7.0 ;
          ymin = -0.5 ;
          ymax = 2.5 ;
          topmargin = 0.1 ;
          bottommargin = 0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 1.0) ;
          fEnv("useColorPs", "true") ;
          fCurve("y=pow(x*x/((x-6)*(x-6)), 1/3)", 0, 6.005, 40, 1) ;
          fCurve("y=pow(x*x/((x-6)*(x-6)), 1/3)", 0, 0.005, 5.95, 1) ;
          fCurve("y=pow(x*x/((x-6)*(x-6)), 1/3)", 0, -20, -0.005, 1) ;
          String Black = "0 0 0 1 setcmykcolor  " ;
          canvas.append( new fPsWrite(Black+"\n")) ;
          fEnv("lineWidth", 0.5) ;
          fLine(-30,0, 60, 0) ;
          fLine(0,-0.5, 0, 5.5) ;

          fLine(20,1, 60, 1) ;
          fLine(-10,1, -30, 1) ;
          fEnv("psDash", "[3 3] 1.5") ;
          fLine(6,1.5, 6, 5.5) ;
          fEnv("psDash", "clear") ;

          fLine(6,0, 6, -0.13) ;
          fLine(0,1, -0.25, 1) ;
          fTeXlabel(6, -0.17, "tc", "$6$") ;
          fTeXlabel(-0.3, 1, "rc", "$1$") ;

          fTeXlabel(xmax, -0.05, "tr", "$x$") ;
          fTeXlabel(-0.2, ymax, "tr", "$y$") ;

          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ; 
          double r = 0.15 ;
          double x = 1 ; double y = 1/Math.pow(25, 1/3.0) ;
          fDisk(x, y, r,r*aspect, FILLED) ;
          fTeXlabel(x+0.2,y, "tl", "${\\scriptstyle(1\\,,\\, 1/\\root{3}\\of{25})}$") ;
     }
}
