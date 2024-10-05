package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ajcq;
import defpackage.apmg;
import defpackage.aqyg;
import defpackage.wbs;
import defpackage.whu;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HatsSurvey extends GridLayout {
    TextView c;
    public ViewGroup d;
    View e;
    TextView f;
    View g;

    public HatsSurvey(Context context) {
        super(context);
    }

    protected boolean c() {
        return false;
    }

    public final void d(CharSequence charSequence) {
        whu.G(this.c, charSequence);
    }

    public final void e(List list) {
        this.d.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            this.d.addView((View) list.get(i));
            if (c() && i < list.size() - 1) {
                ViewGroup viewGroup = this.d;
                Space space = new Space(getContext());
                space.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
                viewGroup.addView(space);
            }
        }
    }

    public final void f(apmg apmgVar, View.OnClickListener onClickListener) {
        boolean z = apmgVar != null;
        whu.I(this.e, z);
        whu.I(this.f, z);
        whu.I(this.g, z);
        if (apmgVar != null) {
            TextView textView = this.f;
            aqyg aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
            this.f.setOnClickListener(onClickListener);
        }
    }

    public final void g(boolean z) {
        if (this.f.isClickable() == z) {
            return;
        }
        this.f.setClickable(z);
        this.f.setFocusable(z);
        this.f.setTextColor(wbs.Q(getContext(), z ? R.attr.ytCallToAction : R.attr.ytIconDisabled));
        this.f.setBackground(z ? wbs.T(getContext(), R.attr.selectableItemBackground) : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.hats_survey_question);
        this.e = findViewById(R.id.hats_branding_logo);
        this.f = (TextView) findViewById(R.id.hats_submit_button);
        this.g = findViewById(R.id.hats_submit_button_spacing);
        this.d = (ViewGroup) findViewById(R.id.hats_survey_response);
    }

    public HatsSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HatsSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
