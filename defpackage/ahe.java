package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahe {
    public ahe() {
    }

    public ahe(Context context, AttributeSet attributeSet) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ahe(byte[] bArr) {
    }

    public static ahe u(Context context, int i, int i2) {
        return new ahq(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public void a(ahh ahhVar) {
    }

    public void b() {
    }

    public void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    public void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
    }

    public void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean n(View view) {
        return false;
    }

    public void o(CoordinatorLayout coordinatorLayout, View view) {
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public void q(View view, Parcelable parcelable) {
    }

    public Parcelable r(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean s(View view, Rect rect) {
        return false;
    }

    public Bundle t() {
        throw null;
    }
}
