
public class NoDebitCardState implements State 
{
	private ATMMachine machine;
	
	public NoDebitCardState(ATMMachine machine)
	{
		this.machine = machine;
	}

	@Override
	public void ejectDebitCard() 
	{
		System.out.println("there is no card in machine");
	}

	@Override
	public void insertDebitCard() 
	{
		System.out.println("debit card inserted");
		State hasCard = new ExistDebitCardState(machine);
		machine.setState(hasCard);
		

	}

}
