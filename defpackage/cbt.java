package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbt extends cbv {
    private static final String f = ajbh.S("BatteryNotLowTracker");

    public cbt(Context context, cfa cfaVar) {
        super(context, cfaVar);
    }

    @Override // defpackage.cbv
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.cbx
    public final /* bridge */ /* synthetic */ Object b() {
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            ajbh.X();
            ajbh.U(f, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
    }

    @Override // defpackage.cbv
    public final void c(Intent intent) {
        char c;
        if (intent.getAction() == null) {
            return;
        }
        ajbh X = ajbh.X();
        String.format("Received %s", intent.getAction());
        X.T(new Throwable[0]);
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -1980154005) {
            if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            g(true);
        } else {
            if (c != 1) {
                return;
            }
            g(false);
        }
    }
}
