package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajkt implements dbw {
    private final aksl a;

    public ajkt(aksl akslVar) {
        this.a = akslVar;
    }

    @Override // defpackage.dbw
    public final boolean a(csz cszVar, Object obj, dcl dclVar, boolean z) {
        this.a.b("GLIDE", "UNKNOWN", true);
        return false;
    }

    @Override // defpackage.dbw
    public final /* bridge */ /* synthetic */ boolean ka(Object obj, Object obj2, int i) {
        aksl akslVar = this.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        akslVar.b("GLIDE", i2 != 1 ? i2 != 2 ? i2 != 4 ? "UNKNOWN" : "MEMORY" : "DISK" : "NOT_CACHED", false);
        return false;
    }
}
