package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ded extends axks {
    public ded(String str) {
        super(str);
    }

    public abstract long[] k();

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int length = k().length;
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 24);
        sb.append(simpleName);
        sb.append("[entryCount=");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}
