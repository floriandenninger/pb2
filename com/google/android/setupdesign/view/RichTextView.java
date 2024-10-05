package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import defpackage.akk;
import defpackage.alta;
import defpackage.altq;
import defpackage.altr;
import defpackage.altu;
import defpackage.altv;
import defpackage.alul;
import defpackage.ic;
import defpackage.jw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RichTextView extends AppCompatTextView implements altu {
    public static Typeface b;
    private altr c;

    public RichTextView(Context context) {
        super(context);
        b();
    }

    private final void b() {
        ic altqVar;
        if (isInEditMode()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            altqVar = new ic();
        } else {
            altqVar = new altq(this);
        }
        altr altrVar = new altr(altqVar);
        this.c = altrVar;
        jw.M(this, altrVar);
    }

    @Override // defpackage.altu
    public final void a() {
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        altr altrVar = this.c;
        if (altrVar != null) {
            ic icVar = altrVar.b;
            if ((icVar instanceof akk) && ((akk) icVar).t(motionEvent)) {
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        for (Drawable drawable : getCompoundDrawablesRelative()) {
            if (drawable != null && drawable.setState(drawableState)) {
                invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        MovementMethod movementMethod = getMovementMethod();
        if (movementMethod instanceof alul) {
            alul alulVar = (alul) movementMethod;
            if (alulVar.b == motionEvent) {
                return alulVar.a;
            }
        }
        return onTouchEvent;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        TypefaceSpan typefaceSpan;
        Context context = getContext();
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(charSequence);
            for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        Log.w("RichTextView", "Cannot find resource: 0");
                        identifier = 0;
                    }
                    alta.M(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    annotation.getValue();
                    altv altvVar = new altv();
                    if (b != null) {
                        typefaceSpan = new TypefaceSpan(b);
                    } else {
                        typefaceSpan = new TypefaceSpan("sans-serif-medium");
                    }
                    alta.M(spannableString, annotation, altvVar, typefaceSpan);
                }
            }
            charSequence = spannableString;
        }
        super.setText(charSequence, bufferType);
        boolean z = (charSequence instanceof Spanned) && ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length > 0;
        if (z) {
            setMovementMethod(new alul());
        } else {
            setMovementMethod(null);
        }
        setFocusable(z);
        if (Build.VERSION.SDK_INT >= 25) {
            setRevealOnFocusHint(false);
            setFocusableInTouchMode(z);
        }
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
