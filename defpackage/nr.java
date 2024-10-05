package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nr {
    public static nr a;
    public final Context b;
    public final nq c = new nq();
    private final LocationManager d;

    public nr(Context context, LocationManager locationManager) {
        this.b = context;
        this.d = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.d.isProviderEnabled(str)) {
                return this.d.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
