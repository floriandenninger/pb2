package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axv implements ayx {
    final /* synthetic */ aye a;

    public axv(aye ayeVar) {
        this.a = ayeVar;
    }

    @Override // defpackage.ayx
    public final void a(byte[] bArr, int i) {
        axw axwVar = this.a.l;
        pse.c(axwVar);
        axwVar.obtainMessage(i, bArr).sendToTarget();
    }
}
