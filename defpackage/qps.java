package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qps implements Runnable {
    final /* synthetic */ qpt a;

    public qps(qpt qptVar) {
        this.a = qptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qnv qnvVar = this.a.a.b;
        qnvVar.f(String.valueOf(qnvVar.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
