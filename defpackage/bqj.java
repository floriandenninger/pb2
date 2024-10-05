package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqj extends Handler {
    public final WeakReference a;

    public bqj(bqh bqhVar) {
        this.a = new WeakReference(bqhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boy boyVar;
        bqh bqhVar = (bqh) this.a.get();
        if (bqhVar != null) {
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle peekData = message.peekData();
            if (i == 0) {
                if (i2 == bqhVar.f) {
                    bqhVar.f = 0;
                    bqn bqnVar = bqhVar.h;
                    if (bqnVar.d == bqhVar) {
                        bqnVar.o();
                    }
                }
                jj jjVar = (jj) bqhVar.g.get(i2);
                if (jjVar != null) {
                    bqhVar.g.remove(i2);
                    jjVar.i(null, null);
                    return;
                }
                return;
            }
            switch (i) {
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        Bundle bundle = (Bundle) obj;
                        if (bqhVar.e == 0 && i2 == bqhVar.f && i3 > 0) {
                            bqhVar.f = 0;
                            bqhVar.e = i3;
                            bqhVar.h.l(bqhVar, bpf.a(bundle));
                            bqn bqnVar2 = bqhVar.h;
                            if (bqnVar2.d == bqhVar) {
                                bqnVar2.m = true;
                                int size = bqnVar2.b.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    ((bqi) bqnVar2.b.get(i4)).e(bqnVar2.d);
                                }
                                bov bovVar = bqnVar2.h;
                                if (bovVar != null) {
                                    bqnVar2.d.c(bovVar);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        Bundle bundle2 = (Bundle) obj;
                        jj jjVar2 = (jj) bqhVar.g.get(i2);
                        if (jjVar2 != null) {
                            bqhVar.g.remove(i2);
                            jjVar2.j(bundle2);
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        String string = peekData != null ? peekData.getString("error") : null;
                        Bundle bundle3 = (Bundle) obj;
                        jj jjVar3 = (jj) bqhVar.g.get(i2);
                        if (jjVar3 != null) {
                            bqhVar.g.remove(i2);
                            jjVar3.i(string, bundle3);
                            return;
                        }
                        return;
                    }
                    return;
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        Bundle bundle4 = (Bundle) obj;
                        if (bqhVar.e != 0) {
                            bqhVar.h.l(bqhVar, bpf.a(bundle4));
                            return;
                        }
                        return;
                    }
                    return;
                case 6:
                    if (obj instanceof Bundle) {
                        Bundle bundle5 = (Bundle) obj;
                        jj jjVar4 = (jj) bqhVar.g.get(i2);
                        if (bundle5 == null || !bundle5.containsKey("routeId")) {
                            jjVar4.i("DynamicGroupRouteController is created without valid route id.", bundle5);
                            return;
                        } else {
                            bqhVar.g.remove(i2);
                            jjVar4.j(bundle5);
                            return;
                        }
                    }
                    Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                    return;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        Bundle bundle6 = (Bundle) obj;
                        if (bqhVar.e != 0) {
                            Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                            bou l = bundle7 != null ? bou.l(bundle7) : null;
                            ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                            ArrayList arrayList = new ArrayList();
                            int size2 = parcelableArrayList.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                Bundle bundle8 = (Bundle) parcelableArrayList.get(i5);
                                if (bundle8 == null) {
                                    boyVar = null;
                                } else {
                                    bou l2 = bou.l(bundle8.getBundle("mrDescriptor"));
                                    int i6 = bundle8.getInt("selectionState", 1);
                                    bundle8.getBoolean("isUnselectable", false);
                                    bundle8.getBoolean("isGroupable", false);
                                    bundle8.getBoolean("isTransferable", false);
                                    boyVar = new boy(l2, i6);
                                }
                                arrayList.add(boyVar);
                            }
                            bqn bqnVar3 = bqhVar.h;
                            if (bqnVar3.d == bqhVar) {
                                bqi e = bqnVar3.e(i3);
                                if (e instanceof bql) {
                                    ((bql) e).k(l, arrayList);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 8:
                    bqn bqnVar4 = bqhVar.h;
                    if (bqnVar4.d == bqhVar) {
                        bqi e2 = bqnVar4.e(i3);
                        bqo bqoVar = bqnVar4.n;
                        if (bqoVar != null && (e2 instanceof bpc)) {
                            bpc bpcVar = (bpc) e2;
                            bpp bppVar = (bpp) bqoVar.a.b;
                            if (bppVar.t == bpcVar) {
                                bppVar.j(bppVar.c(), 2);
                            }
                        }
                        bqnVar4.m(e2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
