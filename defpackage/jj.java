package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class jj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, int i) {
        view.setAccessibilityLiveRegion(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static void h(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        imageView.setImageTintList(colorStateList);
        if (Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    public void i(String str, Bundle bundle) {
        throw null;
    }

    public void j(Bundle bundle) {
        throw null;
    }
}
