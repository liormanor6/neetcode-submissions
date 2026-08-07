class Twitter {
    HashMap<Integer, HashSet<Integer>> userToFollowing;
    Stack<Tweet> tweets;
    HashSet<Integer> users;
 
    public Twitter() {
        userToFollowing = new HashMap<>();
        tweets = new Stack<Tweet>();
        users = new HashSet<>();
    }   
    
    public void postTweet(int userId, int tweetId) {
        if (!users.contains(userId))
            users.add(userId);
        Tweet tweet = new Tweet(userId, tweetId);
        tweets.push(tweet);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> newsFeed = new ArrayList<>();
        HashSet<Integer> following = userToFollowing.get(userId);
        Stack<Tweet> copyOfTweets = new Stack<Tweet>();
        copyOfTweets.addAll(tweets);
        while (!copyOfTweets.empty() && newsFeed.size() < 10)
        {
            Tweet curr = copyOfTweets.pop();
            if ((following != null && following.contains(curr.userId)) || curr.userId == userId)
            {
                newsFeed.add(curr.tweetId);
            }
        }
        return newsFeed;
    }
    
    public void follow(int followerId, int followeeId) {
        if (!users.contains(followerId))
            users.add(followerId);
        if (!users.contains(followeeId))
            users.add(followeeId);
        HashSet<Integer> defaultSet = new HashSet<>();
        HashSet<Integer> followingSet = userToFollowing.getOrDefault(followerId, defaultSet);
        followingSet.add(followeeId);
        userToFollowing.put(followerId, followingSet);
        return;
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (!users.contains(followerId))
            users.add(followerId);
        if (!users.contains(followeeId))
            users.add(followeeId);
        HashSet<Integer> defaultSet = new HashSet<>();
        HashSet<Integer> followingSet = userToFollowing.getOrDefault(followerId, defaultSet);
        if (!followingSet.contains(followeeId))
            return;
        followingSet.remove(followeeId);
        userToFollowing.put(followerId, followingSet);
        return;
    }

    public class Tweet {
        int userId;
        int tweetId;
        public Tweet (int userId, int tweetId)
        {
            this.userId = userId;
            this.tweetId = tweetId;
        }
    }
}
