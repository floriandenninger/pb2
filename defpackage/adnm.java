package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnm implements adlj {
    public static final String a = zga.a("MDX.remote");
    public final azrw d;
    public final Executor f;
    public final acyg g;
    public final acun h;
    public boolean i;
    private final azrw k;
    private final acys n;
    private final ypa p;
    private final azrw q;
    private adni s;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final ykl j = new adnj(this);
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    private final Set o = new HashSet();
    private final Object r = new Object();
    private final Handler m = new adnl(this);
    private final Set l = Collections.newSetFromMap(new ConcurrentHashMap());

    public adnm(Executor executor, acyg acygVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, acys acysVar, ypa ypaVar, acun acunVar) {
        this.f = executor;
        this.g = acygVar;
        this.q = azrwVar;
        this.k = azrwVar2;
        this.d = azrwVar3;
        this.n = acysVar;
        this.p = ypaVar;
        this.h = acunVar;
    }

    private final anhy q(adgb adgbVar, atbi atbiVar) {
        adlm g = ((adlt) this.d.get()).g();
        if (g == null || !adgbVar.equals(g.k())) {
            return anaf.O(true);
        }
        return g.q(atbiVar, Optional.empty());
    }

    private final atbi r(adfy adfyVar) {
        if (!((adtv) this.q.get()).f()) {
            return atbi.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE;
        }
        if (((adtv) this.q.get()).g(3)) {
            if (!TextUtils.equals(adfyVar.e, ((adtv) this.q.get()).b())) {
                return atbi.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
            }
            return atbi.MDX_SESSION_DISCONNECT_REASON_DIAL_SCREEN_UNAVAILABLE;
        }
        return atbi.MDX_SESSION_DISCONNECT_REASON_NETWORK_CHANGED;
    }

    private final void s() {
        this.p.d(adli.a);
        for (final adcn adcnVar : this.l) {
            final bpf e = adcnVar.a.e();
            adcnVar.a.o.execute(new Runnable() { // from class: adcm
                @Override // java.lang.Runnable
                public final void run() {
                    adcn adcnVar2 = adcn.this;
                    bpf bpfVar = e;
                    int i = adcp.q;
                    String.format(Locale.US, "Publishing entire routes on screen changed: %s", adcnVar2.a.j);
                    adcnVar2.a.jN(bpfVar);
                }
            });
        }
    }

    @Override // defpackage.adlj
    public final anhy a(adfs adfsVar) {
        adga adgaVar;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                adgaVar = null;
                break;
            }
            adgaVar = (adga) it.next();
            if (adfsVar.equals(adgaVar.f())) {
                break;
            }
        }
        if (adgaVar == null) {
            return anhv.a;
        }
        ynm.i(q(adgaVar, atbi.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED), new adng(this, adgaVar, 0));
        adok adokVar = (adok) this.k.get();
        final ScreenId b = adgaVar.b();
        return adokVar.e.a.b(new amml() { // from class: adhx
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                ScreenId screenId = ScreenId.this;
                int i = adhy.b;
                aone builder = ((aose) obj).toBuilder();
                int i2 = 0;
                while (true) {
                    if (i2 >= ((aose) builder.instance).b.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((aosd) ((aose) builder.instance).b.get(i2)).c.equals(String.valueOf(screenId))) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    builder.X(i2);
                }
                return (aose) builder.build();
            }
        }, angq.a);
    }

    @Override // defpackage.adlj
    public final List b() {
        return this.b;
    }

    @Override // defpackage.adlj
    public final List c() {
        return this.c;
    }

    @Override // defpackage.adlj
    public final void d(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "pauseScan: ".concat(valueOf);
        }
        this.o.remove(str);
        if (this.o.isEmpty()) {
            this.i = false;
            this.m.removeMessages(0);
            this.m.removeMessages(1);
        }
    }

    @Override // defpackage.adlj
    public final void e(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "resumeScan: ".concat(valueOf);
        }
        if (this.o.isEmpty()) {
            this.i = true;
            o();
            n();
            this.i = true;
            this.m.sendEmptyMessageDelayed(0, 5000L);
            this.m.sendEmptyMessageDelayed(1, 10000L);
        }
        this.o.add(str);
    }

    @Override // defpackage.adlj
    public final void f(adcn adcnVar) {
        this.l.add(adcnVar);
    }

    @Override // defpackage.adlj
    public final void g(adcn adcnVar) {
        this.l.remove(adcnVar);
    }

    @Override // defpackage.adlj
    public final void h(final adgn adgnVar, yki ykiVar) {
        final adok adokVar = (adok) this.k.get();
        final adnh adnhVar = new adnh(this, ykiVar);
        ynm.k(anfq.h(adokVar.e.a(), new amml() { // from class: adoi
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                adga adgaVar;
                String string;
                String str;
                adok adokVar2 = adok.this;
                List list = (List) obj;
                adfw b = adokVar2.f.b(adgnVar, 8);
                if (b == null) {
                    return Optional.empty();
                }
                adfv g = b.g();
                ScreenId screenId = b.f;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        adgaVar = null;
                        break;
                    }
                    adgaVar = (adga) it.next();
                    if (adgaVar.b().equals(screenId)) {
                        break;
                    }
                }
                if (adgaVar != null) {
                    str = adgaVar.g();
                } else if (TextUtils.isEmpty(b.e)) {
                    int i = 1;
                    while (true) {
                        string = adokVar2.h.getString(R.string.screen_name, Integer.valueOf(i));
                        if (adyu.bQ(list, string) == null) {
                            break;
                        }
                        i++;
                    }
                    str = string;
                } else {
                    String str2 = b.e;
                    String str3 = str2;
                    int i2 = 2;
                    while (adyu.bQ(list, str3) != null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(i2);
                        str3 = sb.toString();
                        i2++;
                    }
                    str = str3;
                }
                g.e(str);
                return Optional.of(new adga(g.a()));
            }
        }, adokVar.a), adokVar.a, adha.j, new ynl() { // from class: adoh
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                adok adokVar2 = adok.this;
                ykl yklVar = adnhVar;
                adgn adgnVar2 = adgnVar;
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    yklVar.b(adgnVar2, (adga) optional.get());
                    adhy adhyVar = adokVar2.e;
                    final adga adgaVar = (adga) optional.get();
                    ynm.j(adhyVar.a.b(new amml() { // from class: adhw
                        @Override // defpackage.amml
                        public final Object apply(Object obj2) {
                            adga adgaVar2 = adga.this;
                            int i = adhy.b;
                            aone builder = ((aose) obj2).toBuilder();
                            aone createBuilder = aosd.a.createBuilder();
                            String valueOf = String.valueOf(adgaVar2.b());
                            createBuilder.copyOnWrite();
                            aosd aosdVar = (aosd) createBuilder.instance;
                            valueOf.getClass();
                            aosdVar.b |= 1;
                            aosdVar.c = valueOf;
                            String g = adgaVar2.g();
                            createBuilder.copyOnWrite();
                            aosd aosdVar2 = (aosd) createBuilder.instance;
                            g.getClass();
                            aosdVar2.b |= 2;
                            aosdVar2.d = g;
                            String valueOf2 = String.valueOf(adgaVar2.f());
                            createBuilder.copyOnWrite();
                            aosd aosdVar3 = (aosd) createBuilder.instance;
                            valueOf2.getClass();
                            aosdVar3.b |= 4;
                            aosdVar3.e = valueOf2;
                            aosd aosdVar4 = (aosd) createBuilder.build();
                            builder.copyOnWrite();
                            aose aoseVar = (aose) builder.instance;
                            aosdVar4.getClass();
                            aoseVar.a();
                            aoseVar.b.add(0, aosdVar4);
                            if (((aose) builder.instance).b.size() > 5) {
                                builder.X(((aose) builder.instance).b.size() - 1);
                            }
                            return (aose) builder.build();
                        }
                    }, angq.a), angq.a, adha.f);
                    return;
                }
                yklVar.a(adgnVar2, new Exception("Screen is null."));
            }
        });
    }

    public final void i(adfy adfyVar, AppStatus appStatus) {
        int i = ((AutoValue_AppStatus) appStatus).a;
        String.valueOf(adfyVar.d).length();
        if (i == 2) {
            ynm.i(q(adfyVar, atbi.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED), new adnf(this, adfyVar, 1));
        } else if (i != 1) {
            ynm.i(q(adfyVar, r(adfyVar)), new adnf(this, adfyVar, 0));
        }
    }

    public final void j(adfy adfyVar) {
        adfy p = p(adfyVar.n);
        if (p != null) {
            l(p);
        }
        this.b.add(adfyVar);
        s();
    }

    public final void k(adga adgaVar) {
        if (this.c.contains(adgaVar)) {
            return;
        }
        adlm g = ((adlt) this.d.get()).g();
        Iterator it = this.c.iterator();
        boolean z = true;
        while (it.hasNext()) {
            adga adgaVar2 = (adga) it.next();
            if (adgaVar2.b().equals(adgaVar.b())) {
                if (g == null || !g.k().equals(adgaVar2)) {
                    String.valueOf(String.valueOf(adgaVar2)).length();
                    m(adgaVar2);
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            this.c.add(adgaVar);
        }
        s();
    }

    public final void l(adfy adfyVar) {
        this.b.remove(adfyVar);
        this.e.remove(adfyVar.n);
        s();
    }

    public final void m(adga adgaVar) {
        String.valueOf(String.valueOf(adgaVar)).length();
        this.c.remove(adgaVar);
        s();
    }

    public final void n() {
        this.m.removeMessages(2);
        if (!((adtv) this.q.get()).g(3)) {
            if (!this.b.isEmpty()) {
                zga.h(a, "Network conditions unsatisfactory. Removing all DIAL screens.");
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                adfy adfyVar = (adfy) it.next();
                ynm.i(q(adfyVar, r(adfyVar)), new adnf(this, adfyVar, 2));
            }
            s();
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        newSetFromMap.addAll(this.b);
        Handler handler = this.m;
        handler.sendMessageDelayed(Message.obtain(handler, 2, newSetFromMap), 9500L);
        synchronized (this.r) {
            adni adniVar = this.s;
            if (adniVar != null) {
                this.n.f(adniVar);
            }
            adni adniVar2 = new adni(this, newSetFromMap);
            this.s = adniVar2;
            this.n.b(adniVar2);
        }
    }

    public final void o() {
        if (!((adtv) this.q.get()).f()) {
            if (!this.c.isEmpty()) {
                zga.h(a, "Network conditions unsatisfactory. Removing all manual pairing screens.");
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                adga adgaVar = (adga) it.next();
                ynm.i(q(adgaVar, atbi.MDX_SESSION_DISCONNECT_REASON_NOT_ONLINE), new adng(this, adgaVar, 1));
            }
            s();
            return;
        }
        adok adokVar = (adok) this.k.get();
        ykl yklVar = this.j;
        final adoj adojVar = new adoj(adokVar, yklVar, yklVar);
        ynm.k(adokVar.e.a(), adokVar.a, adha.k, new ynl() { // from class: adog
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                int i = adok.i;
                ykl.this.b(null, (List) obj);
            }
        });
    }

    public final adfy p(adgn adgnVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            adfy adfyVar = (adfy) it.next();
            if (adfyVar.n.equals(adgnVar)) {
                return adfyVar;
            }
        }
        return null;
    }
}
