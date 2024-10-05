package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class im {
    public final GestureDetector a;

    public im(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new GestureDetector(context, onGestureListener, handler);
    }
}
