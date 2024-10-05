package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azvo extends azxo implements azxg, azsq, azwo {
    public final azsv a;

    public azvo(azsv azsvVar) {
        u((azxg) azsvVar.get(azxg.b));
        this.a = azsvVar.plus(this);
    }

    @Override // defpackage.azxo
    protected final String a() {
        return azul.a(azth.g(this), " was cancelled");
    }

    @Override // defpackage.azxo
    public final String b() {
        String a = azwh.a(this.a);
        if (a == null) {
            return azth.g(this);
        }
        return '\"' + a + "\":" + azth.g(this);
    }

    @Override // defpackage.azxo
    public final void c(Throwable th) {
        azth.k(this.a, th);
    }

    @Override // defpackage.azxo
    protected final void d(Object obj) {
        if (obj instanceof azwc) {
            azwc azwcVar = (azwc) obj;
            Throwable th = azwcVar.b;
            azwcVar.c.a();
        }
    }

    protected void e() {
        g();
    }

    @Override // defpackage.azsq
    public final azsv getContext() {
        return this.a;
    }

    @Override // defpackage.azsq
    public final void resumeWith(Object obj) {
        Object q;
        Object l = azth.l(obj);
        do {
            q = super.q(p(), l);
            if (q == azxp.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + l;
                azwc azwcVar = l instanceof azwc ? (azwc) l : null;
                throw new IllegalStateException(str, azwcVar != null ? azwcVar.b : null);
            }
        } while (q == azxp.c);
        if (q == azxp.b) {
            return;
        }
        e();
    }
}
