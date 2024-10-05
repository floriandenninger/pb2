package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alty implements alti {
    public final TemplateLayout a;
    public boolean b = false;
    public float c;
    public float d;
    public int e;
    private float f;

    public alty(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView a;
        TextView a2;
        this.a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, altp.a, i, 0);
        CharSequence text = obtainStyledAttributes.getText(4);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
        obtainStyledAttributes.recycle();
        c();
        if (text != null && (a2 = a()) != null) {
            if (this.b) {
                b(a2);
            }
            a2.setText(text);
        }
        if (colorStateList == null || (a = a()) == null) {
            return;
        }
        a.setTextColor(colorStateList);
    }

    public final TextView a() {
        return (TextView) this.a.findViewById(R.id.suc_layout_title);
    }

    public final void b(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, this.f);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(Math.round(this.d + this.f));
        }
        textView.setMaxLines(6);
        textView.getViewTreeObserver().addOnPreDrawListener(new altx(this, textView));
    }

    public final void c() {
        Context context = this.a.getContext();
        if (!((GlifLayout) this.a).k() || !alte.n(context)) {
            this.b = false;
            return;
        }
        if (alte.f(context).l(altc.CONFIG_HEADER_AUTO_SIZE_ENABLED)) {
            this.b = alte.f(context).j(context, altc.CONFIG_HEADER_AUTO_SIZE_ENABLED, this.b);
        }
        if (this.b) {
            if (alte.f(context).l(altc.CONFIG_HEADER_AUTO_SIZE_MAX_TEXT_SIZE)) {
                this.f = alte.f(context).a(context, altc.CONFIG_HEADER_AUTO_SIZE_MAX_TEXT_SIZE);
            }
            if (alte.f(context).l(altc.CONFIG_HEADER_AUTO_SIZE_MIN_TEXT_SIZE)) {
                this.c = alte.f(context).a(context, altc.CONFIG_HEADER_AUTO_SIZE_MIN_TEXT_SIZE);
            }
            if (alte.f(context).l(altc.CONFIG_HEADER_AUTO_SIZE_LINE_SPACING_EXTRA)) {
                this.d = alte.f(context).a(context, altc.CONFIG_HEADER_AUTO_SIZE_LINE_SPACING_EXTRA);
            }
            if (alte.f(context).l(altc.CONFIG_HEADER_AUTO_SIZE_MAX_LINE_OF_MAX_SIZE)) {
                this.e = alte.f(context).p(context, altc.CONFIG_HEADER_AUTO_SIZE_MAX_LINE_OF_MAX_SIZE);
            }
            if (this.e > 0) {
                float f = this.c;
                if (f > 0.0f && this.f >= f) {
                    return;
                }
            }
            Log.w("HeaderMixin", "Invalid configs, disable auto text size.");
            this.b = false;
        }
    }
}
