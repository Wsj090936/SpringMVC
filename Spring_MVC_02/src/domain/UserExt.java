package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserExt {
	private User user;
	private List<User> userList;
	private Map<String,Object> maps = new HashMap<>();
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserExt [user=" + user + ", userList=" + userList + ", maps=" + maps + "]";
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	
}
