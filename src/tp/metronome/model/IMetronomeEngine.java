package tp.metronome.model;

public interface IMetronomeEngine {
		
	public int getTempoBPM();
	
	public void setTempoBPM(int tempoBPM);
	
	public int getTempsParMesure();
	
	public void setTempsParMesure(int mesure);
	
	public void Start();
	
	public void Stop();
	
	public void inc();
	
	public void dec();
	
	public boolean isOn();

	public void setOn(boolean on);
	
	/*public void addObserver();
	
	public void removeObserver();
	
	public void notifyObserver();*/

	
}
