package utils;

import java.util.Comparator;

import models.User;

/**
 * Comparator class of two users by their outbox size
 * 
 * @author Grigore Oboroceanu
 *
 */
public class UserTalkativeComparator implements Comparator<User>
{
  @Override
  public int compare(User a, User b)
  {
    return Integer.compare (b.outbox.size(), a.outbox.size());
  }
}
