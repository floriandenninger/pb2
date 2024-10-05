package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajke implements ykl {
    private final ykl a;
    private final amnv b;
    private final String c = "NOT_CACHED";

    public ajke(ykl yklVar, amnv amnvVar) {
        this.a = yklVar;
        this.b = amnvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(ylz ylzVar) {
        return ylzVar instanceof ymh ? "MEMORY" : ylzVar instanceof ymk ? "DISK" : "UNKNOWN";
    }

    @Override // defpackage.ykl
    public final void a(Object obj, Exception exc) {
        if (((ammv) this.b.get()).h()) {
            ((aksl) ((ammv) this.b.get()).c()).b("DEFAULT_IMAGE_CLIENT", this.c, true);
        }
        this.a.a(obj, exc);
    }

    @Override // defpackage.ykl
    public final void b(Object obj, Object obj2) {
        if (((ammv) this.b.get()).h()) {
            ((aksl) ((ammv) this.b.get()).c()).b("DEFAULT_IMAGE_CLIENT", this.c, false);
        }
        this.a.b(obj, obj2);
    }
}
