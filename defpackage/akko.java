package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akko implements Runnable {
    final /* synthetic */ akkq a;

    public akko(akkq akkqVar) {
        this.a = akkqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        akiv akivVar = this.a.a;
        akivVar.r = true;
        akivVar.c();
    }
}
