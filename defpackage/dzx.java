package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dzx implements qxp {
    final /* synthetic */ qxe a;

    public dzx(qxe qxeVar) {
        this.a = qxeVar;
    }

    @Override // defpackage.qxp
    public final void a(int i, long j) {
        this.a.d(i, System.currentTimeMillis() - j);
    }

    @Override // defpackage.qxp
    public final void b(int i, long j, String str) {
        this.a.e(i, System.currentTimeMillis() - j, str);
    }
}
