package washingMachine;

public class Wash extends InUse implements WashingMachineState {

	WashingMachine myMachine;
	
	public Wash(WashingMachine washingMachine) {
		super(washingMachine);
	}

}
