interface StarPlayer{
	public abstract void hide();
	int MAX_POWER=50;
	public default void kick() {
		System.out.println("star player kick");
	}
	
}



interface Player{
	int MAX_POWER=100;
	int MIN_POWER=0;
	
	void attack();
	void defense();
	public default void kick()
	{
		System.out.println("Player Kick");
	}
	void punch();
}


interface HybridPlayer extends Player,StarPlayer
{

	@Override
	default void kick() {
		// TODO Auto-generated method stub
		Player.super.kick();
		StarPlayer.super.kick();
		
	}
	
}

class Player1 implements Player,StarPlayer{

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		Player.super.kick();
	}
	
}


class Player2 implements Player{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Player1 x=new Player1();
		x.attack();
		x.defense();
		x.kick();
		x.punch();
	}
}
