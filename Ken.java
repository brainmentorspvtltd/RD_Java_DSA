

//public class Ken implements IPlayer , IStarPlayer {
public class Ken implements IHybridPlayer{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Ken Jump "+MAX);
		
	}

	@Override
	public void punch() {
		System.out.println("Punch High");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		System.out.println("Kick Low");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hideShow() {
		// TODO Auto-generated method stub
		System.out.println("Hide Show Fn Added");
	}

	@Override
	public void flyingKick() {
		// TODO Auto-generated method stub
		
	}

}
