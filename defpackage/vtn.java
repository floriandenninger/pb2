package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.EGLContext;
import android.os.Handler;
import com.google.android.libraries.video.media.VideoMetaData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vtn implements vtf {
    private vtr A;
    private final String B;
    public final vtm a = new vtm(this, true);
    public final vtm b = new vtm(this, false);
    public vts c;
    public vte d;
    public vto e;
    public Exception f;
    public VideoMetaData g;
    public boolean h;
    public final float i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final float p;
    public final EGLContext q;
    public final vrw r;
    public final vrx s;
    public final vum t;
    public final vwb u;
    public final int v;
    public final vys w;
    public final hft x;
    public final vyo y;
    public final vyv z;

    public vtn(vyv vyvVar, vys vysVar, hft hftVar, String str, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f2, EGLContext eGLContext, vyo vyoVar, vrw vrwVar, vrx vrxVar, vum vumVar, vwb vwbVar) {
        this.z = vyvVar;
        this.w = vysVar;
        this.x = hftVar;
        this.B = str;
        this.i = f;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.v = i4;
        this.m = i5;
        this.n = i6;
        this.o = i7;
        this.p = f2;
        this.q = eGLContext;
        this.y = vyoVar;
        this.r = vrwVar;
        this.s = vrxVar;
        this.t = vumVar;
        this.u = vwbVar;
    }

    public final vtr a() {
        if (this.A == null) {
            this.A = new vtj(this);
        }
        return this.A;
    }

    public final void b() {
        anhy anhyVar;
        long j;
        int i;
        vtu vtuVar;
        vto vtoVar = this.e;
        if (vtoVar == null) {
            d(new IOException("Attempting to stop uninitialized muxer"));
            return;
        }
        if (this.f == null) {
            vte vteVar = this.d;
            if (vteVar == null || !vteVar.g()) {
                anhyVar = null;
                j = -1;
            } else {
                final vte vteVar2 = this.d;
                anhy c = aci.c(new aeu() { // from class: vta
                    @Override // defpackage.aeu
                    public final Object a(aes aesVar) {
                        final vte vteVar3 = vte.this;
                        final vtd vtdVar = new vtd(aesVar);
                        vteVar3.b.post(new Runnable() { // from class: vtb
                            @Override // java.lang.Runnable
                            public final void run() {
                                vte vteVar4 = vte.this;
                                vtd vtdVar2 = vtdVar;
                                try {
                                    vti vtiVar = vteVar4.c;
                                    if (vtiVar == null) {
                                        throw new IOException("Audio processors drained before encoder was started");
                                    }
                                    if (vteVar4.h()) {
                                        vteVar4.e.d();
                                        while (vteVar4.h() && !vteVar4.e.h()) {
                                            vtiVar.b(10000L);
                                            long b = vteVar4.b();
                                            ByteBuffer b2 = vteVar4.e.b();
                                            int limit = b2.limit();
                                            vtiVar.d(b2, limit, b);
                                            vteVar4.h += limit;
                                        }
                                    }
                                    vti vtiVar2 = vteVar4.c;
                                    if (vtiVar2 == null) {
                                        throw new IOException("Attempted to end a null encoder");
                                    }
                                    vtiVar2.b(10000L);
                                    vtiVar2.c(vteVar4.b());
                                    vti vtiVar3 = vteVar4.c;
                                    if (vtiVar3 != null) {
                                        while (vteVar4.g()) {
                                            vtiVar3.b(10000L);
                                        }
                                        vtdVar2.a.c(null);
                                        return;
                                    }
                                    throw new IOException("Audio encoder null while attempting to end and drain");
                                } catch (IOException e) {
                                    vtv.c("AudioEncoder: endStreamAndDrainEncoder failed", e);
                                    vtdVar2.a.d(e);
                                }
                            }
                        });
                        return "EndAudioStreamAndDrainEncoder";
                    }
                });
                j = this.d.a();
                anhyVar = c;
            }
            vts vtsVar = this.c;
            if (vtsVar != null && vtsVar.l()) {
                if (j > 0) {
                    try {
                        vts vtsVar2 = this.c;
                        long a = vtsVar2.a();
                        StringBuilder sb = new StringBuilder(108);
                        sb.append("VideoEncoder.appendMostRecentFrameUpToDurationMillis: ");
                        sb.append(j);
                        sb.append(" Current dur: ");
                        sb.append(a);
                        vtv.a(sb.toString());
                        if (vtsVar2.a >= 5) {
                            throw new IOException("Cannot append video frames to a stopped encoder.");
                        }
                        vtt vttVar = vtsVar2.f;
                        if (vttVar == null) {
                            throw new IOException("Video encoder surface unexpectedly null while appending frame");
                        }
                        long b = ((float) vtsVar2.b()) * vtsVar2.b;
                        while (vtsVar2.c(vtsVar2.m + b) <= j) {
                            long j2 = vtsVar2.l;
                            if (j2 <= vtsVar2.m) {
                                j2 += b;
                                vtsVar2.l = j2;
                            }
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("VideoEncoder: Append last frame @");
                            sb2.append(j2);
                            vtv.a(sb2.toString());
                            vti vtiVar = vtsVar2.e;
                            if (vtiVar == null) {
                                throw new IOException("Attempted to drain a null encoder");
                            }
                            vtiVar.b(0L);
                            SurfaceTexture surfaceTexture = vtsVar2.n;
                            if (surfaceTexture == null || (i = vtsVar2.o) < 0 || (vtuVar = vtsVar2.g) == null) {
                                throw new IOException("Cannot append video frames from invalid last frame");
                            }
                            vtsVar2.d(surfaceTexture, i, vtuVar);
                            vtsVar2.e(vttVar);
                        }
                    } catch (IOException e) {
                        d(e);
                    }
                }
                vts vtsVar3 = this.c;
                vti vtiVar2 = vtsVar3.e;
                if (vtiVar2 == null) {
                    throw new IOException("Attempted to end a null encoder");
                }
                vtiVar2.f();
                vti vtiVar3 = vtsVar3.e;
                if (vtiVar3 == null) {
                    throw new IOException("Video encoder null while attempting to end and drain");
                }
                while (vtsVar3.l()) {
                    vtiVar3.b(10000L);
                }
            }
            if (vtoVar.c() && anhyVar != null) {
                try {
                    vtv.a("Mp4Encoder.stopEncodingImpl: endAudioStreamFuture.get()");
                    anhyVar.get(1000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e = e2;
                    anhyVar.cancel(true);
                    d(e);
                } catch (TimeoutException e3) {
                    e = e3;
                    anhyVar.cancel(true);
                    d(e);
                } catch (Exception e4) {
                    d(e4);
                }
            }
        }
        if (vtoVar.c()) {
            vtoVar.b();
            try {
                vtoVar.k.e();
            } catch (IOException | IllegalStateException e5) {
                vtv.c("Failed to stop media muxer.", e5);
            }
        }
        vtoVar.b();
        try {
            vtoVar.k.b();
        } catch (IllegalStateException e6) {
            vtv.c("Failed to release media muxer.", e6);
        }
        vts vtsVar4 = this.c;
        Object obj = "N/A";
        String valueOf = String.valueOf(vtsVar4 != null ? Integer.valueOf(vtsVar4.p) : "N/A");
        vto vtoVar2 = this.e;
        String valueOf2 = String.valueOf(vtoVar2 != null ? Integer.valueOf(vtoVar2.i) : "N/A");
        vts vtsVar5 = this.c;
        String valueOf3 = String.valueOf(vtsVar5 != null ? Integer.valueOf(vtsVar5.q) : "N/A");
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb3.append("Mp4Encoder: Frames processed: ");
        sb3.append(valueOf);
        sb3.append(" Frames encoded: ");
        sb3.append(valueOf2);
        sb3.append(" Frames rejected: ");
        sb3.append(valueOf3);
        vtv.a(sb3.toString());
        vts vtsVar6 = this.c;
        long a2 = vtsVar6 != null ? vtsVar6.a() : -1L;
        vte vteVar3 = this.d;
        long a3 = vteVar3 != null ? vteVar3.a() : -1L;
        double d = a2;
        Double.isNaN(d);
        double d2 = d / 1000.0d;
        if (a3 > 0) {
            double d3 = a3;
            Double.isNaN(d3);
            obj = Double.valueOf(d3 / 1000.0d);
        }
        String valueOf4 = String.valueOf(obj);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 79);
        sb4.append("Mp4Encoder: Transcode complete. Video dur: ");
        sb4.append(d2);
        sb4.append(" Audio dur: ");
        sb4.append(valueOf4);
        vtv.a(sb4.toString());
        vts vtsVar7 = this.c;
        long a4 = vtsVar7 != null ? vtsVar7.a() : -1L;
        if (vtoVar.c()) {
            int i2 = vtoVar.i;
            int i3 = vtoVar.j;
            StringBuilder sb5 = new StringBuilder(95);
            sb5.append("Mp4Muxer.hasValidTracksWritten: videoFramesWritten: ");
            sb5.append(i2);
            sb5.append(" audioFramesWritten: ");
            sb5.append(i3);
            vtv.a(sb5.toString());
            if (vtoVar.i > 0 && ((vtoVar.h || vtoVar.j > 0) && a4 > 0)) {
                vvd vvdVar = new vvd();
                vvdVar.a = Uri.parse(this.B);
                vvdVar.d = this.k;
                vvdVar.e = this.l;
                int i4 = this.v;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                vvdVar.f = i5;
                vvdVar.h = TimeUnit.MILLISECONDS.toMicros(a4);
                vvdVar.i = new long[]{0};
                try {
                    this.g = vvdVar.a();
                    return;
                } catch (IOException e7) {
                    d(e7);
                    this.g = null;
                    return;
                }
            }
        }
        if (vtoVar.i <= 0) {
            d(new IOException("Muxer did not write any video output"));
            return;
        }
        if (a4 > 0) {
            d(new IOException("Muxer did not write any audio output"));
            return;
        }
        StringBuilder sb6 = new StringBuilder(55);
        sb6.append("Video output has invalid duration: ");
        sb6.append(a4);
        d(new IOException(sb6.toString()));
    }

    public final void c(Exception exc) {
        if (this.h) {
            return;
        }
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("Mp4Encoder.stopEncodingWithReason: ");
        sb.append(valueOf);
        vtv.a(sb.toString());
        d(exc);
        vte vteVar = this.d;
        if (vteVar != null) {
            vteVar.f();
        }
        vts vtsVar = this.c;
        if (vtsVar != null) {
            vtsVar.j = false;
            synchronized (vtsVar) {
                while (vtsVar.a <= 0) {
                    try {
                        try {
                            vtsVar.wait();
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Handler handler = vtsVar.h;
                handler.getClass();
                handler.post(new vtq(vtsVar, 1, null));
            }
            return;
        }
        a().a(new IllegalStateException("Encoder stopped without reason before VideoEncoder was started."));
    }

    public final void d(Exception exc) {
        if (this.f != null || exc == null) {
            return;
        }
        this.f = exc;
    }

    public final boolean equals(Object obj) {
        vys vysVar;
        hft hftVar;
        EGLContext eGLContext;
        vyo vyoVar;
        vrw vrwVar;
        vrx vrxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vtn) {
            vtn vtnVar = (vtn) obj;
            if (this.z.equals(vtnVar.z) && ((vysVar = this.w) != null ? vysVar.equals(vtnVar.w) : vtnVar.w == null) && ((hftVar = this.x) != null ? hftVar.equals(vtnVar.x) : vtnVar.x == null) && this.B.equals(vtnVar.B) && Float.floatToIntBits(this.i) == Float.floatToIntBits(vtnVar.i) && this.j == vtnVar.j && this.k == vtnVar.k && this.l == vtnVar.l) {
                int i = this.v;
                int i2 = vtnVar.v;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.m == vtnVar.m && this.n == vtnVar.n && this.o == vtnVar.o && Float.floatToIntBits(this.p) == Float.floatToIntBits(vtnVar.p) && ((eGLContext = this.q) != null ? eGLContext.equals(vtnVar.q) : vtnVar.q == null) && ((vyoVar = this.y) != null ? vyoVar.equals(vtnVar.y) : vtnVar.y == null) && ((vrwVar = this.r) != null ? vrwVar.equals(vtnVar.r) : vtnVar.r == null) && ((vrxVar = this.s) != null ? vrxVar.equals(vtnVar.s) : vtnVar.s == null) && this.t.equals(vtnVar.t) && this.u.equals(vtnVar.u)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.z.hashCode() ^ 1000003) * 1000003;
        vys vysVar = this.w;
        int hashCode2 = (hashCode ^ (vysVar == null ? 0 : vysVar.hashCode())) * 1000003;
        hft hftVar = this.x;
        int hashCode3 = (((((((((((hashCode2 ^ (hftVar == null ? 0 : hftVar.hashCode())) * 1000003) ^ this.B.hashCode()) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003;
        int i = this.v;
        if (i == 0) {
            throw null;
        }
        int floatToIntBits = (((((((((hashCode3 ^ i) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.o) * 1000003) ^ Float.floatToIntBits(this.p)) * 1000003;
        EGLContext eGLContext = this.q;
        int hashCode4 = (floatToIntBits ^ (eGLContext == null ? 0 : eGLContext.hashCode())) * 1000003;
        vyo vyoVar = this.y;
        int hashCode5 = (hashCode4 ^ (vyoVar == null ? 0 : vyoVar.hashCode())) * 1000003;
        vrw vrwVar = this.r;
        int hashCode6 = (hashCode5 ^ (vrwVar == null ? 0 : vrwVar.hashCode())) * 1000003;
        vrx vrxVar = this.s;
        return ((((hashCode6 ^ (vrxVar != null ? vrxVar.hashCode() : 0)) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.z);
        String valueOf2 = String.valueOf(this.w);
        String valueOf3 = String.valueOf(this.x);
        String str = this.B;
        float f = this.i;
        int i = this.j;
        int i2 = this.k;
        int i3 = this.l;
        int i4 = this.v;
        String str2 = i4 != 1 ? i4 != 91 ? "null" : "PORTRAIT" : "LANDSCAPE";
        int i5 = this.m;
        int i6 = this.n;
        int i7 = this.o;
        float f2 = this.p;
        String valueOf4 = String.valueOf(this.q);
        String valueOf5 = String.valueOf(this.y);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.t);
        String valueOf9 = String.valueOf(this.u);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(str).length();
        int length5 = str2.length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 515 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("Mp4Encoder{eventListener=");
        sb.append(valueOf);
        sb.append(", glListener=");
        sb.append(valueOf2);
        sb.append(", encodingProgressListener=");
        sb.append(valueOf3);
        sb.append(", outputPath=");
        sb.append(str);
        sb.append(", videoTargetFrameRate=");
        sb.append(f);
        sb.append(", videoBitRate=");
        sb.append(i);
        sb.append(", videoUnrotatedOutputWidth=");
        sb.append(i2);
        sb.append(", videoUnrotatedOutputHeight=");
        sb.append(i3);
        sb.append(", videoOutputOrientation=");
        sb.append(str2);
        sb.append(", audioBitRate=");
        sb.append(i5);
        sb.append(", audioOutputSampleRate=");
        sb.append(i6);
        sb.append(", audioOutputNumChannels=");
        sb.append(i7);
        sb.append(", outputSpeedAdjustment=");
        sb.append(f2);
        sb.append(", sharedEglContextInternal=");
        sb.append(valueOf4);
        sb.append(", videoFrameTransform=");
        sb.append(valueOf5);
        sb.append(", audioBufferManager=");
        sb.append(valueOf6);
        sb.append(", videoTextureManager=");
        sb.append(valueOf7);
        sb.append(", mediaCodecFactory=");
        sb.append(valueOf8);
        sb.append(", mediaMuxerFactory=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }

    public vtn() {
    }
}
