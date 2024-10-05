package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayje implements Runnable {
    final /* synthetic */ aygo a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ayjp c;

    public ayje(ayjp ayjpVar, aygo aygoVar, boolean z) {
        this.c = ayjpVar;
        this.a = aygoVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.m.c(this.a, this.b);
    }
}
