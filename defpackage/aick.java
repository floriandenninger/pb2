package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.CircularClipTapBloomView;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;
import com.google.android.youtube.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aick {
    private static final Duration g = Duration.ofMillis(200);
    private static final Duration h = Duration.ofMillis(200);
    private static final Duration i = Duration.ofMillis(200);
    public aicr a;
    public LinearLayout b;
    public final View c;
    public final aicj d;
    public yzr e;
    public yzr f;
    private aico j;
    private aice k;
    private boolean l;
    private final aicg m;
    private ViewStub n;
    private boolean o;
    private yzr p;

    public aick(View view, ViewStub viewStub, aicj aicjVar, aicg aicgVar) {
        this.c = view;
        this.n = viewStub;
        this.d = aicjVar;
        this.m = aicgVar;
        if (viewStub == null) {
            a();
        }
    }

    public final void a() {
        if (this.o) {
            return;
        }
        ViewStub viewStub = this.n;
        if (viewStub != null) {
            viewStub.inflate();
            this.n = null;
        }
        int integer = this.c.getResources().getInteger(R.integer.fade_duration_fast);
        this.p = new yzr((CircularClipTapBloomView) this.c.findViewById(R.id.tap_bloom_view));
        this.f = new yzr((TextView) this.c.findViewById(R.id.fast_forward_rewind_hint_text), integer, 8);
        aico aicoVar = new aico((TapBloomView) this.p.b, 650, 0);
        this.j = aicoVar;
        aicoVar.a().addListener(new aici(this));
        aicq a = aicr.a();
        a.c(g);
        Duration duration = i;
        a.b(amru.t(aicp.a(0.0f, 1.0f, duration), aicp.a(1.0f, 1.0f, h), aicp.a(1.0f, 0.0f, duration)));
        a.d(amru.t(this.c.findViewById(R.id.swipe_triangle_left), this.c.findViewById(R.id.swipe_triangle_mid), this.c.findViewById(R.id.swipe_triangle_right)));
        this.a = a.a();
        yzr yzrVar = new yzr((ImageView) this.c.findViewById(R.id.dark_background));
        this.e = yzrVar;
        yzrVar.e = 300L;
        yzrVar.d = 200L;
        this.b = (LinearLayout) this.c.findViewById(R.id.fast_forward_rewind_triangles);
        aice aiceVar = new aice(this.c.findViewById(R.id.user_education_view), this.m);
        this.k = aiceVar;
        aiceVar.f = this.l;
        this.o = true;
    }

    public final void b() {
        this.e.b(true);
        this.p.b(true);
        this.f.b(true);
        this.d.K();
    }

    public final void c(boolean z) {
        this.l = z;
        if (this.o) {
            this.k.f = z;
        }
    }

    public final void d(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.c.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public final void e(CharSequence charSequence, aicf aicfVar, boolean z) {
        a();
        int i2 = aicfVar.b;
        int i3 = i2 == 1 ? 1 : 0;
        ((CircularClipTapBloomView) this.p.b).invalidate();
        ((TextView) this.f.b).setText(charSequence);
        float width = z ? 0.0f : this.c.getWidth() * 0.25f;
        ((TextView) this.f.b).setWidth(this.c.getWidth() / 2);
        ((TextView) this.f.b).setTranslationX(i3 != 0 ? width : -width);
        LinearLayout linearLayout = this.b;
        if (i3 == 0) {
            width = -width;
        }
        linearLayout.setTranslationX(width);
        this.b.setScaleX(i2 == 1 ? 1.0f : -1.0f);
        CircularClipTapBloomView circularClipTapBloomView = (CircularClipTapBloomView) this.p.b;
        circularClipTapBloomView.a = i3;
        circularClipTapBloomView.a(z);
        this.d.J();
        this.e.c(true);
        this.j.b((int) aicfVar.a.getX(), (int) aicfVar.a.getY());
        this.a.c();
        this.p.c(true);
        this.f.c(true);
    }

    public final void f(boolean z) {
        g(z, 0);
    }

    public final void g(boolean z, int i2) {
        String quantityString;
        a();
        if (z) {
            final aice aiceVar = this.k;
            if (!aiceVar.h) {
                int integer = aiceVar.d.getResources().getInteger(R.integer.fade_duration_fast);
                aiceVar.g = (TextView) aiceVar.d.findViewById(R.id.user_education_text_view);
                aiceVar.i = new yzr((ViewGroup) aiceVar.d.findViewById(R.id.user_education_view), integer, 8);
                aiceVar.b = aiceVar.a(R.id.user_education_triangle_left3, R.id.user_education_triangle_left2, R.id.user_education_triangle_left1);
                aiceVar.c = aiceVar.a(R.id.user_education_triangle_right3, R.id.user_education_triangle_right2, R.id.user_education_triangle_right1);
                aiceVar.h = true;
            }
            TextView textView = aiceVar.g;
            aicg aicgVar = aiceVar.e;
            if (i2 != 1) {
                int seconds = (int) aicgVar.a().getSeconds();
                quantityString = aicgVar.a.getQuantityString(R.plurals.user_education_quick_seek, seconds, Integer.valueOf(seconds));
            } else {
                quantityString = aicgVar.a.getString(R.string.chapter_seek_education_text);
            }
            textView.setText(quantityString);
            aiceVar.i.c(true);
            aiceVar.i.h(new zch() { // from class: aicb
                @Override // defpackage.zch
                public final void nE(int i3, yzr yzrVar) {
                    aice aiceVar2 = aice.this;
                    if (i3 == 2) {
                        aiceVar2.b();
                    }
                }
            });
            return;
        }
        aice aiceVar2 = this.k;
        if (aiceVar2.h) {
            aiceVar2.i.b(true);
            aiceVar2.b.b();
            aiceVar2.c.b();
            aiceVar2.g.removeCallbacks(new aicc(aiceVar2));
        }
    }
}
