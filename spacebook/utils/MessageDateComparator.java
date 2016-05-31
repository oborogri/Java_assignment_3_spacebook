package utils;

import java.util.Comparator;

import models.Message;

/**
 * Class to facilitate message comparison by date sent
 * 
 * @author Grigore Oboroceanu
 * 
 */
public class MessageDateComparator implements Comparator<Message> {
	@Override
	public int compare(Message a, Message b) {
		// TODO: - DONE - Complete implementation of method MessageDateComparator.compare

		return a.postedAt.compareTo(b.postedAt);
	}
}
