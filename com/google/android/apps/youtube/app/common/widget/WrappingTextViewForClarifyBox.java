package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.ldi;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WrappingTextViewForClarifyBox extends TextView {
    public List a;
    public int b;
    public int c;
    public ldi d;
    private SpannableString e;
    private CharSequence f;
    private int g;

    public WrappingTextViewForClarifyBox(Context context) {
        super(context);
        this.a = Collections.emptyList();
        this.b = 0;
        this.g = 0;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        CharSequence sb;
        if (this.a.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            int size = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i);
            int i3 = size - this.c;
            StringBuilder sb3 = new StringBuilder();
            this.g = 0;
            Iterator it = this.a.iterator();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CharSequence charSequence = (CharSequence) it.next();
                i4 += charSequence.length();
                boolean z = sb3.length() == 0;
                if (!TextUtils.isEmpty(charSequence)) {
                    if (!z && i4 != this.b) {
                        sb3.append(" ");
                        i4++;
                    }
                    sb3.append(charSequence);
                    int maxLines = getMaxLines() - 1;
                    float f = size;
                    boolean z2 = getPaint().measureText(sb3.toString()) <= f;
                    if (i5 == maxLines) {
                        z2 = getPaint().measureText(sb3.toString()) <= ((float) i3);
                    }
                    if (i5 == maxLines) {
                        if (!z2) {
                            CharSequence ellipsize = TextUtils.ellipsize(sb3, getPaint(), i3, TextUtils.TruncateAt.END);
                            sb3 = new StringBuilder();
                            sb3.append(ellipsize);
                            break;
                        }
                    } else if (!z2) {
                        boolean z3 = !z;
                        if (z3) {
                            sb3.delete(sb3.length() - charSequence.length(), sb3.length());
                        }
                        if (z) {
                            sb = TextUtils.ellipsize(sb3, getPaint(), f, TextUtils.TruncateAt.END);
                        } else {
                            sb = sb3.toString();
                        }
                        sb2.append(sb);
                        i5++;
                        sb3 = z3 ? new StringBuilder(charSequence) : new StringBuilder();
                    }
                }
            }
            if (sb3.length() != 0) {
                sb2.append((CharSequence) sb3);
            }
            this.g = sb3.length() != 0 ? (int) (i3 - getPaint().measureText(sb3.toString())) : -1;
            CharSequence subSequence = sb2.subSequence(0, sb2.length());
            this.f = subSequence;
            this.e = new SpannableString(subSequence);
            this.e.setSpan(new StyleSpan(1), 0, this.b, 18);
            setText(this.e);
            ldi ldiVar = this.d;
            if (ldiVar != null) {
                ldiVar.a.d.g(this.g, ldiVar.b);
            }
        }
        super.onMeasure(i, i2);
    }

    public WrappingTextViewForClarifyBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.emptyList();
        this.b = 0;
        this.g = 0;
    }

    public WrappingTextViewForClarifyBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = Collections.emptyList();
        this.b = 0;
        this.g = 0;
    }
}
