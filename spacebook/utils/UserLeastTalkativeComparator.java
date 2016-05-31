package utils;

import java.util.Comparator;

import models.User;

/**
 * Class to facilitate comparator of two users by their outbox size
 * 
 * @author Grigore Oboroceanu
 *
 */
public class UserLeastTalkativeComparator implements Comparator<User> {
	@Override
	public int compare(User a, User b) {

		// TODO: - DONE - Complete implementation of method
		// UserLeastTalkativeComparator.compare
		
		return Integer.compare(a.outbox.size(), b.outbox.size());
	}
}