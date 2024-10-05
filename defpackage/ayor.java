package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayor implements aypb {
    public int a;
    public boolean b;
    private final axzr c;
    private boolean d;
    private boolean e;

    public ayor() {
    }

    public ayor(axzr axzrVar) {
        this.a = 1;
        this.b = true;
        this.d = false;
        this.e = false;
        this.c = axzrVar;
    }

    @Override // defpackage.aypb
    public final void a() {
        this.c.c();
        this.e = true;
    }

    @Override // defpackage.aypb
    public final void b(Throwable th) {
        this.c.b("Cancelled by client with StreamObserver.onError()", th);
        this.d = true;
    }

    @Override // defpackage.aypb
    public final void c(Object obj) {
        amkq.O(!this.d, "Stream was terminated by error, no further calls are allowed");
        amkq.O(!this.e, "Stream is already completed, no further calls are allowed");
        this.c.e(obj);
    }

    public final void d(Throwable th) {
        this.c.b("Reset conversation", th);
    }

    public final void e() {
        this.c.d(1);
    }
}
