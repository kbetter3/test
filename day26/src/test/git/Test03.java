package test.git;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test03 {

	public static void main(String[] args) {
		Font font = new Font("궁서", Font.BOLD, 40);
		Frame f = new Frame();
		f.setSize(400, 300);
		
		FlowLayout flow = new FlowLayout();
		flow.setAlignment(FlowLayout.CENTER);
		flow.setHgap(0);
		f.setLayout(flow);
		
		Label label = new Label("이용 약관에 동의하십니까?");
		label.setSize(new Dimension(380, 100));
		label.setPreferredSize(new Dimension(390, 100));
		f.add(label);
		
		
		
		Button yBtn, nBtn;
		yBtn = new Button("예");
		nBtn = new Button("아니오");
		
		MouseListener listener = new MouseListener() {
			Color c = null;
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setText("처리가 완료되었습니다.");
				yBtn.setEnabled(false);
				nBtn.setEnabled(false);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				c = ((Button)e.getSource()).getBackground();
				((Button)e.getSource()).setBackground(Color.YELLOW);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				((Button)e.getSource()).setBackground(c);
			}
			
		};
		
		Dimension d = new Dimension(190, 100);
		yBtn.setSize(d);
		nBtn.setSize(d);
		yBtn.setPreferredSize(d);
		nBtn.setPreferredSize(d);
		yBtn.addMouseListener(listener);
		nBtn.addMouseListener(listener);
		
		f.add(yBtn);
		f.add(nBtn);
		
		f.setVisible(true);
		

	}

}
