package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbs extends cbv {
    private static final String f = ajbh.S("BatteryChrgTracker");

    public cbs(Context context, cfa cfaVar) {
        super(context, cfaVar);
    }

    @Override // defpackage.cbv
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    @Override // defpackage.cbx
    public final /* bridge */ /* synthetic */ Object b() {
        int intExtra;
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            ajbh.X();
            ajbh.U(f, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cbv
    public final void c(Intent intent) {
        char c;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        ajbh X = ajbh.X();
        String.format("Received %s", action);
        X.T(new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            g(true);
            return;
        }
        if (c == 1) {
            g(false);
        } else if (c == 2) {
            g(true);
        } else {
            if (c != 3) {
                return;
            }
            g(false);
        }
    }
}
