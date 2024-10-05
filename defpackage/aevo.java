package defpackage;

import android.os.Handler;
import androidx.media3.exoplayer.video.VideoDecoderOutputBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevo extends aug {
    public final afdt b;
    private aetl c;
    private final Handler d;
    private boolean e;
    private final long f;
    private long g;

    public aevo(Handler handler, bhn bhnVar, int i, int i2, int i3, afdt afdtVar, long j) {
        super(5000L, handler, bhnVar, 10, i, i2, i3);
        this.c = aetl.a;
        this.b = afdtVar;
        this.d = handler;
        this.f = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bgo, defpackage.ple
    public final void m(long j, boolean z) {
        super.m(j, z);
        this.g = 0L;
    }

    @Override // defpackage.bgo, defpackage.ple
    public final void n() {
        super.n();
        this.c.f();
        this.e = false;
    }

    @Override // defpackage.bgo, defpackage.ple, defpackage.poc
    public final void rk(int i, Object obj) {
        if (i == 10001) {
            aetl aetlVar = (aetl) obj;
            if (aetlVar == null) {
                aetlVar = aetl.a;
            }
            this.c = aetlVar;
            return;
        }
        super.rk(i, obj);
    }

    @Override // defpackage.bgo, defpackage.poe
    public final boolean s() {
        if (!super.s()) {
            return false;
        }
        this.c.e();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bgo
    public final void u(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, pms pmsVar) {
        if (!this.e && videoDecoderOutputBuffer.hasSupplementalData()) {
            this.e = true;
            this.d.post(new Runnable() { // from class: aevn
                @Override // java.lang.Runnable
                public final void run() {
                    aevo.this.b.b();
                }
            });
        }
        super.u(videoDecoderOutputBuffer, j, pmsVar);
    }

    @Override // defpackage.bgo
    protected final boolean x(long j, long j2) {
        long j3 = this.f;
        if ((j3 <= 0 || j2 - this.g <= j3) && bgo.w(j)) {
            return true;
        }
        this.g = j2;
        return false;
    }
}
