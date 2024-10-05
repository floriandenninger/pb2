package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acbo {
    public String b;
    public int a = -1;
    public int c = -1;

    public final String toString() {
        int i = this.a;
        String str = i != 0 ? i != 1 ? "UNKNOWN" : "ERROR" : "SUCCESS";
        String str2 = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 50 + String.valueOf(str2).length());
        sb.append("[ status=");
        sb.append(str);
        sb.append(", statusMesg=");
        sb.append(str2);
        sb.append(", mesgStreamId=");
        sb.append(i2);
        sb.append(" ]");
        return sb.toString();
    }
}
