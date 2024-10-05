package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azwt extends baam {
    public int f;

    public azwt(int i) {
        super(0L, baal.a);
        this.f = i;
    }

    public Object c(Object obj) {
        return obj;
    }

    public abstract Object d();

    public Throwable e(Object obj) {
        azwc azwcVar = obj instanceof azwc ? (azwc) obj : null;
        if (azwcVar == null) {
            return null;
        }
        return azwcVar.b;
    }

    public abstract azsq f();

    public void g(Object obj, Throwable th) {
        throw null;
    }

    public final void q(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            aynu.g(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        azth.k(f().getContext(), new azwp("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [azsq, aztb] */
    @Override // java.lang.Runnable
    public final void run() {
        Object l;
        Object l2;
        boolean z = azwq.a;
        baan baanVar = this.h;
        try {
            azzm azzmVar = (azzm) f();
            ?? r2 = azzmVar.b;
            Object obj = azzmVar.d;
            azsv context = r2.getContext();
            Object b = baae.b(context, obj);
            if (b != baae.a) {
                azwh.c(r2, context);
            }
            try {
                azsv context2 = r2.getContext();
                Object d = d();
                Throwable e = e(d);
                azxg azxgVar = (e == null && azuj.i(this.f)) ? (azxg) context2.get(azxg.b) : null;
                if (azxgVar != null && !azxgVar.l()) {
                    Throwable h = azxgVar.h();
                    g(d, h);
                    if (azwq.b) {
                        h = baab.a(h, r2);
                    }
                    r2.resumeWith(aype.l(h));
                } else if (e != null) {
                    r2.resumeWith(aype.l(e));
                } else {
                    r2.resumeWith(c(d));
                }
                try {
                    baanVar.f();
                    l2 = azsf.a;
                } catch (Throwable th) {
                    l2 = aype.l(th);
                }
                q(null, azsb.a(l2));
            } finally {
                baae.c(context, b);
            }
        } catch (Throwable th2) {
            try {
                baanVar.f();
                l = azsf.a;
            } catch (Throwable th3) {
                l = aype.l(th3);
            }
            q(th2, azsb.a(l));
        }
    }
}
