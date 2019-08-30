package MyhashMap;

import java.util.LinkedList;

public class MyHashMap implements IHashMap {
    LinkedList<Entry>[] values = new LinkedList[2000];
 
    @Override
    public void put(String key, Object object) {
        // �õ�hashcode
        int hashcode = hashcode(key);
 
        // �ҵ���Ӧ��LinkedList
        LinkedList<Entry> list = values[hashcode];
        // ���LinkedList��null���򴴽�һ��LinkedList
        if (null == list) {
            list = new LinkedList<>();
            values[hashcode] = list;
        }
 
        // �жϸ�key�Ƿ��Ѿ��ж�Ӧ�ļ�ֵ��
        boolean found = false;
        for (Entry entry : list) {
            // ����Ѿ����ˣ����滻��
            if (key.equals(entry.key)) {
                entry.value = object;
                found = true;
                break;
            }
        }
 
        // ���û���Ѿ����ڵļ�ֵ�ԣ��򴴽��µļ�ֵ��
        if (!found) {
            Entry entry = new Entry(key, object);
            list.add(entry);
        }
 
    }
 
    @Override
    public Object get(String key) {
        // ��ȡhashcode
        int hashcode = hashcode(key);
        // �ҵ�hashcode��Ӧ��LinkedList
        LinkedList<Entry> list = values[hashcode];
        if (null == list)
            return null;
 
        Object result = null;
 
        // �����Ƚ�ÿ����ֵ�Ե�key���ҵ�ƥ��ģ�������value
        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                result = entry.value;
                break;
            }
        }
 
        return result;
 
    }
 
    private static int hashcode(String str) {
        // TODO Auto-generated method stub
        if (0 == str.length())
            return 0;
 
        int hashcode = 0;
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            hashcode += cs[i];
        }
        hashcode *= 23;
        // ȡ����ֵ
        hashcode = hashcode < 0 ? 0 - hashcode : hashcode;
        // ����0-1999֮��
        hashcode %= 2000;
 
        return hashcode;
    }
 
    public static void main(String[] args) {
         MyHashMap map =new MyHashMap();
        
         map.put("t", "̹��");
         map.put("adc", "����");
         map.put("apc", "ħ��");
         map.put("t", "̹��2");
        
         System.out.println(map.get("adc"));
        
         System.out.println(map);
         
         System.out.println(map.hashcode("name=hero-2387"));
         System.out.println(map.hashcode("name=hero-5555"));
 
    }
 
    public String toString() {
        LinkedList<Entry> result = new LinkedList();
 
        for (LinkedList<Entry> linkedList : values) {
            if (null == linkedList)
                continue;
            result.addAll(linkedList);
        }
        return result.toString();
    }
 
}
