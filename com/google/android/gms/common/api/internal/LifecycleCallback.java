package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.ci;
import defpackage.dn;
import defpackage.qip;
import defpackage.qqe;
import defpackage.qqf;
import defpackage.qqh;
import defpackage.qrb;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LifecycleCallback {
    public final qqf e;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(qqf qqfVar) {
        this.e = qqfVar;
    }

    private static qqf getChimeraLifecycleFragmentImpl(qqe qqeVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static qqf m(Activity activity) {
        qqh qqhVar;
        qrb qrbVar;
        Object obj = new qqe(activity).a;
        if (!(obj instanceof ci)) {
            WeakReference weakReference = (WeakReference) qqh.a.get(obj);
            if (weakReference != null && (qqhVar = (qqh) weakReference.get()) != null) {
                return qqhVar;
            }
            try {
                qqh qqhVar2 = (qqh) ((Activity) obj).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (qqhVar2 == null || qqhVar2.isRemoving()) {
                    qqhVar2 = new qqh();
                    ((Activity) obj).getFragmentManager().beginTransaction().add(qqhVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                qqh qqhVar3 = qqhVar2;
                qqh.a.put(obj, new WeakReference(qqhVar3));
                return qqhVar3;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        ci ciVar = (ci) obj;
        WeakReference weakReference2 = (WeakReference) qrb.a.get(ciVar);
        if (weakReference2 != null && (qrbVar = (qrb) weakReference2.get()) != null) {
            return qrbVar;
        }
        try {
            qrb qrbVar2 = (qrb) ciVar.getSupportFragmentManager().f("SupportLifecycleFragmentImpl");
            if (qrbVar2 == null || qrbVar2.s) {
                qrbVar2 = new qrb();
                dn k = ciVar.getSupportFragmentManager().k();
                k.r(qrbVar2, "SupportLifecycleFragmentImpl");
                k.k();
            }
            qrb.a.put(ciVar, new WeakReference(qrbVar2));
            return qrbVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public void d(int i, int i2, Intent intent) {
    }

    public void e(Bundle bundle) {
    }

    public void h(Bundle bundle) {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public final Activity l() {
        Activity a = this.e.a();
        qip.an(a);
        return a;
    }

    public void n() {
    }
}
