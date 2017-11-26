package twelve;

import java.util.NoSuchElementException;

public class Chapter12_6_3 {

}

class DynamicsFieldException extends Exception {
    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        try {
            df.setField("A", "AAA");
            df.setField("B", "BBB");
            df.setField("C", "CCC");
            System.out.println(df);
            df.setField("B", "bbb");
            df.setField("D", "DDD");
            System.out.println(df);
            System.out.println("df.getField(\"D\")--->"+df.getField("D").toString());
            df.setField("F", null);
        } catch (DynamicsFieldException e) {
            e.printStackTrace();
        }
    }
}

class DynamicFields {
    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = new Object[]{null, null};
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Object[] obj : fields) {
            builder.append(obj[0]);
            builder.append(":");
            builder.append(obj[1]);
            builder.append("\n");
        }
        return builder.toString();
    }

    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchElementException{
        int fieldNum = hasField(id);
        if (fieldNum == -1) {
            throw new NoSuchElementException();
        }
        return fieldNum;
    }

    private int makeField(String id) {
        for(int i=0;i<fields.length;i++) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
        //No empty fields add one element
        Object[][] tem = new Object[fields.length + 1][2];
        for(int i = 0; i < fields.length; i++) {
            tem[i] = fields[i];
        }
        for(int i = fields.length;i<tem.length;i++) {
            tem[i] = new Object[]{null, null};
        }
        fields = tem;
        return makeField(id);
    }

    public Object getField(String id) throws NoSuchElementException{
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, String value) throws DynamicsFieldException {
        if (value == null) {
            DynamicsFieldException dfe = new DynamicsFieldException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if (fieldNumber == -1) {
            fieldNumber = makeField(id);
        }
        Object result = null;
        try {
            result = getField(id);
        } catch (NoSuchElementException e) {
            throw new RuntimeException();
        }
        fields[fieldNumber][1] = value;
        return result;
    }

}