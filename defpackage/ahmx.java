package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmx implements ahmz, ahoq, aioa, ypd {
    public final ahna a;
    public final ahna b;
    public final azrw c;
    private boolean d;
    private ahef e;

    public ahmx(azrw azrwVar, ahna ahnaVar, ahna ahnaVar2) {
        azrwVar.getClass();
        this.c = azrwVar;
        this.a = ahnaVar;
        ahnaVar2.getClass();
        this.b = ahnaVar2;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahef ahefVar) {
        PlayerResponseModel b;
        boolean j;
        VideoStreamingData videoStreamingData;
        this.e = ahefVar;
        VideoStreamingData videoStreamingData2 = null;
        boolean z = false;
        if (ahefVar.c() == aign.VIDEO_PLAYING || ahefVar.c() == aign.INTERSTITIAL_PLAYING) {
            b = ahefVar.b();
            j = ((ahos) this.c.get()).j();
            this.d = b.c().al();
        } else {
            b = null;
            j = false;
        }
        this.b.a(this.d && j);
        boolean g = ahefVar.c().g();
        if (!j || g) {
            this.a.a(false);
            return;
        }
        if (b != null && (videoStreamingData = b.c) != null) {
            videoStreamingData2 = videoStreamingData;
        }
        boolean z2 = videoStreamingData2 != null && videoStreamingData2.H();
        boolean z3 = videoStreamingData2 != null && videoStreamingData2.w();
        ahna ahnaVar = this.a;
        if (this.d && (z2 || z3)) {
            z = true;
        }
        ahnaVar.a(z);
    }

    @Override // defpackage.ahmz
    public final void c() {
        ((ahos) this.c.get()).g();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 128L)).h(ahbw.e(1)).Y(new ayrs() { // from class: ahmw
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahmx.this.a((ahef) obj);
            }
        }, ahfo.e)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            a((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ahoq
    public final void b(boolean z) {
        if (!z) {
            this.b.a(false);
            this.a.a(false);
        } else {
            ahef ahefVar = this.e;
            if (ahefVar != null) {
                a(ahefVar);
            }
        }
    }
}
