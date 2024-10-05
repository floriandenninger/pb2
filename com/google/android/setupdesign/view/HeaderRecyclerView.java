package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.altp;
import defpackage.alui;
import defpackage.vw;
import defpackage.wd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeaderRecyclerView extends RecyclerView {
    public View W;
    private int aa;
    private boolean ab;

    public HeaderRecyclerView(Context context) {
        super(context);
        this.ab = false;
        a((AttributeSet) null, 0);
    }

    private final void a(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, altp.h, i, 0);
        this.aa = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ac(vw vwVar) {
        if (this.W != null && vwVar != null) {
            alui aluiVar = new alui(vwVar);
            aluiVar.d = this.W;
            vwVar = aluiVar;
        }
        super.ac(vwVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void af(wd wdVar) {
        super.af(wdVar);
        if (wdVar == null || this.W != null || this.aa == 0) {
            return;
        }
        this.W = LayoutInflater.from(getContext()).inflate(this.aa, (ViewGroup) this, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r1 != false) goto L30;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.ab
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            int r0 = r6.getAction()
            if (r0 != r2) goto L10
            r5.ab = r1
            goto L89
        L10:
            int r0 = r6.getAction()
            if (r0 != 0) goto L8a
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 2
            if (r0 == r3) goto L59
            r3 = 20
            if (r0 == r3) goto L24
            goto L84
        L24:
            android.view.View r0 = r5.findFocus()
            if (r0 != 0) goto L2b
            goto L84
        L2b:
            int[] r3 = new int[r4]
            int[] r4 = new int[r4]
            r0.getLocationInWindow(r3)
            r5.getLocationInWindow(r4)
            r3 = r3[r2]
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
            r0 = r4[r2]
            int r4 = r5.getMeasuredHeight()
            int r0 = r0 + r4
            int r3 = r3 - r0
            if (r3 <= 0) goto L84
            int r0 = r5.getMeasuredHeight()
            float r0 = (float) r0
            r4 = 1060320051(0x3f333333, float:0.7)
            float r0 = r0 * r4
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r0, r3)
            r5.ai(r1, r0)
            goto L83
        L59:
            android.view.View r0 = r5.findFocus()
            if (r0 != 0) goto L60
            goto L84
        L60:
            int[] r3 = new int[r4]
            int[] r4 = new int[r4]
            r0.getLocationInWindow(r3)
            r5.getLocationInWindow(r4)
            r0 = r3[r2]
            r3 = r4[r2]
            int r0 = r0 - r3
            if (r0 >= 0) goto L84
            int r3 = r5.getMeasuredHeight()
            float r3 = (float) r3
            r4 = -1087163597(0xffffffffbf333333, float:-0.7)
            float r3 = r3 * r4
            int r3 = (int) r3
            int r0 = java.lang.Math.max(r3, r0)
            r5.ai(r1, r0)
        L83:
            r1 = 1
        L84:
            r5.ab = r1
            if (r1 != 0) goto L89
            goto L8a
        L89:
            return r2
        L8a:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.view.HeaderRecyclerView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.W != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ab = false;
        a(attributeSet, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ab = false;
        a(attributeSet, i);
    }
}
