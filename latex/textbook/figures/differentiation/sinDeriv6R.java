                  /*  File:  sinDeriv6R.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class sinDeriv6R extends Template {

     static {templateClass = new sinDeriv6R() ; }

     public void setup() {
          filePrefix = "sinDeriv6R" ;  
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0*1.5 ;      // in inches
          ysize = 85.0/110.0*2.0*1.5 ;   // in inches. 
          xmin = -5 ;
          xmax = 105 ;
          ymin = -5 ;
          ymax = 80 ;
          topmargin = 0 ;   // in inches
          bottommargin = 0 ;   // in inches
          leftmargin = 0 ;   // in inches
          rightmargin = 0 ;   // in inches
          useZoom = true ;
          useDrag = true ;
          showCoords = true ;
          showCanvasBoundary = true ;   
     }
     
     public  void prepareFigure(Figure canvas) {
          double angle = Math.PI/4.5 ;
          double angleDeg = 180*angle/Math.PI ; 
          double x = 90*Math.cos(angle) ;
          double y = 90*Math.sin(angle) ;
          fEnv("lineWidth", 0.5) ;
          fTeXlabel(12*Math.cos(angle/2), 12*Math.sin(angle/2), "cc", "$h$") ;
          fLine(x, 0, x, y) ;
          fEnv("lineWidth", 1) ;
          fLine(0,0,90,0) ;
          fLine(90, 0, x, y) ;
          fLine(0, 0, 90, 90*Math.tan(angle)) ;
          fLine(90, 0, 90, 90*Math.tan(angle)) ;
          fTeXlabel(0,-2, "tr", "$O$") ;
          fTeXlabel(x,y+3, "bc", "$P$") ;
          fTeXlabel(90,90*Math.tan(angle)+1, "bl", "$Q$") ;
          fTeXlabel(90,-2, "tl", "$R$") ;
          fTeXlabel(x,-2, "tc", "$S$") ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEllipticalArc(0, 0, 90, 90, 0, angleDeg, OPEN) ;
          fEnv("lineWidth", 0.5) ;
          fEllipticalArc(0, 0, 18, 18, 0, angleDeg, OPEN) ;
          fArrowhead(18*Math.cos(0.1), 18*Math.sin(0.1), -90) ;
          fArrowhead(18*Math.cos(angle-0.1), 18*Math.sin(angle-0.1), angleDeg+90) ;

          
     }
}
