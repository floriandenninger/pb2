package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiv implements Runnable {
    final /* synthetic */ ajh a;

    public aiv(ajh ajhVar) {
        this.a = ajhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fh fhVar = this.a.a;
        if (fhVar != null) {
            fhVar.e();
        }
    }
}
