package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class l {
    public CharSequence a;
    public Bitmap b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Integer k;

    public final m a() {
        Boolean bool = this.c;
        if (bool == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" isSkippable");
            }
            if (this.d == null) {
                sb.append(" hideSkipButton");
            }
            if (this.e == null) {
                sb.append(" skipEnabled");
            }
            if (this.f == null) {
                sb.append(" showAdChoices");
            }
            if (this.g == null) {
                sb.append(" extraBottomMarginPx");
            }
            if (this.h == null) {
                sb.append(" skipTimeRemainingMillis");
            }
            if (this.i == null) {
                sb.append(" timeRemainingMillis");
            }
            if (this.j == null) {
                sb.append(" currentAdIndex");
            }
            if (this.k == null) {
                sb.append(" totalAds");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new m(this.a, bool.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.b, this.g.intValue(), this.h.intValue(), this.i.intValue(), this.j.intValue(), this.k.intValue());
    }

    public final void b(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void g(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void h(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void i(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void j(int i) {
        this.k = Integer.valueOf(i);
    }
}
