package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrb extends ce implements qqf {
    public static final WeakHashMap a = new WeakHashMap();
    public Bundle c;
    private final Map d = DesugarCollections.synchronizedMap(new adz());
    public int b = 0;

    @Override // defpackage.ce
    public final void Q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.Q(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
        }
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        super.T(i, i2, intent);
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).d(i, i2, intent);
        }
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.b = 5;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).n();
        }
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.b = 3;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // defpackage.qqf
    public final /* synthetic */ Activity a() {
        return C();
    }

    @Override // defpackage.qqf
    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.d.get(str));
    }

    @Override // defpackage.qqf
    public final void c(String str, LifecycleCallback lifecycleCallback) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, lifecycleCallback);
            if (this.b > 0) {
                new amcc(Looper.getMainLooper(), (byte[]) null).post(new qra(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.b = 4;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        for (Map.Entry entry : this.d.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        this.b = 2;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }
}
