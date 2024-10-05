package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class syo {
    public Integer a;
    public Boolean b;
    public Boolean c;
    private Float d;
    private Boolean e;

    public syo() {
    }

    public syo(syp sypVar) {
        this.a = Integer.valueOf(sypVar.a);
        this.d = Float.valueOf(sypVar.b);
        this.b = Boolean.valueOf(sypVar.c);
        this.c = Boolean.valueOf(sypVar.d);
        this.e = Boolean.valueOf(sypVar.e);
    }

    public final syp a() {
        Integer num = this.a;
        if (num == null || this.d == null || this.b == null || this.c == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" initRangeSize");
            }
            if (this.d == null) {
                sb.append(" rangeRatio");
            }
            if (this.b == null) {
                sb.append(" computeRangeOnSyncLayout");
            }
            if (this.c == null) {
                sb.append(" recyclerViewItemPrefetch");
            }
            if (this.e == null) {
                sb.append(" useLegacyVisible");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new syp(num.intValue(), this.d.floatValue(), this.b.booleanValue(), this.c.booleanValue(), this.e.booleanValue());
    }

    public final void b(float f) {
        this.d = Float.valueOf(f);
    }

    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }
}
