package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axha {
    public final Context a;
    public final FrameLayout b;
    public View c;
    public ImageButton d;
    public View e;
    public ImageButton f;
    public RelativeLayout g;
    public axgs h;
    public volatile Runnable m;
    public volatile String o;
    public int p;
    private RelativeLayout q;
    public volatile boolean i = true;
    public volatile boolean j = true;
    private volatile boolean r = true;
    public volatile Runnable k = null;
    public volatile Runnable l = null;
    public volatile Runnable n = null;
    private volatile boolean s = false;
    private volatile float t = 1.0f;

    public axha(Context context) {
        this.a = context;
        this.b = new axgz(this, context);
        c(R.layout.ui_layer);
    }

    public static int a(boolean z) {
        return z ? 0 : 8;
    }

    public final axgs b() {
        if (this.h == null) {
            this.h = new axgs(this.a);
            this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.h.setVisibility(a(this.s));
            if (this.o != null) {
                this.h.c(this.o);
            }
            if (this.n != null) {
                this.h.c = this.n;
            }
            this.h.b(this.l);
            this.q.addView(this.h);
        }
        return this.h;
    }

    public final void c(int i) {
        this.p = i;
        axgs axgsVar = this.h;
        boolean z = (axgsVar == null || axgsVar.getParent() == null) ? false : true;
        this.h = null;
        RelativeLayout relativeLayout = this.q;
        if (relativeLayout != null) {
            this.b.removeView(relativeLayout);
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) LayoutInflater.from(this.a).inflate(i, (ViewGroup) null, false);
        this.q = relativeLayout2;
        this.b.addView(relativeLayout2);
        if (z) {
            e(this.s);
        }
        this.m = new axgv(this);
        View findViewById = this.q.findViewById(R.id.ui_settings_button_holder);
        this.c = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(a(this.j));
            this.c.setOnClickListener(new axgw(this, 1));
        }
        ImageButton imageButton = (ImageButton) this.q.findViewById(R.id.ui_settings_button);
        this.d = imageButton;
        imageButton.setVisibility(a(this.j));
        this.d.setContentDescription("Settings");
        this.d.setOnClickListener(new axgw(this, 0));
        View findViewById2 = this.q.findViewById(R.id.ui_back_button_holder);
        this.e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(a(f()));
            this.e.setOnClickListener(new axgw(this, 2));
        }
        ImageButton imageButton2 = (ImageButton) this.q.findViewById(R.id.ui_back_button);
        this.f = imageButton2;
        imageButton2.setVisibility(a(f()));
        this.f.setOnClickListener(new axgw(this, 3));
        if (ActivityManager.isRunningInTestHarness()) {
            View view = this.c;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                this.c.setLayoutParams(layoutParams);
            }
            View view2 = this.e;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.height = -2;
                layoutParams2.width = -2;
                this.e.setLayoutParams(layoutParams2);
            }
        }
        RelativeLayout relativeLayout3 = (RelativeLayout) this.q.findViewById(R.id.ui_alignment_marker);
        this.g = relativeLayout3;
        relativeLayout3.setVisibility(a(this.r));
        d(this.t);
    }

    public final void d(float f) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (this.t == f && f == 1.0f) {
            return;
        }
        this.t = f;
        axgo.a(new axgt(this, f));
    }

    public final void e(boolean z) {
        this.s = z;
        axgo.a(new axgx(this, z, 1));
    }

    public final boolean f() {
        return this.l != null;
    }
}
