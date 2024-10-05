package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aolo implements aooy {
    protected int memoizedHashCode = 0;

    @Deprecated
    protected static void addAll(Iterable iterable, Collection collection) {
        aoln.addAll(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(aomf aomfVar) {
        if (!aomfVar.q()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf(str).length());
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(aopq aopqVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int a = aopqVar.a(this);
        setMemoizedSerializedSize(a);
        return a;
    }

    public aopc mutableCopy() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public aoqb newUninitializedMessageException() {
        return new aoqb();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aooy
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            aomp ak = aomp.ak(bArr);
            writeTo(ak);
            ak.an();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // defpackage.aooy
    public aomf toByteString() {
        try {
            int serializedSize = getSerializedSize();
            aomf aomfVar = aomf.b;
            byte[] bArr = new byte[serializedSize];
            aomp ak = aomp.ak(bArr);
            writeTo(ak);
            return aocz.s(ak, bArr);
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // defpackage.aooy
    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        aomp al = aomp.al(outputStream, aomp.V(aomp.ae(serializedSize) + serializedSize));
        al.D(serializedSize);
        writeTo(al);
        al.i();
    }

    @Override // defpackage.aooy
    public void writeTo(OutputStream outputStream) {
        aomp al = aomp.al(outputStream, aomp.V(getSerializedSize()));
        writeTo(al);
        al.i();
    }

    public static void addAll(Iterable iterable, List list) {
        aoln.addAll(iterable, list);
    }
}
