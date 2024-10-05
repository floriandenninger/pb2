package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bzq implements Runnable {
    private final bzo a;
    private final String b;
    private final anhy c;

    public bzq(bzo bzoVar, String str, anhy anhyVar) {
        this.a = bzoVar;
        this.b = str;
        this.c = anhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            z = ((Boolean) this.c.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        this.a.a(this.b, z);
    }
}
