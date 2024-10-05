package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kmb {
    public final boolean a;
    public final boolean b;
    public final ahvo c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ControlsOverlayStyle m;

    public kmb() {
    }

    public kmb(boolean z, boolean z2, ahvo ahvoVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, ControlsOverlayStyle controlsOverlayStyle) {
        this.a = z;
        this.b = z2;
        this.c = ahvoVar;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = controlsOverlayStyle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kmb) {
            kmb kmbVar = (kmb) obj;
            if (this.a == kmbVar.a && this.b == kmbVar.b && this.c.equals(kmbVar.c) && this.d == kmbVar.d && this.e == kmbVar.e && this.f == kmbVar.f && this.g == kmbVar.g && this.h == kmbVar.h && this.i == kmbVar.i && this.j == kmbVar.j && this.k == kmbVar.k && this.l == kmbVar.l && this.m.equals(kmbVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true == this.l ? 1231 : 1237)) * 1000003) ^ this.m.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = this.f;
        boolean z6 = this.g;
        boolean z7 = this.h;
        boolean z8 = this.i;
        boolean z9 = this.j;
        boolean z10 = this.k;
        boolean z11 = this.l;
        String valueOf2 = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 328 + String.valueOf(valueOf2).length());
        sb.append("MidUiModel{isControlsOverlayVisible=");
        sb.append(z);
        sb.append(", isMagicWindowMidUiEduVisible=");
        sb.append(z2);
        sb.append(", videoState=");
        sb.append(valueOf);
        sb.append(", isFullscreen=");
        sb.append(z3);
        sb.append(", hasNext=");
        sb.append(z4);
        sb.append(", hasPrevious=");
        sb.append(z5);
        sb.append(", isUserScrubbing=");
        sb.append(z6);
        sb.append(", isSeekEDUVisible=");
        sb.append(z7);
        sb.append(", isQuickSeekVisible=");
        sb.append(z8);
        sb.append(", isFullscreenEngagementViewVisible=");
        sb.append(z9);
        sb.append(", isStickyControlsEnabled=");
        sb.append(z10);
        sb.append(", isAutonavToggleEnabled=");
        sb.append(z11);
        sb.append(", style=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
