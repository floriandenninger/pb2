package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kko extends kic implements View.OnClickListener, View.OnLongClickListener, aida, kig {
    public ImageView b;
    public boolean c;
    private final aicz d;
    private final Set e;
    private final acra f;
    private final koe g;
    private boolean h;
    private final kpf i;

    public kko(aicz aiczVar, acra acraVar, koc kocVar, koe koeVar, kpf kpfVar, byte[] bArr) {
        this.d = aiczVar;
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        this.f = acraVar;
        this.g = koeVar;
        this.i = kpfVar;
        aiczVar.c.a(this);
        koeVar.a(new kod() { // from class: kkn
            @Override // defpackage.kod
            public final void a(View view) {
                kko kkoVar = kko.this;
                if (kkoVar.b != null) {
                    return;
                }
                kkoVar.b = (ImageView) view.findViewById(R.id.hide_controls_button_top);
                kkoVar.b.setOnClickListener(kkoVar);
            }
        });
        kocVar.getClass();
        hashSet.add(new kkm(kocVar));
    }

    private final void x(boolean z) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            koc kocVar = ((kkm) it.next()).a;
            kocVar.h = z;
            kocVar.a();
        }
    }

    @Override // defpackage.kic
    protected final void a(boolean z) {
        x(false);
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
        u();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.aida
    public final void nW(float f, boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nz(boolean z) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        YouTubeControlsOverlay youTubeControlsOverlay = this.i.a;
        if (youTubeControlsOverlay.t != 0) {
            youTubeControlsOverlay.C();
            youTubeControlsOverlay.S();
        }
        this.f.I(3, new acqx(acsb.c(85016)), null);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return false;
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final void q(boolean z) {
        this.h = z;
        u();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void s(boolean z) {
    }

    @Override // defpackage.kic
    protected final void t(boolean z) {
        this.g.b();
        x(true);
        this.f.n(new acqx(acsb.c(85016)));
    }

    @Override // defpackage.kic
    protected final boolean w(boolean z) {
        return (this.d.c.d() || this.c || !this.h) ? false : true;
    }
}
