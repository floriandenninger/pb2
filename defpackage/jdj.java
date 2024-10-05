package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jdj implements aaha, ewk, ypd {
    public static final String a = zga.a("MDX.MdxConnectNavigationCommand");
    public final addy b;
    public final Context c;
    public final adeg d;
    public final shf e;
    public final adgv f;
    public final ScheduledExecutorService g;
    public final ci h;
    public final ainy i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public Optional m = Optional.empty();
    private final ypa n;
    private final aahd o;
    private final dd p;
    private final bph q;
    private final gcl r;
    private final adlt s;
    private final anzg t;
    private final amce u;

    public jdj(addy addyVar, Context context, adeg adegVar, shf shfVar, anzg anzgVar, adgv adgvVar, anic anicVar, ypa ypaVar, aahd aahdVar, dd ddVar, bph bphVar, ci ciVar, gcl gclVar, adlt adltVar, ainy ainyVar, amce amceVar, byte[] bArr, byte[] bArr2) {
        this.b = addyVar;
        this.c = context;
        this.d = adegVar;
        this.e = shfVar;
        this.t = anzgVar;
        this.f = adgvVar;
        this.g = anicVar;
        this.n = ypaVar;
        this.o = aahdVar;
        this.p = ddVar;
        this.q = bphVar;
        this.h = ciVar;
        this.r = gclVar;
        this.s = adltVar;
        this.i = ainyVar;
        this.u = amceVar;
    }

    public static Optional b(Optional optional) {
        atbe atbeVar;
        if (optional.isPresent()) {
            atbd atbdVar = ((atcd) optional.get()).c;
            if (atbdVar == null) {
                atbdVar = atbd.a;
            }
            if (atbdVar.b == 1) {
                atbd atbdVar2 = ((atcd) optional.get()).c;
                if (atbdVar2 == null) {
                    atbdVar2 = atbd.a;
                }
                if (atbdVar2.b == 1) {
                    atbeVar = (atbe) atbdVar2.c;
                } else {
                    atbeVar = atbe.a;
                }
                return Optional.of(atbeVar);
            }
        }
        return Optional.empty();
    }

    private final void i(String str, String str2) {
        gcm d = gcq.d();
        d.k(str);
        d.m(amkq.d(str2), new View.OnClickListener() { // from class: jcy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jdj jdjVar = jdj.this;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://support.google.com/youtube/answer/7640706"));
                jdjVar.h.startActivity(intent);
            }
        });
        this.r.j(d.b());
    }

    public final void c(aomf aomfVar, boolean z, Optional optional) {
        if (!this.m.isPresent() || (((atcd) this.m.get()).b & 2) == 0 || Objects.equals(this.i.q(), ((atcd) this.m.get()).d)) {
            d(z, optional);
            return;
        }
        String str = ((atcd) this.m.get()).d;
        this.n.g(this);
        aahd aahdVar = this.o;
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = WatchEndpointOuterClass.watchEndpoint;
        aone createBuilder = awdp.a.createBuilder();
        createBuilder.copyOnWrite();
        awdp awdpVar = (awdp) createBuilder.instance;
        str.getClass();
        awdpVar.b |= 1;
        awdpVar.d = str;
        aongVar.e(aonkVar, (awdp) createBuilder.build());
        aongVar.copyOnWrite();
        apxf apxfVar = (apxf) aongVar.instance;
        aomfVar.getClass();
        apxfVar.b |= 1;
        apxfVar.c = aomfVar;
        aahdVar.a((apxf) aongVar.build());
        this.k = true;
    }

    public final void d(boolean z, Optional optional) {
        if (!z) {
            h();
            return;
        }
        if (this.s.g() != null) {
            return;
        }
        if (!optional.isPresent()) {
            bnq c = adfa.c(this.q, new jdb(this));
            c.qi(this.p, c.getClass().getCanonicalName());
            this.n.g(this);
            this.j = true;
            return;
        }
        bpv bpvVar = (bpv) optional.get();
        String valueOf = String.valueOf(bpvVar.d);
        if (valueOf.length() != 0) {
            "Connecting to route: ".concat(valueOf);
        }
        if (!this.m.isPresent() || (((atcd) this.m.get()).b & 2) == 0) {
            this.b.O(bpvVar);
        } else {
            addy addyVar = this.b;
            adld c2 = adle.c();
            c2.f(((atcd) this.m.get()).d);
            addyVar.M(bpvVar, c2.a());
        }
        this.j = true;
        this.n.g(this);
    }

    public final void e(final jdi jdiVar) {
        anhy O;
        ci ciVar = this.h;
        final Optional b = b(this.m);
        if (b.isPresent()) {
            O = anfq.h(this.u.a, new amml() { // from class: jdc
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    bpv a2;
                    jdj jdjVar = jdj.this;
                    Optional optional = b;
                    Boolean bool = (Boolean) obj;
                    if (bool == null || !bool.booleanValue() || (((atbe) optional.get()).b & 1) == 0 || jdjVar.d.b(((atbe) optional.get()).c, jdjVar.c).size() != 1) {
                        a2 = jdjVar.d.a((atbe) optional.get(), jdjVar.c);
                    } else {
                        a2 = (bpv) jdjVar.d.b(((atbe) optional.get()).c, jdjVar.c).get(0);
                    }
                    return Optional.ofNullable(a2);
                }
            }, this.g);
        } else {
            O = anaf.O(Optional.empty());
        }
        ynm.n(ciVar, O, new zfi() { // from class: jcz
            @Override // defpackage.zfi
            public final void a(Object obj) {
                jdi jdiVar2 = jdi.this;
                String str = jdj.a;
                String valueOf = String.valueOf((Throwable) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("Error thrown while attempting to find an available MDx route: ");
                sb.append(valueOf);
                zga.c(str, sb.toString());
                jdiVar2.a();
            }
        }, new zfi() { // from class: jda
            @Override // defpackage.zfi
            public final void a(Object obj) {
                jdj jdjVar = jdj.this;
                jdi jdiVar2 = jdiVar;
                Optional optional = (Optional) obj;
                if (!jdj.b(jdjVar.m).isPresent() ? jdjVar.d.j().isEmpty() : optional == null || !optional.isPresent()) {
                    jdiVar2.a();
                    return;
                }
                if (optional == null) {
                    optional = Optional.empty();
                }
                jdiVar2.b(optional);
            }
        });
    }

    public final void g() {
        this.j = false;
        this.k = false;
        this.n.m(this);
    }

    public final void h() {
        Optional b = b(this.m);
        if (b.isPresent()) {
            String valueOf = String.valueOf(((atbe) b.get()).c);
            if (valueOf.length() != 0) {
                "Failed to connect to MDx screen: ".concat(valueOf);
            }
            i(this.h.getString(R.string.mdx_connect_navigation_command_cant_connect_message, new Object[]{((atbe) b.get()).c}), this.h.getString(R.string.mdx_connect_navigation_command_cant_connect_get_help_button));
        } else {
            i(this.h.getString(R.string.mdx_connect_navigation_command_no_devices_found_message), this.h.getString(R.string.mdx_connect_navigation_command_no_devices_found_learn_more_button));
        }
        g();
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, Map map) {
        if (!apxfVar.pY(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint)) {
            zga.m(a, "MdxConnectNavigationEndpoint not filled");
            return;
        }
        MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint = (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint) apxfVar.pX(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint);
        if ((mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.b & 2) != 0) {
            atcd atcdVar = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.c;
            if (atcdVar == null) {
                atcdVar = atcd.a;
            }
            this.m = Optional.of(atcdVar);
        }
        atba atbaVar = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.d;
        if (atbaVar == null) {
            atbaVar = atba.a;
        }
        atbj b = atbj.b(atbaVar.b);
        if (b == null) {
            b = atbj.MDX_SESSION_SOURCE_UNKNOWN;
        }
        boolean z = b == atbj.MDX_SESSION_SOURCE_CONTENT_RECOMMENDATION_NOTIFICATION;
        this.l = z;
        if (z) {
            this.t.h();
            this.f.b((atcd) this.m.orElse(null), "LR notification clicked.", atbf.MDX_NOTIFICATION_GEL_ACTION_CLICKED);
        }
        final Instant ofEpochMilli = Instant.ofEpochMilli(this.e.c());
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.H(this);
        } else {
            this.g.execute(new Runnable() { // from class: jdd
                @Override // java.lang.Runnable
                public final void run() {
                    jdj jdjVar = jdj.this;
                    jdjVar.b.H(jdjVar);
                }
            });
        }
        this.g.execute(new Runnable() { // from class: jde
            @Override // java.lang.Runnable
            public final void run() {
                jdj jdjVar = jdj.this;
                jdjVar.e(new jdg(jdjVar, apxfVar, ofEpochMilli));
            }
        });
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adlu.class, ahej.class};
        }
        if (i != 0) {
            if (i == 1) {
                ahej ahejVar = (ahej) obj;
                if (!this.k) {
                    g();
                    return null;
                }
                if (ahejVar.a() != 5 && ahejVar.a() != 2) {
                    return null;
                }
                g();
                this.i.a();
                if (this.l && this.m.isPresent()) {
                    this.f.b((atcd) this.m.get(), "LR notification navigated to watch page.", atbf.MDX_NOTIFICATION_GEL_ACTION_NAVIGATED_TO_WATCH);
                }
                e(new jdh(this));
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        adlu adluVar = (adlu) obj;
        if (!this.j) {
            g();
            return null;
        }
        adlm a2 = adluVar.a();
        if (a2 == null || a2.a() == 2) {
            h();
            return null;
        }
        if (a2.a() != 0 && a2.a() != 1) {
            return null;
        }
        String valueOf = String.valueOf(a2.k().c());
        if (valueOf.length() != 0) {
            "Successfully connected to screen: ".concat(valueOf);
        }
        if (this.l) {
            adgv adgvVar = this.f;
            atcd atcdVar = (atcd) this.m.orElse(null);
            String str = "Connection started from LR notification";
            if (atcdVar != null) {
                String valueOf2 = String.valueOf(atcdVar.d);
                str = "Connection started from LR notification".concat(valueOf2.length() != 0 ? ": videoId=".concat(valueOf2) : new String(": videoId="));
            }
            zga.h(adgv.a, str);
            adgvVar.a(atbf.MDX_NOTIFICATION_GEL_ACTION_CONNECTION_STARTED);
        }
        g();
        return null;
    }
}
