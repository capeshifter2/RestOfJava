import java.awt.Color;
import java.util.Scanner;

import graphics.Canvas;

public class Program {
    // Canvas GUI instance providing the drawing area on which to plot the functions
    private static Canvas canvas;

    public static void main(String[] args) {
        
        // Create the canvas instance, set its range to x:[-360, 360] and y:[-240, 240] then 
        // open it on the screen. Use canvas.plot(pX, pY) to plot a point at the (pX, pY) coords
        canvas = new Canvas();
        canvas.setRange(-360, -240, 360, 240);
        canvas.open();

        getInput();

        

        // Pause and close the canvas then terminate the program.
        canvas.pause();
        canvas.close();
    }
    private static void getInput() {
    	Scanner input = new Scanner(System.in);
    	boolean exit = false;
    	while (exit == false) {
	    	String in = input.next();
	    	switch (in) {
	    	case "S":
	    		sin();
	    		break;
	    	case "Q":
	    		quad();
	    		break;
	    	case "L":
	    		Log();
	    		break;
			default:
				
				break;
	    	}
    	}
    }
    private static void sin() {
    	canvas.setColor(Color.red);
        MyFunction fSin =  (x)->{return (int)(200 * Math.sin(Math.PI*x/360));};
        for (int x = -360; x < 360; x++) {
            canvas.plot(x, fSin.calcY(x));
        }
    }
    private static void quad() {
    	canvas.setColor(Color.blue);
    	MyFunction fq =  (x)->{return (int)(x * x) / 100;};
        for (int x = -360; x < 360; x++) {
            canvas.plot(x, fq.calcY(x));
        }
    }
    private static void Log() {
    	canvas.setColor(Color.blue);
    	MyFunction flog =  (x)->{return (int)(Math.log(x)) / 100;};
        for (int x = -360; x < 360; x++) {
            canvas.plot(x, flog.calcY(x));
        }
    }
}
