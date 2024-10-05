package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acfj implements Runnable {
    final /* synthetic */ acfk a;

    public acfj(acfk acfkVar) {
        this.a = acfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acfk acfkVar = this.a;
        if (acfkVar.f) {
            return;
        }
        acfkVar.g();
    }
}
