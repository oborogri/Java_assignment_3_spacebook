package utils;

import java.util.Comparator;

import models.User;

/**
 * Comparator class of two users by number of their friendships
 * 
 * @author Grigore Oboroceanu
 *
 */
public class UserSocialComparator implements Comparator<User> {
	@Override
	public int compare(User a, User b) {
		return Integer.compare(b.friendships.size(), a.friendships.size());
	}
}
