package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dee {
    public int a;
    public final int b;

    public dee(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(44);
        sb.append("Entry{count=");
        sb.append(i);
        sb.append(", offset=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
