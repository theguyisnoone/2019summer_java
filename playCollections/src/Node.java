import java.util.ArrayList;
import java.util.List;

public class Node {
    // ���ӽڵ�
    public Node leftNode;
    // ���ӽڵ�
    public Node rightNode;
  
    // ֵ
    public Object value;
  
    // ���� ����
    public void add(Object v) {
        // �����ǰ�ڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�ڵ���
        if (null == value)
            value = v;
  
        // �����ǰ�ڵ���ֵ���ͽ����жϣ�������ֵ�뵱ǰֵ�Ĵ�С��ϵ
        else {
            // ������ֵ���ȵ�ǰֵС������ͬ
             
            if ((Integer) v -((Integer)value) <= 0) {
                if (null == leftNode)
                    leftNode = new Node();
                leftNode.add(v);
            }
            // ������ֵ���ȵ�ǰֵ��
            else {
                if (null == rightNode)
                    rightNode = new Node();
                rightNode.add(v);
            }
  
        }
  
    }
  
 // ����������еĽڵ�
    public List<Object> values() {
        List<Object> values = new ArrayList<>();
  
        // ��ڵ�ı������
        if (null != leftNode)
            values.addAll(leftNode.values());
  
        // ��ǰ�ڵ�
        values.add(value);
  
        // �ҽڵ�ı������
        if (null != rightNode)
  
            values.addAll(rightNode.values());
  
        return values;
    }
    }