package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udi implements uau {
    private final twx a;
    private final ammv b;

    public udi(twx twxVar, ammv ammvVar) {
        this.a = twxVar;
        this.b = ammvVar;
    }

    @Override // defpackage.uau
    public final void a(String str, aooy aooyVar, Throwable th) {
        tzk.g("RemoveTargetCallback", "Unregistration finished for account: %s (FAILURE).", str);
        try {
            twp b = this.a.b(str).b();
            b.d(twb.FAILED_UNREGISTRATION);
            this.a.e(b.a());
            ((afyo) ((amna) this.b).a).c(th);
        } catch (tww unused) {
        }
    }

    @Override // defpackage.uau
    public final void b(String str, aooy aooyVar, aooy aooyVar2) {
        tzk.e("RemoveTargetCallback", "Unregistration finished for account: %s (SUCCESS).", str);
        try {
            twp b = this.a.b(str).b();
            b.d(twb.UNREGISTERED);
            b.f = 0L;
            b.e = 0L;
            b.c(0);
            this.a.e(b.a());
            ((afyo) ((amna) this.b).a).d();
        } catch (tww unused) {
        }
    }
}
