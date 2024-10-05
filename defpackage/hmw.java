package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hmw implements hna {
    public final aiij a;
    public final hmg c;
    public final Context d;
    public final acqz f;
    public final aahd g;
    public boolean h;
    public boolean i;
    public heg j;
    private final aijp k;
    private final Executor l;
    private final aemv m;
    private final Executor n;
    private final hnb o;
    private final aaxn p;
    public final azqv b = azqv.ap();
    public final pny e = new hmu(this);

    public hmw(Context context, aiij aiijVar, aijp aijpVar, aemv aemvVar, Executor executor, hmg hmgVar, Executor executor2, jgp jgpVar, acqz acqzVar, aaxn aaxnVar, aahd aahdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = aiijVar;
        this.k = aijpVar;
        this.m = aemvVar;
        this.l = executor;
        this.c = hmgVar;
        this.n = executor2;
        this.d = context;
        ysl yslVar = (ysl) jgpVar.a.get();
        yslVar.getClass();
        hfp hfpVar = (hfp) jgpVar.b.get();
        hfpVar.getClass();
        this.o = new hnb(yslVar, hfpVar, this);
        this.f = acqzVar;
        this.p = aaxnVar;
        this.g = aahdVar;
    }

    public final ShortsCreationSelectedTrack a() {
        if (this.b.ar() == null || !((ammv) this.b.ar()).h()) {
            return null;
        }
        return (ShortsCreationSelectedTrack) ((ammv) this.b.ar()).c();
    }

    public final aypy b() {
        return this.b.U();
    }

    public final void c() {
        this.b.c(amlr.a);
        heg hegVar = this.j;
        if (hegVar != null) {
            hegVar.a();
        }
    }

    public final void d(String str, String str2, apxf apxfVar) {
        this.f.mM().D(new acqx(acsb.c(123970)));
        heg hegVar = this.j;
        if (hegVar != null) {
            hegVar.b();
        }
        final hmv hmvVar = new hmv(this);
        final aijr d = this.k.d();
        d.c = str2;
        d.b = str;
        d.e(aigf.BACKGROUND.i);
        d.l(aomf.b);
        if (apxfVar == null || !apxfVar.pY(arbr.b)) {
            this.l.execute(new Runnable() { // from class: hmr
                @Override // java.lang.Runnable
                public final void run() {
                    hmw hmwVar = hmw.this;
                    hmwVar.a.b(d, hmvVar, null, null, true, null);
                }
            });
            return;
        }
        final anhy S = anaf.S(new Callable() { // from class: hmt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hmw hmwVar = hmw.this;
                return hmwVar.a.a(d);
            }
        }, this.l);
        final anhy r = this.p.r(apxfVar, this.l);
        ynm.k(anaf.I(S, r).a(new Callable() { // from class: hml
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hmw hmwVar = hmw.this;
                anhy anhyVar = r;
                anhy anhyVar2 = S;
                try {
                    arsm arsmVar = (arsm) anaf.W(anhyVar);
                    if ((arsmVar.b & 2) != 0) {
                        if (!hmwVar.h) {
                            autf autfVar = arsmVar.d;
                            if (autfVar == null) {
                                autfVar = autf.a;
                            }
                            aute auteVar = autfVar.c;
                            if (auteVar == null) {
                                auteVar = aute.a;
                            }
                            hmwVar.g(auteVar.c);
                        }
                        if ((arsmVar.b & 2) != 0) {
                            autf autfVar2 = arsmVar.d;
                            if (autfVar2 == null) {
                                autfVar2 = autf.a;
                            }
                            azqv azqvVar = hmwVar.b;
                            hmx c = hmwVar.a().c();
                            c.b(true);
                            c.d = autfVar2;
                            azqvVar.c(ammv.j(c.a()));
                        }
                    }
                    if (hmwVar.i && (arsmVar.b & 32) != 0) {
                        hmwVar.i = false;
                        aahd aahdVar = hmwVar.g;
                        apxf apxfVar2 = arsmVar.e;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar.a(apxfVar2);
                    }
                } catch (ExecutionException unused) {
                }
                return (PlayerResponseModel) anaf.W(anhyVar2);
            }
        }, this.l), this.l, new ynk() { // from class: hmk
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                hmw.this.e();
            }
        }, new ynl() { // from class: hmm
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                hmw.this.k((PlayerResponseModel) obj);
            }
        });
    }

    public final void e() {
        this.n.execute(new hmn(this, 1));
    }

    public final void g(final long j) {
        if (this.c.e) {
            this.n.execute(new Runnable() { // from class: hmo
                @Override // java.lang.Runnable
                public final void run() {
                    hmw hmwVar = hmw.this;
                    long j2 = j;
                    hmg hmgVar = hmwVar.c;
                    hmgVar.g = j2;
                    hmgVar.d();
                }
            });
        }
    }

    @Override // defpackage.hna
    public final void h(long j) {
        n(j, amlr.a);
    }

    public final void i(long j) {
        ShortsCreationSelectedTrack a = a();
        if (a != null) {
            azqv azqvVar = this.b;
            hmx c = a.c();
            c.b(true);
            c.c(j);
            azqvVar.c(ammv.j(c.a()));
            g(j);
        }
    }

    public final void j() {
        this.n.execute(new hmn(this, 0));
    }

    public final void k(PlayerResponseModel playerResponseModel) {
        final ammv ammvVar;
        FormatStreamModel[] formatStreamModelArr;
        int length;
        aeeu aeeuVar = null;
        try {
            VideoStreamingData videoStreamingData = playerResponseModel.c;
            if (videoStreamingData != null) {
                aeeuVar = this.m.b(videoStreamingData, playerResponseModel.c(), true);
            }
        } catch (aeew e) {
            zga.d("SCMusicController: Missing stream", e);
        }
        if (aeeuVar == null || (formatStreamModelArr = aeeuVar.b) == null || (length = formatStreamModelArr.length) == 0) {
            if (aeeuVar != null) {
                zga.b("[Shorts Creation][Music] No usable audio streams found in response");
            }
            e();
            ammvVar = amlr.a;
        } else {
            int i = 0;
            while (true) {
                if (i < length) {
                    FormatStreamModel formatStreamModel = formatStreamModelArr[i];
                    if (formatStreamModel.f() == 3 && !formatStreamModel.d.toString().isEmpty()) {
                        ammvVar = ammv.j(formatStreamModel.d);
                        break;
                    }
                    i++;
                } else {
                    zga.l("[Shorts Creation][Music] Medium quality stream not found, using the first available stream. ");
                    if (!aeeuVar.b[0].d.toString().isEmpty()) {
                        ammvVar = ammv.j(aeeuVar.b[0].d);
                    } else {
                        e();
                        ammvVar = amlr.a;
                    }
                }
            }
        }
        if (ammvVar.h()) {
            final hnb hnbVar = this.o;
            final long j = playerResponseModel.c.d;
            aryv aryvVar = playerResponseModel.a.h;
            if (aryvVar == null) {
                aryvVar = aryv.a;
            }
            Iterator it = aryvVar.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hnbVar.b.h(j);
                    break;
                }
                atdz atdzVar = (atdz) it.next();
                if (atdzVar.b == 1) {
                    String str = ((atdy) atdzVar.c).b;
                    ysl yslVar = hnbVar.a;
                    hfp hfpVar = hnbVar.c;
                    hfpVar.f = hfpVar.a.b(asmn.LATENCY_ACTION_SHORTS_WAVEFORM_DOWNLOAD);
                    yslVar.a(new hmz(hnbVar, str, new cnk() { // from class: hmy
                        @Override // defpackage.cnk
                        public final void kY(cnq cnqVar) {
                            cnh cnhVar;
                            hnb.this.b.h(j);
                            if (cnqVar == null || (cnhVar = cnqVar.b) == null) {
                                return;
                            }
                            int i2 = cnhVar.a;
                            StringBuilder sb = new StringBuilder(73);
                            sb.append("[ShortsCreation][Android][Music]Error fetching waveform data: ");
                            sb.append(i2);
                            afsi.b(2, 6, sb.toString());
                        }
                    }, str, j));
                    break;
                }
            }
            this.n.execute(new Runnable() { // from class: hms
                @Override // java.lang.Runnable
                public final void run() {
                    hmw hmwVar = hmw.this;
                    ammv ammvVar2 = ammvVar;
                    hmg hmgVar = hmwVar.c;
                    if (hmgVar.e) {
                        hmgVar.h((Uri) ammvVar2.c());
                    }
                    if (hmwVar.a() != null) {
                        azqv azqvVar = hmwVar.b;
                        hmx c = hmwVar.a().c();
                        c.f = (Uri) ammvVar2.c();
                        azqvVar.c(ammv.j(c.a()));
                    }
                }
            });
            return;
        }
        zga.b("SCMusicController: Streaming url not found");
    }

    public final void l(auti autiVar) {
        azqv azqvVar = this.b;
        hmx m = ShortsCreationSelectedTrack.m();
        m.d(autiVar.c);
        if ((autiVar.b & 2) != 0) {
            avgg avggVar = autiVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            m.c = avggVar;
        }
        if ((autiVar.b & 4) != 0) {
            m.e = autiVar.e;
        }
        m.b(false);
        m.a = autiVar.g;
        if ((autiVar.b & 64) != 0) {
            apxf apxfVar = autiVar.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            m.b = apxfVar;
        }
        m.c(fkc.z(autiVar));
        azqvVar.c(ammv.j(m.a()));
        this.h = false;
        if ((autiVar.b & 16) != 0) {
            g(fkc.z(autiVar));
            this.h = true;
        }
        this.i = false;
        String str = autiVar.c;
        String str2 = autiVar.g;
        apxf apxfVar2 = autiVar.h;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        d(str, str2, apxfVar2);
    }

    public final void m(axet axetVar) {
        azqv azqvVar = this.b;
        hmx m = ShortsCreationSelectedTrack.m();
        m.d(axetVar.c);
        axes axesVar = axetVar.e;
        if (axesVar == null) {
            axesVar = axes.a;
        }
        if ((axesVar.b & 2) != 0) {
            axes axesVar2 = axetVar.e;
            if (axesVar2 == null) {
                axesVar2 = axes.a;
            }
            avgg avggVar = axesVar2.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            m.c = avggVar;
        }
        axes axesVar3 = axetVar.e;
        if (axesVar3 == null) {
            axesVar3 = axes.a;
        }
        if ((axesVar3.b & 1) != 0) {
            axes axesVar4 = axetVar.e;
            if (axesVar4 == null) {
                axesVar4 = axes.a;
            }
            m.e = axesVar4.c;
        }
        if ((axetVar.b & 16) != 0) {
            apxf apxfVar = axetVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            m.b = apxfVar;
        }
        m.b(false);
        m.c(fkc.A(axetVar));
        m.a = axetVar.f;
        azqvVar.c(ammv.j(m.a()));
        g(fkc.A(axetVar));
        this.h = true;
        this.i = true;
        String str = axetVar.c;
        String str2 = axetVar.f;
        apxf apxfVar2 = axetVar.g;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        d(str, str2, apxfVar2);
    }

    public final void n(final long j, final ammv ammvVar) {
        this.n.execute(new Runnable() { // from class: hmp
            @Override // java.lang.Runnable
            public final void run() {
                hmw hmwVar = hmw.this;
                long j2 = j;
                ammv ammvVar2 = ammvVar;
                if (hmwVar.a() != null) {
                    azqv azqvVar = hmwVar.b;
                    hmx c = hmwVar.a().c();
                    c.g = ammv.j(Long.valueOf(j2));
                    c.h = ammvVar2;
                    azqvVar.c(ammv.j(c.a()));
                }
            }
        });
    }

    public final void f() {
        hmg hmgVar = this.c;
        if (!hmgVar.e) {
            Context context = hmgVar.a;
            poj pojVar = new poj(context, new pln(context), new bie());
            muf.J(hmgVar.i, pojVar);
            hmgVar.k = muf.I(pojVar);
            if (!hmgVar.j.c()) {
                hmgVar.k.R();
            }
            hmgVar.g(true);
            hmgVar.k.y(hmgVar.b);
            hmgVar.k.u(hmgVar.c);
            hmgVar.e = true;
        }
        hmg hmgVar2 = this.c;
        pny pnyVar = this.e;
        pom pomVar = hmgVar2.k;
        if (pomVar != null) {
            pomVar.y(pnyVar);
        }
        if (a() == null || a().b() == null || this.c.d) {
            return;
        }
        final Uri b = a().b();
        this.n.execute(new Runnable() { // from class: hmq
            @Override // java.lang.Runnable
            public final void run() {
                hmw hmwVar = hmw.this;
                hmwVar.c.h(b);
            }
        });
    }
}
