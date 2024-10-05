package defpackage;

import android.content.res.Resources;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class khy implements fgp {
    public final fgq a;
    public final ayqd b;
    public final acra c;
    public final ImageView d;

    public khy(fgq fgqVar, ayqd ayqdVar, acra acraVar, ImageView imageView) {
        this.a = fgqVar;
        this.b = ayqdVar;
        this.c = acraVar;
        this.d = imageView;
    }

    public final void a(boolean z) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources = this.d.getResources();
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_horiz_padding);
        if (z) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_top_padding_fullscreen);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_top_padding);
        }
        if (z) {
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_bottom_padding_fullscreen);
        } else {
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_bottom_padding);
        }
        this.d.setPaddingRelative(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        boolean b = fhgVar.b();
        boolean b2 = fhgVar2.b();
        if (b != b2) {
            a(b2);
        }
    }
}
