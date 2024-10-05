package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kfw implements ahyu, aioa {
    public final ci a;
    public final kfv b;
    public final akbz c;
    public boolean d;
    public ammv e;
    public avzr f;
    public VideoQuality[] g;
    private final kem h;
    private final kem i;
    private final kfu j;
    private final Handler k;
    private final aaea l;
    private int m;
    private int n;

    public kfw(final ci ciVar, final kfu kfuVar, kfv kfvVar, Handler handler, aaea aaeaVar, akbz akbzVar) {
        this.a = ciVar;
        kem kemVar = new kem(ciVar.getString(R.string.quality_title), new kel() { // from class: kfp
            @Override // defpackage.kel
            public final void a() {
                kfu.this.c(ciVar);
            }
        });
        this.h = kemVar;
        kem kemVar2 = new kem(ciVar.getString(R.string.quality_title), new kft(this));
        this.i = kemVar2;
        kemVar.e = whu.y(ciVar, R.drawable.yt_outline_gear_black_24, R.attr.ytTextPrimary);
        kemVar2.e = whu.y(ciVar, R.drawable.yt_outline_gear_black_24, R.attr.ytTextPrimary);
        this.j = kfuVar;
        this.b = kfvVar;
        this.k = handler;
        this.l = aaeaVar;
        this.c = akbzVar;
        this.e = amlr.a;
        this.f = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
        atcl atclVar = aaeaVar.a().i;
        atcm atcmVar = (atclVar == null ? atcl.a : atclVar).k;
        if ((atcmVar == null ? atcm.a : atcmVar).c) {
            this.n = 3;
            return;
        }
        atys atysVar = aaeaVar.a().j;
        if ((atysVar == null ? atys.a : atysVar).x) {
            this.n = 2;
        } else {
            this.n = 1;
        }
    }

    private final void d(final kem kemVar, String str) {
        final String d = ammx.d(str);
        if (yjk.h()) {
            kemVar.d(d);
        } else {
            this.k.post(new Runnable() { // from class: kfs
                @Override // java.lang.Runnable
                public final void run() {
                    kem.this.d(d);
                }
            });
        }
    }

    public final kem a() {
        return this.n == 3 ? this.i : this.h;
    }

    public final void b(String str) {
        akbz akbzVar = this.c;
        gcm d = gcq.d();
        d.f(true);
        d.k(str);
        d.d(-1);
        akbzVar.o(d.b());
    }

    public final VideoQuality[] c() {
        VideoQuality[] videoQualityArr = this.g;
        videoQualityArr.getClass();
        return videoQualityArr;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.ae(kfq.b, kfq.a).G().E(ayqr.a()).Y(new ayrs() { // from class: kfr
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kfw kfwVar = kfw.this;
                ahco ahcoVar = (ahco) obj;
                int i = 0;
                boolean z = ahcoVar.a() == -2;
                kfwVar.f = ahcoVar.b();
                if (kfwVar.g != null) {
                    while (true) {
                        if (i >= kfwVar.c().length) {
                            i = -1;
                            break;
                        } else if (kfwVar.c()[i].a == ahcoVar.a()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        kfwVar.o(kfwVar.c(), i, z);
                    }
                }
            }
        }, kfe.d)};
    }

    @Override // defpackage.ahyu
    public final void m(boolean z) {
        this.h.g(z);
        this.d = z;
        kem kemVar = this.i;
        if (!kemVar.g) {
            kemVar.g(true);
        }
        if (z) {
            return;
        }
        d(this.i, this.a.getString(R.string.video_quality_unavailable_menu_item_secondary_text));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        if (r7 != defpackage.avzr.VIDEO_QUALITY_SETTING_ADVANCED_MENU) goto L49;
     */
    @Override // defpackage.ahyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.google.android.libraries.youtube.innertube.model.media.VideoQuality[] r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfw.o(com.google.android.libraries.youtube.innertube.model.media.VideoQuality[], int, boolean):void");
    }

    @Override // defpackage.ahyu
    public final void pz(ahyt ahytVar) {
        this.j.b(ahytVar);
        this.b.b(ahytVar);
    }
}
