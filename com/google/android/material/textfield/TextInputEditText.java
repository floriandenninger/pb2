package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.youtube.R;
import defpackage.akwg;
import defpackage.alig;
import defpackage.alns;
import defpackage.aloa;
import defpackage.sp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TextInputEditText extends sp {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    private final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout b = b();
        if (b == null || !this.b || rect == null) {
            return;
        }
        b.getFocusedRect(this.a);
        rect.bottom = this.a.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout b = b();
        if (b != null && this.b && rect != null) {
            b.getGlobalVisibleRect(this.a, point);
            rect.bottom = this.a.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout b = b();
        return (b == null || !b.h) ? super.getHint() : b.c();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.h && super.getHint() == null && akwg.p()) {
            setHint("");
        }
    }

    @Override // defpackage.sp, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout b = b();
            editorInfo.hintText = b != null ? b.c() : null;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout b = b();
        if (Build.VERSION.SDK_INT >= 23 || b == null) {
            return;
        }
        Editable text = getText();
        CharSequence c = b.c();
        boolean z = !TextUtils.isEmpty(text);
        boolean isEmpty = TextUtils.isEmpty(c);
        setLabelFor(R.id.textinput_helper_text);
        String str = "";
        String charSequence = isEmpty ^ true ? c.toString() : "";
        if (z) {
            String valueOf = String.valueOf(text);
            if (!TextUtils.isEmpty(charSequence)) {
                String valueOf2 = String.valueOf(charSequence);
                str = valueOf2.length() != 0 ? ", ".concat(valueOf2) : new String(", ");
            }
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(str);
            str = sb.toString();
        } else if (!TextUtils.isEmpty(charSequence)) {
            str = charSequence;
        }
        accessibilityNodeInfo.setText(str);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout b = b();
        if (b != null && this.b) {
            this.a.set(0, b.getHeight() - getResources().getDimensionPixelOffset(R.dimen.mtrl_edittext_rectangle_top_offset), b.getWidth(), b.getHeight());
            b.requestRectangleOnScreen(this.a, true);
        }
        return requestRectangleOnScreen;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(aloa.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray a = alig.a(context, attributeSet, alns.b, i, R.style.Widget_Design_TextInputEditText, new int[0]);
        this.b = a.getBoolean(0, false);
        a.recycle();
    }
}
