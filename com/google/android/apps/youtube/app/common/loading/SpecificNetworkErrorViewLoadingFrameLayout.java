package com.google.android.apps.youtube.app.common.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acra;
import defpackage.ajyg;
import defpackage.ajyw;
import defpackage.ci;
import defpackage.fgs;
import defpackage.fgt;
import defpackage.fgu;
import defpackage.fgw;
import defpackage.fgx;
import defpackage.fjs;
import defpackage.ivg;
import defpackage.jwx;
import defpackage.yjk;
import defpackage.ysy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SpecificNetworkErrorViewLoadingFrameLayout extends fgs {
    public final Context a;
    public fgx b;
    public fgw c;
    public FrameLayout d;
    public fgu e;
    public acra f;
    public int g;
    public ysy h;
    public ajyw i;
    private fgx j;

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context) {
        this(context, R.layout.loading_frame_status_error_view, R.layout.loading_frame_status_progress_view, R.layout.loading_frame_status_empty_view);
    }

    private final void j(int i) {
        this.b = new fgx(this, 4, i, R.id.empty_message_text);
    }

    private final void k(int i) {
        this.c = new fgw(this, i);
    }

    private final void l(int i) {
        this.j = new fgx(this, 1, i, 0);
    }

    public final void c() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.loading_frame_offline_status_view, (ViewGroup) this, false);
        this.d = frameLayout;
        addView(frameLayout);
        ajyw ajywVar = this.i;
        FrameLayout frameLayout2 = this.d;
        ci ciVar = (ci) ajywVar.a.get();
        ciVar.getClass();
        fjs fjsVar = (fjs) ajywVar.b.get();
        fjsVar.getClass();
        ajyg ajygVar = (ajyg) ajywVar.c.get();
        ajygVar.getClass();
        frameLayout2.getClass();
        this.e = new jwx(ciVar, fjsVar, ajygVar, frameLayout2);
    }

    public final void f() {
        h(2);
    }

    public final void g() {
        yjk.f();
        if (!this.h.o()) {
            h(6);
        } else {
            h(1);
        }
    }

    public final void h(int i) {
        if (this.g != i) {
            int i2 = i == 2 ? 0 : 8;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setVisibility(i2);
            }
            fgx fgxVar = this.j;
            fgxVar.getClass();
            fgxVar.f(i);
            fgw fgwVar = this.c;
            fgwVar.getClass();
            fgwVar.f(i);
            if (i == 5) {
                FrameLayout frameLayout = this.d;
                frameLayout.getClass();
                frameLayout.setVisibility(0);
                fgu fguVar = this.e;
                fguVar.getClass();
                acra acraVar = this.f;
                acraVar.getClass();
                fguVar.a(acraVar);
            } else if (i != 6) {
                FrameLayout frameLayout2 = this.d;
                frameLayout2.getClass();
                frameLayout2.setVisibility(8);
            } else {
                fgu fguVar2 = this.e;
                fguVar2.getClass();
                jwx jwxVar = (jwx) fguVar2;
                jwxVar.f(true, null);
                ProgressBar progressBar = jwxVar.h;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                TextView textView = jwxVar.g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                FrameLayout frameLayout3 = this.d;
                frameLayout3.getClass();
                frameLayout3.setVisibility(0);
            }
            fgx fgxVar2 = this.b;
            if (fgxVar2 != null) {
                fgxVar2.f(i);
            }
            this.g = i;
        }
    }

    public final void i(ivg ivgVar) {
        fgw fgwVar = this.c;
        fgwVar.getClass();
        fgwVar.b = ivgVar;
        fgu fguVar = this.e;
        if (fguVar != null) {
            ((jwx) fguVar).k = ivgVar;
        }
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, int i, int i2) {
        super(context);
        this.g = 0;
        context.getClass();
        this.a = context;
        l(i2);
        k(i);
        c();
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, int i, int i2, int i3) {
        this(context, i, i2);
        j(i3);
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
        context.getClass();
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fgt.a, i, 0);
        l(obtainStyledAttributes.getResourceId(2, R.layout.loading_frame_status_progress_view));
        j(obtainStyledAttributes.getResourceId(0, R.layout.loading_frame_status_empty_view));
        k(obtainStyledAttributes.getResourceId(1, R.layout.loading_frame_status_error_view));
        c();
        obtainStyledAttributes.recycle();
        g();
    }
}
