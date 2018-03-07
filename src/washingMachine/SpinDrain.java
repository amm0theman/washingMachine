package washingMachine;

public class SpinDrain extends InUse implements WashingMachineState {

	WashingMachine myMachine;
	
	public SpinDrain(WashingMachine washingMachine) {
		super(washingMachine);
	}

}
