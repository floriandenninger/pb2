package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ahe;
import defpackage.akm;
import defpackage.akn;
import defpackage.alft;
import defpackage.alfu;
import defpackage.allg;
import defpackage.jw;
import defpackage.kr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SwipeDismissBehavior extends ahe {
    private boolean a;
    public akn e;
    public allg j;
    public int f = 2;
    public float g = 0.5f;
    public float h = 0.0f;
    public float i = 0.5f;
    private final akm b = new alft(this);

    public static float z(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // defpackage.ahe
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.a = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.a = false;
        }
        if (!z) {
            return false;
        }
        if (this.e == null) {
            this.e = akn.b(coordinatorLayout, this.b);
        }
        return this.e.k(motionEvent);
    }

    @Override // defpackage.ahe
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (jw.c(view) != 0) {
            return false;
        }
        jw.V(view, 1);
        jw.J(view, 1048576);
        if (!v(view)) {
            return false;
        }
        jw.at(view, kr.g, new alfu(this));
        return false;
    }

    @Override // defpackage.ahe
    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        akn aknVar = this.e;
        if (aknVar == null) {
            return false;
        }
        aknVar.f(motionEvent);
        return true;
    }

    public boolean v(View view) {
        return true;
    }

    public void y(allg allgVar) {
        this.j = allgVar;
    }
}
