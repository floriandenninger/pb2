package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajdn extends ajdp {
    public Boolean a;
    public Boolean b;
    private Integer c;
    private awos d;
    private acra e;

    @Override // defpackage.ajdp, defpackage.akbp
    public final /* bridge */ /* synthetic */ akbq a() {
        Boolean bool = this.a;
        if (bool == null || this.c == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" counterfactual");
            }
            if (this.c == null) {
                sb.append(" duration");
            }
            if (this.b == null) {
                sb.append(" rateLimited");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajdq(bool.booleanValue(), this.c.intValue(), this.d, this.e, this.b.booleanValue());
    }

    @Override // defpackage.akbm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void e(awos awosVar) {
        this.d = awosVar;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void f(acra acraVar) {
        this.e = acraVar;
    }
}
