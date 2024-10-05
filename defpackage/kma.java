package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kma {
    private Boolean a;
    private Boolean b;
    private ahvo c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private ControlsOverlayStyle m;

    public kma() {
    }

    public kma(kmb kmbVar) {
        this.a = Boolean.valueOf(kmbVar.a);
        this.b = Boolean.valueOf(kmbVar.b);
        this.c = kmbVar.c;
        this.d = Boolean.valueOf(kmbVar.d);
        this.e = Boolean.valueOf(kmbVar.e);
        this.f = Boolean.valueOf(kmbVar.f);
        this.g = Boolean.valueOf(kmbVar.g);
        this.h = Boolean.valueOf(kmbVar.h);
        this.i = Boolean.valueOf(kmbVar.i);
        this.j = Boolean.valueOf(kmbVar.j);
        this.k = Boolean.valueOf(kmbVar.k);
        this.l = Boolean.valueOf(kmbVar.l);
        this.m = kmbVar.m;
    }

    public final kmb a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" isControlsOverlayVisible");
            }
            if (this.b == null) {
                sb.append(" isMagicWindowMidUiEduVisible");
            }
            if (this.c == null) {
                sb.append(" videoState");
            }
            if (this.d == null) {
                sb.append(" isFullscreen");
            }
            if (this.e == null) {
                sb.append(" hasNext");
            }
            if (this.f == null) {
                sb.append(" hasPrevious");
            }
            if (this.g == null) {
                sb.append(" isUserScrubbing");
            }
            if (this.h == null) {
                sb.append(" isSeekEDUVisible");
            }
            if (this.i == null) {
                sb.append(" isQuickSeekVisible");
            }
            if (this.j == null) {
                sb.append(" isFullscreenEngagementViewVisible");
            }
            if (this.k == null) {
                sb.append(" isStickyControlsEnabled");
            }
            if (this.l == null) {
                sb.append(" isAutonavToggleEnabled");
            }
            if (this.m == null) {
                sb.append(" style");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new kmb(bool.booleanValue(), this.b.booleanValue(), this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m);
    }

    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void g(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public final void h(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void i(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void j(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void k(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    public final void l(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void m(ControlsOverlayStyle controlsOverlayStyle) {
        if (controlsOverlayStyle == null) {
            throw new NullPointerException("Null style");
        }
        this.m = controlsOverlayStyle;
    }

    public final void n(ahvo ahvoVar) {
        if (ahvoVar == null) {
            throw new NullPointerException("Null videoState");
        }
        this.c = ahvoVar;
    }
}
