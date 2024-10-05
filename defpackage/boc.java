package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class boc implements Runnable {
    final /* synthetic */ bod a;

    public boc(bod bodVar) {
        this.a = bodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bof bofVar = this.a.a;
        if (bofVar.w != null) {
            bofVar.w = null;
            if (bofVar.M) {
                bofVar.o(bofVar.N);
            }
        }
    }
}
