package introspect.Assignment31;

import java.util.HashMap;

public class InMemoryStore {

    private static InMemoryStore instance;
    private HashMap<Integer, Integer> store;

    private InMemoryStore() {
        // default constructor made private
        this.store = new HashMap<>();
    }

    public static InMemoryStore getInstance() {
        if (instance == null) {
            instance = new InMemoryStore();
        }
        return instance;
    }

    public void PUT(final int key, final int value) {
        this.store.put(key, value);
    }

    public int GET(final int key) {
        if (this.store.containsKey(key)) {
            return this.store.get(key);
        }
        return -1;
    }
}
