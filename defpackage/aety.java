package defpackage;

import android.media.MediaCodec;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aety implements avm {
    public int a;
    public auj b;
    private final aetx g;
    private final aetw h;
    private final afeu i;
    private int j;
    private final afji d = new afji();
    private final afep e = new afep();
    private final pot f = new pot();
    public final Queue c = new ArrayDeque();

    public aety(aetx aetxVar, aetw aetwVar, afeu afeuVar) {
        this.g = aetxVar;
        this.h = aetwVar;
        this.i = afeuVar;
    }

    private final aeru ar(avl avlVar) {
        aezf as = as(avlVar);
        return as != null ? as.b : this.h.b();
    }

    private final aezf as(avl avlVar) {
        aezf at = at(avlVar, avlVar.c);
        return at != null ? at : this.h.n;
    }

    private final aezf at(avl avlVar, int i) {
        if (avlVar.b.z() || i >= avlVar.b.h()) {
            return null;
        }
        avlVar.b.y(i, this.f);
        Object obj = this.f.c;
        if (obj instanceof aezf) {
            return (aezf) obj;
        }
        if (!(obj instanceof aevu)) {
            return null;
        }
        Object obj2 = ((aevu) obj).a;
        if (obj2 instanceof aezf) {
            return (aezf) obj2;
        }
        return null;
    }

    @Override // defpackage.avm
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void C() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void F() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void G() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void I() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void J() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void K() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void M() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void N() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void O() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void Q() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void R() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void S() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void T() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void U() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void Y(int i) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void Z() {
    }

    @Override // defpackage.avm
    public final void a(avl avlVar, String str, long j, long j2) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j3 = avlVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 91);
            sb.append("onDecoderInitialized.trackType=1.decoderName=");
            sb.append(str);
            sb.append(".initializationDurationMs=");
            sb.append(j2);
            queue.add(new aesd(j3, sb.toString()));
        }
        aezf as = as(avlVar);
        if (as == null) {
            return;
        }
        as.b.a().b(j, j2);
    }

    @Override // defpackage.avm
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ae(asj asjVar) {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ah() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.avm
    public final void am(avl avlVar, auk aukVar) {
        String format;
        String sb;
        if (this.h.s.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_CODEC_DISCARD_REASON)) {
            aeru ar = ar(avlVar);
            if (aukVar == null) {
                return;
            }
            if (aukVar.d != 0) {
                format = String.format(Locale.US, "reused.%d", Integer.valueOf(aukVar.d));
            } else {
                int i = aukVar.e;
                if (i == 0) {
                    sb = "0";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i2 = 0; i2 < 32; i2++) {
                        if (((1 << i2) & i) > 0) {
                            sb2.append(i2);
                            sb2.append(".");
                        }
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    sb = sb2.toString();
                }
                format = String.format(Locale.US, "reused.%d;reason.%s", Integer.valueOf(aukVar.d), sb);
            }
            ar.i("ecir", new aesd(avlVar.a, format));
        }
    }

    @Override // defpackage.avm
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.avm
    public final void ap(avl avlVar, int i, int i2, float f) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            StringBuilder sb = new StringBuilder(130);
            sb.append("onVideoSizeChanged.width=");
            sb.append(i);
            sb.append(".height=");
            sb.append(i2);
            sb.append(".unappliedRotationDegrees=0.pixelWidthHeightRatio=");
            sb.append(f);
            queue.add(new aesd(j, sb.toString()));
        }
        aevl aevlVar = ((aeut) this.g).w;
        aevlVar.i = i;
        aevlVar.j = i2;
        if (aevlVar.n && aevlVar.l() && (aevlVar.k != aevlVar.i || aevlVar.l != aevlVar.j)) {
            aevlVar.g();
        }
        aevlVar.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int aq() {
        auj aujVar = this.b;
        return aujVar != null ? this.j + aujVar.g : this.j;
    }

    @Override // defpackage.avm
    public final void b(avl avlVar, long j) {
        ar(avlVar).s(j);
    }

    @Override // defpackage.avm
    public final void c(avl avlVar, int i, long j, long j2) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j3 = avlVar.a;
            StringBuilder sb = new StringBuilder(116);
            sb.append("onAudioUnderrun.bufferSize=");
            sb.append(i);
            sb.append(".bufferSizeMs=");
            sb.append(j);
            sb.append(".elapsedSinceLastFeedMs=");
            sb.append(j2);
            queue.add(new aesd(j3, sb.toString()));
        }
        aetx aetxVar = this.g;
        aeru ar = ar(avlVar);
        afif afifVar = afif.DEFAULT;
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("b.");
        sb2.append(j);
        sb2.append(";e.");
        sb2.append(j2);
        aetxVar.A(ar, afifVar, "underrun", sb2.toString());
    }

    @Override // defpackage.avm
    public final void d(avl avlVar, int i, auj aujVar) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            StringBuilder sb = new StringBuilder(39);
            sb.append("onDecoderDisabled.trackType=");
            sb.append(i);
            queue.add(new aesd(j, sb.toString()));
        }
        if (i == 2) {
            this.j += aujVar.g;
            this.a += aujVar.e;
            this.b = null;
            return;
        }
        ar(avlVar).b(0);
    }

    @Override // defpackage.avm
    public final void e(avl avlVar, int i, auj aujVar) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            StringBuilder sb = new StringBuilder(38);
            sb.append("onDecoderEnabled.trackType=");
            sb.append(i);
            queue.add(new aesd(j, sb.toString()));
        }
        if (i == 2) {
            this.b = aujVar;
        }
    }

    @Override // defpackage.avm
    public final void f(avl avlVar, int i, pms pmsVar) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            StringBuilder sb = new StringBuilder(49);
            sb.append("onDecoderInputFormatChanged.trackType=");
            sb.append(i);
            queue.add(new aesd(j, sb.toString()));
        }
        if (i == 2) {
            afky afkyVar = this.h.m;
            if (pmsVar != null && afkyVar != null) {
                afld a = this.e.a(pmsVar.x);
                if (a != null) {
                    a.b = pmsVar.y;
                }
                afkyVar.u(a);
            }
        }
        if (i != 1 || pmsVar == null) {
            return;
        }
        aetw aetwVar = this.h;
        int i2 = pmsVar.D;
        boolean z = false;
        if ((i2 > 0 || pmsVar.E > 0) && i2 != -1 && pmsVar.E != -1) {
            z = true;
        }
        aetwVar.q = z;
        aetwVar.r = true;
    }

    @Override // defpackage.avm
    public final void g(avl avlVar, bbn bbnVar) {
        String str;
        if (this.h.s.ae()) {
            this.c.add(new aesd(avlVar.a, "onDownstreamFormatChanged."));
        }
        afki.d(bbnVar.d instanceof aezh);
        Object obj = bbnVar.d;
        pms pmsVar = bbnVar.b;
        if (pmsVar == null || (str = pmsVar.c) == null || obj == null) {
            return;
        }
        aezh aezhVar = (aezh) obj;
        aezhVar.a.m(str, this.h.g(), aezhVar, bbnVar.c);
    }

    @Override // defpackage.avm
    public final void h(avl avlVar, Exception exc) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            String valueOf = String.valueOf(exc.getMessage());
            queue.add(new aesd(j, valueOf.length() != 0 ? "onDrmSessionManagerError.exception=".concat(valueOf) : new String("onDrmSessionManagerError.exception=")));
        }
        aeut aeutVar = (aeut) this.g;
        aeutVar.u(ar(avlVar), afeu.a(exc, aeutVar.g(), afif.DRM, "keyerror", null, false));
    }

    @Override // defpackage.avm
    public final void i(avl avlVar, int i, long j) {
        afhs afhsVar = this.h.s;
        if (afhsVar.ae()) {
            Queue queue = this.c;
            long j2 = avlVar.a;
            StringBuilder sb = new StringBuilder(77);
            sb.append("onDroppedVideoFrames.droppedFrames=");
            sb.append(i);
            sb.append(".elapsedMs=");
            sb.append(j);
            queue.add(new aesd(j2, sb.toString()));
        }
        aezf as = as(avlVar);
        if (as == null) {
            return;
        }
        int aq = aq();
        as.K.d(aq, false);
        PlayerConfigModel a = as.a();
        VideoStreamingData b = as.b();
        FormatStreamModel formatStreamModel = as.x;
        if (formatStreamModel == null || !formatStreamModel.H() || b.D() || a.i() <= 0 || this.h.c.a) {
            return;
        }
        afic aficVar = afic.ABR;
        this.d.c(avlVar.a, aq);
        if (this.d.e(a.i())) {
            double a2 = this.d.a();
            String b2 = this.d.b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 23);
            sb2.append("droprate.");
            sb2.append((int) a2);
            sb2.append(".d.");
            sb2.append(b2);
            String sb3 = sb2.toString();
            this.d.d();
            aeru ar = ar(avlVar);
            aetx aetxVar = this.g;
            String str = as.a;
            if (afhsVar.ak()) {
                if (str == null || !str.equals(((aeut) aetxVar).i.s.at())) {
                    afhsVar.aD(formatStreamModel);
                    aeut aeutVar = (aeut) aetxVar;
                    afie afieVar = new afie("android.hfrdroppedframes.seamless", aeutVar.g());
                    afieVar.a = afif.DEFAULT;
                    afieVar.b = sb3;
                    aeutVar.u(ar, afieVar.a());
                    aeutVar.i.s.aC(str);
                    aeutVar.s.c(aeutVar.g, null, 10004);
                    aeutVar.ag(true, false);
                    return;
                }
                return;
            }
            afhsVar.aD(formatStreamModel);
            aeut aeutVar2 = (aeut) aetxVar;
            afie afieVar2 = new afie("android.hfrdroppedframes", aeutVar2.g());
            afieVar2.a = afif.DEFAULT;
            afieVar2.b = sb3;
            afieVar2.d = formatStreamModel;
            aeutVar2.u(ar, afieVar2.a());
        }
    }

    @Override // defpackage.avm
    public final void j(avl avlVar, bbi bbiVar, bbn bbnVar, IOException iOException, boolean z) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            String message = iOException.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
            sb.append("onLoadError.wasCancelled=");
            sb.append(z);
            sb.append(".exception=");
            sb.append(message);
            queue.add(new aesd(j, sb.toString()));
        }
        if (iOException.getCause() instanceof aele) {
            ar(avlVar).i("empe", new aeqs("incompatible-stream-load-error"));
        }
        long g = this.g.g();
        long f = this.g.f();
        if (iOException.getCause() instanceof aele) {
            return;
        }
        if (!(iOException instanceof afij) || g + 1000 >= f) {
            if (!(iOException instanceof afii) || g + 1000 >= f) {
                aezf aezfVar = this.h.n;
                this.g.u(ar(avlVar), this.i.c(afif.DEFAULT, iOException, bbiVar, bbnVar, aezfVar != null ? aezfVar.b() : null, this.g.g(), aezfVar != null && aezfVar.x(), false));
            }
        }
    }

    @Override // defpackage.avm
    public final void k(avl avlVar, boolean z) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            StringBuilder sb = new StringBuilder(32);
            sb.append("onLoadingChanged.isLoading=");
            sb.append(z);
            queue.add(new aesd(j, sb.toString()));
        }
    }

    @Override // defpackage.avm
    public final void l(avl avlVar, pnu pnuVar) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            float f = pnuVar.b;
            StringBuilder sb = new StringBuilder(49);
            sb.append("onPlaybackParametersChanged.speed=");
            sb.append(f);
            queue.add(new aesd(j, sb.toString()));
        }
        ar(avlVar).p(pnuVar.b);
    }

    @Override // defpackage.avm
    public final void m(avl avlVar, pns pnsVar) {
        aezf aezfVar;
        aeru aeruVar;
        plp plpVar;
        afih afihVar;
        pns pnsVar2 = pnsVar;
        if (!(pnsVar2 instanceof plp)) {
            String valueOf = String.valueOf(pnsVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unexpected PlaybackException: ");
            sb.append(valueOf);
            pnsVar2 = new plp(3, null, sb.toString(), 1001, null, -1, null, 4, false);
        }
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            plp plpVar2 = (plp) pnsVar2;
            int i = plpVar2.a;
            long j2 = plpVar2.i;
            StringBuilder sb2 = new StringBuilder(74);
            sb2.append("onPlayerError.exceptionType=");
            sb2.append(i);
            sb2.append(".exceptionTime=");
            sb2.append(j2);
            queue.add(new aesd(j, sb2.toString()));
        }
        aezf as = as(avlVar);
        if (as == null) {
            return;
        }
        aeru ar = ar(avlVar);
        int i2 = as.h().c;
        VideoStreamingData b = as.b();
        afeu afeuVar = this.i;
        long g = this.g.g();
        Surface surface = ((aeut) this.g).w.r;
        FormatStreamModel formatStreamModel = as.x;
        boolean x = as.x();
        plp plpVar3 = (plp) pnsVar2;
        Throwable cause = plpVar3.getCause();
        if (cause == null) {
            afihVar = new afih("player.exception", g, pnsVar2);
            aezfVar = as;
            aeruVar = ar;
            plpVar = plpVar3;
        } else if (cause instanceof IOException) {
            aezfVar = as;
            aeruVar = ar;
            plpVar = plpVar3;
            afihVar = afeuVar.c(afif.DEFAULT, (IOException) cause, null, null, b, g, x, true);
        } else if (cause instanceof MediaCodec.CryptoException) {
            MediaCodec.CryptoException cryptoException = (MediaCodec.CryptoException) cause;
            int errorCode = cryptoException.getErrorCode();
            String f = afhm.f(cryptoException, true, 2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(f).length() + 17);
            sb3.append("info.");
            sb3.append(errorCode);
            sb3.append(";");
            sb3.append(f);
            afihVar = new afih(afif.DRM, "keyerror", g, sb3.toString());
            aezfVar = as;
            aeruVar = ar;
            plpVar = plpVar3;
        } else {
            aezfVar = as;
            aeruVar = ar;
            plpVar = plpVar3;
            if (!(cause instanceof bab)) {
                if (cause instanceof awd) {
                    int i3 = ((awd) cause).a;
                    StringBuilder sb4 = new StringBuilder(25);
                    sb4.append("src.init;info.");
                    sb4.append(i3);
                    afihVar = new afih("android.audiotrack", g, sb4.toString());
                } else if (cause instanceof awg) {
                    int i4 = ((awg) cause).a;
                    StringBuilder sb5 = new StringBuilder(26);
                    sb5.append("src.write;info.");
                    sb5.append(i4);
                    afihVar = new afih("android.audiotrack", g, sb5.toString());
                } else if (cause instanceof aeew) {
                    afihVar = afeu.d(afif.DEFAULT, (aeew) cause, b, g);
                } else if (cause instanceof aui) {
                    afihVar = new afih(afif.LIBVPX, "fmt.decode", g, cause);
                } else if (cause instanceof OutOfMemoryError) {
                    if (i2 == 4) {
                        afihVar = new afih(afif.LIBVPX, "player.outofmemory", g, cause);
                    } else {
                        afihVar = new afih(afif.DEFAULT, "player.outofmemory", g, cause);
                    }
                } else if (cause instanceof azz) {
                    azz azzVar = (azz) cause;
                    baa baaVar = azzVar.a;
                    String str = baaVar == null ? null : baaVar.a;
                    String a = afhm.a(azzVar.getCause());
                    StringBuilder sb6 = new StringBuilder(String.valueOf(a).length() + 12);
                    sb6.append("src.decfail;");
                    sb6.append(a);
                    String valueOf2 = String.valueOf(sb6.toString());
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf2).length() + 6 + String.valueOf(str).length());
                    sb7.append(valueOf2);
                    sb7.append(";name.");
                    sb7.append(str);
                    String sb8 = sb7.toString();
                    if (azzVar instanceof bgs) {
                        bgs bgsVar = (bgs) azzVar;
                        String valueOf3 = String.valueOf(sb8);
                        int i5 = bgsVar.b;
                        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf3).length() + 20);
                        sb9.append(valueOf3);
                        sb9.append(";surhash.");
                        sb9.append(i5);
                        String valueOf4 = String.valueOf(sb9.toString());
                        String s = aedn.s(surface);
                        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf4).length() + 5 + s.length());
                        sb10.append(valueOf4);
                        sb10.append(";sur.");
                        sb10.append(s);
                        String valueOf5 = String.valueOf(sb10.toString());
                        String str2 = true != bgsVar.c ? "invalid" : "valid";
                        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf5).length() + 6 + str2.length());
                        sb11.append(valueOf5);
                        sb11.append(";esur.");
                        sb11.append(str2);
                        sb8 = sb11.toString();
                    }
                    afie afieVar = new afie("fmt.decode", g);
                    afieVar.b = sb8;
                    afieVar.d = new afhn(str, null);
                    afihVar = afieVar.a();
                } else if (!(cause instanceof pkh)) {
                    if (cause instanceof IllegalStateException) {
                        StackTraceElement[] stackTrace = cause.getStackTrace();
                        if ((cause instanceof MediaCodec.CodecException) || (stackTrace.length > 0 && stackTrace[0].getClassName().contains("MediaCodec"))) {
                            IllegalStateException illegalStateException = (IllegalStateException) cause;
                            if (illegalStateException instanceof MediaCodec.CodecException) {
                                afihVar = new afih(afif.DEFAULT, "fmt.decode", g, "src.decfail;d." + aedn.r((MediaCodec.CodecException) illegalStateException) + ";sur." + aedn.s(surface), illegalStateException, null);
                            } else {
                                String s2 = aedn.s(surface);
                                afihVar = new afih(afif.DEFAULT, "fmt.decode", g, s2.length() != 0 ? "src.decfail;sur.".concat(s2) : new String("src.decfail;sur."), illegalStateException, null);
                            }
                        }
                    }
                    if (cause instanceof pmp) {
                        afif afifVar = afif.DEFAULT;
                        int i6 = ((pmp) cause).a;
                        StringBuilder sb12 = new StringBuilder(13);
                        sb12.append("c.");
                        sb12.append(i6);
                        afihVar = new afih(afifVar, "player.timeout", g, sb12.toString(), pnsVar2, null);
                    } else if (cause instanceof RuntimeException) {
                        afihVar = new afih("player.fatalexception", g, cause);
                    } else {
                        afihVar = new afih("player.exception", g, cause);
                    }
                } else {
                    pkh pkhVar = (pkh) cause;
                    StringBuilder sb13 = new StringBuilder("src.decfail");
                    sb13.append(";");
                    sb13.append(afhm.f(pkhVar, false, 3));
                    Throwable cause2 = pkhVar.getCause();
                    if (cause2 instanceof MediaCodec.CodecException) {
                        sb13.append(";d.");
                        afki.a(cause2);
                        sb13.append(aedn.r((MediaCodec.CodecException) cause2));
                    }
                    sb13.append(";");
                    sb13.append(afhm.d(pkhVar.getMessage()));
                    afihVar = new afih("fmt.decode", g, sb13.toString());
                }
            } else if (!(cause.getCause() instanceof IOException) || !(cause.getCause().getCause() instanceof TimeoutException)) {
                bab babVar = (bab) cause;
                baa baaVar2 = babVar.c;
                String str3 = baaVar2 != null ? baaVar2.a : null;
                StringBuilder sb14 = new StringBuilder();
                sb14.append("src.decinit");
                Throwable cause3 = babVar.getCause();
                if ((cause3 instanceof IllegalArgumentException) && "The surface has been released".equals(cause3.getMessage())) {
                    sb14.append(";c.sur.released");
                }
                sb14.append(";name.");
                baa baaVar3 = babVar.c;
                sb14.append(baaVar3 != null ? baaVar3.a : null);
                sb14.append(";info.");
                if (babVar.d != null || babVar.getCause() == null) {
                    sb14.append(babVar.d);
                } else {
                    sb14.append(afhm.a(babVar.getCause()));
                }
                sb14.append(";mime.");
                sb14.append(babVar.a);
                sb14.append(";sur.");
                sb14.append(aedn.s(surface));
                String sb15 = sb14.toString();
                afie afieVar2 = new afie("fmt.decode", g);
                afieVar2.b = sb15;
                afieVar2.d = new afhn(str3, formatStreamModel);
                afihVar = afieVar2.a();
            } else {
                afihVar = new afih(afif.DEFAULT, "player.timeout", g, "c.codec_init", cause.getCause().getCause(), null);
            }
        }
        this.g.E(aeruVar, afihVar, aezfVar, plpVar);
    }

    @Override // defpackage.avm
    public final void n(avl avlVar, boolean z, int i) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            StringBuilder sb = new StringBuilder(66);
            sb.append("onPlayerStateChanged.playWhenReady=");
            sb.append(z);
            sb.append(".playbackState=");
            sb.append(i);
            queue.add(new aesd(j, sb.toString()));
        }
        aezf as = as(avlVar);
        if (as != null) {
            if (i == 3) {
                as.b.a().an();
                i = 3;
            }
            as.c.c(avlVar, z, i);
        }
    }

    @Override // defpackage.avm
    public final void o(avl avlVar, pnz pnzVar, pnz pnzVar2, int i) {
        aezf as;
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            StringBuilder sb = new StringBuilder(42);
            sb.append("onPositionDiscontinuity.reason=");
            sb.append(i);
            queue.add(new aesd(j, sb.toString()));
        }
        aezf aezfVar = this.h.n;
        aezf at = at(avlVar, pnzVar.b);
        if (this.h.s.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_LEFTOVER_TRANSITION)) {
            as = at(avlVar, pnzVar2.b);
        } else {
            as = as(avlVar);
        }
        if (as == null) {
            return;
        }
        if (i != 0 && ((this.h.s.ac() || i != 1 || amkq.b(aezfVar, as)) && (!this.h.s.ac() || i != 1 || !as.s))) {
            if (i == 2) {
                long j2 = avlVar.g;
                as.f = j2;
                if (as.t.F() == 0 || as.r) {
                    return;
                }
                as.b.i("sst", new aeqs(Long.toString(j2)));
                as.r = true;
                return;
            }
            return;
        }
        if (!this.h.s.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_LEFTOVER_TRANSITION) || this.h.s.ac() || (at != null && aezfVar != null && amkq.b(aezfVar.z, as))) {
            ((aeut) this.g).H = false;
            as.s = false;
            if (this.h.s.p().w) {
                if (i == 1) {
                    as.c.d();
                }
                this.g.O(avlVar);
                return;
            }
            this.g.O(avlVar);
            return;
        }
        if (aezfVar != null) {
            aeru aeruVar = aezfVar.b;
            String str = at != null ? at.a : "null";
            String str2 = as.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
            sb2.append("from.");
            sb2.append(str);
            sb2.append(";to.");
            sb2.append(str2);
            aeruVar.i("ilt", new aeqs(sb2.toString()));
        }
    }

    @Override // defpackage.avm
    public final void p(avl avlVar, Object obj, long j) {
        if (this.h.s.ae()) {
            this.c.add(new aesd(avlVar.a, "onRendererFirstFrame."));
        }
        afky afkyVar = this.h.m;
        if (afkyVar != null) {
            afkyVar.n(0);
            afkyVar.m(obj);
        }
        aezf as = as(avlVar);
        if (as != null) {
            as.D = true;
            aezg aezgVar = as.c;
            aezf aezfVar = aezgVar.a;
            if (aezfVar.B && aezfVar.C && !aezfVar.E) {
                aezfVar.b.q();
                aezgVar.a.E = true;
            }
            as.b.a().C(j);
        }
    }

    @Override // defpackage.avm
    public final void q(avl avlVar) {
        if (this.h.s.ae()) {
            this.c.add(new aesd(avlVar.a, "onSeekProcessed."));
        }
        aezf as = as(avlVar);
        if (as != null) {
            aezg aezgVar = as.c;
            if (!aezgVar.a.L.ab() && aezgVar.d) {
                aezgVar.d = false;
                aezgVar.g = true;
                aezgVar.c = avlVar;
                aezgVar.a();
            }
        }
    }

    @Override // defpackage.avm
    public final void r(avl avlVar) {
        if (this.h.s.ae()) {
            this.c.add(new aesd(avlVar.a, "onSeekStarted."));
        }
        aezf as = as(avlVar);
        if (as != null) {
            as.c.d();
        }
    }

    @Override // defpackage.avm
    public final void s(avl avlVar, boolean z) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            StringBuilder sb = new StringBuilder(52);
            sb.append("onSkipSilenceEnabledChanged.skipSilenceEnabled=");
            sb.append(z);
            queue.add(new aesd(j, sb.toString()));
        }
    }

    @Override // defpackage.avm
    public final void t(avl avlVar, int i) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = avlVar.a;
            StringBuilder sb = new StringBuilder(36);
            sb.append("onTimelineChanged.reason=");
            sb.append(i);
            queue.add(new aesd(j, sb.toString()));
        }
        this.g.L(as(avlVar), i);
    }

    @Override // defpackage.avm
    public final void u(avl avlVar, Exception exc) {
        String str;
        long g = this.g.g();
        if (exc instanceof asv) {
            asv asvVar = (asv) exc;
            int i = asvVar.a;
            int i2 = asvVar.b;
            StringBuilder sb = new StringBuilder(47);
            sb.append("src.buffercapacity;info.");
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            str = sb.toString();
        } else {
            str = null;
        }
        afie afieVar = new afie("player.exception", g);
        afieVar.c = exc;
        afieVar.b = str;
        this.g.u(ar(avlVar), afieVar.a());
    }

    @Override // defpackage.avm
    public final void v(avl avlVar, String str, long j, long j2) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j3 = avlVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 91);
            sb.append("onDecoderInitialized.trackType=2.decoderName=");
            sb.append(str);
            sb.append(".initializationDurationMs=");
            sb.append(j2);
            queue.add(new aesd(j3, sb.toString()));
        }
        aezf as = as(avlVar);
        if (as == null) {
            return;
        }
        as.b.a().as(j, j2);
        if (!as.a().ac() || TextUtils.isEmpty(str)) {
            return;
        }
        as.b.i("dec", new aeqs(str));
    }

    @Override // defpackage.avm
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.avm
    public final /* synthetic */ void z() {
    }
}
