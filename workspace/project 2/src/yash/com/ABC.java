package yash.com;

import java.util.Iterator;
import java.util.Set;

public class ABC {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 9;
	}
	
	@Override
	public boolean equals(Object abc) {
		if (this ==abc)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ABC other = (ABC) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args){
		ABC object1= new ABC();
		ABC object2= new ABC();
		object1.setName("A");
		object2.setName("B");
		
		HashSet set= new HashSet();
		HashSet setAbc= new HashSet();
		HashSet setAbc1= new HashSet();
		setAbc.add(object1);
		setAbc1= add(object2);
		
		Iterator it= new Iterator();
		it.
	
		
	}
}
