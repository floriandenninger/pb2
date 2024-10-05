package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface qqf {
    Activity a();

    LifecycleCallback b(String str, Class cls);

    void c(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);
}
