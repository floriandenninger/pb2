package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hgq extends algb {
    public final ViewGroup a;
    public final hgp b;
    public final BottomSheetBehavior c;
    private final ShortsPlayerView e;
    private final View f;
    private final View g;
    public View d = null;
    private int h = -1;

    public hgq(View view, hgp hgpVar) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.popup_content);
        this.a = viewGroup;
        this.g = view;
        this.b = hgpVar;
        BottomSheetBehavior x = BottomSheetBehavior.x(viewGroup);
        this.c = x;
        x.y(this);
        x.s = false;
        x.E(true);
        this.e = (ShortsPlayerView) view.findViewById(R.id.shorts_edit_player_view);
        this.f = view.findViewById(R.id.shorts_edit_player_view_wrapper);
        c();
    }

    private final int e() {
        int i = this.h;
        if (i >= 0) {
            return i;
        }
        int height = this.g.getHeight() - this.f.getHeight();
        this.h = height;
        return height;
    }

    @Override // defpackage.algb
    public final void b(View view, int i) {
        if (i == 5) {
            this.a.removeAllViews();
            ((hjf) this.b).a.c(false);
            this.c.C(true);
            this.e.a(r3.getHeight());
            return;
        }
        if (i == 3) {
            ((hjf) this.b).a.c(true);
            this.c.C(false);
            this.e.a(r3.getHeight() - (this.a.getHeight() - e()));
        }
    }

    public final void c() {
        d(false);
    }

    public final void d(boolean z) {
        if (z) {
            this.c.G(3);
        } else {
            this.c.G(5);
        }
    }

    @Override // defpackage.algb
    public final void mx(View view, float f) {
        this.e.a(Math.abs(this.e.getHeight() - ((view.getHeight() - e()) * Math.max(0.0f, f + 1.0f))));
    }
}
