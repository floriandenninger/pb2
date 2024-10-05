package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bqy extends brc implements bpy, bqa {
    private static final ArrayList r;
    private static final ArrayList s;
    protected final Object a;
    protected final Object b;
    protected final Object c;
    protected final Object d;
    protected int m;
    protected boolean n;
    protected boolean o;
    protected final ArrayList p;
    protected final ArrayList q;
    private final brb t;
    private jn u;
    private jm v;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        r = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        s = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public bqy(Context context, brb brbVar) {
        super(context);
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.t = brbVar;
        Object systemService = context.getSystemService("media_router");
        this.a = systemService;
        this.b = q();
        this.c = new bqb(this);
        this.d = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        D();
    }

    protected static final bqx C(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof bqx) {
            return (bqx) tag;
        }
        return null;
    }

    private final void D() {
        z();
        MediaRouter mediaRouter = (MediaRouter) this.a;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z |= E(it.next());
        }
        if (z) {
            x();
        }
    }

    private final boolean E(Object obj) {
        String format;
        if (C(obj) != null || n(obj) >= 0) {
            return false;
        }
        String format2 = r() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(s(obj).hashCode()));
        if (o(format2) >= 0) {
            int i = 2;
            while (true) {
                format = String.format(Locale.US, "%s_%d", format2, Integer.valueOf(i));
                if (o(format) < 0) {
                    break;
                }
                i++;
            }
            format2 = format;
        }
        bqw bqwVar = new bqw(obj, format2);
        A(bqwVar);
        this.p.add(bqwVar);
        return true;
    }

    protected final void A(bqw bqwVar) {
        bot botVar = new bot(bqwVar.b, s(bqwVar.a));
        m(bqwVar, botVar);
        bqwVar.c = botVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B(bqx bqxVar) {
        ((MediaRouter.UserRouteInfo) bqxVar.b).setName(bqxVar.a.d);
        ((MediaRouter.UserRouteInfo) bqxVar.b).setPlaybackType(bqxVar.a.k);
        ((MediaRouter.UserRouteInfo) bqxVar.b).setPlaybackStream(bqxVar.a.l);
        ((MediaRouter.UserRouteInfo) bqxVar.b).setVolume(bqxVar.a.n);
        ((MediaRouter.UserRouteInfo) bqxVar.b).setVolumeMax(bqxVar.a.o);
        ((MediaRouter.UserRouteInfo) bqxVar.b).setVolumeHandling(bqxVar.a.a());
    }

    @Override // defpackage.bpy
    public final void a(Object obj) {
        if (E(obj)) {
            x();
        }
    }

    @Override // defpackage.bpd
    public final bpc b(String str) {
        int o = o(str);
        if (o >= 0) {
            return new bqv(((bqw) this.p.get(o)).a);
        }
        return null;
    }

    @Override // defpackage.bpy
    public final void c(Object obj) {
        int n;
        if (C(obj) != null || (n = n(obj)) < 0) {
            return;
        }
        A((bqw) this.p.get(n));
        x();
    }

    @Override // defpackage.bpd
    public final void d(bov bovVar) {
        boolean z;
        int i = 0;
        if (bovVar != null) {
            List b = bovVar.a().b();
            int size = b.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) b.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                }
                i++;
            }
            z = bovVar.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.m == i && this.n == z) {
            return;
        }
        this.m = i;
        this.n = z;
        D();
    }

    @Override // defpackage.bpy
    public final void e(Object obj) {
        int n;
        if (C(obj) != null || (n = n(obj)) < 0) {
            return;
        }
        this.p.remove(n);
        x();
    }

    @Override // defpackage.bpy
    public final void f(Object obj) {
        int n;
        if (C(obj) != null || (n = n(obj)) < 0) {
            return;
        }
        bqw bqwVar = (bqw) this.p.get(n);
        int v = jm.v(obj);
        if (v != bqwVar.c.f()) {
            bot botVar = new bot(bqwVar.c);
            botVar.k(v);
            bqwVar.c = botVar.a();
            x();
        }
    }

    @Override // defpackage.bpy
    public final void g() {
    }

    @Override // defpackage.bpy
    public final void h(Object obj) {
        bpv b;
        if (obj != jn.d(this.a)) {
            return;
        }
        bqx C = C(obj);
        if (C != null) {
            C.a.g();
            return;
        }
        int n = n(obj);
        if (n >= 0) {
            bqw bqwVar = (bqw) this.p.get(n);
            brb brbVar = this.t;
            String str = bqwVar.b;
            bpp bppVar = (bpp) brbVar;
            bppVar.m.removeMessages(262);
            bpu b2 = bppVar.b(bppVar.c);
            if (b2 == null || (b = b2.b(str)) == null) {
                return;
            }
            b.g();
        }
    }

    @Override // defpackage.bpy
    public final void i() {
    }

    @Override // defpackage.bpy
    public final void j() {
    }

    @Override // defpackage.bqa
    public final void k(Object obj, int i) {
        bqx C = C(obj);
        if (C != null) {
            C.a.e(i);
        }
    }

    @Override // defpackage.bqa
    public final void l(Object obj, int i) {
        bqx C = C(obj);
        if (C != null) {
            C.a.f(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(bqw bqwVar, bot botVar) {
        int supportedTypes = ((MediaRouter.RouteInfo) bqwVar.a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            botVar.c(r);
        }
        if ((supportedTypes & 2) != 0) {
            botVar.c(s);
        }
        botVar.i(((MediaRouter.RouteInfo) bqwVar.a).getPlaybackType());
        botVar.a.putInt("playbackStream", ((MediaRouter.RouteInfo) bqwVar.a).getPlaybackStream());
        botVar.k(jm.v(bqwVar.a));
        botVar.m(((MediaRouter.RouteInfo) bqwVar.a).getVolumeMax());
        botVar.l(((MediaRouter.RouteInfo) bqwVar.a).getVolumeHandling());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int n(Object obj) {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            if (((bqw) this.p.get(i)).a == obj) {
                return i;
            }
        }
        return -1;
    }

    protected final int o(String str) {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            if (((bqw) this.p.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    protected final int p(bpv bpvVar) {
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            if (((bqx) this.q.get(i)).a == bpvVar) {
                return i;
            }
        }
        return -1;
    }

    protected Object q() {
        return new bpz(this);
    }

    protected final String s(Object obj) {
        CharSequence name = ((MediaRouter.RouteInfo) obj).getName(this.e);
        return name != null ? name.toString() : "";
    }

    @Override // defpackage.brc
    public final void t(bpv bpvVar) {
        if (bpvVar.c() != this) {
            MediaRouter.UserRouteInfo createUserRoute = ((MediaRouter) this.a).createUserRoute((MediaRouter.RouteCategory) this.d);
            bqx bqxVar = new bqx(bpvVar, createUserRoute);
            createUserRoute.setTag(bqxVar);
            createUserRoute.setVolumeCallback((MediaRouter.VolumeCallback) this.c);
            B(bqxVar);
            this.q.add(bqxVar);
            ((MediaRouter) this.a).addUserRoute(createUserRoute);
            return;
        }
        int n = n(jn.d(this.a));
        if (n < 0 || !((bqw) this.p.get(n)).b.equals(bpvVar.b)) {
            return;
        }
        bpvVar.g();
    }

    @Override // defpackage.brc
    public final void u(bpv bpvVar) {
        int p;
        if (bpvVar.c() == this || (p = p(bpvVar)) < 0) {
            return;
        }
        B((bqx) this.q.get(p));
    }

    @Override // defpackage.brc
    public final void v(bpv bpvVar) {
        int p;
        if (bpvVar.c() == this || (p = p(bpvVar)) < 0) {
            return;
        }
        bqx bqxVar = (bqx) this.q.remove(p);
        ((MediaRouter.RouteInfo) bqxVar.b).setTag(null);
        ((MediaRouter.UserRouteInfo) bqxVar.b).setVolumeCallback(null);
        ((MediaRouter) this.a).removeUserRoute((MediaRouter.UserRouteInfo) bqxVar.b);
    }

    @Override // defpackage.brc
    public final void w(bpv bpvVar) {
        if (bpvVar.m()) {
            if (bpvVar.c() == this) {
                int o = o(bpvVar.b);
                if (o >= 0) {
                    y(((bqw) this.p.get(o)).a);
                    return;
                }
                return;
            }
            int p = p(bpvVar);
            if (p >= 0) {
                y(((bqx) this.q.get(p)).b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        bpe bpeVar = new bpe();
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            bpeVar.b(((bqw) this.p.get(i)).c);
        }
        jN(bpeVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z() {
        if (this.o) {
            this.o = false;
            jn.c(this.a, this.b);
        }
        int i = this.m;
        if (i != 0) {
            this.o = true;
            ((MediaRouter) this.a).addCallback(i, (MediaRouter.Callback) this.b);
        }
    }

    protected Object r() {
        if (this.v == null) {
            this.v = new jm();
        }
        throw null;
    }

    protected void y(Object obj) {
        if (this.u == null) {
            this.u = new jn(null);
            throw null;
        }
        throw null;
    }
}
