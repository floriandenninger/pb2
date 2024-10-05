package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsn implements awh {
    private boolean a;
    private boolean b;
    private pms c;
    private long d;
    private final vyw e;

    public vsn(vyw vywVar) {
        this.e = vywVar;
    }

    @Override // defpackage.awh
    public final int a(pms pmsVar) {
        return ("audio/raw".equals(pmsVar.n) && pmsVar.C == 2) ? 2 : 0;
    }

    @Override // defpackage.awh
    public final long b(boolean z) {
        return this.d;
    }

    @Override // defpackage.awh
    public final pnu c() {
        return pnu.a;
    }

    @Override // defpackage.awh
    public final void d() {
    }

    @Override // defpackage.awh
    public final void e() {
    }

    @Override // defpackage.awh
    public final void f() {
        vtv.a("DecoderAudioSink: Discontinuity encountered during audio transcode. Ignoring.");
    }

    @Override // defpackage.awh
    public final void g() {
    }

    @Override // defpackage.awh
    public final void h() {
    }

    @Override // defpackage.awh
    public final void i() {
        if (this.b || !this.a) {
            return;
        }
        this.b = true;
    }

    @Override // defpackage.awh
    public final void j() {
    }

    @Override // defpackage.awh
    public final void k(asd asdVar) {
    }

    @Override // defpackage.awh
    public final void l(int i) {
    }

    @Override // defpackage.awh
    public final void m(ase aseVar) {
    }

    @Override // defpackage.awh
    public final void n(awe aweVar) {
    }

    @Override // defpackage.awh
    public final void o(pnu pnuVar) {
    }

    @Override // defpackage.awh
    public final void p(boolean z) {
    }

    @Override // defpackage.awh
    public final void q(float f) {
    }

    @Override // defpackage.awh
    public final boolean r(ByteBuffer byteBuffer, long j, int i) {
        final ByteBuffer allocate;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.isDirect()) {
            allocate = ByteBuffer.allocateDirect(asReadOnlyBuffer.remaining());
        } else {
            allocate = ByteBuffer.allocate(asReadOnlyBuffer.remaining());
        }
        allocate.put(asReadOnlyBuffer);
        allocate.order(byteBuffer.order());
        int remaining = byteBuffer.remaining();
        int i2 = this.c.A;
        long micros = ((remaining / (i2 + i2)) * TimeUnit.SECONDS.toMicros(1L)) / r1.B;
        vtn vtnVar = (vtn) this.e.a;
        final vte vteVar = vtnVar.d;
        if (vteVar == null) {
            vtnVar.c(new IOException("Audio sent to unstarted Encoder"));
        } else if (allocate.remaining() > 0) {
            if (!vteVar.g() || !vteVar.d) {
                String str = true != vteVar.g() ? "AudioEncoder not prepared." : "AudioEncoder not accepting input.";
                vtv.a(str.length() != 0 ? "AudioEncoder: Dropping audio: ".concat(str) : new String("AudioEncoder: Dropping audio: "));
            } else {
                vteVar.g += allocate.remaining();
                vrw vrwVar = vteVar.a;
                if (vrwVar != null) {
                    int incrementAndGet = vrwVar.a.incrementAndGet();
                    int i3 = vrwVar.b;
                    if (incrementAndGet > i3) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("AudioBufferManager: Invalid incrementBuffersInUse beyond max of ");
                        sb.append(i3);
                        vtv.b(sb.toString());
                    }
                }
                vteVar.b.post(new Runnable() { // from class: vtc
                    @Override // java.lang.Runnable
                    public final void run() {
                        vte vteVar2 = vte.this;
                        ByteBuffer byteBuffer2 = allocate;
                        synchronized (vteVar2) {
                            vti vtiVar = vteVar2.c;
                            if (vtiVar != null && vteVar2.g()) {
                                vtiVar.b(0L);
                                vxc vxcVar = vteVar2.f;
                                if (vxcVar != null && vxcVar.g()) {
                                    vteVar2.f.e(byteBuffer2);
                                    byteBuffer2 = vteVar2.f.b();
                                }
                                if (vteVar2.h()) {
                                    vteVar2.e.e(byteBuffer2);
                                    byteBuffer2 = vteVar2.e.b();
                                }
                                long b = vteVar2.b();
                                int limit = byteBuffer2.limit();
                                vtiVar.d(byteBuffer2, limit, b);
                                vteVar2.h += limit;
                                vrw vrwVar2 = vteVar2.a;
                                if (vrwVar2 != null) {
                                    vrwVar2.a();
                                    return;
                                }
                                return;
                            }
                            vtv.a("AudioEncoder.onAudioAvailable. Dropping audio: AudioEncoder not processing input.");
                            vrw vrwVar3 = vteVar2.a;
                            if (vrwVar3 != null) {
                                vrwVar3.a();
                            }
                        }
                    }
                });
            }
        }
        this.d = j + micros;
        return true;
    }

    @Override // defpackage.awh
    public final boolean s() {
        return true;
    }

    @Override // defpackage.awh
    public final boolean t() {
        return this.b;
    }

    @Override // defpackage.awh
    public final boolean u(pms pmsVar) {
        return "audio/raw".equals(pmsVar.n) && pmsVar.C == 2;
    }

    @Override // defpackage.awh
    public final void v(pms pmsVar, int[] iArr) {
        vte vteVar;
        vtf vtfVar = this.e.a;
        vtg vtgVar = new vtg(pmsVar.A, pmsVar.B);
        try {
            vteVar = ((vtn) vtfVar).d;
        } catch (avq | IOException e) {
            ((vtn) vtfVar).c(e);
        }
        if (vteVar != null) {
            vteVar.c(vtgVar, ((vtn) vtfVar).t, ((vtn) vtfVar).b);
            this.c = pmsVar;
            this.a = true;
            return;
        }
        throw new IOException("Configured audio with unstarted encoder");
    }
}
