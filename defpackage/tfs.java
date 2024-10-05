package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tfs {
    public String a;
    public ancf b;
    public int[] c;
    public int[] d;
    private aooy e;
    private int f;

    public final tft a() {
        aooy aooyVar;
        String str = this.a;
        if (str == null || (aooyVar = this.e) == null || this.f == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" logSource");
            }
            if (this.e == null) {
                sb.append(" message");
            }
            if (this.f == 0) {
                sb.append(" qosTier");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new tft(str, aooyVar, this.b, this.c, this.d);
    }

    public final void b(aooy aooyVar) {
        if (aooyVar == null) {
            throw new NullPointerException("Null message");
        }
        this.e = aooyVar;
    }

    public final void c() {
        this.f = 1;
    }
}
