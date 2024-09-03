package AdapterDesingPattern.Adapter;

import AdapterDesingPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter  {

	WeightMachine weightMachine;
	
	
	public WeightMachineAdapterImpl(WeightMachine weightMachine) {
		
		this.weightMachine = weightMachine;
	}


	@Override
	public double getWeightInKg() {
		double weightInPound = this.weightMachine.getWeightInPound();
		
		double weightInKg =  weightInPound *.45;
		return weightInKg;
	}

	
	

}
