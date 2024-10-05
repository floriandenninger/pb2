package defpackage;

import android.view.View;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class frz {
    private static final View.AccessibilityDelegate a = new fry();

    public static void a(frx frxVar, View view, Object obj) {
        boolean z;
        view.getClass();
        obj.getClass();
        if (frxVar.c.getCount() > 0) {
            view.setOnClickListener(frxVar);
            view.setTag(obj);
            z = true;
        } else {
            z = false;
        }
        view.setAccessibilityDelegate(a);
        view.setClickable(z);
        view.setEnabled(z);
        view.setFocusable(z);
        view.setVisibility(true != z ? 8 : 0);
    }
}
