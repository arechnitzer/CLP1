                  /*  File:  periodicFull.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class periodicFull extends Template {

     static {templateClass = new periodicFull() ; }

     public void setup() {
          filePrefix = "periodicFull" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 22*0.4*.5 ;   
          ysize = 2.4*0.5 ;   
          xmin = -7.0 ;
          xmax =  15.0 ;
          ymin = -1.2 ;
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
          double x0 = 0.7*Math.PI ; 
          double y0 = Math.sin(x0) + Math.cos(2*x0)/5.0 + Math.sin(4*x0)/8.0 
                                             + Math.sin(6*x0)/10.0 ;
          double dx = 2*Math.PI ; 
          double r = 0.07 ;
          double aspect = (ymax-ymin)*xsize/(xmax-xmin)/ysize ; 
          fEnv("lineWidth", 0.5) ;
          fLine(xmin, 0.0, xmax, 0.0) ;  fTeXlabel(xmax, -0.1, "tr", "$x$") ;
          fLine(0.0, ymin, 0.0, ymax) ;  fTeXlabel(-0.1, ymax, "tr", "$y$") ;

          fEnv("lineWidth", 1.0) ;
          fCurve("y=sin(x) + cos(2*x)/5.0 + sin(4*x)/8.0+ sin(6*x)/10.0", 0, 0, 2*Math.PI, OPEN) ;
          fCurve("y=sin(x) + cos(2*x)/5.0 + sin(4*x)/8.0+ sin(6*x)/10.0", 0, 4*Math.PI, 6*Math.PI, OPEN) ;
          fCurve("y=sin(x) + cos(2*x)/5.0 + sin(4*x)/8.0+ sin(6*x)/10.0", 0, -4*Math.PI, -2*Math.PI, OPEN) ;



          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEnv("useColorPs", "true") ;
          fEnv("psFillColor", Red) ;
          fCurve("y=sin(x) + cos(2*x)/5.0 + sin(4*x)/8.0+ sin(6*x)/10.0", 0, 2*Math.PI, 4*Math.PI, OPEN) ;
          fCurve("y=sin(x) + cos(2*x)/5.0 + sin(4*x)/8.0+ sin(6*x)/10.0", 0, -2*Math.PI, 0, OPEN) ;

          fDisk(x0,y0, r/aspect,r, FILLED) ;
          fTeXlabel(x0+0.5, y0+0.15, "bc", "${\\scriptstyle(x_0,y_0)}$") ;
          fDisk(x0-dx,y0, r/aspect,r, FILLED) ;
          fTeXlabel(x0-dx, y0+0.15, "bc", "${\\scriptstyle(x_0-P,y_0)}$") ;
          fDisk(x0+dx,y0, r/aspect,r, FILLED) ;
          fTeXlabel(x0+dx, y0+0.15, "bc", "${\\scriptstyle(x_0+P,y_0)}$") ;
          fDisk(x0+2*dx,y0, r/aspect,r, FILLED) ;
          fTeXlabel(x0+2*dx, y0+0.15, "bc", "${\\scriptstyle(x_0+2P,y_0)}$") ;


          fEnv("lineWidth", 0.5) ;
          String Black = "0 0 0 1 setcmykcolor  " ;
          canvas.append( new fPsWrite(Black+"\n")) ;
          fEnv("useColorPs", "false") ;
          fEnv("psDash", "[3 3] 1.5") ;
          fLine(dx,ymin, dx, ymax) ;      fTeXlabel(dx+0.1, -0.1, "tl", "$P$") ;
          fLine(2*dx,ymin, 2*dx, ymax) ;  fTeXlabel(2*dx+0.1, -0.1, "tl", "$2P$") ;
          fLine(-dx,ymin, -dx, ymax) ;    fTeXlabel(-dx+0.1, -0.1, "tl", "$-P$") ;
          fEnv("psDash", "clear") ;

     }
}
