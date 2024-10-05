package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import defpackage.algp;
import defpackage.aljq;
import defpackage.alnk;
import defpackage.si;
import defpackage.sk;
import defpackage.su;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final si a(Context context, AttributeSet attributeSet) {
        return new alnk(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final sk c(Context context, AttributeSet attributeSet) {
        return new algp(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final su d(Context context, AttributeSet attributeSet) {
        return new aljq(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
