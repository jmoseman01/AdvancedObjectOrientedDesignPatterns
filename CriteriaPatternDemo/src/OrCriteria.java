import java.util.List;

public class OrCriteria implements Criteria{
	private Criteria criteria;
	private Criteria otherCriteria;


	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}



	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		//construct first and other criteria and run meet criteria on them
		List<Person> firstCriteriaItems=criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems=otherCriteria.meetCriteria(persons);
		//traverse other criteria items and check if the first one missed anything
		//if so add it to the first criteria items
		for(Person person: otherCriteriaItems)
		{
			if(!firstCriteriaItems.contains(person))
			{
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}

}
