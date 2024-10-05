package com.google.android.libraries.youtube.account.verification.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import defpackage.amkq;
import defpackage.wla;
import defpackage.wlb;
import defpackage.wlc;
import defpackage.wlm;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CodeInputView extends RelativeLayout implements View.OnClickListener, wla {
    public CodeInputEditText[] a;
    public wlc b;
    public boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private View[] j;
    private int k;

    public CodeInputView(Context context) {
        super(context);
        this.a = new CodeInputEditText[6];
        this.j = new View[6];
        this.c = true;
        j(context, null, 0);
    }

    public static final int i(CodeInputEditText codeInputEditText) {
        amkq.F(codeInputEditText.getTag() instanceof Integer, "Digit tag should be an integer.");
        return ((Integer) codeInputEditText.getTag()).intValue();
    }

    private final void j(Context context, AttributeSet attributeSet, int i) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.code_input_view, (ViewGroup) this, true);
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, wlm.a, i, 0);
        try {
            this.d = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            this.e = obtainStyledAttributes.getColor(0, -1);
            this.f = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.g = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.h = obtainStyledAttributes.getColor(2, -1);
            this.i = obtainStyledAttributes.getColor(3, -1);
            obtainStyledAttributes.recycle();
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.digit_one_container);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.digit_two_container);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.digit_three_container);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.digit_four_container);
            ViewGroup viewGroup5 = (ViewGroup) findViewById(R.id.digit_five_container);
            ViewGroup viewGroup6 = (ViewGroup) findViewById(R.id.digit_six_container);
            this.a[0] = (CodeInputEditText) viewGroup.findViewById(R.id.digit);
            this.a[1] = (CodeInputEditText) viewGroup2.findViewById(R.id.digit);
            this.a[2] = (CodeInputEditText) viewGroup3.findViewById(R.id.digit);
            this.a[3] = (CodeInputEditText) viewGroup4.findViewById(R.id.digit);
            this.a[4] = (CodeInputEditText) viewGroup5.findViewById(R.id.digit);
            this.a[5] = (CodeInputEditText) viewGroup6.findViewById(R.id.digit);
            this.j[0] = viewGroup.findViewById(R.id.underline);
            this.j[1] = viewGroup2.findViewById(R.id.underline);
            this.j[2] = viewGroup3.findViewById(R.id.underline);
            this.j[3] = viewGroup4.findViewById(R.id.underline);
            this.j[4] = viewGroup5.findViewById(R.id.underline);
            this.j[5] = viewGroup6.findViewById(R.id.underline);
            int i3 = 0;
            while (true) {
                CodeInputEditText[] codeInputEditTextArr = this.a;
                int length = codeInputEditTextArr.length;
                if (i3 >= 6) {
                    break;
                }
                codeInputEditTextArr[i3].setTag(Integer.valueOf(i3));
                this.a[i3].setTextColor(this.e);
                this.a[i3].setTextSize(this.d);
                this.a[i3].addTextChangedListener(new wlb(this, i3));
                this.a[i3].a = this;
                i3++;
            }
            while (true) {
                View[] viewArr = this.j;
                int length2 = viewArr.length;
                if (i2 < 6) {
                    viewArr[i2].setBackgroundColor(this.i);
                    yny.z(this.j[i2], yny.n(this.g), ViewGroup.LayoutParams.class);
                    i2++;
                } else {
                    setOnClickListener(this);
                    return;
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.wla
    public final void a(CodeInputEditText codeInputEditText) {
        int i;
        if (this.c && (i = i(codeInputEditText)) > 0) {
            if (i == 5) {
                if (codeInputEditText.getText().length() > 0) {
                    d(5);
                    return;
                }
                i = 5;
            }
            d(i - 1);
        }
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            CodeInputEditText[] codeInputEditTextArr = this.a;
            int length = codeInputEditTextArr.length;
            if (i < 6) {
                sb.append(codeInputEditTextArr[i].getText().toString().trim());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public final void c() {
        Context context = getContext();
        if (context != null) {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(this.a[this.k].getWindowToken(), 0);
        }
    }

    public final void d(int i) {
        boolean z = false;
        if (i >= 0 && i < 6) {
            z = true;
        }
        amkq.E(z);
        e(i);
        CodeInputEditText codeInputEditText = this.a[i];
        codeInputEditText.requestFocus();
        codeInputEditText.setSelection(codeInputEditText.getText().length());
        if (i != 5 || codeInputEditText.getText().length() == 0) {
            f(i);
        }
    }

    public final void e(int i) {
        boolean z = false;
        if (i >= 0 && i < 6) {
            z = true;
        }
        amkq.E(z);
        this.k = i;
    }

    public final void f(int i) {
        int i2 = 0;
        while (true) {
            View[] viewArr = this.j;
            int length = viewArr.length;
            if (i2 >= 6) {
                return;
            }
            viewArr[i2].setBackgroundColor(i2 == i ? this.h : this.i);
            yny.z(this.j[i2], yny.n(i2 == i ? this.f : this.g), ViewGroup.LayoutParams.class);
            i2++;
        }
    }

    public final void g(String str) {
        int i = 0;
        amkq.E(str.length() <= 6);
        int length = this.a.length;
        amkq.E(true);
        this.c = false;
        while (i < str.length()) {
            int i2 = i + 1;
            this.a[i].setText(str.substring(i, i2));
            i = i2;
        }
        this.c = true;
    }

    public final void h() {
        if (!this.a[this.k].isFocused()) {
            d(this.k);
        }
        Context context = getContext();
        if (context != null) {
            ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(this.a[this.k], 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int i = 0;
        while (true) {
            CodeInputEditText[] codeInputEditTextArr = this.a;
            int length = codeInputEditTextArr.length;
            if (i >= 6) {
                return;
            }
            codeInputEditTextArr[i].setEnabled(z);
            this.j[i].setEnabled(z);
            i++;
        }
    }

    public CodeInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new CodeInputEditText[6];
        this.j = new View[6];
        this.c = true;
        j(context, attributeSet, 0);
    }

    public CodeInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new CodeInputEditText[6];
        this.j = new View[6];
        this.c = true;
        j(context, attributeSet, i);
    }
}
