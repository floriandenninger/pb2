package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.VolumeProvider;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpp implements brb, bqr {
    bpt A;
    public bpo B;
    public hn C;
    private bov E;
    final Context a;
    boolean b;
    brc c;
    bqs d;
    boolean e;
    bos f;
    public final boolean n;
    public bpx o;
    public bqf p;
    bpv q;
    public bpv r;
    public bpv s;
    public bpc t;
    bpv u;
    bpc v;
    public bov x;
    public int y;
    public bpq z;
    final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final Map i = new HashMap();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    final bqt l = new bqt();
    private final bpk F = new bpk(this, null);
    final bpl m = new bpl(this);
    final Map w = new HashMap();
    final bpk D = new bpk(this);

    public bpp(Context context) {
        this.a = context;
        this.n = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private final int p(String str) {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (((bpv) this.h.get(i)).c.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean q(bpv bpvVar) {
        return bpvVar.c() == this.c && bpvVar.o("android.media.intent.category.LIVE_AUDIO") && !bpvVar.o("android.media.intent.category.LIVE_VIDEO");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(bpv bpvVar, bou bouVar) {
        int b = bpvVar.b(bouVar);
        if (b != 0) {
            if ((b & 1) != 0) {
                this.m.a(259, bpvVar);
            }
            if ((b & 2) != 0) {
                this.m.a(260, bpvVar);
            }
            if ((b & 4) != 0) {
                this.m.a(261, bpvVar);
            }
        }
        return b;
    }

    public final bpu b(bpd bpdVar) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (((bpu) this.j.get(i)).a == bpdVar) {
                return (bpu) this.j.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bpv c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bpv bpvVar = (bpv) arrayList.get(i);
            if (bpvVar != this.q && q(bpvVar) && bpvVar.l()) {
                return bpvVar;
            }
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bpv d() {
        bpv bpvVar = this.q;
        if (bpvVar != null) {
            return bpvVar;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bpv e() {
        bpv bpvVar = this.s;
        if (bpvVar != null) {
            return bpvVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f(bpu bpuVar, String str) {
        String flattenToShortString = bpuVar.a().flattenToShortString();
        String str2 = flattenToShortString + ":" + str;
        if (p(str2) < 0) {
            this.i.put(new hx(flattenToShortString, str), str2);
            return str2;
        }
        Log.w("MediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
        int i = 2;
        while (true) {
            String format = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
            if (p(format) < 0) {
                this.i.put(new hx(flattenToShortString, str), format);
                return format;
            }
            i++;
        }
    }

    @Override // defpackage.bqr
    public final void g(bpd bpdVar) {
        if (b(bpdVar) == null) {
            bpu bpuVar = new bpu(bpdVar);
            this.j.add(bpuVar);
            this.m.a(513, bpuVar);
            n(bpuVar, bpdVar.j);
            bpdVar.jQ(this.F);
            bpdVar.jO(this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (this.s.k()) {
            List<bpv> d = this.s.d();
            HashSet hashSet = new HashSet();
            Iterator it = d.iterator();
            while (it.hasNext()) {
                hashSet.add(((bpv) it.next()).c);
            }
            Iterator it2 = this.w.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    bpc bpcVar = (bpc) entry.getValue();
                    bpcVar.i(0);
                    bpcVar.a();
                    it2.remove();
                }
            }
            for (bpv bpvVar : d) {
                if (!this.w.containsKey(bpvVar.c)) {
                    bpc jM = bpvVar.c().jM(bpvVar.b, this.s.b);
                    jM.g();
                    this.w.put(bpvVar.c, jM);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(bpp bppVar, bpv bpvVar, bpc bpcVar, int i, bpv bpvVar2, Collection collection) {
        bpq bpqVar;
        bpt bptVar = this.A;
        if (bptVar != null) {
            bptVar.a();
            this.A = null;
        }
        bpt bptVar2 = new bpt(bppVar, bpvVar, bpcVar, i, bpvVar2, collection);
        this.A = bptVar2;
        if (bptVar2.b != 3 || (bpqVar = this.z) == null) {
            bptVar2.b();
            return;
        }
        final bpv bpvVar3 = this.s;
        final bpv bpvVar4 = bptVar2.c;
        final SettableFuture f = SettableFuture.f();
        final qhq qhqVar = (qhq) bpqVar;
        qhqVar.b.post(new Runnable() { // from class: qhp
            @Override // java.lang.Runnable
            public final void run() {
                qfy a;
                rpt rptVar;
                qhq qhqVar2 = qhq.this;
                bpv bpvVar5 = bpvVar3;
                bpv bpvVar6 = bpvVar4;
                SettableFuture settableFuture = f;
                final qhy qhyVar = qhqVar2.a;
                SessionState sessionState = null;
                if (new HashSet(qhyVar.b).isEmpty()) {
                    settableFuture.o(null);
                    return;
                }
                if (bpvVar5.k != 1 || bpvVar6.k != 0) {
                    settableFuture.o(null);
                    return;
                }
                qgw qgwVar = qhyVar.d;
                if (qgwVar == null) {
                    a = null;
                } else {
                    a = qgwVar.a();
                    if (a != null) {
                        a.e = qhyVar;
                    }
                }
                if (a == null) {
                    settableFuture.o(null);
                    return;
                }
                qjk c = a.c();
                if (c == null || !c.m()) {
                    qhyVar.a();
                    settableFuture.o(null);
                    return;
                }
                qhyVar.f = null;
                qhyVar.c = 1;
                qhyVar.e = settableFuture;
                qip.as("Must be called from the main thread.");
                if (c.l()) {
                    MediaStatus e = c.e();
                    qip.an(e);
                    if ((e.h & 262144) == 0) {
                        rpv rpvVar = new rpv();
                        MediaInfo d = c.d();
                        MediaStatus e2 = c.e();
                        if (d != null && e2 != null) {
                            qfg qfgVar = new qfg();
                            qfgVar.a = d;
                            qfgVar.d = c.c();
                            qfgVar.b = e2.v;
                            qfgVar.b(e2.d);
                            qfgVar.e = e2.k;
                            qfgVar.f = e2.o;
                            MediaLoadRequestData a2 = qfgVar.a();
                            qfk qfkVar = new qfk();
                            qfkVar.a = a2;
                            sessionState = new SessionState(qfkVar.a, null);
                        }
                        rpvVar.b(sessionState);
                        rptVar = rpvVar.a;
                    } else {
                        qla qlaVar = c.b;
                        JSONObject jSONObject = new JSONObject();
                        long a3 = qlaVar.a();
                        try {
                            jSONObject.put("requestId", a3);
                            jSONObject.put("type", "STORE_SESSION");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("assistant_supported", true);
                            jSONObject2.put("display_supported", true);
                            jSONObject2.put("is_group", false);
                            jSONObject.put("targetDeviceCapabilities", jSONObject2);
                        } catch (JSONException e3) {
                            qlaVar.a.e(e3, "store session failed to create JSON message", new Object[0]);
                        }
                        try {
                            qlaVar.c(jSONObject.toString(), a3);
                            qlaVar.C.a(a3, new qkx(qlaVar));
                            qlaVar.D = new rpv();
                            rptVar = qlaVar.D.a;
                        } catch (IllegalStateException e4) {
                            rptVar = rqr.b(e4);
                        }
                    }
                } else {
                    rptVar = rqr.b(new qkz());
                }
                rptVar.r(new rpo() { // from class: qhx
                    @Override // defpackage.rpo
                    public final void d(Object obj) {
                        qhy qhyVar2 = qhy.this;
                        SessionState sessionState2 = (SessionState) obj;
                        if (sessionState2 == null) {
                            return;
                        }
                        qhyVar2.f = sessionState2;
                        SettableFuture settableFuture2 = qhyVar2.e;
                        if (settableFuture2 != null) {
                            settableFuture2.o(null);
                        }
                    }
                });
                rptVar.n(new rpl() { // from class: qhw
                    @Override // defpackage.rpl
                    public final void c(Exception exc) {
                        qhy qhyVar2 = qhy.this;
                        qhy.a.e(exc, "Error storing session", new Object[0]);
                        SettableFuture settableFuture2 = qhyVar2.e;
                        if (settableFuture2 != null) {
                            settableFuture2.cancel(false);
                        }
                    }
                });
                qhg.d(andg.CAST_TRANSFER_TO_LOCAL_USED);
            }
        });
        bpt bptVar3 = this.A;
        bpp bppVar2 = (bpp) bptVar3.e.get();
        if (bppVar2 == null || bppVar2.A != bptVar3) {
            Log.w("MediaRouter", "Router is released. Cancel transfer");
            bptVar3.a();
        } else {
            if (bptVar3.f == null) {
                bptVar3.f = f;
                bpr bprVar = new bpr(bptVar3);
                final bpl bplVar = bppVar2.m;
                bplVar.getClass();
                f.d(bprVar, new Executor() { // from class: bps
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        bpl.this.post(runnable);
                    }
                });
                return;
            }
            throw new IllegalStateException("future is already set");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(bpv bpvVar, int i) {
        if (!this.h.contains(bpvVar)) {
            Log.w("MediaRouter", "Ignoring attempt to select removed route: " + bpvVar);
            return;
        }
        if (!bpvVar.g) {
            Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + bpvVar);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            bpd c = bpvVar.c();
            bos bosVar = this.f;
            if (c == bosVar && this.s != bpvVar) {
                String str = bpvVar.b;
                MediaRoute2Info mediaRoute2Info = null;
                if (str != null) {
                    Iterator it = bosVar.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MediaRoute2Info mediaRoute2Info2 = (MediaRoute2Info) it.next();
                        if (TextUtils.equals(mediaRoute2Info2.getId(), str)) {
                            mediaRoute2Info = mediaRoute2Info2;
                            break;
                        }
                    }
                }
                if (mediaRoute2Info == null) {
                    Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
                    return;
                }
                bosVar.a.transferTo(mediaRoute2Info);
                return;
            }
        }
        k(bpvVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(bpv bpvVar, int i) {
        bpf bpfVar;
        if (bpw.a == null || (this.r != null && bpvVar.i())) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 3; i2 < stackTrace.length; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                sb.append(stackTraceElement.getClassName());
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append("  ");
            }
            if (bpw.a == null) {
                Log.w("MediaRouter", "setSelectedRouteInternal is called while sGlobal is null: pkgName=" + this.a.getPackageName() + ", callers=" + sb.toString());
            } else {
                Log.w("MediaRouter", "Default route is selected while a BT route is available: pkgName=" + this.a.getPackageName() + ", callers=" + sb.toString());
            }
        }
        if (this.s == bpvVar) {
            return;
        }
        if (this.u != null) {
            this.u = null;
            bpc bpcVar = this.v;
            if (bpcVar != null) {
                bpcVar.i(3);
                this.v.a();
                this.v = null;
            }
        }
        if (this.e && (bpfVar = bpvVar.a.c) != null && bpfVar.b) {
            boz jL = bpvVar.c().jL(bpvVar.b);
            if (jL != null) {
                Executor h = aih.h(this.a);
                bpk bpkVar = this.D;
                synchronized (jL.j) {
                    if (h == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (bpkVar != null) {
                        jL.k = h;
                        jL.n = bpkVar;
                        Collection collection = jL.m;
                        if (collection != null && !collection.isEmpty()) {
                            bou bouVar = jL.l;
                            Collection collection2 = jL.m;
                            jL.l = null;
                            jL.m = null;
                            jL.k.execute(new bow(jL, bpkVar, bouVar, collection2, 1));
                        }
                    } else {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                }
                this.u = bpvVar;
                this.v = jL;
                jL.g();
                return;
            }
            Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + bpvVar);
        }
        bpc b = bpvVar.c().b(bpvVar.b);
        if (b != null) {
            b.g();
        }
        if (this.s == null) {
            this.s = bpvVar;
            this.t = b;
            this.m.b(262, new hx(null, bpvVar), i);
            return;
        }
        i(this, bpvVar, b, i, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpp.l():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        MediaRouter2.RoutingController routingController;
        bpv bpvVar = this.s;
        if (bpvVar != null) {
            bqt bqtVar = this.l;
            bqtVar.a = bpvVar.n;
            bqtVar.b = bpvVar.o;
            bqtVar.c = bpvVar.a();
            bqt bqtVar2 = this.l;
            bpv bpvVar2 = this.s;
            bqtVar2.d = bpvVar2.l;
            int i = bpvVar2.k;
            if (this.e && bpvVar2.c() == this.f) {
                bqt bqtVar3 = this.l;
                bpc bpcVar = this.t;
                bqtVar3.e = ((bpcVar instanceof boo) && (routingController = ((boo) bpcVar).b) != null) ? routingController.getId() : null;
            } else {
                this.l.e = null;
            }
            if (this.k.size() > 0) {
                throw null;
            }
            if (this.B != null) {
                if (this.s == d() || this.s == this.r) {
                    this.B.a();
                    return;
                }
                bqt bqtVar4 = this.l;
                int i2 = bqtVar4.c == 1 ? 2 : 0;
                bpo bpoVar = this.B;
                int i3 = bqtVar4.b;
                int i4 = bqtVar4.a;
                String str = bqtVar4.e;
                ars arsVar = bpoVar.b;
                if (arsVar == null || i2 != 0 || i3 != 0) {
                    bpoVar.b = new bpn(bpoVar, i2, i3, i4, str);
                    hn hnVar = bpoVar.a;
                    ars arsVar2 = bpoVar.b;
                    if (arsVar2 == null) {
                        throw new IllegalArgumentException("volumeProvider may not be null!");
                    }
                    hnVar.b.n(arsVar2);
                    return;
                }
                arsVar.a = i4;
                arr.a((VolumeProvider) arsVar.a(), i4);
                return;
            }
            return;
        }
        bpo bpoVar2 = this.B;
        if (bpoVar2 != null) {
            bpoVar2.a();
        }
    }

    public final void n(bpu bpuVar, bpf bpfVar) {
        int i;
        boolean z;
        if (bpuVar.c != bpfVar) {
            bpuVar.c = bpfVar;
            if (bpfVar == null || !(bpfVar.b() || bpfVar == this.c.j)) {
                Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + bpfVar);
                i = 0;
                z = false;
            } else {
                List<bou> list = bpfVar.a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                z = false;
                int i2 = 0;
                for (bou bouVar : list) {
                    if (bouVar == null || !bouVar.u()) {
                        Log.w("MediaRouter", "Ignoring invalid system route descriptor: " + bouVar);
                    } else {
                        String n = bouVar.n();
                        int size = bpuVar.b.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                i3 = -1;
                                break;
                            } else if (((bpv) bpuVar.b.get(i3)).b.equals(n)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 < 0) {
                            bpv bpvVar = new bpv(bpuVar, n, f(bpuVar, n));
                            int i4 = i2 + 1;
                            bpuVar.b.add(i2, bpvVar);
                            this.h.add(bpvVar);
                            if (bouVar.q().size() > 0) {
                                arrayList.add(new hx(bpvVar, bouVar));
                            } else {
                                bpvVar.b(bouVar);
                                this.m.a(257, bpvVar);
                            }
                            i2 = i4;
                        } else if (i3 < i2) {
                            Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + bouVar);
                        } else {
                            bpv bpvVar2 = (bpv) bpuVar.b.get(i3);
                            int i5 = i2 + 1;
                            Collections.swap(bpuVar.b, i3, i2);
                            if (bouVar.q().size() > 0) {
                                arrayList2.add(new hx(bpvVar2, bouVar));
                            } else if (a(bpvVar2, bouVar) != 0 && bpvVar2 == this.s) {
                                i2 = i5;
                                z = true;
                            }
                            i2 = i5;
                        }
                    }
                }
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    hx hxVar = (hx) arrayList.get(i6);
                    bpv bpvVar3 = (bpv) hxVar.a;
                    bpvVar3.b((bou) hxVar.b);
                    this.m.a(257, bpvVar3);
                }
                int size3 = arrayList2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    hx hxVar2 = (hx) arrayList2.get(i7);
                    bpv bpvVar4 = (bpv) hxVar2.a;
                    if (a(bpvVar4, (bou) hxVar2.b) != 0 && bpvVar4 == this.s) {
                        z = true;
                    }
                }
                i = i2;
            }
            for (int size4 = bpuVar.b.size() - 1; size4 >= i; size4--) {
                bpv bpvVar5 = (bpv) bpuVar.b.get(size4);
                bpvVar5.b(null);
                this.h.remove(bpvVar5);
            }
            o(z);
            for (int size5 = bpuVar.b.size() - 1; size5 >= i; size5--) {
                this.m.a(258, (bpv) bpuVar.b.remove(size5));
            }
            this.m.a(515, bpuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z) {
        bpv bpvVar = this.q;
        if (bpvVar != null && !bpvVar.l()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing the default route because it is no longer selectable: ");
            sb.append(this.q);
            this.q = null;
        }
        if (this.q == null && !this.h.isEmpty()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                bpv bpvVar2 = (bpv) arrayList.get(i);
                if (bpvVar2.c() == this.c && bpvVar2.b.equals("DEFAULT_ROUTE") && bpvVar2.l()) {
                    this.q = bpvVar2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Found default route: ");
                    sb2.append(this.q);
                    break;
                }
                i++;
            }
        }
        bpv bpvVar3 = this.r;
        if (bpvVar3 != null && !bpvVar3.l()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Clearing the bluetooth route because it is no longer selectable: ");
            sb3.append(this.r);
            this.r = null;
        }
        if (this.r == null && !this.h.isEmpty()) {
            ArrayList arrayList2 = this.h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                bpv bpvVar4 = (bpv) arrayList2.get(i2);
                if (q(bpvVar4) && bpvVar4.l()) {
                    this.r = bpvVar4;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Found bluetooth route: ");
                    sb4.append(this.r);
                    break;
                }
                i2++;
            }
        }
        bpv bpvVar5 = this.s;
        if (bpvVar5 == null || !bpvVar5.g) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unselecting the current route because it is no longer selectable: ");
            sb5.append(this.s);
            k(c(), 0);
            return;
        }
        if (z) {
            h();
            m();
        }
    }
}
