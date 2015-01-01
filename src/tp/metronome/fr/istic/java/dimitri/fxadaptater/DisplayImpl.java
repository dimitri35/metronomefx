package fr.istic.java.dimitri.fxadaptater;

import javafx.scene.text.Text;

public class DisplayImpl implements Display {

	private Text tempoBpm ;
	
	public DisplayImpl(Text texte) {
		tempoBpm = texte ;
	}
	
	@Override
	public void setText(String texte) {
		tempoBpm.setText(texte);
	}

	@Override
	public String getText() {
		return tempoBpm.getText() ;
	}

}
