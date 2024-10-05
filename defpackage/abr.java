package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abr implements Runnable {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public abr(abs absVar, int i) {
        this.b = i;
        this.a = new WeakReference(absVar);
    }

    public abr(acd acdVar, int i) {
        this.b = i;
        this.a = new WeakReference(acdVar);
    }

    public abr(acd acdVar, int i, byte[] bArr) {
        this.b = i;
        this.a = new WeakReference(acdVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            if (this.a.get() != null) {
                ((acd) this.a.get()).j = false;
            }
        } else if (i != 1) {
            if (this.a.get() != null) {
                ((acd) this.a.get()).k = false;
            }
        } else if (this.a.get() != null) {
            ((abs) this.a.get()).q();
        }
    }
}
