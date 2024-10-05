package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.amru;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WrappingTextView extends TextView {
    private static final amru b = amru.q();
    public List a;
    private StringBuilder c;
    private StringBuilder d;
    private int e;
    private boolean f;

    public WrappingTextView(Context context) {
        super(context);
        this.a = b;
        this.e = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        this.f = true;
    }

    private final CharSequence b(CharSequence charSequence, float f) {
        return TextUtils.ellipsize(charSequence, getPaint(), f, TextUtils.TruncateAt.END);
    }

    public final void a(List list) {
        if (list == null) {
            list = b;
        }
        if (this.a.equals(list)) {
            if (!list.isEmpty() || TextUtils.isEmpty(getText())) {
                return;
            }
            setText((CharSequence) null);
            return;
        }
        if (!(list instanceof amru)) {
            list = new ArrayList(list);
        }
        this.a = list;
        if (list.isEmpty()) {
            this.f = false;
            setText((CharSequence) null);
        } else {
            this.f = true;
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (!this.a.isEmpty() && (this.e != i || this.f)) {
            int size = ((View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i)) - getPaddingLeft()) - getPaddingRight();
            int maxLines = getMaxLines() - 1;
            StringBuilder sb = this.c;
            if (sb == null) {
                this.c = new StringBuilder();
                this.d = new StringBuilder();
            } else {
                sb.setLength(0);
                this.d.setLength(0);
            }
            int size2 = this.a.size();
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < size2 && i3 <= maxLines; i4++) {
                if (!TextUtils.isEmpty((CharSequence) this.a.get(i4))) {
                    String charSequence = ((CharSequence) this.a.get(i4)).toString();
                    if (z) {
                        this.c.append('\n');
                    }
                    boolean isEmpty = TextUtils.isEmpty(this.d);
                    int length = this.d.length();
                    if (!isEmpty) {
                        this.d.append(" · ");
                    }
                    this.d.append((CharSequence) charSequence);
                    float f = size;
                    if (getPaint().measureText(this.d.toString()) < f) {
                        z = false;
                    } else {
                        if (i3 == maxLines || isEmpty) {
                            this.c.append(b(this.d, f));
                            this.d.setLength(0);
                            z = true;
                        } else {
                            this.c.append((CharSequence) this.d, 0, length);
                            this.c.append('\n');
                            this.d.setLength(0);
                            this.d.append(b(charSequence, f));
                            z = false;
                        }
                        i3++;
                    }
                }
            }
            if (!TextUtils.isEmpty(this.d)) {
                this.c.append((CharSequence) this.d);
            }
            setText(this.c);
            this.e = i;
            this.f = false;
        }
        super.onMeasure(i, i2);
    }

    public WrappingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = b;
        this.e = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        this.f = true;
    }

    public WrappingTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = b;
        this.e = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        this.f = true;
    }
}
