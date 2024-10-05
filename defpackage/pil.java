package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pil implements ayx {
    final /* synthetic */ piq a;

    public pil(piq piqVar) {
        this.a = piqVar;
    }

    @Override // defpackage.ayx
    public final void a(byte[] bArr, int i) {
        piq piqVar = this.a;
        if (piqVar.b == 0) {
            piqVar.h.obtainMessage(i, bArr).sendToTarget();
        }
    }
}
