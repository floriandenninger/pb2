package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afyo {
    private final acpz a;

    public afyo(acpz acpzVar) {
        this.a = acpzVar;
    }

    private final void e(int i) {
        this.a.b(new acpx(i - 1, 10), aqxl.FLOW_TYPE_CHIME_REGISTRATION);
    }

    public final void a(Throwable th) {
        e(6);
        afsi.c(2, 7, "Chime registration error", th);
    }

    public final void b() {
        e(5);
    }

    public final void c(Throwable th) {
        e(8);
        afsi.c(2, 7, "Chime unregistration error", th);
    }

    public final void d() {
        e(7);
    }
}
