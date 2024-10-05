package org.chromium.base;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import defpackage.ayeq;
import defpackage.baeb;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PowerMonitor {
    private static PowerMonitor a;
    private boolean b;

    private PowerMonitor() {
    }

    public static void a() {
        if (a != null) {
            return;
        }
        Context context = ayeq.a;
        a = new PowerMonitor();
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            b(registerReceiver.getIntExtra("plugged", 0) == 0);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(new baeb(), intentFilter);
    }

    public static void b(boolean z) {
        a.b = z;
        N.MCImhGql();
    }

    private static int getRemainingBatteryCapacity() {
        if (a == null) {
            a();
        }
        return ((BatteryManager) ayeq.a.getSystemService("batterymanager")).getIntProperty(1);
    }

    private static boolean isBatteryPower() {
        if (a == null) {
            a();
        }
        return a.b;
    }
}
