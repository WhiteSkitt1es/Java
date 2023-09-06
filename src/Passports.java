import java.util.HashMap;
import java.util.Map;

public class Passports {

    private Map<String, String> map = new HashMap<>();

    void add(String passnum, String lastname) {
        map.put(passnum, lastname);
    }

    String getbypassnum(String passnum) {
        return passnum + " : " + map.get(passnum);
    }

    String getByLastname(String lastname) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(lastname)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(lastname);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll() {
        return map.toString();
    }
}
