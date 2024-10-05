package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import defpackage.gbe;
import defpackage.jw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Mealbar extends CardView implements gbe {
    public TextView g;
    public TextView h;
    public Button i;
    public Button j;
    public ImageView k;

    public Mealbar(Context context) {
        super(context);
    }

    @Override // defpackage.gbe
    public final void a() {
        CharSequence text = this.g.getText();
        if (TextUtils.isEmpty(text) || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        String trim = text.toString().trim();
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
            obtain.setClassName(Mealbar.class.getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(trim);
            obtain.setEnabled(true);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.mealbar_title);
        this.h = (TextView) findViewById(R.id.mealbar_message);
        this.i = (Button) findViewById(R.id.mealbar_action_button);
        this.j = (Button) findViewById(R.id.mealbar_dismiss_button);
        this.k = (ImageView) findViewById(R.id.mealbar_icon);
        setStateListAnimator(null);
        jw.au(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
    }

    public Mealbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Mealbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
