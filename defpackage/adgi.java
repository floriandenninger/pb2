package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgi {
    public final String a;
    public final String b;

    public adgi(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }
}
