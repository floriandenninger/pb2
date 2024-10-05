package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azzm extends azwt implements aztb, azsq {
    public final azwj a;
    public final azsq b;
    public Object c;
    public final Object d;
    public final azvm e;

    public azzm(azwj azwjVar, azsq azsqVar) {
        super(-1);
        this.a = azwjVar;
        this.b = azsqVar;
        this.c = azzn.a;
        this.d = baae.a(getContext());
        this.e = azth.o(null);
    }

    @Override // defpackage.azwt
    public final Object d() {
        Object obj = this.c;
        boolean z = azwq.a;
        this.c = azzn.a;
        return obj;
    }

    @Override // defpackage.azwt
    public final azsq f() {
        return this;
    }

    @Override // defpackage.azwt
    public final void g(Object obj, Throwable th) {
        if (obj instanceof azwd) {
            aztu aztuVar = ((azwd) obj).a;
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [azsq, aztb] */
    @Override // defpackage.aztb
    public final aztb getCallerFrame() {
        return this.b;
    }

    @Override // defpackage.azsq
    public final azsv getContext() {
        return this.b.getContext();
    }

    @Override // defpackage.aztb
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.azsq
    public final void resumeWith(Object obj) {
        azsv context = this.b.getContext();
        Object l = azth.l(obj);
        if (this.a.d(context)) {
            this.c = l;
            this.f = 0;
            this.a.so(context, this);
            return;
        }
        boolean z = azwq.a;
        azwy a = azxw.a.a();
        if (a.h()) {
            this.c = l;
            this.f = 0;
            a.e(this);
            return;
        }
        a.f(true);
        try {
            azsv context2 = getContext();
            Object b = baae.b(context2, this.d);
            try {
                this.b.resumeWith(obj);
                do {
                } while (a.i());
            } finally {
                baae.c(context2, b);
            }
        } catch (Throwable th) {
            try {
                q(th, null);
            } finally {
                a.j();
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + azth.i(this.b) + ']';
    }
}
