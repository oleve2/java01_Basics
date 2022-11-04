package Task13_generics;

class DoubleBox<T> {
    private RandomBox<T> first;
    private RandomBox<T> second;
    public Integer len = 0;

    public boolean put(int key, T value) { // ваш код
        if (this.first == null || this.first.getKey() == key) {
            this.first.setValue(key, value);
            return true;
        }
        if (this.second == null || this.second.getKey() == key) {
            this.second.setValue(key, value);
            return true;
        }
        return false;
    }

    public T get(int key) { // ваш код
        try {
            System.out.println(this.first.getKey());
            if (this.first.getKey() == key) {
                return this.first.getValue();
            } else if (this.second.getKey() == key) {
                return this.second.getValue();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    public int size() { //int
        // ваш код
        System.out.println("checking size");
        if (this.first != null) {
            this.len += 1;
            System.out.println("first exists new len=" + this.len);
        }
        if (this.second != null) {
            this.len += 1;
            System.out.println("second exists new len=" + this.len);
        }
        return this.len;
    }
}
