package defpackage;

import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class teu implements DisplayManager.DisplayListener {
    public static final /* synthetic */ int d = 0;
    public DisplayManager b;
    public final HashMap a = new HashMap();
    public final Set c = Collections.newSetFromMap(new WeakHashMap());

    public final DisplayMetrics a(Display display) {
        if (display == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (this.b != null) {
            this.a.put(Integer.valueOf(display.getDisplayId()), displayMetrics);
        }
        return displayMetrics;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        onDisplayChanged(i);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (this.c.isEmpty()) {
            this.a.remove(Integer.valueOf(i));
        } else {
            a(this.b.getDisplay(i));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        this.a.remove(Integer.valueOf(i));
    }
}
