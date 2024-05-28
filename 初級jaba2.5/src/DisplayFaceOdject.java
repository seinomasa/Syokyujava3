
public class DisplayFaceOdject extends MyFrame{
	public void run() {
       Face[] faces=new Face[3]
		faces[0]=new Face(50,50,10,5);
       faces[1]=new Face(200,100,-10,-5);
       faces[2]=new Face(0,100,5,0);
        for (int i = 0; i < 30; i++) {
            clear();
            face[0].draw(this);
            face[1].draw(this);
            face[2].draw(this);
            face[0].move();
            face[1].move();
            face[2].move();
            sleep(0.1);
        }
       
	}
	}


