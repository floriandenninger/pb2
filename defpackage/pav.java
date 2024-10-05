package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class pav {
    public final long d;
    public final ozv e;
    public final long f;
    public final String g;
    public final String h;
    public final pas i;

    public abstract pah h();

    public abstract pas i();

    public pav(String str, long j, ozv ozvVar, String str2, pbb pbbVar, String str3) {
        this.d = j;
        this.e = ozvVar;
        if (str3 == null) {
            String str4 = ozvVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + str4.length());
            sb.append(str);
            sb.append(".");
            sb.append(str4);
            sb.append(".");
            sb.append(j);
            str3 = sb.toString();
        }
        this.h = str3;
        this.i = pbbVar.e(this);
        this.f = pgz.i(pbbVar.h, 1000000L, pbbVar.g);
        this.g = str2;
    }
}
