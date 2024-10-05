package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ljt implements lkd {
    public lkc a;
    public final TextView b;
    public final TextView c;
    private final Context d;
    private final gni e;
    private final View f;
    private final MicrophoneView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final RelativeLayout l;
    private final ImageView m;
    private final ffv n;
    private final Interpolator o = jg.o(0.05f, 0.0f, 0.0f, 1.0f);
    private final axzg p;

    public ljt(Context context, gni gniVar, axzg axzgVar, View view, acra acraVar, byte[] bArr) {
        this.d = context;
        this.e = gniVar;
        this.p = axzgVar;
        this.f = view;
        MicrophoneView microphoneView = (MicrophoneView) view.findViewById(R.id.microphone_container);
        this.g = microphoneView;
        ((FloatingActionButton) microphoneView.findViewById(R.id.disabled_microphone)).setImageDrawable(whu.y(microphoneView.getContext(), R.drawable.yt_outline_mic_white_48, R.attr.ytTextPrimary));
        ((FloatingActionButton) microphoneView.findViewById(R.id.enabled_microphone)).setImageResource(R.drawable.yt_fill_mic_white_48);
        this.j = (TextView) view.findViewById(R.id.state_text_view);
        this.h = (TextView) view.findViewById(R.id.stable_recognized_text);
        this.i = (TextView) view.findViewById(R.id.unstable_recognized_text);
        this.b = (TextView) view.findViewById(R.id.error_text);
        this.c = (TextView) view.findViewById(R.id.error_voice_tips);
        this.k = (TextView) view.findViewById(R.id.listening_voice_tips_text);
        this.l = (RelativeLayout) view.findViewById(R.id.voice_text_container);
        this.m = (ImageView) view.findViewById(R.id.speaking_gif);
        this.n = new ffv(context);
        View findViewById = view.findViewById(R.id.back_button);
        final int i = 1;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: ljs
            public final /* synthetic */ ljt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (i != 0) {
                    lkc lkcVar = this.a.a;
                    if (lkcVar != null) {
                        ((ljn) lkcVar).e();
                        return;
                    }
                    return;
                }
                ljt ljtVar = this.a;
                ljtVar.b.setVisibility(4);
                ljtVar.c.setVisibility(8);
                lkc lkcVar2 = ljtVar.a;
                if (lkcVar2 != null) {
                    lkcVar2.h();
                }
            }
        });
        final int i2 = 0;
        microphoneView.setOnClickListener(new View.OnClickListener(this) { // from class: ljs
            public final /* synthetic */ ljt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (i2 != 0) {
                    lkc lkcVar = this.a.a;
                    if (lkcVar != null) {
                        ((ljn) lkcVar).e();
                        return;
                    }
                    return;
                }
                ljt ljtVar = this.a;
                ljtVar.b.setVisibility(4);
                ljtVar.c.setVisibility(8);
                lkc lkcVar2 = ljtVar.a;
                if (lkcVar2 != null) {
                    lkcVar2.h();
                }
            }
        });
        acraVar.n(new acqx(acsb.c(22156)));
        acraVar.n(new acqx(acsb.c(88272)));
    }

    private final void t() {
        if (v()) {
            this.m.animate().alpha(0.0f).setDuration(200L).setInterpolator(this.o);
        }
    }

    private final boolean u() {
        return this.d.getResources().getConfiguration().screenHeightDp >= 400;
    }

    private final boolean v() {
        return !((String) this.p.f().j().X()).isEmpty();
    }

    @Override // defpackage.lkd
    public final int a() {
        return 3;
    }

    @Override // defpackage.lkd
    public final String b() {
        return u() ? "\n\n" : "\n";
    }

    @Override // defpackage.lkd
    public final void c(StringBuilder sb) {
        this.c.setText(sb);
    }

    @Override // defpackage.lkd
    public final void d(lkc lkcVar) {
        this.a = lkcVar;
    }

    @Override // defpackage.lkd
    public final void e(StringBuilder sb) {
        this.k.setText(sb);
    }

    @Override // defpackage.lkd
    public final void f(int i) {
        this.g.b(i);
    }

    @Override // defpackage.lkd
    public final void g() {
        this.j.setText(this.d.getText(R.string.you_are_online));
        this.g.setEnabled(true);
        this.g.setVisibility(0);
    }

    @Override // defpackage.lkd
    public final void h() {
        this.b.setVisibility(8);
        this.j.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.k.setVisibility(8);
        this.c.setVisibility(8);
        this.g.setEnabled(true);
        this.g.setVisibility(0);
        this.g.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.lkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r5 = this;
            android.widget.TextView r0 = r5.h
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r5.h
            java.lang.String r2 = ""
            r0.setText(r2)
            android.widget.TextView r0 = r5.i
            r0.setText(r2)
            com.google.android.libraries.youtube.search.voice.MicrophoneView r0 = r5.g
            r2 = 1
            r0.setEnabled(r2)
            com.google.android.libraries.youtube.search.voice.MicrophoneView r0 = r5.g
            r2 = 0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r5.b
            r3 = 4
            r0.setVisibility(r3)
            android.widget.TextView r0 = r5.j
            android.content.Context r3 = r5.d
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2132018257(0x7f140451, float:1.9674816E38)
            java.lang.CharSequence r3 = r3.getText(r4)
            r0.setText(r3)
            android.widget.TextView r0 = r5.j
            r0.setVisibility(r2)
            android.widget.TextView r0 = r5.c
            r0.setVisibility(r1)
            com.google.android.libraries.youtube.search.voice.MicrophoneView r0 = r5.g
            r0.f()
            boolean r0 = r5.v()
            if (r0 != 0) goto L4e
            goto Lc0
        L4e:
            android.widget.ImageView r0 = r5.m
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.animation.Interpolator r1 = r5.o
            r0.setInterpolator(r1)
            android.widget.ImageView r0 = r5.m
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 != 0) goto Lc0
            gni r0 = r5.e     // Catch: java.io.IOException -> La5
            gng r0 = r0.a()     // Catch: java.io.IOException -> La5
            gng r1 = defpackage.gng.DARK     // Catch: java.io.IOException -> La5
            if (r0 != r1) goto L85
            android.content.Context r0 = r5.d     // Catch: java.io.IOException -> La5
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.io.IOException -> La5
            r1 = 2131231241(0x7f080209, float:1.8078557E38)
            java.io.InputStream r0 = r0.openRawResource(r1)     // Catch: java.io.IOException -> La5
            goto L92
        L85:
            android.content.Context r0 = r5.d     // Catch: java.io.IOException -> La5
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.io.IOException -> La5
            r1 = 2131231242(0x7f08020a, float:1.807856E38)
            java.io.InputStream r0 = r0.openRawResource(r1)     // Catch: java.io.IOException -> La5
        L92:
            byte[] r1 = defpackage.anbt.c(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto Lac
            r0.close()     // Catch: java.io.IOException -> L9c
            goto Lac
        L9c:
            r0 = move-exception
            goto La7
        L9e:
            r1 = move-exception
            if (r0 == 0) goto La4
            r0.close()     // Catch: java.lang.Throwable -> La4
        La4:
            throw r1     // Catch: java.io.IOException -> La5
        La5:
            r0 = move-exception
            r1 = 0
        La7:
            java.lang.String r2 = "Error converting speaking gif asset to byte array"
            defpackage.zga.d(r2, r0)
        Lac:
            if (r1 == 0) goto Lc0
            ffv r0 = r5.n     // Catch: defpackage.zjg -> Lba
            android.graphics.drawable.Drawable r0 = r0.b(r1)     // Catch: defpackage.zjg -> Lba
            android.widget.ImageView r1 = r5.m     // Catch: defpackage.zjg -> Lba
            r1.setImageDrawable(r0)     // Catch: defpackage.zjg -> Lba
            return
        Lba:
            r0 = move-exception
            java.lang.String r1 = "Error downloading or decoding speaking gif asset."
            defpackage.zga.d(r1, r0)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljt.i():void");
    }

    @Override // defpackage.lkd
    public final void j() {
        this.k.setVisibility(0);
    }

    @Override // defpackage.lkd
    public final void k() {
        this.b.setVisibility(0);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.k.setVisibility(8);
        this.c.setVisibility(8);
        this.j.setText(this.d.getResources().getText(R.string.you_are_offline));
        this.j.setVisibility(0);
        this.g.setVisibility(8);
        this.g.d();
        t();
    }

    @Override // defpackage.lkd
    public final void l() {
        this.g.setEnabled(false);
        this.g.e();
        t();
    }

    @Override // defpackage.lkd
    public final void m() {
        this.h.setVisibility(0);
        this.i.setVisibility(0);
        this.g.c();
    }

    @Override // defpackage.lkd
    public final void n(String str) {
        this.k.setVisibility(8);
        this.j.setVisibility(8);
        this.i.setText("");
        this.h.setText(str);
    }

    @Override // defpackage.lkd
    public final void o(boolean z, boolean z2) {
        this.b.setVisibility(0);
        this.j.setVisibility(0);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.k.setVisibility(8);
        this.c.setVisibility(8);
        this.g.setEnabled(true);
        this.g.setVisibility(0);
        this.g.d();
        Resources resources = this.d.getResources();
        if (!z) {
            this.j.setText(resources.getText(R.string.you_are_offline));
            this.g.setEnabled(false);
        } else if (!z2) {
            this.j.setText(resources.getText(R.string.didnt_hear_that));
        } else if (!TextUtils.isEmpty(this.c.getText().toString())) {
            this.j.setText(resources.getText(R.string.try_saying_text));
            this.c.setVisibility(0);
        } else {
            this.j.setText(resources.getText(R.string.try_again_text));
        }
        t();
    }

    @Override // defpackage.lkd
    public final void p(String str) {
        this.k.setVisibility(8);
        this.j.setVisibility(8);
        this.i.setText(str);
    }

    @Override // defpackage.lkd
    public final boolean q() {
        return Boolean.valueOf(this.d.getResources().getConfiguration().screenWidthDp >= 400).booleanValue() || u();
    }

    @Override // defpackage.lkd
    public final boolean r() {
        return this.g.b == 1;
    }

    public final void s() {
        int dimension;
        float dimension2;
        int dimensionPixelSize;
        int i;
        int i2;
        int i3;
        float dimensionPixelSize2;
        float dimensionPixelSize3;
        int dimensionPixelSize4;
        float f;
        float f2;
        Resources resources = this.d.getResources();
        int dimension3 = (int) resources.getDimension(R.dimen.text_layout_margin_start_end_bottom);
        if (yjk.aa(this.d)) {
            if (yjk.Y(this.d)) {
                i2 = resources.getDimensionPixelSize(R.dimen.microphone_view_margin_bottom_tablet_land);
                f = 0.22f;
                f2 = 0.2f;
            } else {
                i2 = resources.getDimensionPixelSize(R.dimen.microphone_view_margin_bottom_tablet);
                f = 0.24f;
                f2 = 0.1f;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.state_text_margin_bottom_tablet);
            i3 = (int) (f * (yjk.L(this.d) - (jw.s(this.f) != null ? r6.g(7).c : 0)));
            i = (int) (f2 * yjk.N(this.d));
        } else {
            if (u()) {
                dimension = (int) resources.getDimension(R.dimen.microphone_view_margin_bottom);
                dimension2 = resources.getDimension(R.dimen.text_layout_margin_top);
            } else {
                dimension = (int) resources.getDimension(R.dimen.microphone_view_margin_bottom_land);
                dimension2 = resources.getDimension(R.dimen.text_layout_margin_top_land);
            }
            int i4 = (int) dimension2;
            int dimension4 = (int) resources.getDimension(R.dimen.text_layout_margin_start_end_bottom);
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.state_text_margin_bottom);
            i = dimension4;
            i2 = dimension;
            i3 = i4;
        }
        yny.z(this.g, yny.s(0, 0, 0, i2), ViewGroup.MarginLayoutParams.class);
        yny.z(this.l, yny.s(i, i3, i, dimension3), ViewGroup.MarginLayoutParams.class);
        yny.z(this.j, yny.s(0, 0, 0, dimensionPixelSize), ViewGroup.MarginLayoutParams.class);
        Resources resources2 = this.d.getResources();
        if (yjk.aa(this.d)) {
            dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.voice_search_small_text_size_tablet);
            dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_size_tablet);
            dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_line_spacing_extra_tablet);
        } else {
            dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.voice_search_small_text_size);
            dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_size);
            dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_line_spacing_extra);
        }
        float f3 = dimensionPixelSize4;
        this.j.setTextSize(0, dimensionPixelSize3);
        this.j.setLineSpacing(f3, 1.0f);
        this.h.setTextSize(0, dimensionPixelSize3);
        this.h.setLineSpacing(f3, 1.0f);
        this.i.setTextSize(0, dimensionPixelSize3);
        this.i.setLineSpacing(f3, 1.0f);
        this.c.setTextSize(0, dimensionPixelSize2);
        this.k.setTextSize(0, dimensionPixelSize2);
        this.b.setTextSize(0, dimensionPixelSize2);
    }
}
