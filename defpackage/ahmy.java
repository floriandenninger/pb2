package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmy implements ahvc, ahyu, ahxe, ahhb {
    private final ViewGroup a;
    private final Context b;
    private ahmc c;
    private boolean d;
    private boolean e;
    private ahvb f;
    private ahyt g;
    private ahxd h;
    private long j;
    private long k;
    private long l;
    private long m;
    private VideoQuality[] p;
    private int q;
    private boolean r;
    private ControlsState i = ControlsState.b();
    private ControlsOverlayStyle n = ControlsOverlayStyle.a;
    private boolean o = true;

    public ahmy(ViewGroup viewGroup, Context context) {
        this.a = viewGroup;
        this.b = context;
    }

    private final void e() {
        k(this.n);
        ne(this.d);
        b(this.e);
        py(this.j, this.k, this.l, this.m);
        nI(this.i);
        i(this.o);
        o(this.p, this.q, this.r);
    }

    private final void g(ahmc ahmcVar) {
        this.c = ahmcVar;
        if (ahmcVar != null) {
            ahvb ahvbVar = this.f;
            if (ahvbVar != null) {
                ahmcVar.g = ahvbVar;
            }
            ahyt ahytVar = this.g;
            if (ahytVar != null) {
                ahmcVar.h = ahytVar;
            }
            ahxd ahxdVar = this.h;
            if (ahxdVar != null) {
                ahmcVar.i = ahxdVar;
            }
            e();
        }
    }

    @Override // defpackage.ahxe
    public final void b(boolean z) {
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            ahmv ahmvVar = ahmcVar.e;
            ahmvVar.c = z;
            ahmvVar.a();
        }
        this.e = z;
    }

    @Override // defpackage.ahvc
    public final void h(ahvb ahvbVar) {
        this.f = ahvbVar;
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            ahmcVar.g = ahvbVar;
        }
    }

    @Override // defpackage.ahvc
    public final void i(boolean z) {
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            ahmj ahmjVar = ahmcVar.c.f;
            ahmjVar.m = z;
            ahmjVar.a.c(ahmjVar.a());
        }
        this.o = z;
    }

    @Override // defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            ahmv ahmvVar = ahmcVar.e;
            ahmvVar.a = controlsOverlayStyle;
            ahmvVar.a();
            ahlv ahlvVar = ahmcVar.c;
            ahmj ahmjVar = ahlvVar.f;
            ahmjVar.k = controlsOverlayStyle;
            ahiq ahiqVar = ahmjVar.a;
            int i = controlsOverlayStyle.q;
            amkq.E(true);
            ahiqVar.e[0].g(i);
            ahmjVar.a.c(ahmjVar.a());
            boolean b = ControlsOverlayStyle.b(controlsOverlayStyle);
            ahlvVar.i = b;
            ahlvVar.b.l = !b;
            ahlvVar.a.qE(b);
            ahlvVar.b();
        }
        this.n = controlsOverlayStyle;
    }

    @Override // defpackage.ahyu
    public final void m(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void nI(ControlsState controlsState) {
        controlsState.getClass();
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            boolean z = controlsState.b;
            ahmcVar.j = z;
            ahmcVar.b.qE(!z);
            ahmcVar.j();
            ahvo ahvoVar = controlsState.a;
            if (ahvoVar == ahvo.PLAYING) {
                this.c.a();
            } else if (ahvoVar == ahvo.PAUSED) {
                ahmc ahmcVar2 = this.c;
                ahmcVar2.k = false;
                ahmcVar2.e.b(1);
                ahmcVar2.j();
            } else if (ahvoVar == ahvo.ENDED) {
                ahmc ahmcVar3 = this.c;
                ahmcVar3.o = true;
                ahmcVar3.m = true;
                ahmcVar3.k = false;
                ahmcVar3.e.b(3);
                ahmcVar3.j();
            }
        }
        this.i = controlsState;
    }

    @Override // defpackage.ahvc
    public final void nJ(CharSequence charSequence) {
    }

    @Override // defpackage.ahvc
    public final void nK(boolean z) {
    }

    @Override // defpackage.ahxe
    public final void ne(boolean z) {
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            ahmv ahmvVar = ahmcVar.e;
            ahmvVar.b = z;
            ahmvVar.a();
        }
        this.d = z;
    }

    @Override // defpackage.ahvc
    public final void nf() {
    }

    @Override // defpackage.ahvc
    public final void ng() {
        this.n = ControlsOverlayStyle.a;
        this.i = ControlsState.b();
        e();
    }

    @Override // defpackage.ahvc
    public final void nh(String str, boolean z) {
    }

    @Override // defpackage.ahvc
    public final void ns() {
        py(0L, 0L, 0L, 0L);
    }

    @Override // defpackage.ahyu
    public final void o(VideoQuality[] videoQualityArr, int i, boolean z) {
        int length;
        if (videoQualityArr == null || i < 0 || (length = videoQualityArr.length) == 0) {
            return;
        }
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            String str = videoQualityArr[i].b;
            int i2 = length - 1;
            String str2 = videoQualityArr[i2].b;
            boolean z2 = i == i2;
            ahhr ahhrVar = ahmcVar.c.e;
            ahhrVar.h = str;
            ahhrVar.i = str2;
            ahhrVar.e = z2;
            if (ahhrVar.g) {
                ahhrVar.g = z2;
            }
            ahhrVar.a();
        }
        this.p = videoQualityArr;
        this.q = i;
        this.r = z;
    }

    @Override // defpackage.ahvc
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ahvc
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ahvc
    public final void pA() {
    }

    @Override // defpackage.ahvc
    public final void pB() {
    }

    @Override // defpackage.ahxe
    public final void pu(ahxd ahxdVar) {
        this.h = ahxdVar;
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            ahmcVar.i = ahxdVar;
        }
    }

    @Override // defpackage.ahvc
    public final void px(Map map) {
    }

    @Override // defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
        float f;
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            ahlv ahlvVar = ahmcVar.c;
            ahlvVar.h = j3;
            ahhy ahhyVar = ahlvVar.b;
            boolean d = ahbj.d(j, j3);
            if (ahhyVar.e != d) {
                ahhyVar.e = d;
                ahhyVar.c();
            }
            ahjo ahjoVar = ahlvVar.a;
            String i = zhq.i(j / 1000);
            String i2 = zhq.i(j3 / 1000);
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
            sb.append(i);
            sb.append("/");
            sb.append(i2);
            ahjoVar.y(sb.toString());
            ahmj ahmjVar = ahlvVar.f;
            if (j3 <= 0) {
                zga.b("Cannot have a negative time for video duration!");
            } else {
                ahmjVar.g = j3;
                long j5 = j4 > j3 ? j3 : j4;
                ahmjVar.h = j2;
                long j6 = j3 - j2;
                if (j6 <= 0) {
                    float[] fArr = ahmjVar.e;
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    f = 1.0f;
                } else {
                    float[] fArr2 = ahmjVar.e;
                    float f2 = (float) j6;
                    long j7 = j5;
                    fArr2[0] = ((float) (j - j2)) / f2;
                    fArr2[1] = j7 > j ? ((float) (j7 - j)) / f2 : 0.0f;
                    float f3 = fArr2[0];
                    f = 1.0f;
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    fArr2[0] = f3;
                    float f4 = fArr2[1];
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    fArr2[1] = f4;
                }
                float[] fArr3 = ahmjVar.e;
                fArr3[2] = (f - fArr3[0]) - fArr3[1];
                ahmjVar.a.g(fArr3);
                float f5 = ahmjVar.e[0];
                if (f5 < 0.0f || f5 > 1.01d) {
                    StringBuilder sb2 = new StringBuilder(38);
                    sb2.append("percentWidth invalid - ");
                    sb2.append(f5);
                    zga.b(sb2.toString());
                }
                ahmjVar.c.l(ahmjVar.a.h * (f5 - ahmjVar.j), 0.0f, 0.0f);
                ahmjVar.j = f5;
            }
        }
        this.j = j;
        this.k = j2;
        this.l = j3;
        this.m = j4;
    }

    @Override // defpackage.ahyu
    public final void pz(ahyt ahytVar) {
        this.g = ahytVar;
        ahmc ahmcVar = this.c;
        if (ahmcVar != null) {
            ahmcVar.h = ahytVar;
        }
    }

    @Override // defpackage.ahhb
    public final void qF(ahkm ahkmVar, ahki ahkiVar) {
        ahmb ahmbVar = new ahmb(this.a, this.b, ahkmVar, ahkiVar);
        ahjv ahjvVar = new ahjv(ahmbVar.b.clone(), ahmbVar.f.b);
        ahjvVar.l(0.0f, 14.0f, 0.0f);
        ahmc ahmcVar = ahmbVar.a;
        ahmcVar.f = ahjvVar;
        ahmcVar.n(ahjvVar);
        ahlv ahlvVar = new ahlv(ahmbVar.g, (AudioManager) ahmbVar.d.getSystemService("audio"), ahmbVar.e, ahmbVar.f.b, ahmbVar.b.clone(), new ahlz(ahmbVar.a), new ahma(ahmbVar, null), null);
        ahlvVar.l(0.0f, ahkt.a(-60.0f), 0.0f);
        ahlvVar.a(ahmbVar.f.h);
        ahmc ahmcVar2 = ahmbVar.a;
        ahmcVar2.c = ahlvVar;
        ahmcVar2.n(ahlvVar);
        ahmv ahmvVar = new ahmv(ahmbVar.g, ahmbVar.b.clone(), new ahma(ahmbVar), ahmbVar.e);
        ahmvVar.l(0.0f, 7.0f, 0.0f);
        ahmc ahmcVar3 = ahmbVar.a;
        ahmcVar3.e = ahmvVar;
        ahmcVar3.n(ahmvVar);
        ahmc ahmcVar4 = ahmbVar.a;
        ahmcVar4.q = ahmbVar.e.k;
        ahfx ahfxVar = new ahfx(ahmbVar.c, ahmbVar.d, ahmcVar4.a, ahmbVar.b.clone(), ahmbVar.e.a.c(), 10.5f, true);
        ahfxVar.l(0.0f, 7.0f, 0.0f);
        ahfxVar.qE(true);
        ahmc ahmcVar5 = ahmbVar.a;
        ahmcVar5.b = ahfxVar;
        ahmcVar5.n(ahfxVar);
        ahmbVar.e.a(ahmbVar.a);
        ahmbVar.e.b(ahmbVar.a);
        ahki ahkiVar2 = ahmbVar.f;
        ahmc ahmcVar6 = ahmbVar.a;
        ahkiVar2.f = ahmcVar6;
        ahkiVar2.h(ahmcVar6.n);
        ahki ahkiVar3 = ahmbVar.f;
        ahmc ahmcVar7 = ahmbVar.a;
        ahkiVar3.i = ahmcVar7;
        ahkiVar3.j = ahmcVar7;
        g(ahmcVar7);
        ahkiVar.c(ahmcVar7);
    }

    @Override // defpackage.ahhb
    public final void qG() {
        g(null);
    }

    @Override // defpackage.ahvc
    public final void r(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void s(boolean z) {
    }

    @Override // defpackage.ahvc
    public final /* synthetic */ void y() {
        ahbx.c(this);
    }

    @Override // defpackage.ahvc
    public final void z(atyq atyqVar, boolean z) {
    }
}
