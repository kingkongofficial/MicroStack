package org.micro.convert;

import java.util.Map;

public abstract class Reader {

    /**
     * ValueType
     */
    public static enum ValueType {
        STRING, ARRAY, MAP;
    }

    protected int fieldIndex;

    public static final short SIGN_NULL = 1;
    public static final short SIGN_NOLENGTH = 2;
    public static final short SIGN_NOLENBUTBYTES = 3;

    public abstract void prepare(byte[] content);

    public abstract boolean hasNext(int startPosition, int contentLength);

    public boolean hasNext() {
        return hasNext(-1, -1);
    }

    public abstract int position();

    public abstract void skipValue();

    public abstract void readBlank();
    
}
