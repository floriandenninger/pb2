package defpackage;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbr implements aetd, pjz {
    final /* synthetic */ afbs b;
    private final afji c = new afji();
    private final long d = SystemClock.elapsedRealtime();
    public volatile afjf a = afjf.a;

    public afbr(afbs afbsVar) {
        this.b = afbsVar;
    }

    @Override // defpackage.oya
    public final void a(MediaCodec.CryptoException cryptoException) {
        zga.d("Video CryptoError with ExoPlayer.", cryptoException);
    }

    @Override // defpackage.oya
    public final void b(oxz oxzVar) {
        zga.d("Error with ExoPlayer video decoder initialization.", oxzVar);
    }

    @Override // defpackage.oya
    public final void c(String str, long j, long j2) {
        this.a.as(j, j2);
        if (!this.b.x.ac() || TextUtils.isEmpty(str)) {
            return;
        }
        this.b.f.i("dec", new aeqs(str));
    }

    @Override // defpackage.oyl, defpackage.pjz
    public final void d(Surface surface) {
        afky afkyVar = this.b.p;
        if (afkyVar != null) {
            afkyVar.n(0);
            this.b.p.m(surface);
        }
    }

    @Override // defpackage.oyl, defpackage.pjz
    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int b = this.b.b();
        this.b.g.d(b, false);
        aeeu aeeuVar = this.b.G;
        if (aeeuVar != null) {
            for (FormatStreamModel formatStreamModel : aeeuVar.a) {
                if (formatStreamModel.H()) {
                    if (this.b.x.i() <= 0 || this.b.t.D()) {
                        return;
                    }
                    afbs afbsVar = this.b;
                    if (afbsVar.o.a || elapsedRealtime - this.d <= 3000) {
                        return;
                    }
                    int i = afbsVar.x.i();
                    this.c.c(SystemClock.elapsedRealtime(), b);
                    if (this.c.e(i)) {
                        double a = this.c.a();
                        String b2 = this.c.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 23);
                        sb.append("droprate.");
                        sb.append((int) a);
                        sb.append(".d.");
                        sb.append(b2);
                        String sb2 = sb.toString();
                        afie afieVar = new afie("android.hfrdroppedframes", this.b.g());
                        afieVar.a = afif.DEFAULT;
                        afieVar.b = sb2;
                        afieVar.d = this.b.H;
                        afih a2 = afieVar.a();
                        this.c.d();
                        this.b.M();
                        this.b.V(a2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.oyl
    public final void f(int i, int i2) {
        h(i, i2);
    }

    @Override // defpackage.aetd, defpackage.pjz
    public final void g(MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            afbs afbsVar = this.b;
            if (afbsVar.p != null) {
                afld a = afbsVar.n.a(mediaFormat.o);
                if (a != null) {
                    a.b = mediaFormat.n;
                }
                this.b.p.u(a);
            }
        }
    }

    @Override // defpackage.pjz
    public final void h(int i, int i2) {
        afbs afbsVar = this.b;
        afbsVar.v = i;
        afbsVar.w = i2;
        afky afkyVar = afbsVar.p;
        if (afkyVar == null || !afkyVar.E()) {
            return;
        }
        afbs afbsVar2 = this.b;
        afbsVar2.p.v(afbsVar2.v, afbsVar2.w);
    }
}
