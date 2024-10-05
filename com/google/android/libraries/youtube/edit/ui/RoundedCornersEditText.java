package com.google.android.libraries.youtube.edit.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import defpackage.ammv;
import defpackage.wcy;
import defpackage.zzl;
import defpackage.zzm;
import defpackage.zzn;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RoundedCornersEditText extends EditText {
    public boolean a;
    private zzn b;

    public RoundedCornersEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        this.b = new zzn();
    }

    public final void a(int i) {
        if (this.a) {
            zzn zznVar = this.b;
            if (i != zznVar.e) {
                zznVar.c.setPathEffect(new CornerPathEffect(i));
                zznVar.e = i;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final Drawable getBackground() {
        if (this.a) {
            return new ColorDrawable(this.b.c.getColor());
        }
        return super.getBackground();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.a) {
            zzn zznVar = this.b;
            if (zznVar.c.getColor() != 0 && getText().length() != 0) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                StringBuilder sb = zznVar.b;
                sb.delete(0, sb.length());
                StringBuilder sb2 = zznVar.b;
                sb2.append((CharSequence) getText());
                sb2.append(zznVar.c.getColor());
                sb2.append(getTextSize());
                sb2.append(Arrays.toString(iArr));
                sb2.append(getTypeface());
                sb2.append(getTextAlignment());
                int hashCode = zznVar.b.toString().hashCode();
                if (hashCode != zznVar.d) {
                    zznVar.d = hashCode;
                    wcy wcyVar = zznVar.f;
                    zzm zzmVar = zznVar.a;
                    zzmVar.b = 0;
                    zzmVar.a.clear();
                    int lineCount = getLineCount();
                    int length = getText().length();
                    for (int i = 0; i < lineCount; i++) {
                        int lineStart = getLayout().getLineStart(i);
                        if (lineStart == length || getText().charAt(lineStart) == '\n') {
                            zzmVar.b(0.0f, 0.0f);
                        } else {
                            zzmVar.b((getLayout().getLineLeft(i) + getPaddingLeft()) - zzn.a(this), getLayout().getLineRight(i) + getPaddingLeft() + zzn.a(this));
                        }
                    }
                    float textSize = getTextSize() * 0.6f;
                    wcy wcyVar2 = zznVar.f;
                    zzm zzmVar2 = zznVar.a;
                    while (!zzmVar2.a.isEmpty()) {
                        zzl zzlVar = (zzl) zzmVar2.a.poll();
                        ammv a = zzmVar2.a(zzlVar.a - 1);
                        if (a.h()) {
                            wcy.w(zzmVar2, zzlVar, (zzl) a.c(), textSize);
                        }
                        ammv a2 = zzmVar2.a(zzlVar.a + 1);
                        if (a2.h()) {
                            wcy.w(zzmVar2, zzlVar, (zzl) a2.c(), textSize);
                        }
                    }
                }
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < getLineCount(); i4++) {
                    int lineStart2 = getLayout().getLineStart(i4);
                    if (lineStart2 != getLayout().getLineEnd(i4)) {
                        if (getText().charAt(lineStart2) == '\n') {
                            if (i2 > 0) {
                                canvas.drawPath(zznVar.b(this, i3, i4 - 1), zznVar.c);
                                i2 = 0;
                            }
                            i3 = i4 + 1;
                        } else if (i4 == getLineCount() - 1) {
                            canvas.drawPath(zznVar.b(this, i3, i4), zznVar.c);
                        } else {
                            i2++;
                        }
                    } else if (i2 > 0) {
                        canvas.drawPath(zznVar.b(this, i3, i4 - 1), zznVar.c);
                        i2 = 0;
                    }
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (this.a) {
            this.b.c.setColor(i);
            invalidate();
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (this.a) {
            int i2 = (int) (0.8f * f);
            setPadding(i2, 0, i2, 0);
        }
        super.setTextSize(i, f);
    }
}
