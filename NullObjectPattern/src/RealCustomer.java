
public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name=name;
	}

	@Override
	public Boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}


}
