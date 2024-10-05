package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpe implements adlt, adpf, addb, adln, adlb {
    public static final String a = zga.a("MDX.MdxSessionManagerImpl");
    private final acxd A;
    private final acyc B;
    public final Set b;
    public final Set c;
    public volatile adot d;
    public final axpg e;
    public acsx f;
    public final axpg g;
    public final axpg h;
    public final acun i;
    private final axpg k;
    private final ypa l;
    private final shf m;
    private final axpg n;
    private long o;
    private long p;
    private final axpg q;
    private final adon r;
    private final axpg s;
    private final axpg t;
    private final axpg u;
    private final adak v;
    private final adtv w;
    private final axpg x;
    private final acwv y;
    private final acpz z;
    private int j = 2;
    private final adpd C = new adpd(this);

    public adpe(axpg axpgVar, ypa ypaVar, shf shfVar, axpg axpgVar2, axpg axpgVar3, axpg axpgVar4, axpg axpgVar5, axpg axpgVar6, axpg axpgVar7, axpg axpgVar8, axpg axpgVar9, adak adakVar, adtv adtvVar, axpg axpgVar10, Set set, acwv acwvVar, acpz acpzVar, acun acunVar, acxd acxdVar, acyc acycVar) {
        axpgVar.getClass();
        this.k = axpgVar;
        ypaVar.getClass();
        this.l = ypaVar;
        this.b = new CopyOnWriteArraySet(set);
        this.d = null;
        shfVar.getClass();
        this.m = shfVar;
        this.n = axpgVar2;
        axpgVar3.getClass();
        this.e = axpgVar3;
        axpgVar4.getClass();
        this.q = axpgVar4;
        this.r = new adon(this);
        this.g = axpgVar5;
        this.s = axpgVar6;
        this.h = axpgVar7;
        this.c = Collections.newSetFromMap(new ConcurrentHashMap());
        this.t = axpgVar8;
        this.u = axpgVar9;
        this.v = adakVar;
        this.w = adtvVar;
        this.x = axpgVar10;
        this.y = acwvVar;
        this.z = acpzVar;
        this.i = acunVar;
        this.A = acxdVar;
        this.B = acycVar;
    }

    @Override // defpackage.addb
    public final void b(adcz adczVar, Optional optional) {
        atbi atbiVar;
        adot adotVar = this.d;
        if (adotVar != null) {
            if (adczVar.a) {
                atbiVar = atbi.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
            } else if (!this.w.f()) {
                atbiVar = atbi.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE;
            } else if (!this.w.g(adotVar.aq.i)) {
                atbiVar = atbi.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
            } else {
                atbiVar = atbi.MDX_SESSION_DISCONNECT_REASON_ROUTE_UNSELECTED;
            }
            adotVar.ap = adczVar.b;
            adotVar.aP(atbiVar, optional);
        }
    }

    @Override // defpackage.adlb
    public final void c(adfu adfuVar) {
        adot adotVar = this.d;
        if (adotVar == null) {
            zga.m(a, "no MDx session active, ignoring media transfer.");
        } else {
            adotVar.au(adfuVar);
        }
    }

    @Override // defpackage.adlb
    public final void d() {
        adot adotVar = this.d;
        if (adotVar == null) {
            zga.m(a, "no MDx session active, ignoring media transfer.");
        } else {
            adotVar.J();
        }
    }

    @Override // defpackage.adln
    public final void e(int i) {
        String str;
        adot adotVar = this.d;
        if (adotVar == null) {
            zga.c(a, "Reporting flow event with null session instance, ignore");
            return;
        }
        String str2 = a;
        Object[] objArr = new Object[2];
        switch (i) {
            case 2:
                str = "MDX_CONNECTION_EVENT_TYPE_CONNECTION_INITIATED";
                break;
            case 3:
                str = "MDX_CONNECTION_EVENT_TYPE_DIAL_CONNECTION_STARTED";
                break;
            case 4:
                str = "MDX_CONNECTION_EVENT_TYPE_WAKE_ON_LAN_STARTED";
                break;
            case 5:
                str = "MDX_CONNECTION_EVENT_TYPE_DIAL_RECEIVER_APP_LAUNCHED";
                break;
            case 6:
                str = "MDX_CONNECTION_EVENT_TYPE_CAST_CONNECTION_STARTED";
                break;
            case 7:
                str = "MDX_CONNECTION_EVENT_TYPE_CAST_CONNECTED";
                break;
            case 8:
                str = "MDX_CONNECTION_EVENT_TYPE_CAST_APP_LAUNCHED";
                break;
            case 9:
                str = "MDX_CONNECTION_EVENT_TYPE_HAS_SCREEN_ID";
                break;
            case 10:
                str = "MDX_CONNECTION_EVENT_TYPE_MANUAL_PAIRING_CONNECTION_STARTED";
                break;
            case 11:
                str = "MDX_CONNECTION_EVENT_TYPE_HAS_LOUNGE_TOKEN";
                break;
            case 12:
                str = "MDX_CONNECTION_EVENT_TYPE_CONNECTION_SUCCESSFUL";
                break;
            case 13:
                str = "MDX_CONNECTION_EVENT_TYPE_CONNECTION_UNSUCCESSFUL";
                break;
            case 14:
                str = "MDX_CONNECTION_EVENT_TYPE_USER_DISCONNECTED";
                break;
            case 15:
                str = "MDX_CONNECTION_EVENT_TYPE_RECOVERED_CONNECTION_INITIATED";
                break;
            case 16:
                str = "MDX_CONNECTION_EVENT_TYPE_WAKE_ON_LAN_AWOKEN";
                break;
            default:
                str = "MDX_CONNECTION_EVENT_TYPE_DIAL_SMOOTH_PAIRING_RECEIVER_IS_ONLINE";
                break;
        }
        objArr[0] = str;
        objArr[1] = adotVar.aq.g;
        zga.h(str2, String.format("Logging flow event type: %s, for session: %s", objArr));
        acpx acpxVar = new acpx(i - 1, 9);
        aone createBuilder = ataz.a.createBuilder();
        boolean aj = adotVar.aj();
        createBuilder.copyOnWrite();
        ataz atazVar = (ataz) createBuilder.instance;
        atazVar.b = 1 | atazVar.b;
        atazVar.c = aj;
        boolean aI = adotVar.aI();
        createBuilder.copyOnWrite();
        ataz atazVar2 = (ataz) createBuilder.instance;
        atazVar2.b |= 4;
        atazVar2.e = aI;
        if (i == 13) {
            atbi s = adotVar.s();
            createBuilder.copyOnWrite();
            ataz atazVar3 = (ataz) createBuilder.instance;
            atazVar3.d = s.D;
            atazVar3.b |= 2;
        }
        acpz acpzVar = this.z;
        aone createBuilder2 = aqwx.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqwx aqwxVar = (aqwx) createBuilder2.instance;
        ataz atazVar4 = (ataz) createBuilder.build();
        atazVar4.getClass();
        aqwxVar.g = atazVar4;
        aqwxVar.b |= 16;
        acpxVar.a = (aqwx) createBuilder2.build();
        acpzVar.c(acpxVar, aqxl.FLOW_TYPE_MDX_CONNECTION, adotVar.aq.g);
    }

    @Override // defpackage.adlt
    public final int f() {
        return this.j;
    }

    @Override // defpackage.adlt
    public final adlm g() {
        return this.d;
    }

    @Override // defpackage.adlt
    public final adma h() {
        return ((adpj) this.g.get()).a();
    }

    @Override // defpackage.adlt
    public final void i(adlr adlrVar) {
        Set set = this.b;
        adlrVar.getClass();
        set.add(adlrVar);
    }

    @Override // defpackage.adlt
    public final void j(adls adlsVar) {
        this.c.add(adlsVar);
    }

    @Override // defpackage.adlt
    public final void k(adlr adlrVar) {
        Set set = this.b;
        adlrVar.getClass();
        set.remove(adlrVar);
    }

    @Override // defpackage.adlt
    public final void l(adls adlsVar) {
        this.c.remove(adlsVar);
    }

    @Override // defpackage.adlt
    public final void m() {
        if (this.y.b()) {
            try {
                ((acwr) this.x.get()).b();
            } catch (RuntimeException e) {
                zga.f(a, "Catching the lack of module exception. Please see the detail, b/33246615", e);
            }
        }
        ((adgo) this.u.get()).b();
        ((adpj) this.g.get()).j(this.C);
        ((adpj) this.g.get()).i();
        i((adlr) this.s.get());
        final adoz adozVar = (adoz) this.s.get();
        if (adozVar.d) {
            return;
        }
        adozVar.d = true;
        ynm.i(((adov) adozVar.e.get()).a(), new ynl() { // from class: adow
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                adoz adozVar2 = adoz.this;
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    adlp adlpVar = (adlp) optional.get();
                    if (adlpVar.f.isPresent()) {
                        String.valueOf(String.valueOf(adlpVar.f.get())).length();
                    } else {
                        adlo b = adlpVar.b();
                        b.c(atbi.MDX_SESSION_DISCONNECT_REASON_APP_TERMINATED);
                        adlpVar = b.a();
                        adoo adooVar = (adoo) adozVar2.f.get();
                        int i = adlpVar.i;
                        atbi atbiVar = atbi.MDX_SESSION_DISCONNECT_REASON_APP_TERMINATED;
                        int i2 = adlpVar.h;
                        boolean z = i2 > 0;
                        String str = adlpVar.g;
                        boolean isPresent = adlpVar.a.isPresent();
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[6];
                        int i3 = i - 1;
                        if (i != 0) {
                            objArr[0] = Integer.valueOf(i3);
                            objArr[1] = Integer.valueOf(atbiVar.D);
                            objArr[2] = Integer.valueOf(isPresent ? 1 : 0);
                            objArr[3] = Boolean.valueOf(z);
                            objArr[4] = str;
                            objArr[5] = Integer.valueOf(i2);
                            zga.m(adoo.a, String.format(locale, "mdx session disconnected: sessionType=%d disconnectReason=%d prevState=%d reconnect=%s sessionNonce=%s sessionIndex=%d", objArr));
                            aone createBuilder = atan.a.createBuilder();
                            createBuilder.copyOnWrite();
                            atan atanVar = (atan) createBuilder.instance;
                            atanVar.b |= 128;
                            atanVar.h = false;
                            createBuilder.copyOnWrite();
                            atan atanVar2 = (atan) createBuilder.instance;
                            atanVar2.c = i3;
                            atanVar2.b = 1 | atanVar2.b;
                            createBuilder.copyOnWrite();
                            atan atanVar3 = (atan) createBuilder.instance;
                            atanVar3.i = atbiVar.D;
                            atanVar3.b |= 256;
                            createBuilder.copyOnWrite();
                            atan atanVar4 = (atan) createBuilder.instance;
                            str.getClass();
                            atanVar4.b |= 8192;
                            atanVar4.m = str;
                            createBuilder.copyOnWrite();
                            atan atanVar5 = (atan) createBuilder.instance;
                            atanVar5.b |= 16384;
                            atanVar5.n = i2;
                            createBuilder.copyOnWrite();
                            atan atanVar6 = (atan) createBuilder.instance;
                            atanVar6.b |= 32;
                            atanVar6.f = z;
                            createBuilder.copyOnWrite();
                            atan atanVar7 = (atan) createBuilder.instance;
                            atanVar7.d = adoo.b(isPresent ? 1 : 0) - 1;
                            atanVar7.b = 4 | atanVar7.b;
                            if (adlpVar.a.isPresent()) {
                                adkq adkqVar = (adkq) adlpVar.a.get();
                                long j = adkqVar.a;
                                long j2 = adlpVar.b;
                                createBuilder.copyOnWrite();
                                atan atanVar8 = (atan) createBuilder.instance;
                                atanVar8.b |= 8;
                                atanVar8.e = j - j2;
                                long j3 = adkqVar.a;
                                long j4 = adkqVar.b;
                                createBuilder.copyOnWrite();
                                atan atanVar9 = (atan) createBuilder.instance;
                                atanVar9.b |= 2048;
                                atanVar9.k = j3 - j4;
                            }
                            arpn a2 = arpp.a();
                            a2.copyOnWrite();
                            ((arpp) a2.instance).de((atan) createBuilder.build());
                            adooVar.b.c((arpp) a2.build());
                            ((adov) adozVar2.e.get()).d(adlpVar);
                        } else {
                            throw null;
                        }
                    }
                    ((adpj) adozVar2.g.get()).c(adlpVar);
                }
            }
        });
    }

    @Override // defpackage.adlt
    public final void n() {
        ((acwr) this.x.get()).c();
    }

    @Override // defpackage.adlt
    public final boolean o() {
        return ((adpj) this.g.get()).a().a == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.adfu r12, defpackage.acsx r13, defpackage.acsx r14, j$.util.Optional r15) {
        /*
            r11 = this;
            j$.util.Optional r0 = j$.util.Optional.empty()
            boolean r1 = r15.isPresent()
            r2 = 2
            if (r1 == 0) goto L43
            java.lang.Object r1 = r15.get()
            adlp r1 = (defpackage.adlp) r1
            int r1 = r1.i
            if (r1 == 0) goto L41
            if (r1 != r2) goto L43
            java.lang.Object r1 = r15.get()
            adlp r1 = (defpackage.adlp) r1
            java.lang.String r1 = r1.d
            java.lang.String r3 = defpackage.adcp.f(r12)
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L43
            java.lang.Object r0 = r15.get()
            adlp r0 = (defpackage.adlp) r0
            int r0 = r0.h
            int r0 = r0 + 1
            java.lang.Object r15 = r15.get()
            adlp r15 = (defpackage.adlp) r15
            java.lang.String r15 = r15.g
            j$.util.Optional r15 = j$.util.Optional.of(r15)
            r10 = r15
            goto L54
        L41:
            r12 = 0
            throw r12
        L43:
            java.lang.String r15 = defpackage.adpe.a
            java.lang.String r1 = "Cannot retrieve a matching session info for the resumed SDK session. Proceeding with launching with a new session nonce."
            defpackage.zga.m(r15, r1)
            acxd r15 = r11.A
            atbh r1 = defpackage.atbh.MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_NOT_RECOVERY
            r15.a(r1)
            r15 = 0
            r10 = r0
            r0 = 0
        L54:
            axpg r15 = r11.k
            java.lang.Object r15 = r15.get()
            r3 = r15
            com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory r3 = (com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory) r3
            r4 = r12
            r5 = r11
            r6 = r11
            r7 = r14
            r8 = r13
            r9 = r0
            adot r12 = r3.g(r4, r5, r6, r7, r8, r9, r10)
            r11.d = r12
            if (r0 <= 0) goto L6d
            r2 = 15
        L6d:
            r11.e(r2)
            adle r13 = defpackage.adle.a
            r12.ri(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpe.p(adfu, acsx, acsx, j$.util.Optional):void");
    }

    public final void q() {
        aivv aivvVar;
        boolean z = o() || this.j == 1;
        aivo aivoVar = (aivo) this.q.get();
        adon adonVar = z ? this.r : null;
        if (adonVar != null && (aivvVar = aivoVar.e) != null && aivvVar != adonVar) {
            afsi.b(1, 10, "overriding an existing dismiss plugin");
        }
        aivoVar.e = adonVar;
    }

    @Override // defpackage.addb
    public final void r(adgb adgbVar, adle adleVar) {
        acsx acszVar;
        Optional optional;
        String str = a;
        int i = 0;
        zga.h(str, String.format("connectAndPlay to screen %s", adgbVar.c()));
        ((adgo) this.u.get()).a();
        this.B.d(adgbVar);
        adot adotVar = this.d;
        if (adotVar == null || adotVar.ac() || !adotVar.k().equals(adgbVar)) {
            acsx b = ((acsy) this.e.get()).b(asmn.LATENCY_ACTION_MDX_LAUNCH);
            this.f = b;
            if (this.i.z) {
                acszVar = ((acsy) this.e.get()).b(asmn.LATENCY_ACTION_MDX_CAST);
            } else {
                acszVar = new acsz();
            }
            acsx acsxVar = acszVar;
            adpj adpjVar = (adpj) this.g.get();
            Optional empty = Optional.empty();
            Optional b2 = adpjVar.b(adgbVar);
            if (b2.isPresent()) {
                i = ((adlp) b2.get()).h + 1;
                optional = Optional.of(((adlp) b2.get()).g);
            } else {
                optional = empty;
            }
            adot g = ((MdxSessionFactory) this.k.get()).g(adgbVar, this, this, b, acsxVar, i, optional);
            this.d = g;
            e(i > 0 ? 15 : 2);
            g.ri(adleVar);
            return;
        }
        if (adleVar.g()) {
            zga.h(str, "Already connected, just playing video.");
            adotVar.M(adleVar);
        } else {
            zga.h(str, "Ignore connectAndPlay on a CONNECTED remote control: non playable descriptor.");
        }
    }

    @Override // defpackage.adpf
    public final void a(adlm adlmVar) {
        final adlm adlmVar2;
        final adpe adpeVar;
        atag atagVar;
        long j;
        if (adlmVar != this.d) {
            return;
        }
        int i = this.j;
        int a2 = adlmVar.a();
        if (this.j == a2) {
            return;
        }
        this.j = a2;
        if (a2 == 0) {
            adlmVar2 = adlmVar;
            adpeVar = this;
            String str = a;
            adot adotVar = (adot) adlmVar2;
            String valueOf = String.valueOf(adotVar.k());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("MDX session connecting to ");
            sb.append(valueOf);
            zga.h(str, sb.toString());
            adpeVar.o = adpeVar.m.d();
            adpeVar.v.a = adlmVar2;
            adoo adooVar = (adoo) adpeVar.n.get();
            int i2 = adotVar.aq.i;
            boolean aj = adotVar.aj();
            adlp adlpVar = adotVar.aq;
            String str2 = adlpVar.g;
            int i3 = adlpVar.h;
            atbj atbjVar = adotVar.as;
            String str3 = adoo.a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[6];
            int i4 = i2 - 1;
            if (i2 != 0) {
                objArr[0] = Integer.valueOf(i4);
                objArr[1] = Integer.valueOf(i);
                objArr[2] = Boolean.valueOf(aj);
                objArr[3] = str2;
                objArr[4] = Integer.valueOf(i3);
                objArr[5] = atbjVar;
                zga.h(str3, String.format(locale, "mdx session started: sessionType=%d prevState=%d reconnect=%s sessionNonce=%s sessionIndex=%d sessionSource=%s", objArr));
                aone createBuilder = atas.a.createBuilder();
                boolean aI = adotVar.aI();
                createBuilder.copyOnWrite();
                atas atasVar = (atas) createBuilder.instance;
                atasVar.b |= 16;
                atasVar.g = aI;
                createBuilder.copyOnWrite();
                atas atasVar2 = (atas) createBuilder.instance;
                atasVar2.c = i4;
                atasVar2.b |= 1;
                createBuilder.copyOnWrite();
                atas atasVar3 = (atas) createBuilder.instance;
                atasVar3.d = adoo.b(i) - 1;
                atasVar3.b |= 2;
                createBuilder.copyOnWrite();
                atas atasVar4 = (atas) createBuilder.instance;
                atasVar4.b |= 4;
                atasVar4.e = aj;
                createBuilder.copyOnWrite();
                atas atasVar5 = (atas) createBuilder.instance;
                str2.getClass();
                atasVar5.b |= 256;
                atasVar5.j = str2;
                createBuilder.copyOnWrite();
                atas atasVar6 = (atas) createBuilder.instance;
                atasVar6.b |= 512;
                atasVar6.k = i3;
                createBuilder.copyOnWrite();
                atas atasVar7 = (atas) createBuilder.instance;
                atasVar7.h = atbjVar.k;
                atasVar7.b |= 64;
                if (adotVar.aq.i == 3) {
                    aone c = adoo.c(adotVar);
                    createBuilder.copyOnWrite();
                    atas atasVar8 = (atas) createBuilder.instance;
                    aszt asztVar = (aszt) c.build();
                    asztVar.getClass();
                    atasVar8.f = asztVar;
                    atasVar8.b |= 8;
                }
                atag a3 = adoo.a(adotVar.k());
                if (a3 != null) {
                    createBuilder.copyOnWrite();
                    atas atasVar9 = (atas) createBuilder.instance;
                    atasVar9.i = a3;
                    atasVar9.b |= 128;
                }
                adgb k = adotVar.k();
                if (k instanceof adfy) {
                    aone createBuilder2 = atag.a.createBuilder();
                    Map m = ((adfy) k).m();
                    if (m != null) {
                        String str4 = (String) m.get("brand");
                        if (!TextUtils.isEmpty(str4)) {
                            createBuilder2.copyOnWrite();
                            atag atagVar2 = (atag) createBuilder2.instance;
                            str4.getClass();
                            atagVar2.b |= 4;
                            atagVar2.e = str4;
                        }
                        String str5 = (String) m.get("model");
                        if (!TextUtils.isEmpty(str5)) {
                            createBuilder2.copyOnWrite();
                            atag atagVar3 = (atag) createBuilder2.instance;
                            str5.getClass();
                            atagVar3.b |= 2;
                            atagVar3.d = str5;
                        }
                    }
                    atagVar = (atag) createBuilder2.build();
                } else {
                    atagVar = null;
                }
                if (atagVar != null) {
                    createBuilder.copyOnWrite();
                    atas atasVar10 = (atas) createBuilder.instance;
                    atasVar10.l = atagVar;
                    atasVar10.b |= 1024;
                }
                arpn a4 = arpp.a();
                a4.copyOnWrite();
                ((arpp) a4.instance).dg((atas) createBuilder.build());
                adooVar.b.c((arpp) a4.build());
                ((adlw) adpeVar.t.get()).l(adlmVar2);
                final int i5 = 2;
                new Handler(Looper.getMainLooper()).post(new Runnable(adpeVar) { // from class: adpc
                    public final /* synthetic */ adpe a;

                    {
                        this.a = adpeVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i5;
                        if (i6 == 0) {
                            adpe adpeVar2 = this.a;
                            adlm adlmVar3 = adlmVar2;
                            Iterator it = adpeVar2.b.iterator();
                            while (it.hasNext()) {
                                ((adlr) it.next()).k(adlmVar3);
                            }
                            return;
                        }
                        if (i6 != 1) {
                            adpe adpeVar3 = this.a;
                            adlm adlmVar4 = adlmVar2;
                            Iterator it2 = adpeVar3.b.iterator();
                            while (it2.hasNext()) {
                                ((adlr) it2.next()).l(adlmVar4);
                            }
                            return;
                        }
                        adpe adpeVar4 = this.a;
                        adlm adlmVar5 = adlmVar2;
                        Iterator it3 = adpeVar4.b.iterator();
                        while (it3.hasNext()) {
                            ((adlr) it3.next()).j(adlmVar5);
                        }
                    }
                });
            } else {
                throw null;
            }
        } else if (a2 == 1) {
            adlmVar2 = adlmVar;
            adpeVar = this;
            String str6 = a;
            adot adotVar2 = (adot) adlmVar2;
            String valueOf2 = String.valueOf(adotVar2.k());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
            sb2.append("MDX session connected to ");
            sb2.append(valueOf2);
            zga.h(str6, sb2.toString());
            long d = adpeVar.m.d();
            adpeVar.p = d;
            long j2 = d - adpeVar.o;
            adoo adooVar2 = (adoo) adpeVar.n.get();
            int i6 = adotVar2.aq.i;
            boolean aj2 = adotVar2.aj();
            adlp adlpVar2 = adotVar2.aq;
            String str7 = adlpVar2.g;
            int i7 = adlpVar2.h;
            atbj atbjVar2 = adotVar2.as;
            String str8 = adoo.a;
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[7];
            int i8 = i6 - 1;
            if (i6 != 0) {
                objArr2[0] = Integer.valueOf(i8);
                objArr2[1] = Integer.valueOf(i);
                objArr2[2] = Long.valueOf(j2);
                objArr2[3] = Boolean.valueOf(aj2);
                objArr2[4] = str7;
                objArr2[5] = Integer.valueOf(i7);
                objArr2[6] = atbjVar2;
                zga.h(str8, String.format(locale2, "mdx session connected: sessionType=%d prevState=%d msSinceStart=%d reconnect=%s sessionNonce=%s sessionIndex=%d sessionSource=%s", objArr2));
                aone createBuilder3 = atam.a.createBuilder();
                boolean aI2 = adotVar2.aI();
                createBuilder3.copyOnWrite();
                atam atamVar = (atam) createBuilder3.instance;
                atamVar.b |= 32;
                atamVar.h = aI2;
                createBuilder3.copyOnWrite();
                atam atamVar2 = (atam) createBuilder3.instance;
                atamVar2.c = i8;
                atamVar2.b |= 1;
                createBuilder3.copyOnWrite();
                atam atamVar3 = (atam) createBuilder3.instance;
                atamVar3.d = adoo.b(i) - 1;
                atamVar3.b |= 2;
                createBuilder3.copyOnWrite();
                atam atamVar4 = (atam) createBuilder3.instance;
                atamVar4.b |= 4;
                atamVar4.e = j2;
                createBuilder3.copyOnWrite();
                atam atamVar5 = (atam) createBuilder3.instance;
                atamVar5.b |= 8;
                atamVar5.f = aj2;
                createBuilder3.copyOnWrite();
                atam atamVar6 = (atam) createBuilder3.instance;
                str7.getClass();
                atamVar6.b |= 512;
                atamVar6.k = str7;
                createBuilder3.copyOnWrite();
                atam atamVar7 = (atam) createBuilder3.instance;
                atamVar7.b |= 1024;
                atamVar7.l = i7;
                createBuilder3.copyOnWrite();
                atam atamVar8 = (atam) createBuilder3.instance;
                atamVar8.i = atbjVar2.k;
                atamVar8.b |= 128;
                if (adotVar2.aq.i == 3) {
                    aone c2 = adoo.c(adotVar2);
                    createBuilder3.copyOnWrite();
                    atam atamVar9 = (atam) createBuilder3.instance;
                    aszt asztVar2 = (aszt) c2.build();
                    asztVar2.getClass();
                    atamVar9.g = asztVar2;
                    atamVar9.b |= 16;
                }
                atag a5 = adoo.a(adotVar2.k());
                if (a5 != null) {
                    createBuilder3.copyOnWrite();
                    atam atamVar10 = (atam) createBuilder3.instance;
                    atamVar10.j = a5;
                    atamVar10.b |= 256;
                }
                String rf = adotVar2.rf();
                String rg = adotVar2.rg();
                if (rf != null && rg != null) {
                    aone createBuilder4 = atag.a.createBuilder();
                    createBuilder4.copyOnWrite();
                    atag atagVar4 = (atag) createBuilder4.instance;
                    atagVar4.b |= 4;
                    atagVar4.e = rf;
                    createBuilder4.copyOnWrite();
                    atag atagVar5 = (atag) createBuilder4.instance;
                    atagVar5.b |= 2;
                    atagVar5.d = rg;
                    atag atagVar6 = (atag) createBuilder4.build();
                    createBuilder3.copyOnWrite();
                    atam atamVar11 = (atam) createBuilder3.instance;
                    atagVar6.getClass();
                    atamVar11.m = atagVar6;
                    atamVar11.b |= 2048;
                }
                arpn a6 = arpp.a();
                a6.copyOnWrite();
                ((arpp) a6.instance).dd((atam) createBuilder3.build());
                adooVar2.b.c((arpp) a6.build());
                acsx acsxVar = adpeVar.f;
                if (acsxVar != null) {
                    acsxVar.c("mdx_ls");
                }
                q();
                final int i9 = 1;
                new Handler(Looper.getMainLooper()).post(new Runnable(adpeVar) { // from class: adpc
                    public final /* synthetic */ adpe a;

                    {
                        this.a = adpeVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i62 = i9;
                        if (i62 == 0) {
                            adpe adpeVar2 = this.a;
                            adlm adlmVar3 = adlmVar2;
                            Iterator it = adpeVar2.b.iterator();
                            while (it.hasNext()) {
                                ((adlr) it.next()).k(adlmVar3);
                            }
                            return;
                        }
                        if (i62 != 1) {
                            adpe adpeVar3 = this.a;
                            adlm adlmVar4 = adlmVar2;
                            Iterator it2 = adpeVar3.b.iterator();
                            while (it2.hasNext()) {
                                ((adlr) it2.next()).l(adlmVar4);
                            }
                            return;
                        }
                        adpe adpeVar4 = this.a;
                        adlm adlmVar5 = adlmVar2;
                        Iterator it3 = adpeVar4.b.iterator();
                        while (it3.hasNext()) {
                            ((adlr) it3.next()).j(adlmVar5);
                        }
                    }
                });
                adpeVar.e(12);
            } else {
                throw null;
            }
        } else {
            String str9 = a;
            adot adotVar3 = (adot) adlmVar;
            String valueOf3 = String.valueOf(adotVar3.k());
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 30);
            sb3.append("MDX session disconnected from ");
            sb3.append(valueOf3);
            zga.h(str9, sb3.toString());
            long d2 = this.m.d() - this.o;
            if (i == 1) {
                j = this.m.d() - this.p;
                i = 1;
            } else {
                j = 0;
            }
            adoo adooVar3 = (adoo) this.n.get();
            int i10 = adotVar3.aq.i;
            atbi s = adotVar3.s();
            Integer aO = adotVar3.aO();
            boolean aj3 = adotVar3.aj();
            adlp adlpVar3 = adotVar3.aq;
            String str10 = adlpVar3.g;
            int i11 = adlpVar3.h;
            Locale locale3 = Locale.US;
            Object[] objArr3 = new Object[9];
            int i12 = i10 - 1;
            if (i10 != 0) {
                objArr3[0] = Integer.valueOf(i12);
                objArr3[1] = Integer.valueOf(s.D);
                objArr3[2] = Integer.valueOf(i);
                objArr3[3] = Long.valueOf(d2);
                objArr3[4] = Long.valueOf(j);
                objArr3[5] = aO;
                objArr3[6] = Boolean.valueOf(aj3);
                objArr3[7] = str10;
                objArr3[8] = Integer.valueOf(i11);
                String format = String.format(locale3, "mdx session disconnected: sessionType=%d disconnectReason=%d prevState=%d msSinceStarted=%d msSinceConnected=%d errorCode=%d reconnect=%s sessionNonce=%s sessionIndex=%d", objArr3);
                if (adotVar3.rj()) {
                    zga.m(adoo.a, format);
                } else {
                    zga.h(adoo.a, format);
                }
                aone createBuilder5 = atan.a.createBuilder();
                boolean aI3 = adotVar3.aI();
                createBuilder5.copyOnWrite();
                atan atanVar = (atan) createBuilder5.instance;
                atanVar.b |= 128;
                atanVar.h = aI3;
                createBuilder5.copyOnWrite();
                atan atanVar2 = (atan) createBuilder5.instance;
                atanVar2.c = i12;
                atanVar2.b |= 1;
                createBuilder5.copyOnWrite();
                atan atanVar3 = (atan) createBuilder5.instance;
                atanVar3.i = s.D;
                atanVar3.b |= 256;
                createBuilder5.copyOnWrite();
                atan atanVar4 = (atan) createBuilder5.instance;
                str10.getClass();
                atanVar4.b |= 8192;
                atanVar4.m = str10;
                createBuilder5.copyOnWrite();
                atan atanVar5 = (atan) createBuilder5.instance;
                atanVar5.b |= 16384;
                atanVar5.n = i11;
                if (aO != null) {
                    if (adotVar3.rj()) {
                        String str11 = adoo.a;
                        String valueOf4 = String.valueOf(aO);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 23);
                        sb4.append("status error code set: ");
                        sb4.append(valueOf4);
                        zga.m(str11, sb4.toString());
                    } else {
                        String str12 = adoo.a;
                        String valueOf5 = String.valueOf(aO);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 23);
                        sb5.append("status error code set: ");
                        sb5.append(valueOf5);
                        zga.h(str12, sb5.toString());
                    }
                    int intValue = aO.intValue();
                    createBuilder5.copyOnWrite();
                    atan atanVar6 = (atan) createBuilder5.instance;
                    atanVar6.b |= 512;
                    atanVar6.j = intValue;
                }
                createBuilder5.copyOnWrite();
                atan atanVar7 = (atan) createBuilder5.instance;
                atanVar7.d = adoo.b(i) - 1;
                atanVar7.b |= 4;
                createBuilder5.copyOnWrite();
                atan atanVar8 = (atan) createBuilder5.instance;
                atanVar8.b |= 8;
                atanVar8.e = d2;
                createBuilder5.copyOnWrite();
                atan atanVar9 = (atan) createBuilder5.instance;
                atanVar9.b |= 2048;
                atanVar9.k = j;
                createBuilder5.copyOnWrite();
                atan atanVar10 = (atan) createBuilder5.instance;
                atanVar10.b |= 32;
                atanVar10.f = aj3;
                if (adotVar3.aq.i == 3) {
                    aone c3 = adoo.c(adotVar3);
                    createBuilder5.copyOnWrite();
                    atan atanVar11 = (atan) createBuilder5.instance;
                    aszt asztVar3 = (aszt) c3.build();
                    asztVar3.getClass();
                    atanVar11.g = asztVar3;
                    atanVar11.b |= 64;
                }
                atag a7 = adoo.a(adotVar3.k());
                if (a7 != null) {
                    createBuilder5.copyOnWrite();
                    atan atanVar12 = (atan) createBuilder5.instance;
                    atanVar12.l = a7;
                    atanVar12.b |= 4096;
                }
                arpn a8 = arpp.a();
                a8.copyOnWrite();
                ((arpp) a8.instance).de((atan) createBuilder5.build());
                adooVar3.b.c((arpp) a8.build());
                if (i != 0) {
                    adpeVar = this;
                } else if (atbi.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER.equals(adotVar3.s())) {
                    adpeVar = this;
                    adpeVar.e(14);
                } else {
                    adpeVar = this;
                    adpeVar.e(13);
                }
                adpeVar.v.a = null;
                adlmVar2 = adlmVar;
                ((adlw) adpeVar.t.get()).k(adlmVar2);
                adpeVar.d = null;
                adpeVar.f = null;
                q();
                final int i13 = 0;
                new Handler(Looper.getMainLooper()).post(new Runnable(adpeVar) { // from class: adpc
                    public final /* synthetic */ adpe a;

                    {
                        this.a = adpeVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i62 = i13;
                        if (i62 == 0) {
                            adpe adpeVar2 = this.a;
                            adlm adlmVar3 = adlmVar2;
                            Iterator it = adpeVar2.b.iterator();
                            while (it.hasNext()) {
                                ((adlr) it.next()).k(adlmVar3);
                            }
                            return;
                        }
                        if (i62 != 1) {
                            adpe adpeVar3 = this.a;
                            adlm adlmVar4 = adlmVar2;
                            Iterator it2 = adpeVar3.b.iterator();
                            while (it2.hasNext()) {
                                ((adlr) it2.next()).l(adlmVar4);
                            }
                            return;
                        }
                        adpe adpeVar4 = this.a;
                        adlm adlmVar5 = adlmVar2;
                        Iterator it3 = adpeVar4.b.iterator();
                        while (it3.hasNext()) {
                            ((adlr) it3.next()).j(adlmVar5);
                        }
                    }
                });
            } else {
                throw null;
            }
        }
        adpeVar.l.d(new adlu(adpeVar.d, adlmVar.p()));
        final acyc acycVar = adpeVar.B;
        if (adlmVar.o() == null || adlmVar.o().g == null || adlmVar.k() == null) {
            return;
        }
        ynm.j(acycVar.j.b(new amml() { // from class: acya
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                acyc acycVar2 = acyc.this;
                adlm adlmVar3 = adlmVar2;
                awva awvaVar = (awva) obj;
                adgb k2 = adlmVar3.k();
                String h = k2.h();
                awux awuxVar = awux.a;
                aoot aootVar = awvaVar.c;
                if (aootVar.containsKey(h)) {
                    awuxVar = (awux) aootVar.get(h);
                }
                aone builder = awuxVar.toBuilder();
                builder.copyOnWrite();
                awux awuxVar2 = (awux) builder.instance;
                awuxVar2.b |= 1;
                awuxVar2.c = h;
                String str13 = adlmVar3.o().g;
                awvb awvbVar = awvb.a;
                str13.getClass();
                Map unmodifiableMap = Collections.unmodifiableMap(((awux) builder.instance).e);
                if (unmodifiableMap.containsKey(str13)) {
                    awvbVar = (awvb) unmodifiableMap.get(str13);
                }
                aone builder2 = awvbVar.toBuilder();
                long c4 = acycVar2.b.c();
                builder2.copyOnWrite();
                awvb awvbVar2 = (awvb) builder2.instance;
                int i14 = awvbVar2.b | 4;
                awvbVar2.b = i14;
                awvbVar2.e = c4;
                if (k2 instanceof adfu) {
                    builder2.copyOnWrite();
                    awvb awvbVar3 = (awvb) builder2.instance;
                    awvbVar3.c = 1;
                    awvbVar3.b |= 1;
                } else if (k2 instanceof adfy) {
                    adfy adfyVar = (adfy) k2;
                    if ((i14 & 1) == 0) {
                        if (adfyVar.o()) {
                            builder2.copyOnWrite();
                            awvb awvbVar4 = (awvb) builder2.instance;
                            awvbVar4.c = 3;
                            awvbVar4.b |= 1;
                        } else {
                            builder2.copyOnWrite();
                            awvb awvbVar5 = (awvb) builder2.instance;
                            awvbVar5.c = 2;
                            awvbVar5.b |= 1;
                        }
                    }
                }
                int o = awxr.o(((awvb) builder2.instance).d);
                if (o == 0 || o != 3) {
                    int a9 = adlmVar3.a();
                    if (a9 == 0) {
                        builder2.copyOnWrite();
                        awvb awvbVar6 = (awvb) builder2.instance;
                        awvbVar6.d = 1;
                        awvbVar6.b |= 2;
                    } else if (a9 == 1) {
                        builder2.copyOnWrite();
                        awvb awvbVar7 = (awvb) builder2.instance;
                        awvbVar7.d = 2;
                        awvbVar7.b |= 2;
                    }
                }
                awvb awvbVar8 = (awvb) builder2.build();
                str13.getClass();
                awvbVar8.getClass();
                builder.copyOnWrite();
                ((awux) builder.instance).a().put(str13, awvbVar8);
                aone builder3 = awvaVar.toBuilder();
                builder3.bf(h, (awux) builder.build());
                return (awva) builder3.build();
            }
        }, angq.a), angq.a, abbr.p);
    }
}
