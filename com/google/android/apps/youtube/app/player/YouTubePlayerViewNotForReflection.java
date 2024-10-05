package com.google.android.apps.youtube.app.player;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.afkp;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fhg;
import defpackage.fkv;
import defpackage.flp;
import defpackage.jw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubePlayerViewNotForReflection extends fkv implements fgp {
    private fhg a;
    private flp b;

    public YouTubePlayerViewNotForReflection(Context context) {
        this(context, null);
    }

    private final boolean f(View view) {
        return (view != this.p || this.a.g() || this.b == null) ? false : true;
    }

    public void extractSmartClipData(int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.flq
    public final void kF(flp flpVar) {
        if (this.b == flpVar) {
            return;
        }
        this.b = flpVar;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aivi
    public final void kS(View view, Rect rect, int i, int i2, int i3, int i4) {
        if (!f(view)) {
            super.kS(view, rect, i, i2, i3, i4);
        } else {
            this.b.g(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aivi
    public final void kT(View view, Rect rect, int i, int i2) {
        if (!f(view)) {
            super.kT(view, rect, i, i2);
        } else {
            this.b.h(view);
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        fhgVar.getClass();
        if (fhgVar == this.a) {
            return;
        }
        this.a = fhgVar;
        afkp afkpVar = this.d;
        if (!afkpVar.G() || afkpVar.b.C().j || !fhgVar.m()) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.aivi, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        View view = this.p;
        if (view != null) {
            view.forceLayout();
        }
    }

    public YouTubePlayerViewNotForReflection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = fhg.NONE;
        jw.V(this, 2);
    }
}
