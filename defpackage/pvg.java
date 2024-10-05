package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvg {
    public final String a;
    public final boolean b;

    @Deprecated
    public pvg(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z);
        return sb.toString();
    }
}
