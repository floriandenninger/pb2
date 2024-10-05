package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccb extends cbv {
    static {
        ajbh.S("StorageNotLowTracker");
    }

    public ccb(Context context, cfa cfaVar) {
        super(context, cfaVar);
    }

    @Override // defpackage.cbv
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // defpackage.cbx
    public final /* bridge */ /* synthetic */ Object b() {
        char c;
        Intent registerReceiver = this.a.registerReceiver(null, a());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return true;
        }
        String action = registerReceiver.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -1181163412) {
            if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            return c != 1 ? null : false;
        }
        return true;
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
        if (hashCode != -1181163412) {
            if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
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
