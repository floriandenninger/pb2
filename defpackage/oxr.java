package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxr implements Runnable {
    final /* synthetic */ ozh a;
    final /* synthetic */ oxt b;

    public oxr(oxt oxtVar, ozh ozhVar) {
        this.b = oxtVar;
        this.a = ozhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.e(this.a);
    }
}
