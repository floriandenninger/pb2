package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yki extends yky {
    private final Activity b;

    private yki(Activity activity, ykl yklVar) {
        super(yklVar);
        activity.getClass();
        this.b = activity;
    }

    public static yki c(Activity activity, ykl yklVar) {
        return new yki(activity, yklVar);
    }

    @Override // defpackage.yky
    protected final void d(Runnable runnable) {
        this.b.runOnUiThread(runnable);
    }
}
