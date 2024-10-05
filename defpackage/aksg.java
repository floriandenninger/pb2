package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksg {
    public final WindowManager a;
    public final Thread b;

    public aksg(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.a = windowManager;
        this.b = context.getMainLooper().getThread();
    }
}
