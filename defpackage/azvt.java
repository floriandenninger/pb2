package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvt extends azwt implements azvs, aztb {
    public final azsq a;
    public final azsv b;
    public final azvk c;
    public final azvm d;
    public azww e;

    public azvt(azsq azsqVar, int i) {
        super(i);
        this.a = azsqVar;
        boolean z = azwq.a;
        this.b = azsqVar.getContext();
        this.c = azth.p();
        this.d = azth.o(azvp.a);
    }

    public static final void m(aztu aztuVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + aztuVar + ", already has " + obj).toString());
    }

    private static final Object s(azxt azxtVar, Object obj, int i) {
        boolean z;
        if (obj instanceof azwc) {
            boolean z2 = azwq.a;
        } else if (azuj.i(i) && ((z = azxtVar instanceof azvr)) && !z) {
            return new azwb(obj, (azvr) azxtVar, null, 16);
        }
        return obj;
    }

    @Override // defpackage.azvs
    public final void a() {
        boolean z = azwq.a;
        r(this.f);
    }

    public final Object b() {
        return this.d.a;
    }

    @Override // defpackage.azwt
    public final Object c(Object obj) {
        return obj instanceof azwb ? ((azwb) obj).a : obj;
    }

    @Override // defpackage.azwt
    public final Object d() {
        return b();
    }

    @Override // defpackage.azwt
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e == null) {
            return null;
        }
        azsq azsqVar = this.a;
        return (azwq.b && (azsqVar instanceof aztb)) ? baab.a(e, (aztb) azsqVar) : e;
    }

    @Override // defpackage.azwt
    public final azsq f() {
        return this.a;
    }

    @Override // defpackage.azwt
    public final void g(Object obj, Throwable th) {
        azvm azvmVar = this.d;
        while (true) {
            Object obj2 = azvmVar.a;
            if (obj2 instanceof azxt) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof azwc) {
                return;
            }
            if (obj2 instanceof azwb) {
                azwb azwbVar = (azwb) obj2;
                if (azwbVar.d == null) {
                    Object obj3 = azwbVar.a;
                    azvr azvrVar = azwbVar.e;
                    aztu aztuVar = azwbVar.b;
                    Object obj4 = azwbVar.c;
                    if (this.d.c(obj2, new azwb(obj3, azvrVar, th))) {
                        azvr azvrVar2 = azwbVar.e;
                        if (azvrVar2 != null) {
                            p(azvrVar2);
                        }
                        aztu aztuVar2 = azwbVar.b;
                        return;
                    }
                } else {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
            } else if (this.d.c(obj2, new azwb(obj2, null, th, 14))) {
                return;
            }
        }
    }

    @Override // defpackage.aztb
    public final aztb getCallerFrame() {
        azsq azsqVar = this.a;
        if (azsqVar instanceof aztb) {
            return (aztb) azsqVar;
        }
        return null;
    }

    @Override // defpackage.azsq
    public final azsv getContext() {
        return this.b;
    }

    @Override // defpackage.aztb
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void h() {
        azww azwwVar = this.e;
        if (azwwVar == null) {
            return;
        }
        azwwVar.d();
        this.e = azxs.a;
    }

    public final void i() {
        if (k()) {
            return;
        }
        h();
    }

    public final void j() {
        azsq azsqVar = this.a;
        Throwable th = null;
        azzm azzmVar = azsqVar instanceof azzm ? (azzm) azsqVar : null;
        if (azzmVar != null) {
            azvm azvmVar = azzmVar.e;
            while (true) {
                Object obj = azvmVar.a;
                if (obj == azzn.b) {
                    if (azzmVar.e.c(azzn.b, this)) {
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    if (!azzmVar.e.c(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    th = (Throwable) obj;
                } else {
                    throw new IllegalStateException(azul.a("Inconsistent state ", obj).toString());
                }
            }
        }
        if (th == null) {
            return;
        }
        h();
        l(th);
    }

    public final boolean k() {
        return this.f == 2 && ((azzm) this.a).e.a != null;
    }

    public final void l(Throwable th) {
        Object obj;
        boolean z;
        azvm azvmVar = this.d;
        do {
            obj = azvmVar.a;
            if (!(obj instanceof azxt)) {
                return;
            } else {
                z = obj instanceof azvr;
            }
        } while (!this.d.c(obj, new azvv(th, z)));
        azvr azvrVar = z ? (azvr) obj : null;
        if (azvrVar != null) {
            p(azvrVar);
        }
        i();
        r(this.f);
    }

    public final void n(Object obj, int i) {
        Object obj2;
        azvm azvmVar = this.d;
        do {
            obj2 = azvmVar.a;
            if (obj2 instanceof azxt) {
            } else {
                if (!(obj2 instanceof azvv) || !((azvv) obj2).a.b()) {
                    throw new IllegalStateException(azul.a("Already resumed, but proposed with update ", obj).toString());
                }
                return;
            }
        } while (!this.d.c(obj2, s((azxt) obj2, obj, i)));
        i();
        r(i);
    }

    public final baac o(Object obj) {
        Object obj2;
        azvm azvmVar = this.d;
        do {
            obj2 = azvmVar.a;
            if (obj2 instanceof azxt) {
            } else {
                boolean z = obj2 instanceof azwb;
                return null;
            }
        } while (!this.d.c(obj2, s((azxt) obj2, obj, this.f)));
        i();
        return azvu.a;
    }

    public final void p(azvr azvrVar) {
        try {
            azvrVar.b();
        } catch (Throwable th) {
            azth.k(this.b, new azwf(azul.a("Exception in invokeOnCancellation handler for ", this), th));
        }
    }

    @Override // defpackage.azsq
    public final void resumeWith(Object obj) {
        Throwable a = azsb.a(obj);
        if (a != null) {
            if (azwq.b) {
                a = baab.a(a, this);
            }
            obj = new azwc(a);
        }
        n(obj, this.f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation(");
        sb.append(azth.i(this.a));
        sb.append("){");
        Object b = b();
        if (b instanceof azxt) {
            str = "Active";
        } else {
            str = b instanceof azvv ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(azth.h(this));
        return sb.toString();
    }

    private final void r(int i) {
        azvk azvkVar = this.c;
        do {
            int i2 = azvkVar.a;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z = azwq.a;
                azsq azsqVar = this.a;
                if (!(azsqVar instanceof azzm) || azuj.i(i) != azuj.i(this.f)) {
                    azuj.h(this, azsqVar, false);
                    return;
                }
                azwj azwjVar = ((azzm) azsqVar).a;
                azsv context = azsqVar.getContext();
                if (!azwjVar.d(context)) {
                    azwy a = azxw.a.a();
                    if (a.h()) {
                        a.e(this);
                        return;
                    }
                    a.f(true);
                    try {
                        azuj.h(this, this.a, true);
                        do {
                        } while (a.i());
                        return;
                    } catch (Throwable th) {
                        try {
                            q(th, null);
                            return;
                        } finally {
                            a.j();
                        }
                    }
                }
                azwjVar.so(context, this);
                return;
            }
        } while (!this.c.c(0, 2));
    }
}
