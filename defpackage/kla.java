package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kla {
    public final kkz a;
    private final TextView b;
    private final fmf c;
    private final klg d;
    private boolean e = false;
    private int f;
    private ControlsState g;
    private boolean h;
    private boolean i;

    public kla(Context context, fmf fmfVar, klg klgVar, ProgressBar progressBar, TextView textView) {
        this.b = textView;
        this.c = fmfVar;
        this.d = klgVar;
        this.a = new kkz(progressBar);
        Resources resources = context.getResources();
        tjr tjrVar = new tjr(-1.0f, resources.getDimensionPixelSize(R.dimen.inline_muted_buffering_progress_thickness), resources.getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{resources.getColor(R.color.buffering_progress_color)});
        tjrVar.setAlpha(resources.getInteger(R.integer.buffering_progress_transparency));
        progressBar.setIndeterminateDrawable(tjrVar);
        this.f = 0;
    }

    private final void g(int i, int i2) {
        if ((i & 4) != 0) {
            kkz kkzVar = this.a;
            if (!kkzVar.b) {
                kkzVar.b = true;
                kkzVar.a.setVisibility(0);
            }
        }
        if ((i2 & 4) != 0) {
            kkz kkzVar2 = this.a;
            kkzVar2.b = false;
            kkzVar2.a.setVisibility(8);
        }
        if ((i & 1) != 0) {
            this.c.k(true);
        }
        if ((i2 & 1) != 0) {
            this.c.b(false);
        }
        if ((i & 2) != 0) {
            this.d.f(false);
        }
        if ((i2 & 2) != 0) {
            this.d.a(false);
        }
    }

    public final void a() {
        b();
        this.f = 0;
        this.g = ControlsState.b();
        h();
    }

    public final void b() {
        this.c.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r8 == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.aqyg r7, java.util.List r8) {
        /*
            r6 = this;
            avfx r0 = defpackage.fkc.i(r8)
            r1 = 2
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L35
            int r7 = r0.b
            r7 = r7 & 8
            if (r7 == 0) goto L1e
            int r7 = r0.f
            int r7 = defpackage.awxr.ar(r7)
            if (r7 != 0) goto L18
            goto L1b
        L18:
            if (r7 == r3) goto L1b
            goto L1e
        L1b:
            r6.h = r3
            return
        L1e:
            android.widget.TextView r7 = r6.b
            defpackage.fkc.l(r7, r0)
            int r7 = r0.e
            int r7 = defpackage.awxr.aq(r7)
            if (r7 != 0) goto L2c
            r7 = 1
        L2c:
            int r8 = r0.f
            int r8 = defpackage.awxr.ar(r8)
            if (r8 != 0) goto L4a
            goto L49
        L35:
            android.widget.TextView r0 = r6.b
            android.text.Spanned r4 = defpackage.ajcq.b(r7)
            java.lang.CharSequence r7 = defpackage.ajcq.i(r7)
            r5 = 0
            boolean r7 = defpackage.fkc.k(r0, r4, r7, r8, r5)
            if (r3 == r7) goto L48
            r7 = 2
            goto L49
        L48:
            r7 = 3
        L49:
            r8 = 1
        L4a:
            r0 = 0
            r6.h = r0
            ahvo r4 = defpackage.ahvo.NEW
            int r7 = r7 + (-1)
            if (r7 == r1) goto L6c
            if (r7 == r2) goto L6c
            r7 = 5
            if (r8 != r7) goto L64
            klg r7 = r6.d
            android.widget.TextView r8 = r6.b
            java.lang.CharSequence r8 = r8.getText()
            r7.h(r8)
            return
        L64:
            klg r7 = r6.d
            r7.a = r0
            r7.d(r3)
            return
        L6c:
            klg r7 = r6.d
            android.widget.TextView r8 = r6.b
            java.lang.CharSequence r8 = r8.getText()
            r7.h(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kla.d(aqyg, java.util.List):void");
    }

    public final void e(ControlsOverlayStyle controlsOverlayStyle) {
        this.c.i(controlsOverlayStyle);
    }

    public final void f(long j, long j2, long j3, long j4) {
        this.c.j(j, j2, j3, j4);
    }

    private final void h() {
        boolean z = this.g.a == ahvo.PLAYING && !this.g.b;
        if (this.h) {
            if (this.f == 3 && z) {
                g(0, 5);
                return;
            } else {
                g(4, 1);
                return;
            }
        }
        int i = this.f;
        if (i == 0) {
            g(0, 7);
            return;
        }
        if (i == 2) {
            ControlsState controlsState = this.g;
            if (this.e) {
                int ordinal = controlsState.a.ordinal();
                if (ordinal == 0) {
                    g(2, 0);
                    return;
                } else {
                    if ((ordinal == 1 || ordinal == 2) && controlsState.b) {
                        g(4, 0);
                        return;
                    }
                    return;
                }
            }
            g(6, 0);
            return;
        }
        if (i != 3) {
            return;
        }
        ControlsState controlsState2 = this.g;
        ahvo ahvoVar = controlsState2.a;
        ahvo ahvoVar2 = ahvo.PAUSED;
        ahvo ahvoVar3 = controlsState2.a;
        ahvo ahvoVar4 = ahvo.PLAYING;
        boolean z2 = ahvoVar3 == ahvoVar4 && controlsState2.b;
        boolean z3 = ahvoVar3 == ahvoVar4 && !controlsState2.b;
        if (this.e) {
            if (z2) {
                g(4, 0);
                return;
            } else if (z3) {
                g((this.i ? 1 : 0) | 2, 4);
                return;
            } else {
                if (ahvoVar == ahvoVar2) {
                    g(2, 5);
                    return;
                }
                return;
            }
        }
        if (z2) {
            g(6, 0);
        } else if (z3) {
            g((this.i ? 1 : 0) | 2, 4);
        } else if (ahvoVar == ahvoVar2) {
            g(2, 1);
        }
    }

    public final void c(kkx kkxVar) {
        this.f = kkxVar.a;
        gof gofVar = kkxVar.c;
        this.i = ((Boolean) (gofVar == null ? amlr.a : ammv.j(gofVar.a().b)).b(kfq.d).e(false)).booleanValue();
        this.g = kkxVar.b;
        this.e = ((Boolean) kkxVar.d().b(kfq.c).e(false)).booleanValue();
        h();
    }
}
