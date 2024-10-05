package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxq implements Runnable {
    final /* synthetic */ ozg a;
    final /* synthetic */ oxt b;

    public oxq(oxt oxtVar, ozg ozgVar) {
        this.b = oxtVar;
        this.a = ozgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.d(this.a);
    }
}
