package D_8;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;

public class rwm {
	public static void main(String[] args) throws IOException {
		Qrcode rwm=new Qrcode();
	
		int width=300;
		int	height=300;
		BufferedImage tx=new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		Graphics2D rwhb=tx.createGraphics();
		
		rwhb.setBackground(Color.WHITE);
		rwhb.setColor(Color.BLACK);
		rwhb.clearRect(0, 0, width, height);
		String wz="my name is the flashs";
		byte[] zjsz=wz.getBytes();
		int pianyi=2;
		if (zjsz.length>0&&zjsz.length<100) {
			boolean[][]rwsz=rwm.calQrcode(zjsz);
			for (int i=0;i<rwsz.length;i++) {
				for (int j=0;j<rwsz.length;j++) {
					if(rwsz[j][i]) {
						rwhb.fillRect(j*3+pianyi, i*3+pianyi, 3, 3);
					}
				
				}
			}
		}
		
		
		rwhb.dispose();
		tx.flush();
		
		
		ImageIO.write(tx,"jpg",new File("3.jpg"));
	}
}
