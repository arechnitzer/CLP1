                  /*  File:  speedB.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class speedB extends Template {

     static {templateClass = new speedB() ; }

     public void setup() {
          filePrefix = "speedB" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 6.0*0.5 ;   
          ysize = 3.0*0.5 ;   
          xmin = -300.0 ;
          xmax = 300.0 ;
          ymin = -100.0 ;
          ymax = 400.0 ;
          topmargin = 0.2 ;
          bottommargin = 0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {

          fEnv("lineWidth", 0.5) ;
          fLine(-250.0, 150.0, 250.0, 150.0) ;
          fLine(0.0, 380.0, 0.0, -100.0) ;

          fCurve("y = 10*((x/80)*(x/80)*(x/80)-3*(x/80)+2)+150", 0, -80.0, 80.0, 1) ;

          fTeXlabel(250, 145, "tr", "$t$") ;
          fTeXlabel(-5, 380, "tr", "$x$") ;
          
          fLine(80, 150, 80, 140) ;
          fLine(-80, 150, -80, 140) ;
          fTeXlabel(80, 135, "tc", "$1$") ;
          fTeXlabel(-80, 135, "tc", "$-1$") ;
          fLine(0, 190, -10, 190) ;
          fTeXlabel(-15, 190, "rc", "$4$") ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 2) ;
          fCurve("y=10*((x/80)*(x/80)*(x/80)-3*(x/80)+2)+150", 0, -250.0, -80.0, 1) ;
          fCurve("y = 10*((x/80)*(x/80)*(x/80)-3*(x/80)+2)+150", 0, 80.0, 250.0, 1) ;
     }
}
