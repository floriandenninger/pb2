package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qyg implements rpl {
    public final /* synthetic */ rpv a;
    private final /* synthetic */ int b;

    public /* synthetic */ qyg(rpv rpvVar, int i) {
        this.b = i;
        this.a = rpvVar;
    }

    @Override // defpackage.rpl
    public final void c(Exception exc) {
        if (this.b != 0) {
            this.a.b(null);
        } else {
            this.a.c(exc);
        }
    }
}
