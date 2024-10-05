package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vte {
    public final vrw a;
    public final Handler b;
    vti c;
    public boolean d;
    public axe e;
    public vxc f;
    public long g;
    public long h;
    private final int i;
    private final int j;
    private final int k;
    private final float l;
    private HandlerThread m;
    private int n;
    private int o;

    public vte(int i, int i2, int i3, float f, vrw vrwVar) {
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = f;
        this.a = vrwVar;
        HandlerThread handlerThread = new HandlerThread("encodeAudio");
        this.m = handlerThread;
        handlerThread.start();
        this.b = new Handler(this.m.getLooper());
    }

    private final int i() {
        int i = this.k;
        return i > 0 ? i : this.o;
    }

    private final int j() {
        int i = this.j;
        return i > 0 ? i : this.n;
    }

    private static final long k(long j, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return 0L;
        }
        double micros = TimeUnit.SECONDS.toMicros(1L);
        double d = j / (i + i);
        Double.isNaN(micros);
        Double.isNaN(d);
        double d2 = micros * d;
        double d3 = i2;
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public final long a() {
        return k(this.g, this.o, this.n) / 1000;
    }

    public final long b() {
        return k(this.h, i(), j());
    }

    public final synchronized void c(vtg vtgVar, vum vumVar, vth vthVar) {
        this.o = vtgVar.a;
        this.n = vtgVar.b;
        int j = j();
        int i = i();
        vur a = vumVar.a("audio/mp4a-latm", true);
        if (a == null) {
            throw new IOException("Failed to create audio encoder.");
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", j, i);
        createAudioFormat.setInteger("bitrate", this.i);
        createAudioFormat.setInteger("max-input-size", 20000);
        vti vtiVar = new vti(a, createAudioFormat);
        this.c = vtiVar;
        vtiVar.a = vthVar;
        vtiVar.g();
        vrw vrwVar = this.a;
        if (vrwVar != null) {
            ByteBuffer[] byteBufferArr = this.c.b;
            byteBufferArr.getClass();
            vrwVar.b = byteBufferArr.length;
        }
        int i2 = this.o;
        if (i2 > 0 && i2 != i()) {
            int i3 = this.n;
            int i4 = i();
            vxc vxcVar = new vxc();
            this.f = vxcVar;
            vxcVar.e = i4;
            int i5 = this.o;
            StringBuilder sb = new StringBuilder(78);
            sb.append("AudioEncoder: configureChannels: ");
            sb.append(i5);
            sb.append(" ch @");
            sb.append(i3);
            sb.append(" -> ");
            sb.append(i4);
            sb.append(" ch");
            vtv.a(sb.toString());
            try {
                this.f.a(new avp(i3, this.o, 2));
                this.f.c();
            } catch (avq e) {
                vtv.b("ChannelConvertingAudioProcessor UnhandledAudioFormatException: The input audio format has to be mono or stereo C.ENCODING_PCM_16BIT.");
                throw e;
            }
        }
        if (Math.abs(this.l - 1.0f) < 0.01f) {
            int i6 = this.n;
            int j2 = j();
            if (i6 <= 0 || i6 == j2) {
                return;
            }
        }
        int j3 = j();
        int i7 = i();
        axe axeVar = new axe();
        this.e = axeVar;
        axeVar.i(this.l);
        int i8 = this.n;
        if (i8 <= 0) {
            i8 = j3;
        }
        if (i8 != j3) {
            this.e.b = j3;
        }
        float f = this.l;
        StringBuilder sb2 = new StringBuilder(105);
        sb2.append("AudioEncoder: configureSonic: ");
        sb2.append(i7);
        sb2.append(" ch @");
        sb2.append(i8);
        sb2.append(" -> ");
        sb2.append(i7);
        sb2.append(" ch @");
        sb2.append(j3);
        sb2.append(" ");
        sb2.append(f);
        sb2.append("x");
        vtv.a(sb2.toString());
        try {
            this.e.a(new avp(i8, i7, 2));
            this.e.c();
        } catch (avq e2) {
            vtv.b("SonicAudioProcessor UnhandledAudioFormatException: The input audio format has to be C.ENCODING_PCM_16BIT.");
            throw e2;
        }
    }

    public final synchronized void d() {
        f();
        vti vtiVar = this.c;
        if (vtiVar != null) {
            vtiVar.h();
            vtiVar.e();
            this.c = null;
        }
        this.b.removeCallbacksAndMessages(null);
        HandlerThread handlerThread = this.m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.m = null;
        }
    }

    public final synchronized void e() {
        this.d = true;
    }

    public final synchronized void f() {
        this.d = false;
    }

    public final boolean g() {
        vti vtiVar = this.c;
        return vtiVar != null && vtiVar.c == 2;
    }

    public final boolean h() {
        axe axeVar = this.e;
        return axeVar != null && axeVar.g();
    }
}
