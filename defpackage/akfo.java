package defpackage;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import io.grpc.Status;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akfo {
    public final ammv A;
    public final boolean B;
    public final String C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final axzg f64J;
    public final ajoy K;
    private final Executor L;
    private final int N;
    private boolean O;
    private final int P;
    public final amkm a;
    protected final AudioRecord b;
    public final Handler c;
    public final akfn d;
    public final akfm e;
    public final String f;
    public final amkj g;
    public final amkl h;
    public final CronetEngine i;
    public final String j;
    public String k;
    public final byte[] m;
    public final afsy n;
    public final String o;
    public final int p;
    final aycd q;
    public final wco r;
    public amkp s;
    volatile aypb t;
    public aybv u;
    public final float x;
    public final String y;
    public final boolean z;
    public final akfv l = new akfv();
    public final aypb v = new akfl(this);
    private final Runnable M = new Runnable() { // from class: akfd
        @Override // java.lang.Runnable
        public final void run() {
            int i;
            byte[] bArr;
            int read;
            float f;
            int i2;
            int i3;
            byte[] bArr2;
            final akfo akfoVar = akfo.this;
            while (akfoVar.b.getRecordingState() == 3 && (read = akfoVar.b.read((bArr = new byte[(i = akfoVar.p)]), 0, i)) > 0) {
                akfv akfvVar = akfoVar.l;
                int i4 = read >> 1;
                long j = 0;
                long j2 = 0;
                while (read >= 2) {
                    int i5 = read - 2;
                    j2 += (bArr[read - 1] << 8) + (bArr[i5] & 255);
                    j += r4 * r4;
                    read = i5;
                }
                float sqrt = (float) Math.sqrt(((j * i4) - (j2 * j2)) / (i4 * i4));
                if (!akfvVar.b && sqrt == 0.0f) {
                    zga.m("SpeechLevelGenerator", "Really low audio levels detected. The audio input may have issues.");
                    akfvVar.b = true;
                }
                float f2 = akfvVar.a;
                if (f2 < sqrt) {
                    f = (f2 * 0.999f) + (0.001f * sqrt);
                    akfvVar.a = f;
                } else {
                    f = (f2 * 0.95f) + (0.05f * sqrt);
                    akfvVar.a = f;
                }
                float f3 = -120.0f;
                if (f > 0.0d) {
                    double d = sqrt / f;
                    if (d > 1.0E-6d) {
                        f3 = ((float) Math.log10(d)) * 10.0f;
                    }
                }
                int min = (int) (((Math.min(Math.max(f3, -2.0f), 10.0f) + 2.0f) * 100.0f) / 12.0f);
                final int i6 = min < 30 ? 0 : (min / 10) * 10;
                akfoVar.c.post(new Runnable() { // from class: akfg
                    @Override // java.lang.Runnable
                    public final void run() {
                        akfo akfoVar2 = akfo.this;
                        akfoVar2.d.a(i6);
                    }
                });
                if (akfoVar.t == null) {
                    akfoVar.c();
                    akfoVar.c.post(new akfh(akfoVar, new NullPointerException(), 1));
                    return;
                }
                if (akfoVar.e()) {
                    akfy akfyVar = akfoVar.w;
                    if (!akfyVar.b) {
                        throw new IllegalStateException("You forgot to call init()!");
                    }
                    if (akfyVar.a) {
                        throw new IllegalStateException("Cannot process more bytes after flushing.");
                    }
                    akfw akfwVar = akfyVar.c;
                    aome t = aomf.t();
                    if (!akfwVar.d) {
                        try {
                            i2 = akfwVar.e;
                            i3 = i2 - 1;
                            bArr2 = null;
                        } catch (IOException unused) {
                            zga.b("Unable to write bytes into buffer!");
                        }
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i3 == 0) {
                            throw new IllegalStateException("Trying to make header for unspecified codec!");
                        }
                        if (i3 == 1) {
                            bArr2 = "#!AMR-WB\n".getBytes();
                        } else if (i3 == 2) {
                            bArr2 = new byte[0];
                        } else if (i3 == 3) {
                            throw new IllegalStateException("Should never happen! Use OggOpusEncoder instead.");
                        }
                        t.write(bArr2);
                        akfwVar.d = true;
                    }
                    int i7 = 0;
                    while (i7 < i) {
                        int min2 = Math.min(4096, i - i7);
                        akfwVar.a(bArr, i7, min2, false, t);
                        i7 += min2;
                    }
                    aomf b = t.b();
                    if (b.d() > 0) {
                        aypb aypbVar = akfoVar.t;
                        aone createBuilder = amkh.a.createBuilder();
                        createBuilder.copyOnWrite();
                        amkh amkhVar = (amkh) createBuilder.instance;
                        b.getClass();
                        amkhVar.b = 1;
                        amkhVar.c = b;
                        aypbVar.c((amkh) createBuilder.build());
                    }
                } else {
                    aypb aypbVar2 = akfoVar.t;
                    aone createBuilder2 = amkh.a.createBuilder();
                    aomf x = aomf.x(bArr);
                    createBuilder2.copyOnWrite();
                    amkh amkhVar2 = (amkh) createBuilder2.instance;
                    amkhVar2.b = 1;
                    amkhVar2.c = x;
                    aypbVar2.c((amkh) createBuilder2.build());
                }
            }
        }
    };
    public final akfy w = new akfy();

    public akfo(akfp akfpVar) {
        int c;
        int i = akfpVar.i;
        this.N = i;
        this.i = akfpVar.a;
        this.r = akfpVar.b;
        this.K = akfpVar.E;
        this.d = akfpVar.g;
        this.e = akfpVar.h;
        this.q = new aycd();
        this.f = akfpVar.l;
        this.L = akfpVar.d;
        this.c = akfpVar.e;
        this.m = akfpVar.m;
        this.n = akfpVar.c;
        this.H = akfpVar.C;
        this.o = akfpVar.f;
        this.f64J = akfpVar.D;
        int i2 = akfpVar.B;
        this.P = i2;
        int j = j();
        boolean i3 = i(i);
        this.O = i3;
        int i4 = 4;
        i2 = (!i3 || (c = akfy.c(j)) == 4 || akfy.a(akfy.b(c)) == null) ? 2 : i2;
        this.I = i2;
        this.j = akfpVar.q;
        int i5 = akfpVar.x;
        this.p = i5 <= 0 ? 1024 : i5;
        aone createBuilder = amkj.a.createBuilder();
        int i6 = i2 - 1;
        AudioRecord audioRecord = null;
        if (i2 == 0) {
            throw null;
        }
        if (i6 == 2) {
            i4 = 5;
        } else if (i6 == 3) {
            i4 = 6;
        } else if (i6 != 4) {
            i4 = 3;
        }
        createBuilder.copyOnWrite();
        ((amkj) createBuilder.instance).b = i4 - 2;
        int i7 = akfpVar.i;
        createBuilder.copyOnWrite();
        ((amkj) createBuilder.instance).c = i7;
        this.g = (amkj) createBuilder.build();
        aone createBuilder2 = amkl.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((amkl) createBuilder2.instance).b = 1;
        createBuilder2.copyOnWrite();
        ((amkl) createBuilder2.instance).c = 16000;
        createBuilder2.copyOnWrite();
        ((amkl) createBuilder2.instance).d = 100;
        this.h = (amkl) createBuilder2.build();
        int i8 = akfpVar.o;
        int i9 = akfpVar.n;
        try {
            audioRecord = new AudioRecord(6, i, i8, i9, Math.max(1280, AudioRecord.getMinBufferSize(i, i8, i9)));
        } catch (IllegalArgumentException unused) {
        }
        this.b = audioRecord;
        aone createBuilder3 = amkm.a.createBuilder();
        String str = akfpVar.k;
        createBuilder3.copyOnWrite();
        ((amkm) createBuilder3.instance).b = str;
        String str2 = akfpVar.j;
        createBuilder3.copyOnWrite();
        ((amkm) createBuilder3.instance).c = str2;
        this.a = (amkm) createBuilder3.build();
        this.x = akfpVar.w;
        this.z = akfpVar.s;
        this.y = akfpVar.p;
        this.A = akfpVar.y;
        this.B = akfpVar.v;
        this.C = akfpVar.r;
        this.D = akfpVar.u;
        this.E = akfpVar.z;
        this.G = akfpVar.A;
        this.F = akfpVar.t;
    }

    private final void h() {
        this.O = false;
        if (e()) {
            try {
                akfy akfyVar = this.w;
                if (!akfyVar.b) {
                    throw new IllegalStateException("You forgot to call init()!");
                }
                if (!akfyVar.a) {
                    akfyVar.a = true;
                    akfyVar.c.b();
                    akfyVar.b = false;
                    return;
                }
                throw new IllegalStateException("Already flushed. You must reinitialize.");
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean i(int i) {
        int j = j();
        if (j != 1) {
            try {
                akfy akfyVar = this.w;
                akfyVar.c = new akfw();
                akfw akfwVar = akfyVar.c;
                int c = akfy.c(j);
                akfwVar.e = c;
                if (c == 1 || c == 4) {
                    throw new akfx("Codec not set properly.");
                }
                if (c == 2 && i != 16000) {
                    throw new akfx("AMR-WB encoder requires a sample rate of 16kHz.");
                }
                MediaCodecInfo a = akfy.a(akfy.b(c));
                if (a == null) {
                    throw new akfx("Encoder not found.");
                }
                akfwVar.b = MediaCodec.createByCodecName(a.getName());
                MediaFormat mediaFormat = new MediaFormat();
                int c2 = akfy.c(j);
                mediaFormat.setString("mime", akfy.b(c2));
                mediaFormat.setInteger("sample-rate", i);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("max-input-size", 4096);
                if (c2 != 3) {
                    mediaFormat.setInteger("bitrate", j - 1);
                }
                akfwVar.b.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                akfwVar.b.start();
                akfwVar.d = false;
                akfwVar.c = false;
                akfwVar.a = false;
                akfyVar.b = true;
                akfyVar.a = false;
                return true;
            } catch (akfx | IOException | IllegalArgumentException unused) {
            }
        }
        return false;
    }

    private final int j() {
        int i = this.I;
        if (i == 0) {
            i = this.P;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 2) {
            return i2 != 4 ? 1 : 2;
        }
        return 23851;
    }

    public final void a() {
        AudioRecord audioRecord = this.b;
        if (audioRecord != null) {
            audioRecord.release();
        }
        aybv aybvVar = this.u;
        if (aybvVar != null) {
            aylc aylcVar = ((ayld) aybvVar).c;
            int i = aylc.a;
            aylcVar.a();
            aykx aykxVar = (aykx) ((ayio) aybvVar).a;
            aykxVar.G.a(1, "shutdownNow() called");
            aykxVar.n();
            aykt ayktVar = aykxVar.I;
            ayktVar.c.o.execute(new ayko(ayktVar, 0));
            aykxVar.o.execute(new ayjx(aykxVar, 2));
        }
    }

    public final void b() {
        String g = this.n.g();
        if (g != null) {
            this.q.f(ayca.c("X-Goog-Visitor-Id", aycd.a), g);
        }
    }

    public final void c() {
        AudioRecord audioRecord = this.b;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        if (this.f64J.h().booleanValue()) {
            synchronized (this) {
                h();
                if (this.t != null) {
                    ((ayor) this.t).d(Status.c.asException());
                    this.t = null;
                }
            }
            return;
        }
        h();
        this.L.execute(new akfe(this, 1));
    }

    public final void d() {
        AudioRecord audioRecord = this.b;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        if (this.f64J.h().booleanValue()) {
            synchronized (this) {
                h();
                if (this.t != null) {
                    this.t.a();
                    this.t = null;
                }
            }
            return;
        }
        h();
        this.L.execute(new akfe(this, 2));
    }

    public final boolean e() {
        return this.I != 2;
    }

    public final boolean f() {
        AudioRecord audioRecord = this.b;
        if (audioRecord == null || audioRecord.getState() != 1) {
            zga.b("AudioRecord is null or not initialized");
            return false;
        }
        if (!this.O) {
            this.O = i(this.N);
        }
        this.b.startRecording();
        this.c.post(new akfe(this, 0));
        this.L.execute(new Runnable() { // from class: akff
            @Override // java.lang.Runnable
            public final void run() {
                akfo akfoVar = akfo.this;
                int i = 1;
                if (akfoVar.s == null) {
                    afsx c = akfoVar.n.c();
                    if (c.z() || !(c instanceof AccountIdentity)) {
                        akfoVar.k = "";
                    } else {
                        aftg d = akfoVar.r.d((AccountIdentity) c);
                        if (d.g()) {
                            akfoVar.k = d.e();
                        } else {
                            akfoVar.k = "";
                        }
                    }
                    afsx c2 = akfoVar.n.c();
                    if (c2 != null && c2.w()) {
                        akfoVar.q.f(ayca.c("X-Goog-PageId", aycd.a), c2.e());
                    }
                    if (ammx.e(akfoVar.k)) {
                        akfoVar.q.f(ayca.c("x-goog-api-key", aycd.a), akfoVar.j);
                        akfoVar.b();
                    } else if (akfoVar.z) {
                        akfoVar.b();
                    }
                    ayfe a = ayfe.a(akfoVar.E, 443, akfoVar.i);
                    a.b.c.addAll(Arrays.asList(new akfs(akfoVar.q, akfoVar.k)));
                    a.b.g = akfoVar.o;
                    akfoVar.u = a.c();
                    akfoVar.s = (amkp) amkp.b(new amko(0), akfoVar.u);
                }
                amkp amkpVar = akfoVar.s;
                aypb aypbVar = akfoVar.v;
                axzp axzpVar = amkpVar.a;
                aych aychVar = amkq.a;
                if (aychVar == null) {
                    synchronized (amkq.class) {
                        aychVar = amkq.a;
                        if (aychVar == null) {
                            ayce a2 = aych.a();
                            a2.c = aycg.BIDI_STREAMING;
                            a2.d = aych.c("google.assistant.embedded.v1.EmbeddedAssistant", "YTAssist");
                            a2.b();
                            a2.a = ayom.b(amkh.a);
                            a2.b = ayom.b(amki.a);
                            aychVar = a2.a();
                            amkq.a = aychVar;
                        }
                    }
                }
                akfoVar.t = ayox.b(axzpVar.a(aychVar, amkpVar.b), aypbVar);
                aone createBuilder = amkd.a.createBuilder();
                amkj amkjVar = akfoVar.g;
                createBuilder.copyOnWrite();
                amkd amkdVar = (amkd) createBuilder.instance;
                amkjVar.getClass();
                amkdVar.c = amkjVar;
                amkdVar.b = 1;
                amkl amklVar = akfoVar.h;
                createBuilder.copyOnWrite();
                amkd amkdVar2 = (amkd) createBuilder.instance;
                amklVar.getClass();
                amkdVar2.d = amklVar;
                amkm amkmVar = akfoVar.a;
                createBuilder.copyOnWrite();
                amkd amkdVar3 = (amkd) createBuilder.instance;
                amkmVar.getClass();
                amkdVar3.f = amkmVar;
                aone createBuilder2 = arja.a.createBuilder();
                int i2 = akfoVar.H;
                createBuilder2.copyOnWrite();
                arja arjaVar = (arja) createBuilder2.instance;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                arjaVar.f = i3;
                arjaVar.b |= 4096;
                float f = akfoVar.x;
                createBuilder2.copyOnWrite();
                arja arjaVar2 = (arja) createBuilder2.instance;
                arjaVar2.b |= 8192;
                arjaVar2.g = f;
                boolean z = akfoVar.D;
                createBuilder2.copyOnWrite();
                arja arjaVar3 = (arja) createBuilder2.instance;
                arjaVar3.b |= 32;
                arjaVar3.d = z;
                aone createBuilder3 = ariz.a.createBuilder();
                boolean z2 = akfoVar.B;
                createBuilder3.copyOnWrite();
                ariz arizVar = (ariz) createBuilder3.instance;
                arizVar.b |= 4;
                arizVar.e = !z2;
                String str = akfoVar.C;
                createBuilder3.copyOnWrite();
                ariz arizVar2 = (ariz) createBuilder3.instance;
                str.getClass();
                arizVar2.b |= 1;
                arizVar2.c = str;
                if (akfoVar.B) {
                    String str2 = akfoVar.f;
                    createBuilder3.copyOnWrite();
                    ariz arizVar3 = (ariz) createBuilder3.instance;
                    str2.getClass();
                    arizVar3.b |= 2;
                    arizVar3.d = str2;
                }
                ariz arizVar4 = (ariz) createBuilder3.build();
                createBuilder2.copyOnWrite();
                arja arjaVar4 = (arja) createBuilder2.instance;
                arizVar4.getClass();
                arjaVar4.h = arizVar4;
                arjaVar4.b |= 131072;
                aone createBuilder4 = awfo.a.createBuilder();
                if (akfoVar.A.h()) {
                    String str3 = (String) akfoVar.A.c();
                    createBuilder4.copyOnWrite();
                    awfo awfoVar = (awfo) createBuilder4.instance;
                    awfoVar.b |= 2048;
                    awfoVar.c = str3;
                }
                aone createBuilder5 = awfq.a.createBuilder();
                createBuilder5.copyOnWrite();
                awfq awfqVar = (awfq) createBuilder5.instance;
                awfo awfoVar2 = (awfo) createBuilder4.build();
                awfoVar2.getClass();
                awfqVar.d = awfoVar2;
                awfqVar.b |= 4;
                aone createBuilder6 = awfp.a.createBuilder();
                if (!TextUtils.isEmpty(akfoVar.y)) {
                    String str4 = akfoVar.y;
                    createBuilder6.copyOnWrite();
                    awfp awfpVar = (awfp) createBuilder6.instance;
                    str4.getClass();
                    awfpVar.b |= 128;
                    awfpVar.d = str4;
                }
                try {
                    asas asasVar = (asas) aonm.parseFrom(asas.a, akfoVar.m);
                    if (asasVar != null) {
                        createBuilder6.copyOnWrite();
                        awfp awfpVar2 = (awfp) createBuilder6.instance;
                        awfpVar2.c = asasVar;
                        awfpVar2.b |= 1;
                    }
                } catch (aoob unused) {
                }
                awfp awfpVar3 = (awfp) createBuilder6.build();
                createBuilder5.copyOnWrite();
                awfq awfqVar2 = (awfq) createBuilder5.instance;
                awfpVar3.getClass();
                awfqVar2.c = awfpVar3;
                awfqVar2.b |= 1;
                createBuilder2.copyOnWrite();
                arja arjaVar5 = (arja) createBuilder2.instance;
                awfq awfqVar3 = (awfq) createBuilder5.build();
                awfqVar3.getClass();
                arjaVar5.e = awfqVar3;
                arjaVar5.b |= 2048;
                aone t = akfoVar.K.t();
                createBuilder2.copyOnWrite();
                arja arjaVar6 = (arja) createBuilder2.instance;
                arnb arnbVar = (arnb) t.build();
                arnbVar.getClass();
                arjaVar6.c = arnbVar;
                arjaVar6.b |= 1;
                aone createBuilder7 = awzf.a.createBuilder();
                aomf byteString = ((arja) createBuilder2.build()).toByteString();
                createBuilder7.copyOnWrite();
                awzf awzfVar = (awzf) createBuilder7.instance;
                awzfVar.b = 1;
                awzfVar.c = byteString;
                if (akfoVar.F) {
                    aone createBuilder8 = awzh.a.createBuilder();
                    aone createBuilder9 = amkw.a.createBuilder();
                    createBuilder9.copyOnWrite();
                    amkw amkwVar = (amkw) createBuilder9.instance;
                    aonu aonuVar = amkwVar.b;
                    if (!aonuVar.c()) {
                        amkwVar.b = aonm.mutableCopy(aonuVar);
                    }
                    amkwVar.b.g(0);
                    createBuilder8.copyOnWrite();
                    awzh awzhVar = (awzh) createBuilder8.instance;
                    amkw amkwVar2 = (amkw) createBuilder9.build();
                    amkwVar2.getClass();
                    awzhVar.c = amkwVar2;
                    awzhVar.b |= 1;
                    aone createBuilder10 = amkx.a.createBuilder();
                    createBuilder10.copyOnWrite();
                    amkx amkxVar = (amkx) createBuilder10.instance;
                    amkxVar.c = 5;
                    amkxVar.b |= 1;
                    int i4 = akfoVar.I;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 2) {
                        i = 7;
                    } else if (i5 == 3) {
                        i = 10;
                    } else if (i5 == 4) {
                        i = 8;
                    }
                    createBuilder10.copyOnWrite();
                    amkx amkxVar2 = (amkx) createBuilder10.instance;
                    amkxVar2.d = i - 1;
                    amkxVar2.b |= 2;
                    createBuilder8.copyOnWrite();
                    awzh awzhVar2 = (awzh) createBuilder8.instance;
                    amkx amkxVar3 = (amkx) createBuilder10.build();
                    amkxVar3.getClass();
                    awzhVar2.d = amkxVar3;
                    awzhVar2.b |= 2;
                    aomf byteString2 = ((awzh) createBuilder8.build()).toByteString();
                    createBuilder7.copyOnWrite();
                    awzf awzfVar2 = (awzf) createBuilder7.instance;
                    awzfVar2.d = 4;
                    awzfVar2.e = byteString2;
                }
                awzf awzfVar3 = (awzf) createBuilder7.build();
                aone createBuilder11 = amkn.a.createBuilder();
                String str5 = akfoVar.f;
                createBuilder11.copyOnWrite();
                amkn amknVar = (amkn) createBuilder11.instance;
                str5.getClass();
                amknVar.c = str5;
                boolean z3 = akfoVar.B;
                createBuilder11.copyOnWrite();
                ((amkn) createBuilder11.instance).d = z3;
                if (akfoVar.G > 0) {
                    aone createBuilder12 = amkf.a.createBuilder();
                    aone createBuilder13 = amke.a.createBuilder();
                    int i6 = akfoVar.G;
                    createBuilder13.copyOnWrite();
                    ((amke) createBuilder13.instance).b = i6;
                    amke amkeVar = (amke) createBuilder13.build();
                    createBuilder12.copyOnWrite();
                    amkf amkfVar = (amkf) createBuilder12.instance;
                    amkeVar.getClass();
                    amkfVar.b = amkeVar;
                    amkf amkfVar2 = (amkf) createBuilder12.build();
                    createBuilder11.copyOnWrite();
                    amkn amknVar2 = (amkn) createBuilder11.instance;
                    amkfVar2.getClass();
                    amknVar2.b = amkfVar2;
                }
                aone createBuilder14 = amkr.a.createBuilder();
                aomf byteString3 = awzfVar3.toByteString();
                createBuilder14.copyOnWrite();
                ((amkr) createBuilder14.instance).b = byteString3;
                amkr amkrVar = (amkr) createBuilder14.build();
                createBuilder.copyOnWrite();
                amkd amkdVar4 = (amkd) createBuilder.instance;
                amkrVar.getClass();
                amkdVar4.g = amkrVar;
                amkn amknVar3 = (amkn) createBuilder11.build();
                createBuilder.copyOnWrite();
                amkd amkdVar5 = (amkd) createBuilder.instance;
                amknVar3.getClass();
                amkdVar5.e = amknVar3;
                if (akfoVar.f64J.h().booleanValue()) {
                    synchronized (akfoVar) {
                        akfoVar.g(createBuilder);
                    }
                } else {
                    akfoVar.g(createBuilder);
                }
            }
        });
        return true;
    }

    public final void g(aone aoneVar) {
        if (this.t != null) {
            aypb aypbVar = this.t;
            aone createBuilder = amkh.a.createBuilder();
            createBuilder.copyOnWrite();
            amkh amkhVar = (amkh) createBuilder.instance;
            amkd amkdVar = (amkd) aoneVar.build();
            amkdVar.getClass();
            amkhVar.c = amkdVar;
            amkhVar.b = 2;
            aypbVar.c((amkh) createBuilder.build());
            this.M.run();
            return;
        }
        d();
        this.c.post(new akfh(this, new NullPointerException(), 0));
    }
}
