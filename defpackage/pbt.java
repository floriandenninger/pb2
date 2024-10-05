package defpackage;

import android.os.Handler;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ext.opus.OpusDecoder;
import com.google.android.exoplayer.ext.opus.OpusOutputBuffer;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pbt extends oys implements oxp {
    public final oxd a;
    public final afbe b;
    private final Handler c;
    private final ozb d;
    private final oyn e;
    private MediaFormat f;
    private OpusDecoder g;
    private phb i;
    private OpusOutputBuffer j;
    private boolean k;
    private boolean l;
    private boolean m;

    public pbt(oyr oyrVar, Handler handler, afbe afbeVar, ozb ozbVar) {
        super(oyrVar);
        this.a = new oxd();
        this.c = handler;
        this.b = afbeVar;
        this.d = ozbVar;
        this.e = new oyn();
    }

    private final void l(pbu pbuVar) {
        if (this.b != null) {
            this.c.post(new pbs(this, pbuVar));
        }
    }

    @Override // defpackage.oys
    protected final void A(long j, long j2, boolean z) {
        if (this.l) {
            return;
        }
        this.m = z;
        if (this.f == null) {
            if (J(j, this.e, null) != -4) {
                return;
            }
            MediaFormat mediaFormat = this.e.a;
            this.f = mediaFormat;
            axfl axflVar = (axfl) this.d;
            if (!axflVar.b) {
                axflVar.i(mediaFormat);
            }
            axflVar.j(mediaFormat.r, mediaFormat.q);
        }
        if (this.g == null) {
            List list = this.f.f;
            if (list.size() <= 0) {
                throw new oxh("Missing initialization data");
            }
            try {
                OpusDecoder opusDecoder = new OpusDecoder(list);
                this.g = opusDecoder;
                opusDecoder.start();
                this.a.a++;
            } catch (pbu e) {
                l(e);
                throw new oxh(e);
            }
        }
        while (true) {
            try {
                if (!this.l) {
                    OpusOutputBuffer opusOutputBuffer = this.j;
                    if (opusOutputBuffer == null) {
                        opusOutputBuffer = (OpusOutputBuffer) this.g.g();
                        this.j = opusOutputBuffer;
                        if (opusOutputBuffer == null) {
                            break;
                        }
                    }
                    if (!opusOutputBuffer.getFlag(1)) {
                        ozb ozbVar = this.d;
                        OpusOutputBuffer opusOutputBuffer2 = this.j;
                        long j3 = opusOutputBuffer2.timestampUs;
                        ByteBuffer byteBuffer = opusOutputBuffer2.data;
                        if (!((axfl) ozbVar).l(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), false)) {
                            break;
                        }
                        this.a.f++;
                        this.j.release();
                        this.j = null;
                    } else {
                        this.l = true;
                        this.d.c();
                        this.j.release();
                        this.j = null;
                        break;
                    }
                } else {
                    break;
                }
            } catch (ozg e2) {
                if (this.b != null) {
                    this.c.post(new pbq(this, e2));
                }
                throw new oxh(e2);
            } catch (ozh e3) {
                if (this.b != null) {
                    this.c.post(new pbr(this, e3));
                }
                throw new oxh(e3);
            } catch (pbu e4) {
                l(e4);
                throw new oxh(e4);
            }
        }
        while (!this.k) {
            phb phbVar = this.i;
            if (phbVar == null) {
                phbVar = this.g.f();
                this.i = phbVar;
                if (phbVar == null) {
                    return;
                }
            }
            int J2 = J(j, this.e, phbVar.a);
            if (J2 == -2) {
                return;
            }
            if (J2 == -4) {
                this.f = this.e.a;
            } else if (J2 != -1) {
                if (this.i.a.c()) {
                    this.i.setFlag(2);
                }
                this.g.i(this.i);
                this.i = null;
            } else {
                this.i.setFlag(1);
                this.g.i(this.i);
                this.i = null;
                this.k = true;
                return;
            }
        }
    }

    @Override // defpackage.oys
    protected final boolean E(MediaFormat mediaFormat) {
        return "audio/opus".equalsIgnoreCase(mediaFormat.b);
    }

    @Override // defpackage.oxp
    public final long a() {
        return this.d.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean h() {
        return this.l && !this.d.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean i() {
        if (!this.d.h()) {
            if (this.f == null) {
                return false;
            }
            if (!this.m && this.j == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.oyx, defpackage.oxi
    public final void k(int i, Object obj) {
        if (i == 1) {
            this.d.g(((Float) obj).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final oxp m() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oys, defpackage.oyx
    public final void q() {
        this.i = null;
        this.j = null;
        this.f = null;
        try {
            OpusDecoder opusDecoder = this.g;
            if (opusDecoder != null) {
                opusDecoder.d();
                this.g = null;
                this.a.b++;
            }
            this.d.f();
        } finally {
            super.q();
        }
    }

    @Override // defpackage.oys
    protected final void r(long j) {
        this.d.b(j);
        this.k = false;
        this.l = false;
        this.m = false;
        if (this.g != null) {
            this.i = null;
            OpusOutputBuffer opusOutputBuffer = this.j;
            if (opusOutputBuffer != null) {
                opusOutputBuffer.release();
                this.j = null;
            }
            this.g.h();
        }
    }

    @Override // defpackage.oyx
    protected final void v() {
        this.d.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void w() {
        this.d.d();
    }
}
