package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbd implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ afbs b;

    public afbd(afbs afbsVar, String str) {
        this.b = afbsVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j.post(new afbc(this));
    }
}
