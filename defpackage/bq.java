package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bq implements Runnable {
    final /* synthetic */ bv a;

    public bq(bv bvVar) {
        this.a = bvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bv bvVar = this.a;
        bvVar.a.onDismiss(bvVar.d);
    }
}
