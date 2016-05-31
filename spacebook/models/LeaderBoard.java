package models;
/**
* @file    LeaderBoard.java
* @brief   Class publishes users graded most socially and talkatively active
* @version 2016-4-22
* @author  G. Oboroceanu
*/

import java.util.ArrayList;
import java.util.Collections;

import utils.UserSocialComparator;
import utils.UserTalkativeComparator;
import utils.UserLeastTalkativeComparator;
import views.LeaderBoardView;

public class LeaderBoard {
	public static void index(ArrayList<User> users) {

		Collections.sort(users, new UserSocialComparator());
		LeaderBoardView.index(users);
	}

	/**
	 * Method to sort users List by their outbox size
	 * 
	 * @param users
	 */

	public static void talkative(ArrayList<User> users) {
		// TODO: - DONE - Complete implementation of method LeaderBoard.talkative

		Collections.sort(users, new UserTalkativeComparator());
		LeaderBoardView.talkative(users);
	}

	public static void leastTalkative(ArrayList<User> users) {
		// TODO: - DONE - Complete implementation of method

		Collections.sort(users, new UserLeastTalkativeComparator());
		LeaderBoardView.leastTalkative(users);
	}
}
