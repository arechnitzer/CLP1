                  /*  File:  badNewtonF.java    */

import figPac.* ;
import fnPac.* ;
import java.applet.* ;
import java.awt.* ;

public class badNewtonF extends Template {

     static {templateClass = new badNewtonF() ; }

     public void setup() {
          filePrefix = "badNewtonF" ;
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 3.0 ;   
          ysize = 2.5 ;   
          xmin = -6 ;
          xmax = 6 ;
          ymin = -1.5 ;
          ymax = 2 ;
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
          fEnv("lineWidth", 1.0) ;
          fTeXlabel(xmax, -0.05, "tr", "$x$", "x") ;
          fTeXlabel(-0.1, ymax, "tr", "$y$", "y") ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          String Black = "0 0 0 1 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fCurve("y=atan(x)", 0, xmin, xmax, OPEN) ;
          canvas.append( new fPsWrite(Black+"\n")) ;
          fTeXlabel(xmax+1, 1.35, "tr", "$y=\\tan^{-1}x$") ;

          fEnv("lineWidth", 1.0) ;
          fCurve("y=0.983+0.308*(x-1.5)", 0, -3, 3, OPEN) ;
          fEnv("lineWidth", 0.5) ;
          fLine(1.5,0, 1.5,-0.1) ;
          fTeXlabel(1.5, -0.15, "tc", "$x_1$") ; 
          fTeXlabel(3.3, 0.983+0.308*(3.0-1.5)+0.05, "br", "$y=F_1(x)$") ; 


          fEnv("lineWidth", 1.0) ;
          fCurve("y=-1.036+0.259*(x+1.69)", 0, -3, 3, OPEN) ;
          fEnv("lineWidth", 0.5) ;
          fLine(-1.69,0, -1.69,-0.1) ;
          fTeXlabel(-1.69, -0.15, "tc", "$x_2$") ; 
          fTeXlabel(3,-1.036+0.259*(3+1.69)+0.05, "bl", "$y=F_2(x)$") ; 

          fEnv("lineWidth", 1.0) ;
          fCurve("y=1.164+0.157*(x-2.32)", 0, -6, 6, OPEN) ;
          fEnv("lineWidth", 0.5) ;
          fLine(2.32,0, 2.32,-0.1) ;
          fTeXlabel(2.32, -0.15, "tc", "$x_3$") ; 
          fTeXlabel(6.05, 1.164+0.157*(6.0-2.32), "lb", "$y=F_3(x)$") ; 


          fEnv("lineWidth", 1.0) ;
          fCurve("y=-1.3775+0.0369*(x+5.11)", 0, xmin, xmax, OPEN) ;
          fEnv("lineWidth", 0.5) ;
          fLine(-5.11,0, -5.11,-0.1) ;
          fTeXlabel(-5.11, -0.15, "tc", "$x_4$") ; 
          fTeXlabel(xmax+0.05, -1.3775+0.0369*(xmax+5.11), "lc", "$y=F_4(x)$") ; 


          fLine(xmin, 0.0, xmax, 0.0) ;
          fLine(0.0, ymin, 0.0, ymax) ;



     }
}
