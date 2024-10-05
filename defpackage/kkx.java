package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kkx {
    public final int a;
    public final ControlsState b;
    public final gof c;
    public final fhg d;
    public final kky e;
    public final ControlsOverlayStyle f;
    private final String g;

    public kkx() {
    }

    public kkx(int i, ControlsState controlsState, gof gofVar, fhg fhgVar, String str, kky kkyVar, ControlsOverlayStyle controlsOverlayStyle) {
        this.a = i;
        this.b = controlsState;
        this.c = gofVar;
        this.d = fhgVar;
        this.g = str;
        this.e = kkyVar;
        this.f = controlsOverlayStyle;
    }

    public static kkw a() {
        kkw kkwVar = new kkw();
        kkwVar.c = fhg.NONE;
        kkwVar.a = ControlsState.b();
        kkwVar.b(0);
        kkwVar.d = null;
        kkwVar.b = null;
        kkwVar.e = kky.a(0L, 0L, 0L, 0L);
        kkwVar.f = null;
        return kkwVar;
    }

    public final kkw b() {
        kkw kkwVar = new kkw();
        kkwVar.c = this.d;
        kkwVar.e = this.e;
        kkwVar.b(this.a);
        kkwVar.b = this.c;
        kkwVar.d = this.g;
        kkwVar.a = this.b;
        kkwVar.f = this.f;
        return kkwVar;
    }

    public final ammv c() {
        gof gofVar = this.c;
        return gofVar == null ? amlr.a : ammv.j(gofVar.a().c);
    }

    public final ammv d() {
        gof gofVar = this.c;
        return gofVar == null ? amlr.a : ammv.j(gofVar.a().d);
    }

    public final boolean equals(Object obj) {
        ControlsState controlsState;
        gof gofVar;
        fhg fhgVar;
        String str;
        kky kkyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kkx) {
            kkx kkxVar = (kkx) obj;
            if (this.a == kkxVar.a && ((controlsState = this.b) != null ? controlsState.equals(kkxVar.b) : kkxVar.b == null) && ((gofVar = this.c) != null ? gofVar.equals(kkxVar.c) : kkxVar.c == null) && ((fhgVar = this.d) != null ? fhgVar.equals(kkxVar.d) : kkxVar.d == null) && ((str = this.g) != null ? str.equals(kkxVar.g) : kkxVar.g == null) && ((kkyVar = this.e) != null ? kkyVar.equals(kkxVar.e) : kkxVar.e == null)) {
                ControlsOverlayStyle controlsOverlayStyle = this.f;
                ControlsOverlayStyle controlsOverlayStyle2 = kkxVar.f;
                if (controlsOverlayStyle != null ? controlsOverlayStyle.equals(controlsOverlayStyle2) : controlsOverlayStyle2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String str = this.g;
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 143 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Model{inlinePlaybackState=");
        sb.append(i);
        sb.append(", controlsState=");
        sb.append(valueOf);
        sb.append(", currentInlineVideo=");
        sb.append(valueOf2);
        sb.append(", playerViewMode=");
        sb.append(valueOf3);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append(", videoTimes=");
        sb.append(valueOf4);
        sb.append(", controlsOverlayStyle=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        ControlsState controlsState = this.b;
        int hashCode = (i ^ (controlsState == null ? 0 : controlsState.hashCode())) * 1000003;
        gof gofVar = this.c;
        int hashCode2 = (hashCode ^ (gofVar == null ? 0 : gofVar.hashCode())) * 1000003;
        fhg fhgVar = this.d;
        int hashCode3 = (hashCode2 ^ (fhgVar == null ? 0 : fhgVar.hashCode())) * 1000003;
        String str = this.g;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        kky kkyVar = this.e;
        int hashCode5 = (hashCode4 ^ (kkyVar == null ? 0 : kkyVar.hashCode())) * 1000003;
        ControlsOverlayStyle controlsOverlayStyle = this.f;
        return hashCode5 ^ (controlsOverlayStyle != null ? controlsOverlayStyle.hashCode() : 0);
    }
}
