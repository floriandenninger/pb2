package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vtm implements vth {
    final /* synthetic */ vtn a;
    private final boolean b;

    public vtm(vtn vtnVar, boolean z) {
        this.a = vtnVar;
        this.b = z;
    }

    @Override // defpackage.vth
    public final void a(vti vtiVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        try {
            vto vtoVar = this.a.e;
            if (vtoVar == null) {
                throw new IOException("Received data for uninitialized muxer");
            }
            boolean z2 = this.b;
            byteBuffer.getClass();
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size != 0) {
                synchronized (vtoVar.a) {
                    while (true) {
                        z = vtoVar.b;
                        if (z || vtoVar.c) {
                            break;
                        }
                        String str = true != z2 ? "audio" : "video";
                        try {
                            StringBuilder sb = new StringBuilder(str.length() + 34);
                            sb.append("Mp4Muxer.waitForMuxerStart: ");
                            sb.append(str);
                            sb.append(" track");
                            vtv.a(sb.toString());
                            vtoVar.a.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (z && !vtoVar.c) {
                        int i = z2 ? vtoVar.d : vtoVar.e;
                        amkq.E(i >= 0);
                        try {
                            vtoVar.k.f(i, byteBuffer, bufferInfo);
                            if (z2) {
                                vtoVar.i++;
                            } else {
                                vtoVar.j++;
                            }
                        } catch (IOException e) {
                            vtv.b("Mp4Muxer: Failed to write sample data.");
                            throw new IOException("Failed to write sample data", e);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            this.a.c(e2);
        }
    }

    @Override // defpackage.vth
    public final void b(vti vtiVar, MediaFormat mediaFormat) {
        try {
            vto vtoVar = this.a.e;
            if (vtoVar != null) {
                boolean z = this.b;
                synchronized (vtoVar.a) {
                    if (z) {
                        if (vtoVar.f != null) {
                            throw new IOException("Multiple video tracks specified.");
                        }
                        vtoVar.f = mediaFormat;
                        vtv.a("Mp4Muxer.onOutputFormatChanged: Video format set");
                    } else {
                        if (vtoVar.g != null) {
                            throw new IOException("Multiple audio tracks specified.");
                        }
                        if (!vtoVar.h) {
                            vtoVar.g = mediaFormat;
                            vtv.a("Mp4Muxer.onOutputFormatChanged: Audio format set");
                        }
                    }
                    vtoVar.a();
                }
                return;
            }
            throw new IOException("Configured format with uninitialized muxer");
        } catch (IOException e) {
            this.a.c(e);
        }
    }
}
