package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apc implements aok {
    public static final apc a = new apc();
    public Handler e;
    public int b = 0;
    public int c = 0;
    public boolean d = true;
    private boolean i = true;
    public final aom f = new aom(this);
    public final Runnable g = new aoy(this);
    final aoz h = new aoz(this);

    private apc() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                this.e.removeCallbacks(this.g);
            } else {
                this.f.e(aod.ON_RESUME);
                this.d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1 && this.i) {
            this.f.e(aod.ON_START);
            this.i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.b == 0 && this.d) {
            this.f.e(aod.ON_STOP);
            this.i = true;
        }
    }

    @Override // defpackage.aok
    public final aof getLifecycle() {
        return this.f;
    }
}
