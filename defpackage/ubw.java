package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubw {
    private final Context a;
    private final twn b;
    private final ammv c;

    public ubw(Context context, twn twnVar, ammv ammvVar) {
        this.a = context;
        this.b = twnVar;
        this.c = ammvVar;
    }

    private static int f() {
        return aij.f() ? 33554432 : 0;
    }

    public final PendingIntent a(String str, int i, String str2, twu twuVar, List list, aokw aokwVar, List list2, ucx ucxVar, aohq aohqVar) {
        amkq.F(!list2.isEmpty(), "Collaborator intents should not be empty");
        tzk.e("PendingIntentHelper", "Creating a collaborator pending intent for action [%s] in account [%s]", str2, twuVar != null ? twuVar.b : "null");
        Intent intent = (Intent) amkq.bj(list2);
        if (aij.d()) {
            if (TextUtils.isEmpty(intent.getIdentifier())) {
                int hashCode = str.hashCode();
                StringBuilder sb = new StringBuilder(19);
                sb.append("chime://");
                sb.append(hashCode);
                intent.setIdentifier(sb.toString());
            }
        } else if (intent.getData() == null || intent.getData().equals(Uri.EMPTY)) {
            int hashCode2 = str.hashCode();
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("chime://");
            sb2.append(hashCode2);
            intent.setData(Uri.parse(sb2.toString()));
        }
        tyo.B(intent, twuVar);
        tyo.D(intent, i);
        tyo.C(intent, str2);
        tyo.I(intent, aokwVar);
        tyo.F(intent, ucxVar);
        tyo.G(intent, aohqVar);
        if (list.size() == 1) {
            tyo.H(intent, (txb) list.get(0));
        } else {
            tyo.E(intent, (txb) list.get(0));
        }
        return PendingIntent.getActivities(this.a, tyo.s(str, str2, i), (Intent[]) list2.toArray(new Intent[0]), f() | 134217728);
    }

    public final PendingIntent b(String str, int i, String str2, ubv ubvVar, twu twuVar, List list, aokw aokwVar, ucx ucxVar, twy twyVar, aohq aohqVar, boolean z) {
        ubv ubvVar2;
        tzk.e("PendingIntentHelper", "Creating a notification pending intent for action [%s], handler [%s] and handleInForeground [%s] in account [%s]", str2, ubvVar, Boolean.valueOf(z), twuVar != null ? twuVar.b : "null");
        Intent className = new Intent("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT").setClassName(this.a, this.b.d.i);
        tyo.B(className, twuVar);
        tyo.D(className, i);
        tyo.C(className, str2);
        tyo.I(className, aokwVar);
        tyo.F(className, ucxVar);
        if (twyVar != null) {
            className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION", twyVar.b().toByteArray());
        }
        tyo.G(className, aohqVar);
        if (z) {
            ubvVar2 = ubv.ACTIVITY;
            className.putExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", true);
        } else {
            ubvVar2 = ubvVar;
        }
        if (list.size() == 1) {
            tyo.H(className, (txb) list.get(0));
        } else {
            tyo.E(className, (txb) list.get(0));
        }
        if (ubvVar2 != ubv.ACTIVITY) {
            int t = aobq.t(aokwVar.c);
            if (t != 0 && t == 5) {
                className.addFlags(268435456);
            }
            return PendingIntent.getBroadcast(this.a, tyo.s(str, str2, i), className, f() | 134217728);
        }
        className.setClassName(this.a, this.b.d.h);
        return PendingIntent.getActivity(this.a, tyo.s(str, str2, i), className, f() | 134217728);
    }

    public final PendingIntent d(String str, twu twuVar, List list, ucx ucxVar) {
        ucz b = ((uda) ((amna) this.c).a).b(list);
        if (b.b != 1 || b.a == null) {
            return b(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", aij.d() ? ubv.BROADCAST : ubv.ACTIVITY, twuVar, list, tyo.r(list), ucxVar, null, aohq.CLICKED_IN_SYSTEM_TRAY, !((txb) list.get(0)).d.h.isEmpty());
        }
        return a(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", twuVar, list, tyo.r(list), b.a, ucxVar, aohq.CLICKED_IN_SYSTEM_TRAY);
    }

    public final PendingIntent e(String str, twu twuVar, List list) {
        ubv ubvVar = ubv.BROADCAST;
        aone createBuilder = aokw.a.createBuilder();
        createBuilder.copyOnWrite();
        aokw aokwVar = (aokw) createBuilder.instance;
        aokwVar.f = 2;
        aokwVar.b |= 8;
        createBuilder.copyOnWrite();
        aokw aokwVar2 = (aokw) createBuilder.instance;
        aokwVar2.e = 2;
        aokwVar2.b |= 4;
        return b(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED", ubvVar, twuVar, list, (aokw) createBuilder.build(), null, null, aohq.DISMISSED_IN_SYSTEM_TRAY, false);
    }

    public final PendingIntent c(String str, twu twuVar, txb txbVar, twy twyVar, ucx ucxVar) {
        int i;
        int i2;
        ucz uczVar;
        ubv ubvVar;
        int i3 = twyVar.h;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 != 0) {
            i = i4 != 1 ? i4 != 2 ? i4 != 3 ? 0 : 5 : 4 : 2;
        } else {
            if (twyVar.a.isEmpty()) {
                throw new IllegalStateException("ChimeNotificationAction must have an action id or builtInActionType");
            }
            i = 1;
        }
        String valueOf = String.valueOf(twyVar.a);
        String concat = valueOf.length() != 0 ? "com.google.android.libraries.notifications.ACTION_ID:".concat(valueOf) : new String("com.google.android.libraries.notifications.ACTION_ID:");
        if (i != 1) {
            i2 = i;
            uczVar = new ucz(2, null);
        } else {
            uczVar = ((uda) ((amna) this.c).a).a(twyVar);
            i2 = 1;
        }
        if (uczVar.b != 1 || uczVar.a == null) {
            boolean z = !twyVar.d.isEmpty();
            String a = axsm.a.get().a();
            if (!TextUtils.isEmpty(a)) {
                Iterator it = amnm.c(",").f(a).iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(twyVar.a)) {
                        ubvVar = ubv.ACTIVITY;
                        break;
                    }
                }
            }
            int t = aobq.t(twyVar.e.c);
            if (t == 0 || t != 5 || aij.d()) {
                ubvVar = ubv.BROADCAST;
            } else {
                ubvVar = ubv.ACTIVITY;
            }
            return b(str, i2, concat, ubvVar, twuVar, Arrays.asList(txbVar), twyVar.e, ucxVar, twyVar, aohq.ACTION_CLICK_IN_SYSTEM_TRAY, z);
        }
        return a(str, i2, concat, twuVar, Arrays.asList(txbVar), twyVar.e, uczVar.a, ucxVar, aohq.ACTION_CLICK_IN_SYSTEM_TRAY);
    }
}
