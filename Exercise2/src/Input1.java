import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Input1 {
	Map<String, List<String>> map = new HashMap<>();
	
	public void readInput(String acountry, String astate) {
//		if(map.containsKey(acountry)) {
//			//map.put()
//			map.get(acountry).add(astate);
//		} else {
//			map.put(acountry, new ArrayList<>());
//			map.get(acountry).add(astate);
//		}
		map.putIfAbsent(acountry, new ArrayList<String>());
		map.get(acountry).add(astate);
	}
	
	public void print() {
//		for(HashMap.Entry<String,List<String>> entry : map.entrySet()) {
//			System.out.println("--------"+entry.getKey()+"-----------");
//			
//			for(int i=0;i<entry.getValue().size();i++) {
//				System.out.println(entry.getValue().get(i));
//			}	
//			
////			map.forEach((key, value) -> System.out.println(key+ value));
//		}
		map.forEach((country,stateList) -> {
			System.out.println("------"+country+"------");
			stateList.forEach(state -> System.out.println(state) );
			
		});
	}
}
