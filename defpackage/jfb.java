package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jfb extends ahva implements ahxt, ahum, ahyu, ahxe, adue {
    private final ahyg a;
    private Optional b;
    private Optional c;
    private final ControlsOverlayStyle d;
    private boolean e;
    private boolean f;
    private adub g;

    static {
        zga.a("MDX.PlayerControlsOverlay");
    }

    public jfb(adlt adltVar) {
        adltVar.getClass();
        this.d = ControlsOverlayStyle.a;
        ahyg ahygVar = new ahyg();
        this.a = ahygVar;
        ahygVar.l = true;
        new Handler(Looper.getMainLooper());
        this.g = adub.a().a();
        this.c = Optional.empty();
        this.b = Optional.empty();
        Optional.empty();
    }

    @Override // defpackage.ahxe
    public final void b(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
    }

    @Override // defpackage.ahxt
    public final void e(boolean z) {
    }

    @Override // defpackage.ahxt
    public final void g(boolean z) {
    }

    @Override // defpackage.ahva, defpackage.ahvc
    public final void h(ahvb ahvbVar) {
        amkq.O(!this.b.isPresent(), "Must not override an existing listener.");
        this.b = Optional.of(ahvbVar);
    }

    @Override // defpackage.ahva, defpackage.ahvc
    public final void i(boolean z) {
    }

    @Override // defpackage.ahxt
    public final void j(SubtitleTrack subtitleTrack) {
    }

    @Override // defpackage.ahva, defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        amkq.b(this.d, controlsOverlayStyle);
    }

    @Override // defpackage.ahxt
    public final void l(ahxs ahxsVar) {
    }

    @Override // defpackage.ahyu
    public final void m(boolean z) {
    }

    @Override // defpackage.ahva, defpackage.ahvc
    public final void nI(ControlsState controlsState) {
        if (controlsState == null) {
            controlsState = ControlsState.b();
        }
        if (this.c.isPresent() && controlsState.equals(this.c.get())) {
            return;
        }
        this.c = Optional.of(controlsState);
        int i = this.g.a;
        whu.I(null, true);
        whu.I(null, true);
        whu.I(null, true);
        whu.I(null, true);
    }

    @Override // defpackage.ahxe
    public final void ne(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
    }

    @Override // defpackage.ahva, defpackage.ahvc
    public final void ns() {
    }

    @Override // defpackage.ahyu
    public final void o(VideoQuality[] videoQualityArr, int i, boolean z) {
    }

    @Override // defpackage.adue
    public final void oZ(int i, adub adubVar) {
        this.g = adubVar;
    }

    @Override // defpackage.ahxe
    public final void pu(ahxd ahxdVar) {
        Optional.of(ahxdVar);
    }

    @Override // defpackage.ahva, defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
    }

    @Override // defpackage.ahyu
    public final void pz(ahyt ahytVar) {
    }

    @Override // defpackage.ahxt
    public final void q(List list) {
    }
}
