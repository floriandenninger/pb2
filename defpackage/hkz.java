package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditToolButtonView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsIntensitySliderView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import com.google.research.xeno.effect.Control;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hkz implements zvj {
    public final ci a;
    public ChooseFilterView b;
    public EditorButtonView c;
    public acsc d;
    public ShortsEditToolButtonView e;
    public ShortsIntensitySliderView f;
    public AnimatorSet g;
    public zys h;
    public acsc i;
    public FilterMapTable$FilterDescriptor j;
    public ztf k;
    public jqr l;
    private View m;
    private TextView n;

    public hkz(ci ciVar) {
        this.a = ciVar;
    }

    public final void a(int i) {
        View view;
        TextView textView;
        TextView textView2;
        if (i == 3) {
            if (this.m == null) {
                return;
            }
            AnimatorSet O = fhe.O(this.n, -r3.getWidth());
            if (O == null || (textView2 = this.n) == null) {
                return;
            }
            d(3, textView2, O);
            return;
        }
        if (i != 1 || (view = this.m) == null) {
            return;
        }
        AnimatorSet O2 = fhe.O(this.n, view.getWidth());
        if (O2 == null || (textView = this.n) == null) {
            return;
        }
        d(1, textView, O2);
    }

    public final void b() {
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor;
        Control.FloatSetting floatSetting;
        Pair pair;
        ChooseFilterView chooseFilterView = this.b;
        if (chooseFilterView == null || !chooseFilterView.f || (filterMapTable$FilterDescriptor = this.j) == null || !filterMapTable$FilterDescriptor.f("preset_intensity")) {
            ShortsIntensitySliderView shortsIntensitySliderView = this.f;
            if (shortsIntensitySliderView != null) {
                shortsIntensitySliderView.setVisibility(4);
                return;
            }
            return;
        }
        Control b = this.j.b("preset_intensity");
        ShortsIntensitySliderView shortsIntensitySliderView2 = this.f;
        if (shortsIntensitySliderView2 != null && b != null && (pair = (floatSetting = b.b).b) != null) {
            shortsIntensitySliderView2.c.setMax(ShortsIntensitySliderView.b(((Float) pair.second).floatValue()));
            shortsIntensitySliderView2.c.setProgress(ShortsIntensitySliderView.b(Control.nativeGetFloatValue(floatSetting.a)));
            shortsIntensitySliderView2.a = floatSetting;
        }
        ShortsIntensitySliderView shortsIntensitySliderView3 = this.f;
        if (shortsIntensitySliderView3 != null) {
            shortsIntensitySliderView3.setVisibility(0);
        }
    }

    public final void c(FrameLayout frameLayout, ChooseFilterView chooseFilterView, TextView textView, jqr jqrVar, List list, Context context) {
        this.m = frameLayout;
        this.b = chooseFilterView;
        textView.getClass();
        this.n = textView;
        this.l = jqrVar;
        if (chooseFilterView != null) {
            frameLayout.addView(chooseFilterView, 0);
        }
        hky hkyVar = new hky(this, context, this.a.getSupportFragmentManager(), this.l.a, context, list);
        this.h = hkyVar;
        hkyVar.F(context.getString(R.string.camera_filter_presets_done));
        if (chooseFilterView != null) {
            chooseFilterView.a.n = this;
        }
    }

    private final void d(int i, final TextView textView, final AnimatorSet animatorSet) {
        ChooseFilterView chooseFilterView = this.b;
        final zvk c = chooseFilterView == null ? null : chooseFilterView.c();
        if (c != null) {
            if (i == 3) {
                c.j();
                fhe.P(this.l.a, c.c, this.i);
            } else {
                if (i != 1) {
                    return;
                }
                c.k();
                fhe.P(this.l.a, c.c, this.i);
            }
            this.a.runOnUiThread(new Runnable() { // from class: hkx
                @Override // java.lang.Runnable
                public final void run() {
                    hkz hkzVar = hkz.this;
                    TextView textView2 = textView;
                    zvk zvkVar = c;
                    AnimatorSet animatorSet2 = animatorSet;
                    AnimatorSet animatorSet3 = hkzVar.g;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    textView2.setText(zvkVar.f());
                    animatorSet2.start();
                    hkzVar.g = animatorSet2;
                }
            });
        }
    }
}
