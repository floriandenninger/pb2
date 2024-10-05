package defpackage;

import android.app.Application;
import android.hardware.display.DisplayManager;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdq {
    public final teu a;
    private final WeakReference b;

    public tdq(Application application) {
        teu teuVar = new teu();
        this.a = teuVar;
        this.b = new WeakReference(application);
        if (teuVar.b != null) {
            return;
        }
        teuVar.b = (DisplayManager) application.getApplicationContext().getSystemService("display");
        teuVar.b.registerDisplayListener(teuVar, null);
    }

    public final Application a() {
        return (Application) this.b.get();
    }
}
