package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pcb implements Runnable {
    final /* synthetic */ pcg a;

    public pcb(pcg pcgVar) {
        this.a = pcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pcd pcdVar = this.a.a;
        if (pcdVar.a != null) {
            pcdVar.a = null;
        }
    }
}
