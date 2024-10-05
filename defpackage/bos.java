package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bos extends bpd {
    final MediaRouter2 a;
    final Map b;
    public List c;
    final bpk d;
    private final MediaRouter2.RouteCallback m;
    private final MediaRouter2.TransferCallback n;
    private final MediaRouter2.ControllerCallback o;
    private final Handler p;
    private final Executor q;
    private final Map r;

    public bos(Context context, bpk bpkVar, byte[] bArr, byte[] bArr2) {
        super(context);
        this.b = new ArrayMap();
        this.m = new boq(this);
        this.n = new bor(this);
        this.o = new bol(this);
        this.c = new ArrayList();
        this.r = new ArrayMap();
        this.a = MediaRouter2.getInstance(context);
        this.d = bpkVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.p = handler;
        this.q = new bok(handler, 0);
    }

    @Override // defpackage.bpd
    public final bpc b(String str) {
        return new bop((String) this.r.get(str), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.a.getRoutes()) {
            if (mediaRoute2Info != null && !arraySet.contains(mediaRoute2Info) && !mediaRoute2Info.isSystemRoute()) {
                arraySet.add(mediaRoute2Info);
                arrayList.add(mediaRoute2Info);
            }
        }
        if (arrayList.equals(this.c)) {
            return;
        }
        this.c = arrayList;
        this.r.clear();
        for (MediaRoute2Info mediaRoute2Info2 : this.c) {
            Bundle extras = mediaRoute2Info2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2Info2);
            } else {
                this.r.put(mediaRoute2Info2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (MediaRoute2Info mediaRoute2Info3 : this.c) {
            bou f = jk.f(mediaRoute2Info3);
            if (mediaRoute2Info3 != null) {
                arrayList2.add(f);
            }
        }
        bpe bpeVar = new bpe();
        bpeVar.a = true;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                bpeVar.b((bou) it.next());
            }
        }
        jN(bpeVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(MediaRouter2.RoutingController routingController) {
        boo booVar = (boo) this.b.get(routingController);
        if (booVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        List<String> g = jk.g(selectedRoutes);
        bou f = jk.f(selectedRoutes.get(0));
        Bundle controlHints = routingController.getControlHints();
        String string = this.e.getString(R.string.mr_dialog_default_group_name);
        bou bouVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (true != TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    bouVar = bou.l(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (bouVar == null) {
            bot botVar = new bot(routingController.getId(), string);
            botVar.d(2);
            botVar.i(1);
            botVar.k(routingController.getVolume());
            botVar.m(routingController.getVolumeMax());
            botVar.l(routingController.getVolumeHandling());
            botVar.c(f.p());
            if (!g.isEmpty()) {
                for (String str : g) {
                    if (!TextUtils.isEmpty(str)) {
                        if (botVar.b == null) {
                            botVar.b = new ArrayList();
                        }
                        if (!botVar.b.contains(str)) {
                            botVar.b.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                }
            }
            bouVar = botVar.a();
        }
        List g2 = jk.g(routingController.getSelectableRoutes());
        List g3 = jk.g(routingController.getDeselectableRoutes());
        bpf bpfVar = this.j;
        if (bpfVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<bou> list = bpfVar.a;
        if (!list.isEmpty()) {
            for (bou bouVar2 : list) {
                String n = bouVar2.n();
                box boxVar = new box(bouVar2);
                boxVar.b = true != g.contains(n) ? 1 : 3;
                g2.contains(n);
                g3.contains(n);
                arrayList.add(new boy(boxVar.a, boxVar.b));
            }
        }
        booVar.i = bouVar;
        booVar.k(bouVar, arrayList);
    }

    @Override // defpackage.bpd
    public final boz jL(String str) {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            boo booVar = (boo) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, booVar.a)) {
                return booVar;
            }
        }
        return null;
    }

    @Override // defpackage.bpd
    public final bpc jM(String str, String str2) {
        String id;
        String str3 = (String) this.r.get(str);
        for (boo booVar : this.b.values()) {
            bou bouVar = booVar.i;
            if (bouVar != null) {
                id = bouVar.n();
            } else {
                id = booVar.b.getId();
            }
            if (TextUtils.equals(str2, id)) {
                return new bop(str3, booVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new bop(str3, null);
    }

    @Override // defpackage.bpd
    public final void d(bov bovVar) {
        RouteDiscoveryPreference build;
        char c;
        if (bpw.a == null || bpw.a().y <= 0) {
            this.a.unregisterRouteCallback(this.m);
            this.a.unregisterTransferCallback(this.n);
            this.a.unregisterControllerCallback(this.o);
            return;
        }
        boolean f = bpw.f();
        if (bovVar == null) {
            bovVar = new bov(bph.a, false);
        }
        List b = bovVar.a().b();
        if (f) {
            if (!b.contains("android.media.intent.category.LIVE_AUDIO")) {
                b.add("android.media.intent.category.LIVE_AUDIO");
            }
        } else {
            b.remove("android.media.intent.category.LIVE_AUDIO");
        }
        bpg bpgVar = new bpg();
        bpgVar.b(b);
        bov bovVar2 = new bov(bpgVar.a(), bovVar.b());
        MediaRouter2 mediaRouter2 = this.a;
        Executor executor = this.q;
        MediaRouter2.RouteCallback routeCallback = this.m;
        if (!bovVar2.c()) {
            build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean b2 = bovVar2.b();
            ArrayList arrayList = new ArrayList();
            for (String str : bovVar2.a().b()) {
                int hashCode = str.hashCode();
                if (hashCode == -2065577523) {
                    if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                        c = 2;
                    }
                    c = 65535;
                } else if (hashCode != 956939050) {
                    if (hashCode == 975975375 && str.equals("android.media.intent.category.LIVE_VIDEO")) {
                        c = 1;
                    }
                    c = 65535;
                } else {
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        c = 0;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    str = "android.media.route.feature.LIVE_AUDIO";
                } else if (c == 1) {
                    str = "android.media.route.feature.LIVE_VIDEO";
                } else if (c == 2) {
                    str = "android.media.route.feature.REMOTE_PLAYBACK";
                }
                arrayList.add(str);
            }
            build = new RouteDiscoveryPreference.Builder(arrayList, b2).build();
        }
        mediaRouter2.registerRouteCallback(executor, routeCallback, build);
        this.a.registerTransferCallback(this.q, this.n);
        this.a.registerControllerCallback(this.q, this.o);
    }
}
