class Player{

	private String name;
	private boolean win;

	public Player(String name, boolean win){
		this.name = name;
		this.win = win;
	}
	public String getName(){
		return name;
	}
	public void setWin(boolean x){
		this.win = x;
	}
	public boolean getWin(){
		return win;
	}
}