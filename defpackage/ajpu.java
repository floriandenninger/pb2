package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajpu {
    public Long a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;

    public ajpu() {
    }

    public ajpu(ahtg ahtgVar) {
        this.d = Integer.valueOf(ahtgVar.a);
        this.e = Integer.valueOf(ahtgVar.b);
        this.a = Long.valueOf(ahtgVar.c);
        this.b = Integer.valueOf(ahtgVar.d);
        this.c = Integer.valueOf(ahtgVar.e);
    }

    public final ahtg a() {
        Integer num = this.d;
        if (num == null || this.e == null || this.a == null || this.b == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" maximumBarHeight");
            }
            if (this.e == null) {
                sb.append(" minimumBarHeight");
            }
            if (this.a == null) {
                sb.append(" showHideAnimationDurationMillis");
            }
            if (this.b == null) {
                sb.append(" barGap");
            }
            if (this.c == null) {
                sb.append(" highlightWidth");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ahtg(num.intValue(), this.e.intValue(), this.a.longValue(), this.b.intValue(), this.c.intValue());
    }

    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void d(long j) {
        this.a = Long.valueOf(j);
    }
}
