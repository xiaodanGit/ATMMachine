
public class ATMMachine 
{
	private State machineState;
	
	public ATMMachine()
	{
		machineState = new NoDebitCardState(this);
	}
	
	public State getState()
	{
		return this.machineState;
	}
	
	public void setState(State state)
	{
		this.machineState = state;
	}
	
	public void insertDebitCard()
	{
		machineState.insertDebitCard();
	}
	
	public void ejectDebitCard()
	{
		machineState.ejectDebitCard();
	}
	

}
