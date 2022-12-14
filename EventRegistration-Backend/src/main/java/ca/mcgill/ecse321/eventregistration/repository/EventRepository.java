package ca.mcgill.ecse321.eventregistration.repository;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.eventregistration.model.Event;

public interface EventRepository extends CrudRepository<Event, String> {
	public Event findEventByName(String name);
}
