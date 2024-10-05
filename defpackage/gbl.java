package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbl extends akbp {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public awos d;
    public acra e;
    private Integer f;

    @Override // defpackage.akbp
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gbm a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rateLimited");
            }
            if (this.b == null) {
                sb.append(" shownOnFullscreen");
            }
            if (this.c == null) {
                sb.append(" counterfactual");
            }
            if (this.f == null) {
                sb.append(" duration");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new gbm(bool.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.f.intValue(), this.d, this.e);
    }

    @Override // defpackage.akbm
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void d(int i) {
        this.f = Integer.valueOf(i);
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
