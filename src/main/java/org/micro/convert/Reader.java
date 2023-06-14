package org.micro.convert;

import java.util.Map;

public abstract class Reader {

    public static enum ValueType {
        STRING, ARRAY, MAP;
    }

    protected int fieldIndex;

    public static final short SIGN_NULL = -1;

    public static final short SIGN_NOLENGTH = -2;

    public static final short SIGN_NOLENBUTBYTES = -3; 

    public abstract void prepare(byte[] content);

    public abstract boolean hasNext(int startPosition, int contentLength);

    public boolean hasNext() {
        return hasNext(-1, -1);
    }

    public abstract int position();

    public abstract int readMemberContentLength(DeMember member, Decodeable decoder);

    public abstract void skipValue();

    public abstract void readBlank();

    public abstract ValueType readType();

    public String readObjectB(final Class clazz) {
        this.fieldIndex = 0;
        return null;
    }

    public abstract void readObjectE(final Class clazz);

    public abstract int readArrayB(DeMember member, byte[] typevals, Decodeable componentDecoder);

    public abstract void readArrayE();

    public abstract int readMapB(DeMember member, byte[] typevals, Decodeable keyDecoder, Decodeable valueDecoder);

    public abstract void readMapE();

    public abstract DeMember readFieldName(final DeMember[] members, Map<String, DeMember> memberFieldMap, Map<Integer, DeMember> memberTagMap);

    public abstract boolean readBoolean();

    public abstract byte readByte();

    public abstract byte[] readByteArray();

    public abstract char readChar();

    public abstract short readShort();

    public abstract int readInt();

    public abstract long readLong();

    public abstract float readFloat();

    public abstract double readDouble();

    public abstract String readSmallString();

    public abstract String readClassName();

    public abstract String readString();

}