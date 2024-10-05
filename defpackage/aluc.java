package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aluc implements alti {
    public final TemplateLayout a;
    public final boolean b;

    public aluc(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.a = templateLayout;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, altp.n, i, 0);
            r0 = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getBoolean(0, false) : false;
            obtainStyledAttributes.recycle();
            ProgressBar a = a();
            if (a != null) {
                a.setVisibility(true != this.b ? 8 : 4);
            }
        }
        this.b = r0;
    }

    public final ProgressBar a() {
        return (ProgressBar) this.a.findViewById(true != this.b ? R.id.sud_layout_progress : R.id.sud_glif_progress_bar);
    }
}
