package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxx extends vxv {
    public final CountDownLatch c;
    public Bitmap d;
    private final int e;

    public vxx(int i) {
        super(10);
        this.c = new CountDownLatch(1);
        this.e = i;
    }

    @Override // defpackage.vxv
    public final int a() {
        return this.e;
    }

    @Override // defpackage.vxv
    public final void b() {
        this.c.countDown();
    }

    @Override // defpackage.vxv
    public final void c(Exception exc) {
        vtv.c("Failed to extract thumbnail for video", exc);
        this.c.countDown();
    }

    @Override // defpackage.vxv
    public final int d() {
        if (this.d == null) {
            return this.e;
        }
        return -1;
    }

    @Override // defpackage.vxv
    public final void e(int i, Bitmap bitmap) {
        vcp.d(this.e == i);
        this.d = bitmap;
    }

    @Override // defpackage.vxv
    public final boolean f(int i) {
        return this.e == i;
    }
}
