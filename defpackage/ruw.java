package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ruw implements Runnable {
    final /* synthetic */ rvd a;

    public ruw(rvd rvdVar) {
        this.a = rvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.h == rvc.EXPLORE && this.a.i.contains(rvc.DESCRIBE)) {
            this.a.e(rvc.DESCRIBE);
        }
    }
}
