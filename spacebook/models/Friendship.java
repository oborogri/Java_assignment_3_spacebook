package models;

/**
 * Class to describe Friendship model
 *
 * @author Grigore Oboroceanu version 20-04-2016
 *
 */
public class Friendship {
	User sourceUser;
	public User targetUser;

	/*
	 * A Friendship consists of two users sourceUser - originator of the
	 * Friendship and friend targetUser
	 * 
	 */
	public Friendship(User sourceUser, User targetUser) {
		this.sourceUser = sourceUser;
		this.targetUser = targetUser;
	}

	@Override
	public String toString() {
		return targetUser.firstName + ",s friend is " + targetUser.lastName;
	}
}
