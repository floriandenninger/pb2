package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kr {
    public static final kr a = new kr(1, (CharSequence) null);
    public static final kr b;
    public static final kr c;
    public static final kr d;
    public static final kr e;
    public static final kr f;
    public static final kr g;
    public static final kr h;
    public static final kr i;
    public final Object j;
    public final int k;
    public final Class l;
    public final lf m;

    static {
        new kr(2, (CharSequence) null);
        new kr(4, (CharSequence) null);
        new kr(8, (CharSequence) null);
        b = new kr(16, (CharSequence) null);
        new kr(32, (CharSequence) null);
        new kr(64, (CharSequence) null);
        new kr(128, (CharSequence) null);
        new kr(256, ky.class);
        new kr(512, ky.class);
        new kr(1024, kz.class);
        new kr(2048, kz.class);
        c = new kr(4096, (CharSequence) null);
        d = new kr(8192, (CharSequence) null);
        new kr(16384, (CharSequence) null);
        new kr(32768, (CharSequence) null);
        new kr(65536, (CharSequence) null);
        new kr(131072, ld.class);
        e = new kr(262144, (CharSequence) null);
        f = new kr(524288, (CharSequence) null);
        g = new kr(1048576, (CharSequence) null);
        new kr(2097152, le.class);
        new kr(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, lb.class);
        h = new kr(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
        i = new kr(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, lc.class);
        new kr(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, la.class);
        new kr(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new kr(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
    }

    public kr(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.j).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.j).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof kr) && this.j.equals(((kr) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    private kr(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public kr(Object obj, int i2, CharSequence charSequence, lf lfVar, Class cls) {
        this.k = i2;
        this.m = lfVar;
        this.j = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.l = cls;
    }
}
