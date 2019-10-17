public class Lv4 {
    static class MutableStringArray {
        private int size;
        private String[] dynamic;

        public MutableStringArray() {
            dynamic = new String[0];
            size = 0;
        }

        public boolean add(String s) {
            size++;
            String[] tem = new String[size];
            for (int i = 0; i < tem.length - 1; i++)
                tem[i] = dynamic[i];
            tem[tem.length - 1] = s;
            dynamic = tem;
            return true;
        }

        public void add(String[] s) {
            int a = size + s.length;
            String tem[] = new String[a];
            int i = 0;
            while (i < size) {
                tem[i] = dynamic[i];
                i++;
            }
            size += s.length;
            for (int j = 0; i < a; i++, j++) {
                tem[i] = s[j];
            }
            dynamic = tem;
        }

        public boolean addAt(String s, int locate) {
            if (locate > size || locate < 0) {
                System.out.println("非法输入");
                return false;
            }
            size++;
            String[] tem = new String[size];
            for (int i = 0, j = 0; i < size; i++, j++) {
                if (i == locate) {
                    tem[i] = s;
                    j--;
                    continue;
                }
                tem[i] = dynamic[j];
            }
            dynamic = tem;
            return true;
        }

        public boolean deleteLast() {
            if (size <= 0)
                return false;
            size--;
            String[] tem = new String[size];
            for (int i = 0; i < size; i++)
                tem[i] = dynamic[i];
            dynamic = tem;
            return true;
        }

        public boolean deleteAt(int index) {
            if (index < 0 || index > size) {
                System.out.println("超出范围");
                return false;
            }
            size--;
            String[] tem = new String[size];
            for (int i = 0, j = 0; i < size; i++, j++) {
                if (i == index) {
                    j++;
                    tem[i] = dynamic[j];
                }
                tem[i] = dynamic[j];
            }
            dynamic = tem;
            return true;
        }

        public boolean clear() {
            String[] tem = new String[0];
            dynamic = tem;
            return true;
        }

        public void changeAt(int index, String s) {
            String[] tem = new String[size];
            for (int i = 0; i < size; i++) {
                if (i == index)
                    tem[i] = s;
                else
                    tem[i] = dynamic[i];
            }
            dynamic = tem;
        }

        public String get(int index) {
            return dynamic[index];
        }

        public boolean contains(String s) {
            for (int i = 0; i < size; i++)
                if (dynamic[i] == s)
                    return true;
            return false;
        }

        public int getLength() {
            return dynamic.length;
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"A", "B", "C"};
        MutableStringArray mutableStringArray = new MutableStringArray();
        mutableStringArray.add(stringArray); // 此时 {"A","B","C"}

        mutableStringArray.add("D"); // 此时 {"A","B","C","D"}
        mutableStringArray.addAt("E", 0); // 此时 {"E","A","B","C","D"}
        mutableStringArray.deleteLast();// 此时 {"E","A","B","C"}
        mutableStringArray.deleteAt(2);// 此时 {"E","A","C"}
        mutableStringArray.changeAt(2, "F");// 此时 {"E","A","F"}
        System.out.println(mutableStringArray.get(2));// F
        System.out.println(mutableStringArray.contains("C"));// false
        System.out.println(mutableStringArray.getLength());// 3
        mutableStringArray.clear();// 此时 {} 即动态数组是空的，但数组对象仍然存在


    }
}

