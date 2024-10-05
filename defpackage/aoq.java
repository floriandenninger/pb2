package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoq implements Runnable {
    final /* synthetic */ aot a;

    public aoq(aot aotVar) {
        this.a = aotVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.a.b) {
            obj = this.a.d;
            this.a.d = aot.a;
        }
        this.a.l(obj);
    }
}
