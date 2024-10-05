package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ftm implements View.OnClickListener, fwc, ajmt, ypd {
    public static final Set a = Collections.emptySet();
    private final fto A;
    private final aaea B;
    private final Random C;
    private AlertDialog D;
    private Map E;
    private final aoae F;
    boolean b;
    public final zaw c;
    public final fvd d;
    public final Set e = Collections.newSetFromMap(new WeakHashMap());
    public final akbu f;
    auzj g;
    AlertDialog h;
    public acra i;
    boolean j;
    boolean k;
    boolean l;
    ayqx m;
    boolean n;
    private final ci o;
    private final afsy p;
    private final aftn q;
    private final aahd r;
    private final ypa s;
    private final TextView t;
    private final fwe u;
    private final ysy v;
    private final zbi w;
    private final ajmu x;
    private final aahv y;
    private final fto z;

    public ftm(ci ciVar, afsy afsyVar, aftn aftnVar, zaw zawVar, aahd aahdVar, akbu akbuVar, ypa ypaVar, fwe fweVar, ysy ysyVar, zbi zbiVar, aoae aoaeVar, ajmu ajmuVar, aahv aahvVar, aaea aaeaVar, TextView textView, fvd fvdVar, byte[] bArr) {
        this.t = textView;
        this.o = ciVar;
        this.p = afsyVar;
        this.q = aftnVar;
        this.c = zawVar;
        this.r = aahdVar;
        this.f = akbuVar;
        this.s = ypaVar;
        this.d = fvdVar;
        this.u = fweVar;
        this.v = ysyVar;
        this.w = zbiVar;
        this.F = aoaeVar;
        this.x = ajmuVar;
        this.y = aahvVar;
        this.B = aaeaVar;
        textView.setOnClickListener(this);
        this.z = new fto(textView, true);
        this.A = new fto(textView, false);
        this.C = new Random();
    }

    private final apxf p() {
        auzn auznVar = this.g.q;
        if (auznVar == null) {
            auznVar = auzn.a;
        }
        auzm auzmVar = auznVar.d;
        if (auzmVar == null) {
            auzmVar = auzm.a;
        }
        if ((auzmVar.b & 1) == 0) {
            return null;
        }
        auzn auznVar2 = this.g.q;
        if (auznVar2 == null) {
            auznVar2 = auzn.a;
        }
        auzm auzmVar2 = auznVar2.d;
        if (auzmVar2 == null) {
            auzmVar2 = auzm.a;
        }
        apxf apxfVar = auzmVar2.c;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    private final String q() {
        auzo auzoVar;
        if (!u()) {
            return null;
        }
        auzg auzgVar = this.g.u;
        if (auzgVar == null) {
            auzgVar = auzg.a;
        }
        if (auzgVar.b == 136390057) {
            auzoVar = (auzo) auzgVar.c;
        } else {
            auzoVar = auzo.a;
        }
        return auzoVar.b;
    }

    private final void r() {
        boolean booleanValue = b().booleanValue();
        this.k = booleanValue;
        this.j = booleanValue;
    }

    private final void s() {
        fvd fvdVar = this.d;
        if (fvdVar == null) {
            return;
        }
        fvdVar.g(this.g, this.i);
        if (!t() || !b().booleanValue() || this.b) {
            this.d.f();
            return;
        }
        fvd fvdVar2 = this.d;
        ftw ftwVar = fvdVar2.b;
        if (ftwVar != null) {
            ftwVar.d();
        }
        fve fveVar = fvdVar2.c;
        if (fveVar != null) {
            fveVar.c();
        }
        fvl fvlVar = fvdVar2.d;
        if (fvlVar != null && fvlVar.c != null) {
            fvlVar.b.setVisibility(0);
        }
        View a2 = fvdVar2.a();
        if (a2 != null) {
            fvdVar2.a.setVisibility(a2.getVisibility());
        } else {
            fvdVar2.a.setVisibility(8);
        }
    }

    private final boolean t() {
        auzj auzjVar = this.g;
        if (auzjVar == null) {
            return false;
        }
        if (auzjVar.n) {
            return true;
        }
        if (b().booleanValue()) {
            if (fkc.n(this.g) == null) {
                return false;
            }
        } else if ((this.g.b & 65536) == 0) {
            return false;
        }
        return true;
    }

    private final boolean u() {
        auzo auzoVar;
        auzj auzjVar = this.g;
        if (auzjVar == null) {
            return false;
        }
        auzg auzgVar = auzjVar.u;
        if (auzgVar == null) {
            auzgVar = auzg.a;
        }
        if (auzgVar.b == 136390057) {
            auzoVar = (auzo) auzgVar.c;
        } else {
            auzoVar = auzo.a;
        }
        return !auzoVar.b.isEmpty();
    }

    private final boolean v() {
        return (this.n || this.g.m.isEmpty()) ? false : true;
    }

    final Boolean b() {
        if (this.g == null) {
            throw new IllegalStateException("Active model not set on the server.");
        }
        if (v()) {
            return Boolean.valueOf(this.l);
        }
        return Boolean.valueOf(this.g.l);
    }

    public final void c(ftl ftlVar) {
        this.e.add(ftlVar);
    }

    public final void d() {
        this.s.m(this);
        this.x.e(this);
        this.u.c.remove(new fwd(this, 0L));
        Object obj = this.m;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.m = null;
        }
        fvd fvdVar = this.d;
        if (fvdVar != null) {
            fvdVar.g(null, null);
        }
        AlertDialog alertDialog = this.h;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.h = null;
        }
        AlertDialog alertDialog2 = this.D;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
            this.D = null;
        }
        this.i = null;
        this.E = null;
        this.b = false;
        this.l = false;
        this.j = false;
        this.k = false;
        this.g = null;
        this.n = false;
        this.t.setVisibility(8);
    }

    public final void e() {
        arej arejVar;
        if (!t() || this.b || b().booleanValue()) {
            return;
        }
        arel arelVar = this.g.t;
        if (arelVar == null) {
            arelVar = arel.a;
        }
        if (arelVar.b == 102716411) {
            akbu akbuVar = this.f;
            arel arelVar2 = this.g.t;
            if (arelVar2 == null) {
                arelVar2 = arel.a;
            }
            if (arelVar2.b == 102716411) {
                arejVar = (arej) arelVar2.c;
            } else {
                arejVar = arej.a;
            }
            akbuVar.b(arejVar, this.t, this.g, this.i);
        }
    }

    @Override // defpackage.fwc
    public final void g(String str) {
        if (TextUtils.isEmpty(str) || !str.equals(q())) {
            return;
        }
        e();
    }

    public final void h(auzj auzjVar, boolean z, boolean z2) {
        fvx fvxVar = new fvx(z, new ftk(this, auzjVar, z2));
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", fvxVar);
        acra acraVar = this.i;
        if (acraVar != null) {
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", acraVar);
        }
        Map map = this.E;
        if (map != null) {
            hashMap.putAll(map);
        }
        aahd aahdVar = this.r;
        List list = null;
        if (!z2) {
            if (auzjVar.A.size() <= 0) {
                Iterator it = auzjVar.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    apxf apxfVar = (apxf) it.next();
                    if (apxfVar.pY(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)) {
                        list = amru.r(apxfVar);
                        break;
                    }
                }
            } else {
                list = auzjVar.A;
            }
        } else if (auzjVar.z.size() <= 0) {
            Iterator it2 = auzjVar.x.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                apxf apxfVar2 = (apxf) it2.next();
                if (apxfVar2.pY(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint)) {
                    list = amru.r(apxfVar2);
                    break;
                }
            }
        } else {
            list = auzjVar.z;
        }
        aahdVar.d(list, hashMap);
    }

    public final void i(auzj auzjVar, acra acraVar) {
        j(auzjVar, acraVar, null);
    }

    public final void j(auzj auzjVar, acra acraVar, Map map) {
        auzo auzoVar;
        String str;
        acra acraVar2;
        d();
        if (auzjVar == null) {
            return;
        }
        this.g = auzjVar;
        this.i = acraVar;
        this.E = map;
        if (v()) {
            String str2 = this.g.m;
            aahu c = this.y.c();
            this.m = c.h(str2, false).ab(ayqr.a()).C(new ggc(1)).ax(new ayrs() { // from class: fti
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ftm ftmVar = ftm.this;
                    aakz aakzVar = (aakz) obj;
                    if (aakzVar.e == aaky.CLEAR_ON_SIGN_OUT) {
                        String str3 = aakzVar.a;
                        return;
                    }
                    avap avapVar = (avap) aakzVar.c;
                    if (avapVar == null) {
                        ftmVar.n = true;
                    } else {
                        ftmVar.l = avapVar.getSubscribed().booleanValue();
                        ftmVar.m();
                    }
                }
            });
            avap avapVar = (avap) c.f(str2).g(avap.class).X();
            if (avapVar == null) {
                this.n = true;
                ayrz.c((AtomicReference) this.m);
                this.m = null;
                r();
                m();
            } else {
                this.l = avapVar.getSubscribed().booleanValue();
                m();
                r();
            }
        } else {
            r();
            m();
        }
        if (t()) {
            auzj auzjVar2 = this.g;
            if (auzjVar2 != null && (acraVar2 = this.i) != null) {
                acraVar2.u(new acqx(auzjVar2.D), null);
            }
            auzj auzjVar3 = this.g;
            if (auzjVar3 != null) {
                arel arelVar = auzjVar3.t;
                if (arelVar == null) {
                    arelVar = arel.a;
                }
                if (arelVar.b == 102716411) {
                    if ((this.g.b & 1048576) == 0) {
                        e();
                    } else if (u()) {
                        fwe fweVar = this.u;
                        String q = q();
                        auzg auzgVar = this.g.u;
                        if (auzgVar == null) {
                            auzgVar = auzg.a;
                        }
                        if (auzgVar.b == 136390057) {
                            auzoVar = (auzo) auzgVar.c;
                        } else {
                            auzoVar = auzo.a;
                        }
                        long j = auzoVar.c;
                        if (!TextUtils.isEmpty(q) && j >= 0 && ((str = fweVar.g) == null || str.equals(q))) {
                            fwd fwdVar = new fwd(this, j);
                            fweVar.c.remove(fwdVar);
                            if (!q.equals(fweVar.d)) {
                                fweVar.d();
                            }
                            fweVar.d = q;
                            if (fweVar.c() < j || !fweVar.h()) {
                                fweVar.c.offer(fwdVar);
                                fweVar.f();
                            } else {
                                g(q);
                            }
                        }
                    }
                }
            }
            this.s.g(this);
            if (!auzjVar.f.isEmpty()) {
                Uri a2 = ipl.a(auzjVar.f);
                ipl iplVar = (ipl) this.x.b(a2);
                ipl a3 = ipl.b(auzjVar).a();
                long j2 = auzjVar.G;
                if (j2 > 0) {
                    if (iplVar == null || iplVar.d < j2) {
                        this.x.c(a2, a3);
                        this.x.h(a2, this);
                    } else {
                        this.x.h(a2, this);
                        this.x.c(a2, a3);
                    }
                } else if (iplVar == null || iplVar.e <= auzjVar.F) {
                    this.x.c(a2, a3);
                    this.x.h(a2, this);
                } else {
                    this.x.h(a2, this);
                    this.x.c(a2, a3);
                }
            }
        }
        this.F.c(auzjVar, this.t);
    }

    public final void k(int i) {
        this.z.a = i;
        this.A.a = i;
    }

    @Override // defpackage.ajmt
    public final void kB(Uri uri, Uri uri2) {
        ajms b = this.x.b(uri);
        if (b instanceof ipl) {
            ipl iplVar = (ipl) b;
            auzj auzjVar = this.g;
            if ((auzjVar.b & 1) == 0 || !auzjVar.f.equals(iplVar.c)) {
                return;
            }
            aone builder = this.g.toBuilder();
            long j = iplVar.e;
            builder.copyOnWrite();
            auzj auzjVar2 = (auzj) builder.instance;
            auzjVar2.c |= 2;
            auzjVar2.F = j;
            Boolean bool = iplVar.h;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                builder.copyOnWrite();
                auzj auzjVar3 = (auzj) builder.instance;
                auzjVar3.b |= 1024;
                auzjVar3.l = booleanValue;
            }
            apmp c = fvd.c(this.g);
            apmp apmpVar = iplVar.k;
            avae e = fvd.e(this.g);
            avae avaeVar = iplVar.j;
            avaa d = fvd.d(this.g);
            avaa avaaVar = iplVar.i;
            if (c != null && apmpVar != null) {
                aone createBuilder = apmh.a.createBuilder();
                createBuilder.copyOnWrite();
                apmh apmhVar = (apmh) createBuilder.instance;
                apmhVar.d = apmpVar;
                apmhVar.b |= 2;
                apmh apmhVar2 = (apmh) createBuilder.build();
                builder.copyOnWrite();
                auzj auzjVar4 = (auzj) builder.instance;
                apmhVar2.getClass();
                auzjVar4.o = apmhVar2;
                auzjVar4.b |= 8192;
            } else if (e != null && avaeVar != null) {
                aone createBuilder2 = auzh.a.createBuilder();
                createBuilder2.copyOnWrite();
                auzh auzhVar = (auzh) createBuilder2.instance;
                auzhVar.c = avaeVar;
                auzhVar.b = 119226798;
                auzh auzhVar2 = (auzh) createBuilder2.build();
                builder.copyOnWrite();
                auzj auzjVar5 = (auzj) builder.instance;
                auzhVar2.getClass();
                auzjVar5.p = auzhVar2;
                auzjVar5.b |= 16384;
            } else if (d != null && avaaVar != null) {
                aone createBuilder3 = auzh.a.createBuilder();
                createBuilder3.copyOnWrite();
                auzh auzhVar3 = (auzh) createBuilder3.instance;
                auzhVar3.c = avaaVar;
                auzhVar3.b = 136076983;
                auzh auzhVar4 = (auzh) createBuilder3.build();
                builder.copyOnWrite();
                auzj auzjVar6 = (auzj) builder.instance;
                auzhVar4.getClass();
                auzjVar6.p = auzhVar4;
                auzjVar6.b |= 16384;
            }
            this.g = (auzj) builder.build();
            if (v()) {
                s();
            } else {
                m();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ypd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] kz(java.lang.Class r3, java.lang.Object r4, int r5) {
        /*
            r2 = this;
            r3 = -1
            r0 = 0
            if (r5 == r3) goto L63
            if (r5 != 0) goto L4a
            com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction r4 = (com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction) r4
            java.lang.String r3 = r4.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L6b
            auzj r3 = r2.g
            if (r3 == 0) goto L3b
            auzg r3 = r3.u
            if (r3 != 0) goto L1a
            auzg r3 = defpackage.auzg.a
        L1a:
            int r3 = r3.b
            r5 = 136390057(0x82125a9, float:4.8493444E-34)
            if (r3 != r5) goto L3b
            auzj r3 = r2.g
            auzg r3 = r3.u
            if (r3 != 0) goto L29
            auzg r3 = defpackage.auzg.a
        L29:
            int r1 = r3.b
            if (r1 != r5) goto L32
            java.lang.Object r3 = r3.c
            auzo r3 = (defpackage.auzo) r3
            goto L34
        L32:
            auzo r3 = defpackage.auzo.a
        L34:
            aony r3 = r3.d
            amsx r3 = defpackage.amsx.p(r3)
            goto L3d
        L3b:
            java.util.Set r3 = defpackage.ftm.a
        L3d:
            java.lang.String r4 = r4.b
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L46
            goto L6b
        L46:
            r2.e()
            return r0
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r0 = 32
            r4.<init>(r0)
            java.lang.String r0 = "unsupported op code: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L63:
            r3 = 1
            java.lang.Class[] r0 = new java.lang.Class[r3]
            r3 = 0
            java.lang.Class<com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction> r4 = com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class
            r0[r3] = r4
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftm.kz(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }

    public final void l(auzj auzjVar, boolean z) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        if (o(auzjVar)) {
            boolean booleanValue = b().booleanValue();
            aqyg aqygVar4 = null;
            if (booleanValue) {
                if (fkc.n(this.g) != null) {
                    atta n = fkc.n(this.g);
                    AlertDialog alertDialog = this.h;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.o);
                    if ((n.b & 1) != 0) {
                        aqygVar = n.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    AlertDialog.Builder title = builder.setTitle(ajcq.b(aqygVar));
                    if ((n.b & 2) != 0) {
                        aqygVar2 = n.d;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    AlertDialog.Builder message = title.setMessage(ajcq.b(aqygVar2));
                    if ((n.b & 4) != 0) {
                        aqygVar3 = n.e;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                    } else {
                        aqygVar3 = null;
                    }
                    this.h = message.setNegativeButton(ajcq.b(aqygVar3), (DialogInterface.OnClickListener) null).create();
                    if (n.f) {
                        final auzj auzjVar2 = this.g;
                        AlertDialog alertDialog2 = this.h;
                        if ((n.b & 16) != 0 && (aqygVar4 = n.g) == null) {
                            aqygVar4 = aqyg.a;
                        }
                        alertDialog2.setButton(-1, ajcq.b(aqygVar4), new DialogInterface.OnClickListener() { // from class: fth
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ftm.this.h(auzjVar2, false, false);
                            }
                        });
                    }
                    this.h.show();
                    return;
                }
            } else if ((this.g.b & 65536) != 0) {
                if (p() != null) {
                    this.r.c(p(), null);
                    return;
                }
                auzn auznVar = this.g.q;
                if (auznVar == null) {
                    auznVar = auzn.a;
                }
                if ((auznVar.b & 4) != 0) {
                    auzn auznVar2 = this.g.q;
                    if (auznVar2 == null) {
                        auznVar2 = auzn.a;
                    }
                    aqkv aqkvVar = auznVar2.c;
                    if (aqkvVar == null) {
                        aqkvVar = aqkv.a;
                    }
                    if (this.D == null) {
                        this.D = new AlertDialog.Builder(this.o).setPositiveButton(this.o.getResources().getString(R.string.ok), (DialogInterface.OnClickListener) null).create();
                    }
                    this.D.setTitle(aqkvVar.d);
                    this.D.setMessage(aqkvVar.e);
                    this.D.show();
                }
            }
            auzj auzjVar3 = this.g;
            if (auzjVar3.n) {
                h(auzjVar3, z, !booleanValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        if (this.g == null) {
            return;
        }
        n(b().booleanValue());
    }

    public final void n(boolean z) {
        if (this.g != null) {
            boolean z2 = b().booleanValue() != z;
            this.b = z2;
            auzj auzjVar = this.g;
            if (auzjVar != null && this.i != null && !z2) {
                int i = auzjVar.b;
                if ((i & 1) == 0 || (i & 536870912) == 0) {
                    zga.b("SubscribeButtonRenderer must have valid channel id and tracking params");
                } else {
                    auzu auzuVar = this.B.a().q;
                    if (auzuVar == null) {
                        auzuVar = auzu.a;
                    }
                    if (this.C.nextFloat() < auzuVar.b) {
                        aone createBuilder = asht.a.createBuilder();
                        aone createBuilder2 = asin.a.createBuilder();
                        boolean booleanValue = b().booleanValue();
                        createBuilder2.copyOnWrite();
                        asin asinVar = (asin) createBuilder2.instance;
                        asinVar.b |= 2;
                        asinVar.d = booleanValue;
                        String str = this.g.f;
                        createBuilder2.copyOnWrite();
                        asin asinVar2 = (asin) createBuilder2.instance;
                        str.getClass();
                        asinVar2.b = 1 | asinVar2.b;
                        asinVar2.c = str;
                        createBuilder.copyOnWrite();
                        asht ashtVar = (asht) createBuilder.instance;
                        asin asinVar3 = (asin) createBuilder2.build();
                        asinVar3.getClass();
                        ashtVar.x = asinVar3;
                        ashtVar.c |= 16384;
                        this.i.w(new acqx(this.g.D), (asht) createBuilder.build());
                    }
                }
            }
            if (z) {
                this.z.a(this.g);
            } else {
                this.A.a(this.g);
            }
            this.t.setVisibility(0);
            if (this.j != z || this.k != b().booleanValue()) {
                this.j = z;
                this.k = b().booleanValue();
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((ftl) it.next()).nV(z, this.k);
                }
            }
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o(auzj auzjVar) {
        auzj auzjVar2 = this.g;
        return (auzjVar2 == null || auzjVar == null || !auzjVar2.equals(auzjVar)) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        auzj auzjVar;
        if (this.b || (auzjVar = this.g) == null) {
            return;
        }
        if (!auzjVar.y.isEmpty()) {
            this.r.d(this.g.y, null);
            return;
        }
        if (this.v.o()) {
            auzj auzjVar2 = this.g;
            if (auzjVar2 != null && (auzjVar2.b & 536870912) != 0 && this.i != null) {
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = ashk.a.createBuilder();
                int i = true != b().booleanValue() ? 3 : 2;
                createBuilder2.copyOnWrite();
                ashk ashkVar = (ashk) createBuilder2.instance;
                ashkVar.c = i - 1;
                ashkVar.b |= 1;
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                ashk ashkVar2 = (ashk) createBuilder2.build();
                ashkVar2.getClass();
                ashtVar.m = ashkVar2;
                ashtVar.b |= 32768;
                this.i.I(3, new acqx(this.g.D.I()), (asht) createBuilder.build());
            }
            if (this.p.t()) {
                l(this.g, false);
                return;
            }
            ftj ftjVar = new ftj(this, this.g);
            if ((this.g.c & 1) == 0) {
                this.q.c(this.o, null, ftjVar);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sign_in_callback", ftjVar);
            aahd aahdVar = this.r;
            apxf apxfVar = this.g.E;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, hashMap);
            return;
        }
        this.w.b();
    }
}
