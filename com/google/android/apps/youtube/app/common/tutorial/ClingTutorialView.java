package com.google.android.apps.youtube.app.common.tutorial;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.fwg;
import defpackage.nkq;
import defpackage.nkr;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClingTutorialView extends RelativeLayout implements View.OnClickListener, fwg {
    public ClingView a;
    public TextView b;
    public int c;
    public nkq d;
    private View e;
    private LinearLayout f;

    public ClingTutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 500;
    }

    public final void a() {
        b();
        nkq nkqVar = this.d;
        if (nkqVar != null) {
            nkr nkrVar = nkqVar.a;
            nkrVar.a.f(nkrVar);
        }
    }

    public final void b() {
        setAnimation(null);
        setVisibility(8);
    }

    @Override // defpackage.fwg
    public final void c(Rect rect) {
        int height;
        int i = rect.top;
        int measuredHeight = getMeasuredHeight() - rect.bottom;
        if (this.f == null) {
            return;
        }
        if (rect.top == rect.bottom || i >= measuredHeight) {
            height = rect.top - this.f.getHeight();
        } else {
            height = rect.bottom;
        }
        yny.z(this.f, yny.v(height), ViewGroup.MarginLayoutParams.class);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            a();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ok);
        this.e = findViewById;
        findViewById.setOnClickListener(this);
        ClingView clingView = (ClingView) findViewById(R.id.cling_view);
        this.a = clingView;
        clingView.c = this;
        this.b = (TextView) findViewById(R.id.text);
        this.f = (LinearLayout) findViewById(R.id.text_area);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClingView clingView = this.a;
        if (clingView == null) {
            return false;
        }
        if (!clingView.a().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            a();
        }
        return false;
    }
}
