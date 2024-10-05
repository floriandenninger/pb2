package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ajci;
import defpackage.ajcj;
import defpackage.ajct;
import defpackage.jw;
import defpackage.zbh;
import defpackage.zbm;
import defpackage.zcl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class YouTubeTextView extends TextView {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private boolean f;
    public boolean g;
    public boolean h;
    public int i;
    private int j;
    private boolean k;
    private int l;
    private zbh m;

    public YouTubeTextView(Context context) {
        super(context);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        e(context, null, 0, 0);
    }

    private final void a(TypedArray typedArray) {
        if (isInEditMode()) {
            return;
        }
        int indexCount = typedArray.getIndexCount();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArray.getIndex(i6);
            int[] iArr = zbm.a;
            if (index == 5) {
                this.a = typedArray.getBoolean(5, false);
            } else if (index == 1) {
                i5 = typedArray.getInt(1, i5);
            } else if (index == 6) {
                i2 = typedArray.getInt(6, i2);
            } else if (index == 12) {
                i3 = typedArray.getInt(12, i3);
            } else if (index == 11) {
                i4 = typedArray.getInt(11, i4);
            } else if (index == 4) {
                this.i = typedArray.getColor(4, 0);
                this.h = true;
            } else if (index == 8) {
                this.e = typedArray.getColor(8, 0);
                this.d = true;
            } else if (index == 9) {
                this.j = typedArray.getColor(9, 0);
                this.f = true;
            } else if (index == 10) {
                this.l = typedArray.getDimensionPixelSize(10, 0);
                this.k = true;
            } else if (index == 7) {
                this.c = typedArray.getBoolean(7, true);
            }
        }
        Context context = getContext();
        ajct ajctVar = null;
        if (i2 != -1) {
            ajctVar = ajct.c(i2);
        } else if (i3 != -1) {
            ajctVar = ajct.d(i3);
        } else if (i4 != -1) {
            ajct[] values = ajct.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                ajct ajctVar2 = values[i];
                if (ajctVar2.v == i4) {
                    ajctVar = ajctVar2;
                    break;
                }
                i++;
            }
        }
        if (ajctVar != null) {
            setTypeface(ajctVar.b(context, i5), i5);
        }
    }

    private final void e(Context context, AttributeSet attributeSet, int i, int i2) {
        if (isInEditMode()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            boolean isFocusable = isFocusable();
            zbh zbhVar = new zbh(this);
            this.m = zbhVar;
            jw.M(this, zbhVar);
            setFocusable(isFocusable);
        }
        Resources.Theme theme = context.getTheme();
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(null, zbm.i, i, i2);
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, zbm.i, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(0, 0);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, zbm.i);
            a(obtainStyledAttributes3);
            obtainStyledAttributes3.recycle();
        }
        a(obtainStyledAttributes2);
        obtainStyledAttributes2.recycle();
    }

    private final void f() {
        if (this.a) {
            CharSequence text = getText();
            if (!(text instanceof Spanned) || ((ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class)).length <= 0) {
                b();
            } else {
                c();
            }
        }
    }

    public final void b() {
        this.b = false;
        setMovementMethod(getDefaultMovementMethod());
    }

    public final void c() {
        this.b = true;
        boolean isLongClickable = isLongClickable();
        setMovementMethod(zcl.a());
        setLongClickable(isLongClickable);
    }

    public final void d(boolean z) {
        this.a = z;
        if (z) {
            f();
        } else {
            b();
        }
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT >= 26 || !this.m.t(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return super.onTouchEvent(motionEvent);
        }
        this.g = false;
        super.onTouchEvent(motionEvent);
        return this.g;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.c) {
            super.scrollTo(i, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence instanceof Spanned) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.strike_through_line_width);
            Spanned spanned = (Spanned) charSequence;
            for (ajci ajciVar : (ajci[]) spanned.getSpans(0, charSequence.length(), ajci.class)) {
                if (this.d) {
                    ajciVar.a.setColor(this.e);
                    ajciVar.b = true;
                }
                ajciVar.a.setStrokeWidth(dimensionPixelSize);
            }
            int dimensionPixelSize2 = this.k ? this.l : getContext().getResources().getDimensionPixelSize(R.dimen.underline_line_width);
            for (ajcj ajcjVar : (ajcj[]) spanned.getSpans(0, charSequence.length(), ajcj.class)) {
                if (this.f) {
                    ajcjVar.a.setColor(this.j);
                    ajcjVar.b = true;
                }
                ajcjVar.a.setStrokeWidth(dimensionPixelSize2);
            }
        }
        super.setText(charSequence, bufferType);
        f();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        ajct c = ajct.c(-1);
        if (c != null) {
            setTypeface(c.b(getContext(), 0), 0);
        }
        this.i = 0;
        this.e = 0;
        this.j = 0;
        this.l = 0;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        super.setTextAppearance(context, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, zbm.i);
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        e(context, attributeSet, 0, 0);
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        e(context, attributeSet, i, 0);
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        e(context, attributeSet, i, i2);
    }
}
