package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kjj implements kig {
    public final TextView a;
    private boolean b;

    public kjj(View view) {
        TextView textView = (TextView) view.findViewById(R.id.player_error_view);
        this.a = textView;
        textView.setTag(R.id.disallow_player_overlay_tap_listener, true);
        textView.setVisibility(8);
        jw.au(textView);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: kji
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = (int) ((i3 - i) * 0.16666667f);
                kjj.this.a.setPadding(i9, 10, i9, 10);
            }
        });
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
    public final void nF(ControlsState controlsState) {
        if (this.b == controlsState.i()) {
            return;
        }
        boolean i = controlsState.i();
        this.b = i;
        whu.I(this.a, i);
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

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void s(boolean z) {
    }
}
