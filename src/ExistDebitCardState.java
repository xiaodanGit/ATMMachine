
public class ExistDebitCardState implements State 
{
	private ATMMachine machine;
	
	public ExistDebitCardState(ATMMachine machine)
	{
		this.machine = machine;
	}
	
	@Override
	public void ejectDebitCard() 
	{
		System.out.println("there is no card in machine");
		State noCard = new NoDebitCardState(machine);
		machine.setState(noCard);
	}

	@Override
	public void insertDebitCard() 
	{
		System.out.println("debit card inserted");

	}

}
