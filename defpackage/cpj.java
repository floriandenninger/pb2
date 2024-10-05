package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpj implements dbw {
    private final aes a;

    public cpj(aes aesVar) {
        this.a = aesVar;
    }

    @Override // defpackage.dbw
    public final boolean a(csz cszVar, Object obj, dcl dclVar, boolean z) {
        aes aesVar = this.a;
        Throwable th = cszVar;
        if (cszVar == null) {
            th = new RuntimeException("Unknown error");
        }
        aesVar.d(th);
        return true;
    }

    @Override // defpackage.dbw
    public final boolean ka(Object obj, Object obj2, int i) {
        try {
            this.a.c(new clu(obj, null));
            return true;
        } catch (Throwable th) {
            this.a.d(th);
            return true;
        }
    }
}
