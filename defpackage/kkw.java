package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kkw {
    public ControlsState a;
    public gof b;
    public fhg c;
    public String d;
    public kky e;
    public ControlsOverlayStyle f;
    private Integer g;

    public final kkx a() {
        Integer num = this.g;
        if (num == null) {
            throw new IllegalStateException("Missing required properties: inlinePlaybackState");
        }
        return new kkx(num.intValue(), this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }
}
