package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubz implements ubr {
    private final Context a;
    private final ammv b;
    private final ubp c;
    private final ubo d;
    private final ubw e;
    private final two f;
    private final Map g;
    private final shf h;
    private final txq i;
    private final tzh j;

    public ubz(Context context, ammv ammvVar, ubp ubpVar, txq txqVar, ubo uboVar, ubw ubwVar, tzh tzhVar, twn twnVar, Map map, shf shfVar) {
        this.a = context;
        this.b = ammvVar;
        this.c = ubpVar;
        this.i = txqVar;
        this.d = uboVar;
        this.e = ubwVar;
        this.j = tzhVar;
        this.f = twnVar.d;
        this.g = map;
        this.h = shfVar;
    }

    private static synchronized void e(Context context, String str, Notification notification) {
        synchronized (ubz.class) {
            eg.a(context).f(str, 0, notification);
            tzk.e("SystemTrayManagerImpl", "Added to tray: tag = %s", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf A[Catch: all -> 0x026e, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0012, B:9:0x002b, B:12:0x002f, B:18:0x0049, B:19:0x004e, B:23:0x0062, B:25:0x006f, B:27:0x0073, B:30:0x0078, B:32:0x007c, B:37:0x0094, B:39:0x009c, B:44:0x00a8, B:46:0x00bf, B:47:0x00c3, B:49:0x00cf, B:52:0x00e1, B:54:0x00eb, B:55:0x00fb, B:57:0x010c, B:58:0x0129, B:59:0x0143, B:61:0x0149, B:79:0x0157, B:64:0x017d, B:69:0x0189, B:77:0x01af, B:82:0x01b0, B:87:0x01d7, B:89:0x01ff, B:92:0x01d3, B:94:0x026d, B:95:0x010f, B:101:0x011e, B:102:0x0121, B:103:0x0124, B:104:0x0127), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf A[Catch: all -> 0x026e, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0012, B:9:0x002b, B:12:0x002f, B:18:0x0049, B:19:0x004e, B:23:0x0062, B:25:0x006f, B:27:0x0073, B:30:0x0078, B:32:0x007c, B:37:0x0094, B:39:0x009c, B:44:0x00a8, B:46:0x00bf, B:47:0x00c3, B:49:0x00cf, B:52:0x00e1, B:54:0x00eb, B:55:0x00fb, B:57:0x010c, B:58:0x0129, B:59:0x0143, B:61:0x0149, B:79:0x0157, B:64:0x017d, B:69:0x0189, B:77:0x01af, B:82:0x01b0, B:87:0x01d7, B:89:0x01ff, B:92:0x01d3, B:94:0x026d, B:95:0x010f, B:101:0x011e, B:102:0x0121, B:103:0x0124, B:104:0x0127), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c A[Catch: all -> 0x026e, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0012, B:9:0x002b, B:12:0x002f, B:18:0x0049, B:19:0x004e, B:23:0x0062, B:25:0x006f, B:27:0x0073, B:30:0x0078, B:32:0x007c, B:37:0x0094, B:39:0x009c, B:44:0x00a8, B:46:0x00bf, B:47:0x00c3, B:49:0x00cf, B:52:0x00e1, B:54:0x00eb, B:55:0x00fb, B:57:0x010c, B:58:0x0129, B:59:0x0143, B:61:0x0149, B:79:0x0157, B:64:0x017d, B:69:0x0189, B:77:0x01af, B:82:0x01b0, B:87:0x01d7, B:89:0x01ff, B:92:0x01d3, B:94:0x026d, B:95:0x010f, B:101:0x011e, B:102:0x0121, B:103:0x0124, B:104:0x0127), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149 A[Catch: all -> 0x026e, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0012, B:9:0x002b, B:12:0x002f, B:18:0x0049, B:19:0x004e, B:23:0x0062, B:25:0x006f, B:27:0x0073, B:30:0x0078, B:32:0x007c, B:37:0x0094, B:39:0x009c, B:44:0x00a8, B:46:0x00bf, B:47:0x00c3, B:49:0x00cf, B:52:0x00e1, B:54:0x00eb, B:55:0x00fb, B:57:0x010c, B:58:0x0129, B:59:0x0143, B:61:0x0149, B:79:0x0157, B:64:0x017d, B:69:0x0189, B:77:0x01af, B:82:0x01b0, B:87:0x01d7, B:89:0x01ff, B:92:0x01d3, B:94:0x026d, B:95:0x010f, B:101:0x011e, B:102:0x0121, B:103:0x0124, B:104:0x0127), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f A[Catch: all -> 0x026e, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0012, B:9:0x002b, B:12:0x002f, B:18:0x0049, B:19:0x004e, B:23:0x0062, B:25:0x006f, B:27:0x0073, B:30:0x0078, B:32:0x007c, B:37:0x0094, B:39:0x009c, B:44:0x00a8, B:46:0x00bf, B:47:0x00c3, B:49:0x00cf, B:52:0x00e1, B:54:0x00eb, B:55:0x00fb, B:57:0x010c, B:58:0x0129, B:59:0x0143, B:61:0x0149, B:79:0x0157, B:64:0x017d, B:69:0x0189, B:77:0x01af, B:82:0x01b0, B:87:0x01d7, B:89:0x01ff, B:92:0x01d3, B:94:0x026d, B:95:0x010f, B:101:0x011e, B:102:0x0121, B:103:0x0124, B:104:0x0127), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void f(defpackage.twu r23, defpackage.txb r24, java.lang.String r25, defpackage.dy r26, boolean r27, boolean r28, defpackage.ucx r29, defpackage.tzg r30) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubz.f(twu, txb, java.lang.String, dy, boolean, boolean, ucx, tzg):void");
    }

    private static synchronized void g(Context context, String str) {
        synchronized (ubz.class) {
            eg.a(context).d(str, 0);
            tzk.e("SystemTrayManagerImpl", "Removed from tray: tag = %s", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h(String str, String str2, twu twuVar, txb txbVar, boolean z, ucx ucxVar) {
        List list;
        boolean equals = "chime_default_group".equals(str2);
        if (!tyo.l() && equals) {
            return false;
        }
        String str3 = twuVar != null ? twuVar.b : null;
        List b = this.i.b(str3, str2);
        if (tyo.l()) {
            list = new ArrayList();
            ArrayList arrayList = new ArrayList();
            amxe it = ((amru) b).iterator();
            while (it.hasNext()) {
                txb txbVar2 = (txb) it.next();
                if (txbVar == null || !txbVar.a.equals(txbVar2.a)) {
                    if (tyo.l()) {
                        for (StatusBarNotification statusBarNotification : ((NotificationManager) this.a.getSystemService(NotificationManager.class)).getActiveNotifications()) {
                            if (statusBarNotification.getId() != 0 || !tyo.t(str3, txbVar2.a).equals(statusBarNotification.getTag())) {
                            }
                        }
                    }
                    arrayList.add(txbVar2.a);
                }
                list.add(txbVar2);
            }
            if (!arrayList.isEmpty()) {
                this.i.d(str3, (String[]) arrayList.toArray(new String[0]));
            }
        } else {
            list = b;
        }
        if (list.isEmpty()) {
            g(this.a, str);
            return false;
        }
        if (equals) {
            int size = list.size();
            if (tyo.l() && size < this.f.k) {
                for (StatusBarNotification statusBarNotification2 : ((NotificationManager) this.a.getSystemService("notification")).getActiveNotifications()) {
                    if (!str.equals(statusBarNotification2.getTag()) || statusBarNotification2.getId() != 0) {
                    }
                }
                tzk.e("SystemTrayManagerImpl", "Skipped creating default summary.", new Object[0]);
                return true;
            }
        }
        dy a = this.c.a(str, twuVar, list, z, ucxVar);
        a.u = true;
        a.t = str;
        e(this.a, str, a.b());
        return true;
    }

    private final synchronized void i(twu twuVar, List list, List list2, tzg tzgVar, aohq aohqVar) {
        if (list.isEmpty()) {
            tzk.e("SystemTrayManagerImpl", "Remove notifications skipped due to empty thread list.", new Object[0]);
            return;
        }
        String str = twuVar != null ? twuVar.b : null;
        String[] strArr = (String[]) list.toArray(new String[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g(this.a, tyo.t(str, (String) it.next()));
        }
        this.i.d(str, strArr);
        HashSet hashSet = new HashSet();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str2 = ((txb) it2.next()).j;
            if (hashSet.add(str2)) {
                h(tyo.u(str, str2), str2, twuVar, null, true, null);
            }
        }
        if (!list2.isEmpty() && axrx.b() && aohqVar != null) {
            tzf a = this.j.a(aoic.REMOVED);
            a.d(twuVar);
            a.c(list2);
            ((tzj) a).w = 2;
            ((tzj) a).t = tzgVar;
            ((tzj) a).j = aohqVar;
            a.i();
        }
        tzk.e("SystemTrayManagerImpl", "Remove notifications completed.", new Object[0]);
    }

    @Override // defpackage.ubr
    public final synchronized List a(twu twuVar, List list, tzg tzgVar, aohq aohqVar) {
        String str;
        List c;
        if (twuVar != null) {
            try {
                str = twuVar.b;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            str = null;
        }
        c = this.i.c(str, (String[]) list.toArray(new String[0]));
        i(twuVar, list, c, tzgVar, aohqVar);
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ubr
    public final synchronized List b(twu twuVar, List list, aohq aohqVar) {
        ArrayList arrayList;
        String str = twuVar.b;
        String[] strArr = new String[list.size()];
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            String str2 = ((aojv) list.get(i)).c;
            strArr[i] = str2;
            hashMap.put(str2, Long.valueOf(((aojv) list.get(i)).d));
        }
        List c = this.i.c(str, strArr);
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        amxe it = ((amru) c).iterator();
        while (it.hasNext()) {
            txb txbVar = (txb) it.next();
            String str3 = txbVar.a;
            if (((Long) hashMap.get(str3)).longValue() > txbVar.b.longValue()) {
                arrayList2.add(str3);
                arrayList.add(txbVar);
            }
        }
        i(twuVar, arrayList2, arrayList, null, aohqVar);
        return arrayList;
    }

    @Override // defpackage.ubr
    public final void c(twu twuVar, txb txbVar, boolean z, boolean z2, twd twdVar, ucx ucxVar, tzg tzgVar) {
        txb txbVar2 = txbVar;
        tzk.e("SystemTrayManagerImpl", "Updating notification", new Object[0]);
        two twoVar = this.f;
        twoVar.getClass();
        if (!twoVar.l || twuVar == null || twuVar.i.longValue() < txbVar2.b.longValue()) {
            String str = twuVar != null ? twuVar.b : null;
            if (!z) {
                List c = this.i.c(str, txbVar2.a);
                if (!c.isEmpty() && ((txb) c.get(0)).b.longValue() >= txbVar2.b.longValue()) {
                    tzf c2 = this.j.c(42);
                    c2.d(twuVar);
                    c2.b(txbVar2);
                    ((tzj) c2).t = tzgVar;
                    c2.i();
                    tzk.e("SystemTrayManagerImpl", "Skipping thread [%s]. Already in system tray.", txbVar2.a);
                    return;
                }
            }
            if (tyo.m(this.a)) {
                String a = this.d.a(txbVar2);
                if (TextUtils.isEmpty(a)) {
                    tzf c3 = this.j.c(35);
                    c3.d(twuVar);
                    c3.b(txbVar2);
                    ((tzj) c3).t = tzgVar;
                    c3.i();
                    tzk.b("SystemTrayManagerImpl", "Skipping thread [%s]. Channel not found error.", txbVar2.a);
                    return;
                }
                if (!this.d.e(a)) {
                    tzf c4 = this.j.c(36);
                    c4.d(twuVar);
                    c4.a(a);
                    c4.b(txbVar2);
                    ((tzj) c4).t = tzgVar;
                    c4.i();
                    tzk.e("SystemTrayManagerImpl", "Skipping thread [%s]. Can't post to channel.", txbVar2.a);
                    return;
                }
            }
            if (eg.a(this.a).g()) {
                String t = tyo.t(str, txbVar2.a);
                long d = this.h.d();
                Pair b = this.c.b(t, twuVar, txbVar, z2, twdVar, ucxVar);
                if (tzgVar != null) {
                    tzgVar.g = Long.valueOf(this.h.d() - d);
                }
                if (b == null) {
                    tzk.e("SystemTrayManagerImpl", "Skipping thread [%s]. No notification builder.", txbVar2.a);
                    return;
                }
                dy dyVar = (dy) b.first;
                Iterator it = ucq.a.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    Map map = this.g;
                    Integer valueOf = Integer.valueOf(intValue);
                    if (map.containsKey(valueOf) && ((ucq) this.g.get(valueOf)).b(twuVar, txbVar2, dyVar, (ammv) b.second, twdVar)) {
                        tzk.e("SystemTrayManagerImpl", "Notification customized by customizer with int key: %d", valueOf);
                        txbVar2 = ((ucq) this.g.get(valueOf)).a(txbVar2);
                    }
                }
                f(twuVar, txbVar2, t, dyVar, z, z2, ucxVar, tzgVar);
                return;
            }
            tzf c5 = this.j.c(7);
            c5.d(twuVar);
            c5.b(txbVar2);
            ((tzj) c5).t = tzgVar;
            c5.i();
            tzk.e("SystemTrayManagerImpl", "Skipping thread [%s]. Notifications from this app are blocked.", txbVar2.a);
            return;
        }
        tzf c6 = this.j.c(52);
        c6.d(twuVar);
        c6.b(txbVar2);
        ((tzj) c6).t = tzgVar;
        c6.i();
        tzk.e("SystemTrayManagerImpl", "Skipping thread [%s]. Created before first registration.", txbVar2.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ubr
    public final synchronized void d(twu twuVar, aohq aohqVar) {
        String str;
        if (twuVar != null) {
            try {
                str = twuVar.b;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            str = null;
        }
        List a = this.i.a(str);
        txq txqVar = this.i;
        uzi b = uzi.b();
        b.c("1");
        txqVar.a.b(str, amru.r(b.a()));
        HashSet hashSet = new HashSet();
        amxe it = ((amru) a).iterator();
        while (it.hasNext()) {
            txb txbVar = (txb) it.next();
            hashSet.add(txbVar.j);
            g(this.a, tyo.t(str, txbVar.a));
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            g(this.a, tyo.u(str, (String) it2.next()));
        }
        if (a.isEmpty() || !axrx.b() || aohqVar == null) {
            return;
        }
        tzf a2 = this.j.a(aoic.REMOVED);
        a2.d(twuVar);
        a2.c(a);
        ((tzj) a2).w = 2;
        ((tzj) a2).j = aohqVar;
        a2.i();
    }
}
