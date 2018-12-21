                  /*  File:  periodicPt.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class periodicPt extends Template {

     static {templateClass = new periodicPt() ; }

     public void setup() {
          filePrefix = "periodicPt" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 22*0.4*.5 ;   
          ysize = 2.4*0.3 ;   
          xmin = -7.0 ;
          xmax =  15.0 ;
          ymin = -0.2 ;
          ymax =  1.2 ;
          topmargin = 0.0 ;
          bottommargin = 0.0 ;
          leftmargin = 0 ;
          rightmargin = 0 ;
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;
     }

     public  void prepareFigure(Figure canvas) {
          double x0 = Math.PI/4.0 ; double y0 = Math.sin(x0) ;
          double dx = 2*Math.PI ; 
          double r = 0.05 ;
          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ; 
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ; 
          fLine(0.0, ymin, 0.0, ymax) ; 
          fLine(x0,0, x0,-0.1) ; fTeXlabel(x0, -0.15, "tc", "$x_0$") ;
          fLine(x0+dx,0, x0+dx,-0.1) ; fTeXlabel(x0+dx, -0.15, "tc", "$x_0+P$") ;
          fLine(x0+2*dx,0, x0+2*dx,-0.1) ; fTeXlabel(x0+2*dx, -0.15, "tc", "$x_0+2P$") ;
          fLine(x0-dx,0, x0-dx,-0.1) ; fTeXlabel(x0-dx, -0.15, "tc", "$x_0-P$") ;
          fLine(0,y0, -0.1/aspect,y0) ;  ; fTeXlabel(-0.15/aspect, y0, "rc", "$y_0$") ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fDisk(x0,y0, r/aspect,r, FILLED) ;
          fTeXlabel(x0+0.5, y0+0.15, "bc", "${\\scriptstyle(x_0,y_0)}$") ;
          fDisk(x0-dx,y0, r/aspect,r, FILLED) ;
          fTeXlabel(x0-dx, y0+0.15, "bc", "${\\scriptstyle(x_0-P,y_0)}$") ;
          fDisk(x0+dx,y0, r/aspect,r, FILLED) ;
          fTeXlabel(x0+dx, y0+0.15, "bc", "${\\scriptstyle(x_0+P,y_0)}$") ;
          fDisk(x0+2*dx,y0, r/aspect,r, FILLED) ;
          fTeXlabel(x0+2*dx, y0+0.15, "bc", "${\\scriptstyle(x_0+2P,y_0)}$") ;
     }
}
