package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apk implements Runnable {
    final aod a;
    private final aom b;
    private boolean c = false;

    public apk(aom aomVar, aod aodVar) {
        this.b = aomVar;
        this.a = aodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.b.e(this.a);
        this.c = true;
    }
}
