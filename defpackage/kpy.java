package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kpy implements fng {
    public final long a;
    public final khz b;
    public final acra c;
    public final aahd d;
    public final ahtp k;
    public kiw l;
    public ammv m;
    public final kpf n;
    public final axzg o;
    private final koe p;
    public final azrh e = azrh.e();
    public final azrh f = azrh.e();
    public final azrh g = azrh.e();
    public final azrh i = azrh.e();
    public final azrh j = azrh.e();
    public final azrh h = azrh.e();

    public kpy(ahtp ahtpVar, acra acraVar, aahd aahdVar, axzg axzgVar, koe koeVar, kpf kpfVar, long j, khz khzVar, byte[] bArr, byte[] bArr2) {
        this.p = koeVar;
        this.k = ahtpVar;
        this.n = kpfVar;
        this.a = j;
        this.b = khzVar;
        this.c = acraVar;
        this.d = aahdVar;
        this.o = axzgVar;
        koeVar.a(new kod() { // from class: kpu
            @Override // defpackage.kod
            public final void a(View view) {
                final kpy kpyVar = kpy.this;
                if (kpyVar.l != null) {
                    return;
                }
                View findViewById = view.findViewById(R.id.timestamps_container);
                TextView textView = (TextView) view.findViewById(R.id.time_bar_current_time);
                TextView textView2 = (TextView) view.findViewById(R.id.time_bar_chapter_title);
                kpyVar.l = new kiw(new yzr(textView, kpyVar.a, 4), new yzr((TextView) view.findViewById(R.id.time_bar_total_time), kpyVar.a, 4), new yzr((TextView) view.findViewById(R.id.time_bar_live_label), kpyVar.a, 8), new yzr(findViewById, kpyVar.a, 4), new yzr(textView2, kpyVar.a, 8), kpyVar.k, kpyVar.b, kpyVar.c, kpyVar.d, kpyVar.o, null, null);
                kpyVar.l.i((aypy) ((amna) kpyVar.m).a);
                final int i = 0;
                kpyVar.l.a(false);
                azrh azrhVar = kpyVar.e;
                kiw kiwVar = kpyVar.l;
                kiwVar.getClass();
                azrhVar.ax(new kpv(kiwVar, 3));
                azrh azrhVar2 = kpyVar.f;
                kiw kiwVar2 = kpyVar.l;
                kiwVar2.getClass();
                azrhVar2.ax(new kpv(kiwVar2, 2));
                azrh azrhVar3 = kpyVar.g;
                kiw kiwVar3 = kpyVar.l;
                kiwVar3.getClass();
                azrhVar3.ax(new kpv(kiwVar3, 4));
                azrh azrhVar4 = kpyVar.i;
                kiw kiwVar4 = kpyVar.l;
                kiwVar4.getClass();
                azrhVar4.ax(new kpv(kiwVar4, i));
                final int i2 = 1;
                kpyVar.j.ax(new ayrs() { // from class: kpw
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i2 != 0) {
                            kpx kpxVar = (kpx) obj;
                            kiw kiwVar5 = kpyVar.l;
                            if (kiwVar5 == null) {
                                return;
                            }
                            kiwVar5.e(kpxVar.a, kpxVar.b, kpxVar.c);
                            return;
                        }
                        kpy kpyVar2 = kpyVar;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        kiw kiwVar6 = kpyVar2.l;
                        if (kiwVar6 == null || kiwVar6.e == booleanValue) {
                            return;
                        }
                        kiwVar6.e = booleanValue;
                        kiwVar6.j(false);
                    }
                });
                kpyVar.h.ax(new ayrs() { // from class: kpw
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i != 0) {
                            kpx kpxVar = (kpx) obj;
                            kiw kiwVar5 = kpyVar.l;
                            if (kiwVar5 == null) {
                                return;
                            }
                            kiwVar5.e(kpxVar.a, kpxVar.b, kpxVar.c);
                            return;
                        }
                        kpy kpyVar2 = kpyVar;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        kiw kiwVar6 = kpyVar2.l;
                        if (kiwVar6 == null || kiwVar6.e == booleanValue) {
                            return;
                        }
                        kiwVar6.e = booleanValue;
                        kiwVar6.j(false);
                    }
                });
                final YouTubeControlsOverlay youTubeControlsOverlay = kpyVar.n.a;
                youTubeControlsOverlay.p = (TextView) youTubeControlsOverlay.l.findViewById(R.id.time_bar_live_label);
                youTubeControlsOverlay.p.setOnClickListener(new View.OnClickListener() { // from class: koz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        YouTubeControlsOverlay youTubeControlsOverlay2 = YouTubeControlsOverlay.this;
                        if (ControlsOverlayStyle.c(youTubeControlsOverlay2.z)) {
                            return;
                        }
                        youTubeControlsOverlay2.c.a();
                        youTubeControlsOverlay2.g.r(youTubeControlsOverlay2.u);
                        youTubeControlsOverlay2.o.g(true);
                    }
                });
                youTubeControlsOverlay.M.ax(new kpa(youTubeControlsOverlay, 10));
                kpt kptVar = youTubeControlsOverlay.n;
                View view2 = youTubeControlsOverlay.k;
                kptVar.h.g(view2.findViewById(R.id.fullscreen_button));
                kptVar.h.g(view2.findViewById(R.id.time_bar_live_label));
                if (kptVar.i) {
                    kptVar.h.g(view2.findViewById(R.id.time_bar_chapter_title));
                }
                kptVar.h.t(view2.findViewById(R.id.time_bar_reference_view));
                youTubeControlsOverlay.n.j(youTubeControlsOverlay.w, youTubeControlsOverlay.v, youTubeControlsOverlay.u, youTubeControlsOverlay.x);
            }
        });
    }

    @Override // defpackage.fng
    public final void a(boolean z) {
        kiw kiwVar = this.l;
        if (kiwVar == null) {
            return;
        }
        kiwVar.a(z);
    }

    @Override // defpackage.fng
    public final void c(boolean z) {
        this.e.c(Boolean.valueOf(z));
    }

    @Override // defpackage.fng
    public final void d(boolean z) {
        this.g.c(Boolean.valueOf(z));
    }

    @Override // defpackage.fng
    public final void e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.j.c(new kpx(charSequence, charSequence2, charSequence3));
    }

    @Override // defpackage.fng
    public final void f(boolean z) {
        if (this.g.aR() && ((Boolean) this.g.aO()).booleanValue()) {
            this.p.b();
        }
        kiw kiwVar = this.l;
        if (kiwVar == null) {
            return;
        }
        kiwVar.f(z);
    }

    @Override // defpackage.fng
    public final void g(boolean z) {
        kiw kiwVar = this.l;
        if (kiwVar != null) {
            kiwVar.g(z);
        }
    }

    @Override // defpackage.fng
    public final void ny(boolean z) {
        this.f.c(Boolean.valueOf(z));
    }
}
