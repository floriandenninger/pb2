package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhy implements Runnable {
    final /* synthetic */ Boolean a;
    final /* synthetic */ rid b;

    public rhy(rid ridVar, Boolean bool) {
        this.b = ridVar;
        this.a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.S(this.a, true);
    }
}
