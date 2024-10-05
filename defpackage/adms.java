package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adms extends adot implements adpk {
    public static final String a = zga.a("MDX.CastV3");
    public final MdxSessionFactory b;
    public final acsx c;
    public final acsx d;
    public final acwr e;
    public final String f;
    public final Handler g;
    public final ScheduledExecutorService h;
    public qfy i;
    public qjk j;
    public boolean k;
    public final List l;
    public adfu m;
    public final adkv n;
    private final ypa o;
    private admr p;

    public adms(adfu adfuVar, MdxSessionFactory mdxSessionFactory, Context context, adpf adpfVar, adln adlnVar, zaw zawVar, ypa ypaVar, acsx acsxVar, acsx acsxVar2, int i, Optional optional, acwr acwrVar, acxi acxiVar, Handler handler, acun acunVar, ScheduledExecutorService scheduledExecutorService, atbj atbjVar, adkv adkvVar) {
        super(context, adpfVar, adlnVar, zawVar, acunVar, atbjVar);
        this.l = new ArrayList();
        this.m = adfuVar;
        this.b = mdxSessionFactory;
        ypaVar.getClass();
        this.o = ypaVar;
        acsxVar.getClass();
        this.c = acsxVar;
        acsxVar2.getClass();
        this.d = acsxVar2;
        this.e = acwrVar;
        this.g = handler;
        this.h = scheduledExecutorService;
        this.n = adkvVar;
        this.f = acxiVar.j;
        adlo a2 = adlp.a();
        a2.i(2);
        a2.e(adfuVar.c());
        a2.d(adcp.f(adfuVar));
        a2.f(i);
        if (optional.isPresent()) {
            a2.g((String) optional.get());
        }
        this.aq = a2.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x002b. Please report as an issue. */
    public static atbi ao(int i, atbi atbiVar) {
        if (acxe.a.contains(Integer.valueOf(i))) {
            return atbi.MDX_SESSION_DISCONNECT_REASON_CAST_AUTHENTICATION_FAILURE;
        }
        if (i != 2002) {
            if (i != 2005) {
                if (i != 2152) {
                    if (i != 2271) {
                        if (i != 2473) {
                            if (i != 2450) {
                                if (i != 2451) {
                                    switch (i) {
                                        case 2154:
                                        case 2155:
                                        case 2156:
                                        case 2158:
                                        case 2161:
                                            break;
                                        case 2157:
                                        case 2159:
                                        case 2160:
                                            break;
                                        default:
                                            switch (i) {
                                                case 2251:
                                                case 2253:
                                                    break;
                                                case 2252:
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 2259:
                                                            return atbi.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE;
                                                        case 2260:
                                                        case 2261:
                                                            return atbi.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
                                                        default:
                                                            return atbiVar;
                                                    }
                                            }
                                    }
                                }
                            }
                        }
                        return atbi.MDX_SESSION_DISCONNECT_REASON_CONNECTION_TIMEOUT;
                    }
                    return atbi.MDX_SESSION_DISCONNECT_REASON_NETWORK;
                }
                return atbi.MDX_SESSION_DISCONNECT_REASON_CAST_SDK_CANCELLED;
            }
            return atbi.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED;
        }
        return atbi.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void K() {
        qjk qjkVar = this.j;
        if (qjkVar == null) {
            super.K();
            return;
        }
        qjkVar.f().g(new admp(new admm(this, 1)));
        this.o.d(new acxo());
        this.d.c("mdx_ccs");
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void L() {
        qjk qjkVar = this.j;
        if (qjkVar == null) {
            super.L();
            return;
        }
        qjkVar.g().g(new admp(new admm(this, 0)));
        this.o.d(new acxp());
        this.d.c("mdx_ccp");
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void W(final int i) {
        qoi qoiVar;
        qjk qjkVar = this.j;
        if (qjkVar == null) {
            super.W(i);
            return;
        }
        double d = i / 100.0f;
        qip.as("Must be called from the main thread.");
        if (!qjkVar.l()) {
            qoiVar = qjk.v();
        } else {
            qiz qizVar = new qiz(qjkVar, d);
            qjk.u(qizVar);
            qoiVar = qizVar;
        }
        qoiVar.g(new admp(new Runnable() { // from class: admn
            @Override // java.lang.Runnable
            public final void run() {
                super/*adot*/.W(i);
            }
        }));
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void Z(int i, int i2) {
        W(i);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean ab() {
        adfu adfuVar = this.m;
        return !adfuVar.a.d(1) && adfuVar.a.d(4);
    }

    public final /* synthetic */ anhy an(atbi atbiVar, Optional optional, Boolean bool) {
        if (bool.booleanValue()) {
            return super.q(atbiVar, optional);
        }
        return super.q(atbi.MDX_SESSION_DISCONNECT_REASON_RECEIVER_DEAD_AFTER_RECEIVER_PING, optional);
    }

    public final void as() {
        int i;
        if (!this.an.A || (i = this.al) >= this.am || this.i == null) {
            return;
        }
        this.al = i + 1;
        f().b(this.i);
    }

    @Override // defpackage.adot
    public final void at() {
        qfy qfyVar;
        this.ao.e(6);
        this.c.c("cc_c");
        if (aI() && (qfyVar = this.i) != null && qfyVar.o()) {
            f().b(this.i);
        }
    }

    @Override // defpackage.adot
    public final void au(adfu adfuVar) {
        this.k = false;
        this.m = adfuVar;
        adlo b = this.aq.b();
        b.e(adfuVar.c());
        b.d(adcp.f(this.m));
        this.aq = b.a();
    }

    @Override // defpackage.adpk
    public final void av(final boolean z) {
        this.g.post(new Runnable() { // from class: admo
            @Override // java.lang.Runnable
            public final void run() {
                adms admsVar = adms.this;
                admsVar.e.d(z);
            }
        });
    }

    @Override // defpackage.adot
    public final boolean aw() {
        return false;
    }

    @Override // defpackage.adot
    public final void ax(boolean z) {
    }

    @Override // defpackage.adot, defpackage.adlm
    public final int b() {
        double d;
        qfy qfyVar = this.i;
        if (qfyVar == null || !qfyVar.o()) {
            zga.m(a, "Cast session is either null or not connected.");
            return super.b();
        }
        qfy qfyVar2 = this.i;
        qip.as("Must be called from the main thread.");
        qep qepVar = qfyVar2.c;
        if (qepVar != null) {
            qfe qfeVar = (qfe) qepVar;
            qfeVar.g();
            d = qfeVar.l;
        } else {
            d = 0.0d;
        }
        return (int) (d * 100.0d);
    }

    public final synchronized acwt f() {
        if (this.p == null) {
            this.p = new admr(this);
        }
        return this.p;
    }

    @Override // defpackage.adlm
    public final adgb k() {
        return this.m;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final anhy q(final atbi atbiVar, final Optional optional) {
        if (optional.isPresent() && (atbi.MDX_SESSION_DISCONNECT_REASON_ROUTE_UNSELECTED.equals(atbiVar) || atbi.MDX_SESSION_DISCONNECT_REASON_UNKNOWN.equals(atbiVar))) {
            atbiVar = ao(((Integer) optional.get()).intValue(), atbiVar);
        }
        if (a() != 1 || !this.an.az || !atbi.MDX_SESSION_DISCONNECT_REASON_CAST_SDK_DISCONNECTED.equals(atbiVar)) {
            return super.q(atbiVar, optional);
        }
        return anfq.i(anht.q(aN()), new anfz() { // from class: adml
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                return adms.this.an(atbiVar, optional, (Boolean) obj);
            }
        }, angq.a);
    }
}
