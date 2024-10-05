package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class arb {
    public final Object e;
    public boolean f;
    public boolean g;
    public int h;

    public arb(Object obj) {
        this.e = obj;
    }

    public void a(Object obj) {
    }

    public final void b(Object obj) {
        if (this.f || this.g) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.e);
        }
        this.f = true;
        a(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.f || this.g;
    }
}
