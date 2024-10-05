package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.IInterface;
import com.google.vr.vrcore.common.api.HeadTrackingState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface axhl extends IInterface {
    int a(ComponentName componentName, HeadTrackingState headTrackingState);

    int f(ComponentName componentName, int i, PendingIntent pendingIntent, HeadTrackingState headTrackingState);

    int g(Bundle bundle, HeadTrackingState headTrackingState);

    void h();

    void i(PendingIntent pendingIntent);

    void j();

    boolean k(PendingIntent pendingIntent);

    boolean l(Bundle bundle);

    boolean m();

    boolean n(axhn axhnVar);

    void o(PendingIntent pendingIntent, ComponentName componentName);

    void p(ComponentName componentName, axhj axhjVar);

    void q(ComponentName componentName);
}
