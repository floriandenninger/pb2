package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alsc {
    public final Object a;
    public final alse b;
    public boolean c;
    public Object d;
    public Exception e;

    public alsc() {
    }

    public final void a() {
        alta.o(!this.c, "Task is already complete");
    }

    public final void b() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void d(alrx alrxVar) {
        this.b.a(new alrw(alsh.a, alrxVar));
        b();
    }

    public final void e(alsa alsaVar) {
        this.b.a(new alrz(alsh.a, alsaVar));
        b();
    }

    public alsc(byte[] bArr) {
        this.a = new Object();
        this.b = new alse();
    }
}
