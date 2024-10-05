package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aldo {
    public volatile boolean a;

    public aldo() {
        this.a = false;
    }

    public aldo(byte[] bArr) {
    }

    public static aldo c() {
        return new aldo(null);
    }

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public final void b() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
