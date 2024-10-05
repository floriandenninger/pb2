package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class altw implements alti {
    public final TemplateLayout a;

    public altw(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView a;
        TextView a2;
        this.a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, altp.d, i, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null && (a2 = a()) != null) {
            a2.setText(text);
            TextView a3 = a();
            if (a3 != null) {
                a3.setVisibility(0);
            }
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null && (a = a()) != null) {
            a.setTextColor(colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    public final TextView a() {
        return (TextView) this.a.findViewById(R.id.sud_layout_subtitle);
    }
}
