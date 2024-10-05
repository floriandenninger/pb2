package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anmq implements anjy {
    private final ankb a;
    private final byte[] b = {0};

    public anmq(ankb ankbVar) {
        this.a = ankbVar;
    }

    @Override // defpackage.anjy
    public final byte[] a(byte[] bArr) {
        anjz anjzVar = this.a.b;
        if (anjzVar.c == 4) {
            return aocz.av(anjzVar.a(), ((anjy) this.a.b.a).a(aocz.av(bArr, this.b)));
        }
        return aocz.av(anjzVar.a(), ((anjy) this.a.b.a).a(bArr));
    }
}
