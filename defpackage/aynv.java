package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aynv implements Runnable {
    final /* synthetic */ aynw a;
    final /* synthetic */ aynx b;
    final /* synthetic */ Object c;
    final /* synthetic */ ayny d;

    public aynv(ayny aynyVar, aynw aynwVar, aynx aynxVar, Object obj) {
        this.d = aynyVar;
        this.a = aynwVar;
        this.b = aynxVar;
        this.c = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                try {
                    this.b.b(this.c);
                    this.d.a.remove(this.b);
                    if (this.d.a.isEmpty()) {
                        this.d.b.shutdown();
                        this.d.b = null;
                    }
                } catch (Throwable th) {
                    this.d.a.remove(this.b);
                    if (this.d.a.isEmpty()) {
                        this.d.b.shutdown();
                        this.d.b = null;
                    }
                    throw th;
                }
            }
        }
    }
}
