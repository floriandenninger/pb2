package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsw implements acsy {
    private final shf a;
    private final acpl b;
    private final SharedPreferences c;
    private final acsv d;
    private final Executor e;
    private final ConcurrentHashMap f;
    private final ajkn g;

    public acsw(SharedPreferences sharedPreferences, ajkn ajknVar, shf shfVar, acpl acplVar, Executor executor, byte[] bArr) {
        sharedPreferences.getClass();
        this.c = sharedPreferences;
        ajknVar.getClass();
        this.g = ajknVar;
        shfVar.getClass();
        this.a = shfVar;
        acplVar.getClass();
        this.b = acplVar;
        this.d = new acsv(l(), shfVar);
        this.f = new ConcurrentHashMap();
        this.e = anaf.E(executor);
    }

    private final String w(asmn asmnVar) {
        hx hxVar = new hx(asmnVar, "");
        String str = (String) this.f.get(hxVar);
        if (str != null) {
            return str;
        }
        String e = e();
        String str2 = (String) this.f.putIfAbsent(hxVar, e);
        return str2 == null ? e : str2;
    }

    private final void x(asmn asmnVar, int i, String str, asme asmeVar) {
        if (TextUtils.isEmpty(str)) {
            str = w(asmnVar);
        }
        aone builder = asmeVar.toBuilder();
        builder.copyOnWrite();
        asme asmeVar2 = (asme) builder.instance;
        str.getClass();
        asmeVar2.b |= 2;
        asmeVar2.d = str;
        builder.copyOnWrite();
        asme asmeVar3 = (asme) builder.instance;
        asmeVar3.b |= 32;
        asmeVar3.h = i;
        asme asmeVar4 = (asme) builder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cJ(asmeVar4);
        this.b.c((arpp) a.build());
        acsv acsvVar = this.d;
        if (acsvVar.a) {
            String str2 = asmeVar4.c;
            String str3 = asmeVar4.d;
            long j = asmeVar4.f;
            long j2 = asmeVar4.e;
            asmm asmmVar = asmeVar4.g;
            if (asmmVar == null) {
                asmmVar = asmm.a;
            }
            String str4 = asmmVar.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 102 + String.valueOf(str3).length() + String.valueOf(str4).length());
            sb.append("logActionSpan: ");
            sb.append(str2);
            sb.append(", CAN ");
            sb.append(str3);
            sb.append(", Start Time ");
            sb.append(j);
            sb.append(", Span Length ");
            sb.append(j2);
            sb.append(", request URL ");
            sb.append(str4);
            acsvVar.a(sb.toString());
        }
    }

    @Override // defpackage.acsy
    public final int a() {
        return new Random().nextInt(Integer.MAX_VALUE);
    }

    @Override // defpackage.acsy
    public final acsx b(asmn asmnVar) {
        acsx d = d(asmnVar);
        d.e();
        return d;
    }

    @Override // defpackage.aftq
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final acsx d(asmn asmnVar) {
        return new acss(this, this.a, asmnVar, e(), ammv.i(null), l());
    }

    @Override // defpackage.acsy
    public final String e() {
        return this.g.b(16);
    }

    @Override // defpackage.acsy
    public final void f(asmb asmbVar) {
        g(asmbVar, -1L);
    }

    public final void g(asmb asmbVar, long j) {
        if (TextUtils.isEmpty(asmbVar.f)) {
            this.d.c("logActionInfo");
            return;
        }
        if (j < 0) {
            j = this.a.c();
        }
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cI(asmbVar);
        this.b.f((arpp) a.build(), j);
        acsv acsvVar = this.d;
        if (acsvVar.a) {
            String str = asmbVar.f;
            asmn b = asmn.b(asmbVar.e);
            if (b == null) {
                b = asmn.LATENCY_ACTION_UNKNOWN;
            }
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(valueOf).length());
            sb.append("logActionInfo: ");
            sb.append(str);
            sb.append(", action ");
            sb.append(valueOf);
            acsvVar.a(sb.toString());
        }
    }

    @Override // defpackage.acsy
    public final void h(asmb asmbVar) {
        this.e.execute(new acsu(this, asmbVar, this.a.c()));
    }

    @Override // defpackage.acsy
    public final void i(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            this.d.c("logBaseline");
            return;
        }
        aone createBuilder = asma.a.createBuilder();
        createBuilder.copyOnWrite();
        asma asmaVar = (asma) createBuilder.instance;
        str.getClass();
        asmaVar.b |= 1;
        asmaVar.c = str;
        asma asmaVar2 = (asma) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cH(asmaVar2);
        this.b.f((arpp) a.build(), j);
        acsv acsvVar = this.d;
        if (acsvVar.a) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("logBaseline ");
            sb.append(j);
            acsvVar.b(str, sb.toString());
        }
    }

    @Override // defpackage.acsy
    public final void j(String str) {
        this.e.execute(new acst(this, str, this.a.c()));
    }

    @Override // defpackage.acsy
    public final void k(String str, String str2, long j) {
        if (TextUtils.isEmpty(str2)) {
            acsv acsvVar = this.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
            sb.append("logTick(");
            sb.append(str);
            sb.append(")");
            acsvVar.c(sb.toString());
            return;
        }
        aone createBuilder = asmf.a.createBuilder();
        createBuilder.copyOnWrite();
        asmf asmfVar = (asmf) createBuilder.instance;
        str.getClass();
        asmfVar.b |= 1;
        asmfVar.c = str;
        createBuilder.copyOnWrite();
        asmf asmfVar2 = (asmf) createBuilder.instance;
        str2.getClass();
        asmfVar2.b |= 2;
        asmfVar2.d = str2;
        asmf asmfVar3 = (asmf) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cK(asmfVar3);
        this.b.f((arpp) a.build(), j);
        acsv acsvVar2 = this.d;
        if (acsvVar2.a) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length());
            sb2.append("logTick: ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(j);
            acsvVar2.b(str2, sb2.toString());
        }
    }

    protected final boolean l() {
        return this.c.getBoolean("DebugCsiGelLogging", false);
    }

    @Override // defpackage.acsy
    public final void m(asmn asmnVar) {
        String str = (String) this.f.remove(new hx(asmnVar, ""));
        acsv acsvVar = this.d;
        if (acsvVar.a) {
            if (str == null) {
                String valueOf = String.valueOf(asmnVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79);
                sb.append("Attempted to clearActionNonce, didn't exist. actionType=[");
                sb.append(valueOf);
                sb.append("], actionDescriptor=[]");
                acsvVar.a(sb.toString());
                return;
            }
            long d = acsvVar.d(asmnVar);
            String valueOf2 = String.valueOf(asmnVar);
            String e = acsv.e(acsvVar.b.c(), d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51 + String.valueOf(e).length());
            sb2.append("clearActionNonce actionType=[");
            sb2.append(valueOf2);
            sb2.append("] actionDescriptor=[] ");
            sb2.append(e);
            acsvVar.b(str, sb2.toString());
        }
    }

    @Override // defpackage.acsy
    public final boolean n(asmn asmnVar) {
        return this.f.containsKey(new hx(asmnVar, ""));
    }

    @Override // defpackage.acsy
    public final void o(asmn asmnVar, asmb asmbVar) {
        aone builder = asmbVar.toBuilder();
        String w = w(asmnVar);
        builder.copyOnWrite();
        asmb asmbVar2 = (asmb) builder.instance;
        w.getClass();
        asmbVar2.b |= 2;
        asmbVar2.f = w;
        f((asmb) builder.build());
    }

    @Override // defpackage.acsy
    public final void p(asmn asmnVar, int i, String str, asme asmeVar) {
        if (i < 0 || asmeVar == null || asmeVar.c.isEmpty() || asmeVar.e <= 0) {
            return;
        }
        x(asmnVar, i, str, asmeVar);
    }

    @Override // defpackage.acsy
    public final void q(asmn asmnVar, asme asmeVar) {
        if (asmeVar == null || asmeVar.c.isEmpty() || asmeVar.e <= 0) {
            return;
        }
        x(asmnVar, a(), "", asmeVar);
    }

    @Override // defpackage.acsy
    public final void r(asmn asmnVar) {
        s(asmnVar, this.a.c());
    }

    @Override // defpackage.acsy
    public final void s(asmn asmnVar, long j) {
        String w = w(asmnVar);
        acsv acsvVar = this.d;
        if (acsvVar.a) {
            acsvVar.c.put(new hx(asmnVar, ""), Long.valueOf(j));
        }
        i(w, j);
        acsv acsvVar2 = this.d;
        if (acsvVar2.a) {
            long d = acsvVar2.d(asmnVar);
            String valueOf = String.valueOf(asmnVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
            sb.append("logBaseline actionType=[");
            sb.append(valueOf);
            sb.append("] actionDescriptor=[] ");
            sb.append(d);
            acsvVar2.b(w, sb.toString());
        }
    }

    @Override // defpackage.acsy
    public final void t(asmn asmnVar) {
        r(asmnVar);
        aone createBuilder = asmb.a.createBuilder();
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmbVar.e = asmnVar.bO;
        asmbVar.b |= 1;
        String w = w(asmnVar);
        createBuilder.copyOnWrite();
        asmb asmbVar2 = (asmb) createBuilder.instance;
        w.getClass();
        asmbVar2.b |= 2;
        asmbVar2.f = w;
        f((asmb) createBuilder.build());
    }

    @Override // defpackage.acsy
    public final void u(String str, asmn asmnVar) {
        long c = this.a.c();
        String w = w(asmnVar);
        k(str, w, c);
        acsv acsvVar = this.d;
        if (acsvVar.a) {
            if (w == null) {
                String valueOf = String.valueOf(asmnVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75);
                sb.append("logTick, actionNonce not found for given actionType=[");
                sb.append(valueOf);
                sb.append("], actionDescriptor=[]");
                acsvVar.a(sb.toString());
                return;
            }
            long d = acsvVar.d(asmnVar);
            String valueOf2 = String.valueOf(asmnVar);
            String e = acsv.e(c, d);
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length + 54 + String.valueOf(valueOf2).length() + String.valueOf(e).length());
            sb2.append("logTick tickName=[");
            sb2.append(str);
            sb2.append("] actionType=[");
            sb2.append(valueOf2);
            sb2.append("] actionDescriptor=[] ");
            sb2.append(e);
            acsvVar.b(w, sb2.toString());
        }
    }

    @Override // defpackage.acsy
    public final void v(String str, asmn asmnVar) {
        u(str, asmnVar);
        m(asmnVar);
    }
}
