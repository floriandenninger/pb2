package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amfn implements amfl {
    private final ConnectivityManager a;
    private final /* synthetic */ int b;

    public amfn(Context context, ConnectivityManager connectivityManager, int i, byte[] bArr) {
        this.b = i;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            amkq.O(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    public amfn(Context context, ConnectivityManager connectivityManager, int i) {
        this.b = i;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            amkq.O(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    @Override // defpackage.amfl
    public final boolean a() {
        if (this.b != 0) {
            NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
            return (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) ? false : true;
        }
        boolean isActiveNetworkMetered = this.a.isActiveNetworkMetered();
        NetworkInfo activeNetworkInfo2 = this.a.getActiveNetworkInfo();
        return (isActiveNetworkMetered || activeNetworkInfo2 == null || !activeNetworkInfo2.isConnected() || activeNetworkInfo2.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) ? false : true;
    }
}
