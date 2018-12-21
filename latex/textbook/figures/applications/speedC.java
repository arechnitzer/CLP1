                  /*  File:  speedC.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class speedC extends Template {

     static {templateClass = new speedC() ; }

     public void setup() {
          filePrefix = "speedC" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 6.0*0.9 ;   
          ysize = 0.8*0.9 ;   
          xmin = -300.0 ;
          xmax = 300.0 ;
          ymin = -200.0 ;
          ymax = -120.0 ;
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
          fEnv("headHalfWidth", 2*1.5) ;
          fEnv("headLength", 6*1.5) ;
          fEnv("lineWidth", 0.5) ;

          fLine(-250.0, -190.0, 250.0, -190.0) ;

          fLine(110.0, -160.0, -110.0, -160.0) ;
          fArrowhead( 0, -160, 180) ;
          fEllipticalArc(110, -170, 10, 10, 0, 90, OPEN) ;
          fEllipticalArc(-110, -150, 10, 10, 180, 270, OPEN) ;

          fTeXlabel(250, -195, "tr", "$x$") ;
          
          fLine(120, -190, 120, -200) ;
          fLine(-120, -190, -120, -200) ;
          fTeXlabel(120, -205, "tc", "$4$") ;
          fTeXlabel(-120, -205, "tc", "$0$") ;
          fTeXlabel(125, -170, "lc", "$t=-1,\\ x=4$") ;
          fTeXlabel(-125, -150, "rc", "$t=1,\\ x=0$") ;

          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("lineWidth", 2) ;
          fLine(-250.0, -180.0, 110.0, -180.0) ;
          fLine(-110.0, -140.0, 250.0, -140.0) ;
          fEllipticalArc(110, -170, 10, 10, -90, 0, OPEN) ;
          fEllipticalArc(-110, -150, 10, 10, 90, 180, OPEN) ;
          fArrowhead( 80, -140, 0) ;
          fArrowhead(-80, -180, 0) ;

     }
}
