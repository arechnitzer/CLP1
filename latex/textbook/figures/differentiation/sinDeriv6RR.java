                  /*  File:  sinDeriv6RR.java    */


import figPac.* ;
import java.applet.* ;
import java.awt.* ;


public class sinDeriv6RR extends Template {

     static {templateClass = new sinDeriv6RR() ; }

     public void setup() {
          filePrefix = "sinDeriv6RR" ;  
          outputPsFile = true ;
          outputLblFile = true ;
          xsize = 2.0*1.4 ;      // in inches
          ysize = 90.0/110.0*2.0*1.4 ;   // in inches. 
          xmin = -5 ;
          xmax = 105 ;
          ymin = -10 ;
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
          double x = 90*Math.cos(angle) ; double xp = -4*Math.sin(angle) ;
          double y = 90*Math.sin(angle) ; double yp =  4*Math.cos(angle) ;
          double yq = 90*Math.tan(angle) ; 
          fEnv("lineWidth", 0.5) ;
          fTeXlabel(12*Math.cos(angle/2), 12*Math.sin(angle/2), "cc", "$h$") ;
          fLine(x, 0, x, y) ;
          fEnv("lineWidth", 1) ;
          fLine(0,0,90,0) ;
          fLine(90, 0, x, y) ;
          fLine(0, 0, 90, 90*Math.tan(angle)) ;
          fLine(90, 0, 90, 90*Math.tan(angle)) ;
          fTeXlabel(-1,-2, "tr", "$O$") ;
          fTeXlabel(x,y+3, "bc", "$P$") ;
          fTeXlabel(90,yq+1, "bl", "$Q$") ;
          fTeXlabel(91,-1, "tl", "$R$") ;
          fTeXlabel(x+1,2, "bl", "$S$") ;
          String Red = "0 1 1 0 setcmykcolor  " ;
          canvas.append( new fPsWrite(Red+"\n")) ;
          fEllipticalArc(0, 0, 90, 90, 0, angleDeg, OPEN) ;
          fEnv("lineWidth", 0.5) ;
          fEllipticalArc(0, 0, 18, 18, 0, angleDeg, OPEN) ;
          fArrowhead(18*Math.cos(0.1), 18*Math.sin(0.1), -90) ;
          fArrowhead(18*Math.cos(angle-0.1), 18*Math.sin(angle-0.1), angleDeg+90) ;

          fArrow(0.37*x, -4, 0, -4) ;
          fArrow(0.63*x, -4, x, -4) ;
          fTeXlabel(0.5*x, -3.1, "cc", "$\\cos h$") ;

          fArrow(0.45*90, -9, 0, -9) ;
          fArrow(0.55*90, -9, 90, -9) ;
          fTeXlabel(0.5*90, -9, "cc", "$1$") ;

          fArrow(0.47*x+xp, 0.47*y+yp, xp , yp) ;
          fArrow(0.53*x+xp, 0.53*y+yp, x+xp , y+yp) ;
          fTeXlabel(0.51*x+xp, 0.51*y+yp, "cc", "$1$") ;

          fArrow(x-3, 0.5, x-3, y-1) ;
          fArrow(x-3, y-5, x-3, 0.5) ;
          fTeXlabel(x-4, y/2, "cr", "$\\sin h$") ;

          fArrow(93, 0.5, 93, yq-1) ;
          fArrow(93, yq-5, 93, 0.5) ;
          fTeXlabel(95, yq/2, "cl", "$\\tan h$") ;




          
     }
}
