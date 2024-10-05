package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.g;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.i;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import j$.util.Objects;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.AccessControlException;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class otb implements osv {
    public static final Map a = new HashMap();
    protected static final Map b = new HashMap();
    public final f c;
    protected final Context d;
    public final boolean e;
    public ost f;
    public azrw g;
    public aact h;
    public String i;
    protected final int j;
    private final String k;
    private final g l;
    private a m;
    private aaqp n;

    static {
        zga.k("YouTubeAndroidPlayerAPI");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public otb(Context context, String str, f fVar, boolean z, int i) {
        this.d = context;
        this.k = str;
        this.c = fVar;
        this.e = z;
        this.j = i;
        this.l = new g(context, str, fVar);
    }

    public static int l(Exception exc) {
        if (exc instanceof zgw) {
            return 12;
        }
        return ((exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof ysr)) ? 10 : 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int m(Context context, f fVar, int i) {
        return Objects.hash(fVar.a, Integer.valueOf(i), fav.C(context));
    }

    public static void n(final otc otcVar, Handler handler, final Context context, final String str, final String str2, final String str3, final String str4, final boolean z, final int i) {
        handler.post(new Runnable() { // from class: osx
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Not initialized variable reg: 31, insn: 0x026b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r31 I:??[OBJECT, ARRAY]), block:B:37:0x026b */
            /* JADX WARN: Type inference failed for: r1v0, types: [osx] */
            /* JADX WARN: Type inference failed for: r1v1, types: [otc] */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4 */
            @Override // java.lang.Runnable
            public final void run() {
                f fVar;
                Integer valueOf;
                otb otbVar;
                Object obj;
                otc otcVar2;
                Integer num;
                otb otbVar2;
                ?? r1 = this;
                Context context2 = context;
                String str5 = str;
                String str6 = str2;
                String str7 = str3;
                String str8 = str4;
                boolean z2 = z;
                int i2 = i;
                otc otcVar3 = otcVar;
                Map map = otb.a;
                try {
                    try {
                        try {
                            fVar = new f(str6, str7, str5);
                            yjk.f();
                            int m = otb.m(context2, fVar, i2);
                            Map map2 = otb.a;
                            valueOf = Integer.valueOf(m);
                            otbVar = (otb) map2.get(valueOf);
                        } catch (Exception e) {
                            e = e;
                            r1 = otcVar3;
                        }
                        try {
                            if (otbVar == null) {
                                otb otbVar3 = new otb(context2, str8, fVar, z2, i2);
                                yjk.f();
                                if (!otbVar3.e) {
                                    num = valueOf;
                                    otcVar2 = otcVar3;
                                    otbVar2 = otbVar3;
                                    oss M = oue.M();
                                    otbVar2.k(M);
                                    ayaw.j(M.a, a.class);
                                    ayaw.j(M.b, d.class);
                                    ayaw.j(M.c, Context.class);
                                    ayaw.j(M.d, aabx.class);
                                    ayaw.j(M.e, ahbv.class);
                                    ayaw.j(M.f, afqp.class);
                                    ayaw.j(M.g, amrz.class);
                                    ayaw.j(M.h, wni.class);
                                    ayaw.j(M.i, amnv.class);
                                    otbVar2.f = new oue(M.a, new opn(), M.b, new wbs(), M.c, M.d, M.e, M.f, M.g, M.h, M.i, M.j, M.k, M.l, null, null, null, null);
                                } else {
                                    ouv M2 = oun.M();
                                    otbVar3.k(M2);
                                    M2.m = new vzw();
                                    ayaw.j(M2.a, a.class);
                                    ayaw.j(M2.b, d.class);
                                    ayaw.j(M2.c, Context.class);
                                    ayaw.j(M2.d, aabx.class);
                                    ayaw.j(M2.e, ahbv.class);
                                    ayaw.j(M2.f, afqp.class);
                                    ayaw.j(M2.g, amrz.class);
                                    ayaw.j(M2.h, wni.class);
                                    ayaw.j(M2.i, amnv.class);
                                    ayaw.j(M2.m, vzp.class);
                                    otcVar2 = otcVar3;
                                    num = valueOf;
                                    otbVar2 = otbVar3;
                                    otbVar2.f = new oun(M2.a, new opn(), M2.b, new wbs(), M2.m, M2.c, M2.d, M2.e, M2.f, M2.g, M2.h, M2.i, M2.j, M2.k, M2.l, null, null, null, null);
                                }
                                otbVar2.f.B().execute(new zfw(otbVar2.f.q()));
                                otbVar2.f.u().h(otbVar2.f.B(), umy.l, null);
                                final zfu p = otbVar2.f.p();
                                if (!zfu.a) {
                                    p.b.execute(new Runnable() { // from class: zfs
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            try {
                                                zfu.this.a();
                                            } catch (IllegalStateException e2) {
                                                zga.d("GooglePlayProviderInstaller failed.", e2);
                                            }
                                        }
                                    });
                                }
                                if (otbVar2.e) {
                                    final ouw ouwVar = (ouw) otbVar2.f;
                                    ouwVar.getClass();
                                    otbVar2.g = new azrw() { // from class: osz
                                        @Override // defpackage.azrw
                                        public final Object get() {
                                            return ouw.this.O();
                                        }
                                    };
                                    otbVar2.h = ouwVar.R();
                                }
                                otbVar2.f.n().c();
                                afsm z3 = otbVar2.f.z();
                                afsi.a(z3);
                                otbVar2.f.k().g(otbVar2.f.t());
                                z3.b = otbVar2.f.x().a(otbVar2.f.P());
                                z3.g();
                                otbVar2.f.y().c();
                                otbVar2.f.N().c();
                                aqrs E = oba.E(otbVar2.f.F());
                                if (otbVar2.j != 1 && E != null && E.c) {
                                    otbVar2.f.e().a();
                                }
                                otbVar2.f.r().c();
                                otbVar2.j();
                                otbVar2.f.w().a();
                                String num2 = Integer.toString(otb.m(otbVar2.d, otbVar2.c, otbVar2.j));
                                if (!otb.b.containsKey(num2)) {
                                    otb.b.put(num2, otbVar2.f.E());
                                }
                                otb.a.put(num, otbVar2);
                                otbVar = otbVar2;
                            } else {
                                otcVar2 = otcVar3;
                                otbVar.j();
                            }
                            otcVar2.a(otbVar);
                        } catch (Exception e2) {
                            e = e2;
                            r1 = obj;
                            r1.b(e);
                        }
                    } catch (IllegalArgumentException e3) {
                        String message = e3.getMessage();
                        if (message != null) {
                            zga.b(message);
                        }
                        throw e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            }
        });
    }

    @Override // defpackage.osv
    public final com.google.android.apps.youtube.embeddedplayer.service.csi.service.a a() {
        return this.f.c();
    }

    @Override // defpackage.osv
    public final b b() {
        return this.f.f();
    }

    @Override // defpackage.osv
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f c() {
        return this.f.h();
    }

    @Override // defpackage.osv
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g d() {
        return this.f.i();
    }

    @Override // defpackage.osv
    public final c e() {
        return this.f.j();
    }

    @Override // defpackage.osv
    public final ajjz f() {
        return this.f.A();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [wiz, java.lang.Object] */
    @Override // defpackage.osv
    public final void g(String str, aftl aftlVar) {
        azrw azrwVar;
        if (!this.e || (azrwVar = this.g) == null) {
            throw new AccessControlException("Permission denied: unauthorized usage of SignIn API");
        }
        azrwVar.get().n(str, aftlVar);
    }

    @Override // defpackage.osv
    public final ajyw h() {
        return this.f.K();
    }

    @Override // defpackage.osv
    public final ajyw i() {
        return this.f.L();
    }

    public final void j() {
        this.f.B().execute(new Runnable() { // from class: osy
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    otb.this.f.v().a();
                } catch (aasx unused) {
                    alta.B("Failed to retrieve configs on init", new Object[0]);
                }
            }
        });
    }

    public final void k(otv otvVar) {
        String num = Integer.toString(m(this.d, this.c, this.j));
        ahbu a2 = ahbv.a();
        a2.d(new zih() { // from class: osw
            @Override // defpackage.zih
            public final Object a() {
                return otb.this.i;
            }
        });
        a2.b();
        a2.c(true);
        otvVar.j(a2.a());
        i iVar = new i(this.e, this.c);
        afqo afqoVar = new afqo();
        afqoVar.a = iVar;
        afqoVar.b = afqi.ANDROID_EMBEDDED_PLAYER;
        afqoVar.c = new ota(this, 0);
        afqoVar.d = new ota(this, 1);
        otvVar.h(afqoVar.a());
        otvVar.f(acov.a);
        otvVar.d(this.d);
        this.n = new aaqp(this.d, 1);
        aabw aabwVar = new aabw();
        aabwVar.c = army.ANDROID_EMBEDDED_PLAYER;
        aabwVar.d = this.n;
        otvVar.g(aabwVar.a());
        otvVar.l(this.l);
        wnh a3 = wni.a(alvw.a(this.d));
        a3.b(true);
        a3.c(true);
        a3.e(true);
        a3.d(true);
        a3.f(true);
        otvVar.b(a3.a());
        if (this.m == null) {
            this.m = new a(this.c, this.k);
        }
        otvVar.c(this.m);
        otvVar.e((CronetEngine) b.get(num));
        otvVar.i(String.valueOf(num).concat("_partition"));
        f fVar = this.c;
        int hashCode = fVar.a.hashCode();
        int hashCode2 = fVar.c.hashCode();
        StringBuilder sb = new StringBuilder(20);
        sb.append(((hashCode + 527) * 31) + hashCode2);
        sb.append("_ep_prefs");
        otvVar.k(sb.toString());
        Context context = this.d;
        f fVar2 = this.c;
        otvVar.a(new d(new com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c(context, fVar2.c, fVar2.a)));
    }
}
