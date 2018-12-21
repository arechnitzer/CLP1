                  /*  File:  lampShadowM.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class lampShadowM extends Template {

     static {templateClass = new lampShadowM() ; }

     public void setup() {
          filePrefix = "lampShadowM" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0 ;   
          ysize = 1.0 ;   
          xmin = -10.0 ;
          xmax = 90.0 ;
          ymin = -10.0 ;
          ymax = 90.0 ;
          topmargin = -0.1 ;
          bottommargin = 0.1 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          fTeXlabel(-3.0, 40.0, "rc", "$h$") ;
          fTeXlabel(60.0, -3.0, "tc", "$s$") ;
          fTeXlabel(20.0, -3.0, "tc", "$6$") ;
          fTeXlabel(38.0, 20.0, "rc", "$2$") ;
          fEnv("lineWidth", 0.5) ;
          fLine(0.0, 80.0, 0.0, 0.0) ;
          fLine(0.0, 0.0, 80.0, 0.0) ;
          fLine(40.0, 0.0, 40.0, 40.0) ;
          fEnv("lineWidth", 1.0) ;

          String Yellow = "0 0 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Yellow+"\n")) ;
          fLine(0.0, 80.0, 80.0, 0.0) ;

     }
}
