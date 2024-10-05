package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtw {
    public CharSequence a;
    public CharSequence b;
    public avgg c;
    private Integer d;
    private Integer e;

    public adtw() {
    }

    public adtw(adtx adtxVar) {
        this.a = adtxVar.a;
        this.b = adtxVar.b;
        this.d = Integer.valueOf(adtxVar.c);
        this.e = Integer.valueOf(adtxVar.d);
        this.c = adtxVar.e;
    }

    public final adtx a() {
        Integer num = this.d;
        if (num == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" adProgressMillis");
            }
            if (this.e == null) {
                sb.append(" skippableState");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adtx(this.a, this.b, num.intValue(), this.e.intValue(), this.c);
    }

    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }
}
