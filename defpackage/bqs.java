package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqs {
    public final Context a;
    final bqr b;
    public boolean d;
    private final PackageManager g;
    private final ArrayList h = new ArrayList();
    public final BroadcastReceiver e = new bqp(this);
    public final Runnable f = new bqq(this);
    public final Handler c = new Handler();

    public bqs(Context context, bqr bqrVar) {
        this.a = context;
        this.b = bqrVar;
        this.g = context.getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i;
        if (this.d) {
            ArrayList<ServiceInfo> arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList2 = new ArrayList();
                Iterator<ResolveInfo> it = this.g.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().serviceInfo);
                }
                arrayList = arrayList2;
            }
            Iterator<ResolveInfo> it2 = this.g.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (true) {
                int i3 = -1;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if (bpw.e() && !arrayList.isEmpty()) {
                        for (ServiceInfo serviceInfo2 : arrayList) {
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = this.h.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        bqn bqnVar = (bqn) this.h.get(i4);
                        if (bqnVar.a.getPackageName().equals(str) && bqnVar.a.getClassName().equals(str2)) {
                            i3 = i4;
                            break;
                        }
                        i4++;
                    }
                    if (i3 < 0) {
                        bqn bqnVar2 = new bqn(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        bqnVar2.n = new bqo(this);
                        bqnVar2.n();
                        i = i2 + 1;
                        this.h.add(i2, bqnVar2);
                        this.b.g(bqnVar2);
                    } else if (i3 >= i2) {
                        bqn bqnVar3 = (bqn) this.h.get(i3);
                        bqnVar3.n();
                        if (bqnVar3.d == null && bqnVar3.q()) {
                            bqnVar3.o();
                            bqnVar3.f();
                        }
                        i = i2 + 1;
                        Collections.swap(this.h, i3, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.h.size()) {
                for (int size2 = this.h.size() - 1; size2 >= i2; size2--) {
                    bqn bqnVar4 = (bqn) this.h.get(size2);
                    bpp bppVar = (bpp) this.b;
                    bpu b = bppVar.b(bqnVar4);
                    if (b != null) {
                        bqnVar4.jQ(null);
                        bqnVar4.jO(null);
                        bppVar.n(b, null);
                        bppVar.m.a(514, b);
                        bppVar.j.remove(b);
                    }
                    this.h.remove(bqnVar4);
                    bqnVar4.n = null;
                    if (bqnVar4.c) {
                        bqnVar4.c = false;
                        bqnVar4.p();
                    }
                }
            }
        }
    }
}
