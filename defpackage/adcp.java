package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcp extends bpd {
    public static final /* synthetic */ int q = 0;
    public final azrw a;
    public volatile boolean b;
    public boolean c;
    public int d;
    public final adco m;
    public final adcn n;
    public final Executor o;
    final String p;
    private final Map r;
    private final azrw s;
    private final azrw t;
    private final azrw u;
    private final boolean v;
    private final anib w;

    static {
        zga.a("MDX.mediaroute");
    }

    public adcp(Context context, Executor executor, anib anibVar, String str, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, boolean z) {
        super(context);
        this.r = new ConcurrentHashMap();
        this.b = false;
        this.c = false;
        this.m = new adco(this);
        this.a = azrwVar;
        this.s = azrwVar2;
        this.t = azrwVar3;
        this.u = azrwVar4;
        this.v = z;
        this.n = new adcn(this);
        this.o = executor;
        this.w = anibVar;
        this.p = str;
    }

    public static String f(adgb adgbVar) {
        if (adgbVar instanceof adfy) {
            return ((adfy) adgbVar).n.c.replace("-", "").replace("uuid:", "");
        }
        return adgbVar.h();
    }

    @Override // defpackage.bpd
    public final bpc b(String str) {
        adgb adgbVar = (adgb) this.r.get(str);
        if (adgbVar == null) {
            return null;
        }
        return new adcv(this.u, adgbVar, this.t, str);
    }

    @Override // defpackage.bpd
    public final void d(final bov bovVar) {
        ynm.k(this.w.submit(new Callable() { // from class: adcl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                adcp adcpVar = adcp.this;
                bov bovVar2 = bovVar;
                String.valueOf(String.valueOf(bovVar2)).length();
                bph a = bovVar2 != null ? bovVar2.a() : null;
                if (a == null || !a.b().contains(adcpVar.p)) {
                    ((adlj) adcpVar.a.get()).g(adcpVar.n);
                    adcpVar.b = false;
                    adcpVar.l();
                    return null;
                }
                ((adlj) adcpVar.a.get()).f(adcpVar.n);
                adcpVar.b = true;
                adcpVar.l();
                return adcpVar.e();
            }
        }), this.o, abbr.q, new ynl() { // from class: adck
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                adcp adcpVar = adcp.this;
                bpf bpfVar = (bpf) obj;
                if (bpfVar != null) {
                    adcpVar.jN(bpfVar);
                }
            }
        });
    }

    public final bpf e() {
        String c;
        this.r.clear();
        bpe bpeVar = new bpe();
        for (adgb adgbVar : (List) Stream.CC.concat(Collection.EL.stream(((adlj) this.a.get()).b()), Collection.EL.stream(((adlj) this.a.get()).c())).collect(Collectors.toList())) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory(this.p);
            if (this.v) {
                c = adgbVar.c();
                if (this.v) {
                    StringBuilder sb = new StringBuilder();
                    if (adgbVar instanceof adfy) {
                        sb.append("d");
                        if (((adfy) adgbVar).p()) {
                            sb.append(",w");
                        }
                    } else if (adgbVar instanceof adfu) {
                        sb.append("ca");
                    } else if (adgbVar instanceof adga) {
                        sb.append("cl");
                    }
                    if (sb.length() > 0) {
                        sb.insert(0, " <");
                        sb.append(">");
                    }
                    c = c.concat(sb.toString());
                }
            } else {
                c = adgbVar.c();
            }
            bot botVar = new bot(f(adgbVar), c);
            botVar.b(intentFilter);
            botVar.i(1);
            botVar.l(1);
            botVar.g(true);
            botVar.m(100);
            botVar.h(adgbVar.s());
            botVar.f(1);
            adlm g = ((adlt) this.s.get()).g();
            if (g != null && adgbVar.j(g.k())) {
                botVar.k(this.d);
                int a = g.a();
                if (a == 0) {
                    botVar.d(1);
                } else if (a == 1) {
                    botVar.d(2);
                }
            }
            bou a2 = botVar.a();
            bpeVar.b(a2);
            this.r.put(a2.n(), adgbVar);
        }
        return bpeVar.a();
    }

    public final void l() {
        adlj adljVar = (adlj) this.a.get();
        if (!this.b || this.c) {
            adljVar.d(this.p);
        } else {
            adljVar.e(this.p);
        }
    }
}
