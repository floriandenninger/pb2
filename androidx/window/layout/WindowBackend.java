package androidx.window.layout;

import android.app.Activity;
import defpackage.hw;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, hw hwVar);

    void unregisterLayoutChangeCallback(hw hwVar);
}
