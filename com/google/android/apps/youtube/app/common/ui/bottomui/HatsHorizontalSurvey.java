package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.whu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HatsHorizontalSurvey extends HatsSurvey {
    TextView a;
    TextView b;

    public HatsHorizontalSurvey(Context context) {
        super(context);
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
        whu.I(this.b, !TextUtils.isEmpty(charSequence));
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
        whu.I(this.a, !TextUtils.isEmpty(charSequence));
    }

    @Override // com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey
    protected final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.hats_low_text);
        this.b = (TextView) findViewById(R.id.hats_high_text);
    }

    public HatsHorizontalSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HatsHorizontalSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
