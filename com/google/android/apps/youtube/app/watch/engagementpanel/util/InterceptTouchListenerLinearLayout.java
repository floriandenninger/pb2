package com.google.android.apps.youtube.app.watch.engagementpanel.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import defpackage.nxp;
import defpackage.nyj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InterceptTouchListenerLinearLayout extends LinearLayout {
    private nyj a;

    public InterceptTouchListenerLinearLayout(Context context) {
        super(context);
    }

    public final void a(nyj nyjVar) {
        this.a = nyjVar;
        setOnTouchListener(nyjVar);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nyj nyjVar = this.a;
        if (nyjVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else if (nxp.a(((nxp) nyjVar).a, motionEvent)) {
                    return true;
                }
            }
            nxp nxpVar = (nxp) nyjVar;
            if (!nxp.a(nxpVar.a, motionEvent)) {
                nxpVar.a.f();
            }
            return true;
        }
        ((nxp) nyjVar).a.g(motionEvent);
        return false;
    }

    public InterceptTouchListenerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptTouchListenerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
