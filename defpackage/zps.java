package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zps implements Runnable {
    final /* synthetic */ zpt a;

    public zps(zpt zptVar) {
        this.a = zptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zpt zptVar = this.a;
        zptVar.e.b.removeCallbacks(zptVar.d);
        this.a.e.c();
        zpt zptVar2 = this.a;
        if (zptVar2.a != null || zptVar2.b == null) {
            return;
        }
        zptVar2.e.b.postDelayed(zptVar2.d, zptVar2.c);
    }
}
