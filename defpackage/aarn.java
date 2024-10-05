package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aarn extends afvw implements cnn {
    public static final /* synthetic */ int a = 0;
    private static final alwf b;
    private final azrw A;
    private final boolean B;
    private final boolean C;
    private final ykr D;
    private final ykq E;
    private final afxj F;
    private final shf G;
    private byte[] H;
    private Map I;

    /* renamed from: J, reason: collision with root package name */
    private String f23J;
    private String K;
    private boolean L;
    private boolean M;
    private final aaru c;
    private final aooy k;
    private final afwx l;
    private final aftj m;
    private final Set n;
    private final Set q;
    private final Set r;
    private final aaqz s;
    private final afqb t;
    private final String u;
    private final String v;
    private final aaea w;
    private final aart x;
    private final boolean y;
    private final afsy z;

    static {
        alwe c = alwf.b.c();
        alwe c2 = alwf.b.c();
        c2.e(22, alwf.a);
        c.e(1, c2.a());
        b = c.a();
    }

    public aarn(aaru aaruVar, aooy aooyVar, afwx afwxVar, aftj aftjVar, Set set, Set set2, Set set3, afqb afqbVar, String str, String str2, yvn yvnVar, boolean z, boolean z2, shf shfVar, afsy afsyVar, aaea aaeaVar, aaqz aaqzVar, boolean z3, azrw azrwVar, ykr ykrVar, ykq ykqVar, afxj afxjVar, aart aartVar) {
        super(yvnVar, new afpy(afwxVar, afqbVar), !aaruVar.q());
        this.L = false;
        this.M = false;
        aaruVar.getClass();
        this.c = aaruVar;
        this.k = aooyVar;
        afwxVar.getClass();
        this.l = afwxVar;
        this.m = aftjVar;
        this.n = set;
        this.q = set2;
        this.r = set3;
        this.t = afqbVar;
        this.u = str;
        this.v = str2;
        this.w = aaeaVar;
        this.x = aartVar;
        if (yvnVar == yvn.IMMEDIATE) {
            s();
        }
        this.B = z;
        this.C = z2;
        this.G = shfVar;
        this.z = afsyVar;
        this.f = this;
        this.s = aaqzVar;
        this.y = z3;
        this.A = azrwVar;
        ykrVar.getClass();
        this.D = ykrVar;
        ykqVar.getClass();
        this.E = ykqVar;
        this.F = afxjVar;
    }

    private final aaqu C() {
        aaqu aaquVar = new aaqu();
        aaquVar.b(0);
        aaquVar.a = 0L;
        aaquVar.b = this.c.m;
        aaquVar.c = Integer.valueOf(a());
        amru h = this.c.h();
        if (h != null) {
            aaquVar.d = h;
            return aaquVar;
        }
        throw new NullPointerException("Null networkHealthAnnotations");
    }

    private final aooy D() {
        aoox a2 = this.c.a();
        aone u = this.c.u();
        if (this.y) {
            ((aaqs) this.A.get()).b(u);
        }
        return ((aoox) this.D.a(a2, u)).build();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aooy, java.lang.Object] */
    private static final aooy E(byte[] bArr, aopf aopfVar) {
        return aopfVar.n(bArr, aomw.b());
    }

    public final boolean A() {
        return this.c.h;
    }

    @Override // defpackage.cnn
    public final int a() {
        return (int) this.x.c.a;
    }

    @Override // defpackage.cnn
    public final int b() {
        return (int) this.x.c.a();
    }

    @Override // defpackage.cnn
    public final void c(cnq cnqVar) {
        aftj aftjVar;
        boolean z = cnqVar instanceof cnb;
        if (!z) {
            aart aartVar = this.x;
            if (!yny.c(cnqVar) && !aartVar.a.a(cnqVar)) {
                throw cnqVar;
            }
            if (!h()) {
                throw cnqVar;
            }
            z = false;
        }
        if (this.x.c.b()) {
            if (z) {
                if (!this.M) {
                    afsx e = e();
                    if (!e.z() && (aftjVar = this.m) != null) {
                        this.I = null;
                        aftjVar.a(e).b(e);
                    }
                    this.M = true;
                } else {
                    throw cnqVar;
                }
            }
            if (this.x.b()) {
                this.f23J = null;
                this.I = null;
            }
            this.L = true;
            return;
        }
        throw cnqVar;
    }

    @Override // defpackage.yvo
    public final cnq d(cnq cnqVar) {
        aaqu aaquVar;
        if (this.C) {
            p((aaqv) k(aaqv.class));
            aaquVar = C();
        } else {
            aaquVar = null;
        }
        if (cnqVar instanceof cno) {
            zhp zhpVar = new zhp(cnqVar);
            if (this.C) {
                aarw aarwVar = new aarw();
                aarwVar.a = Integer.valueOf(zhpVar.c.b);
                Iterator it = zhpVar.b().iterator();
                while (it.hasNext()) {
                    String str = ((aols) it.next()).b;
                    if (str != null) {
                        if (aarwVar.b == null) {
                            aarwVar.b = amru.f();
                        }
                        aarwVar.b.h(str);
                    }
                }
                amrp amrpVar = aarwVar.b;
                if (amrpVar != null) {
                    aarwVar.c = amrpVar.g();
                } else if (aarwVar.c == null) {
                    aarwVar.c = amru.q();
                }
                Integer num = aarwVar.a;
                if (num == null) {
                    throw new IllegalStateException("Missing required properties: rpcStatusCode");
                }
                aaquVar.e = new aarx(num.intValue(), aarwVar.c);
            }
            cnqVar = zhpVar;
        }
        if (this.C) {
            r(aaquVar.a());
        }
        return cnqVar;
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final afsx e() {
        return this.c.n;
    }

    @Override // defpackage.yvo
    public final Map f() {
        if (this.I == null) {
            HashMap hashMap = new HashMap();
            this.I = hashMap;
            hashMap.put("Content-Type", "application/x-protobuf");
            this.I.put("X-GOOG-API-FORMAT-VERSION", "2");
            if (!z()) {
                this.F.a(t());
            }
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((afvb) it.next()).b(this.I, this);
            }
        }
        return this.I;
    }

    @Override // defpackage.yvo
    public final boolean h() {
        return this.c.i;
    }

    @Override // defpackage.yvo
    public final Optional j() {
        return this.c.o;
    }

    @Override // defpackage.yvo
    public final String l() {
        if (this.K == null) {
            String b2 = this.c.b();
            if ("NO_CACHE_KEY_VALUE".equals(b2)) {
                b2 = t();
            }
            this.K = b2;
        }
        return this.K;
    }

    @Override // defpackage.yvo
    public final String m() {
        return t();
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        cnh cnhVar2 = cnhVar;
        yjk.e();
        try {
            this.l.lK();
            long d = this.G.d();
            yst ystVar = this.c.p;
            if (ystVar != null) {
                ystVar.d();
            }
            aooy E = E(cnhVar2.b, this.k.getParserForType());
            final arnd arndVar = (arnd) this.E.a(E);
            long d2 = this.G.d();
            if (ystVar != null) {
                ystVar.c();
            }
            byte[] bArr = cnhVar2.b;
            if (this.y) {
                try {
                    ((aaqs) this.A.get()).a(this.c.u(), arndVar);
                    abfh a2 = abfh.a(aomk.O(cnhVar2.b), b);
                    byte[] bArr2 = new byte[a2.b];
                    a2.b(aomp.ak(bArr2));
                    bArr = bArr2;
                } catch (IOException unused) {
                    zga.b("Failed rewriting consistency token");
                    bArr = cnhVar2.b;
                }
            }
            String d3 = this.z.c().d();
            String d4 = this.c.n.d();
            atfr atfrVar = this.w.a().f;
            if (atfrVar == null) {
                atfrVar = atfr.a;
            }
            if (!atfrVar.b || !this.c.p() || d3.equals(d4) || this.c.o()) {
                if (arndVar != null) {
                    for (aasa aasaVar : this.r) {
                        if (aasaVar.f(this.c)) {
                            aasaVar.d(this.c, arndVar);
                        }
                    }
                }
                if (!B(cnhVar)) {
                    this.s.b(this.c.n, E, bArr, new amnv() { // from class: aarj
                        @Override // defpackage.amnv
                        public final Object get() {
                            arnd arndVar2 = arnd.this;
                            int i = aarn.a;
                            return arndVar2;
                        }
                    });
                    if (!afvw.B(cnhVar)) {
                        amru q = amru.q();
                        if (cnhVar2.d != null) {
                            amrp amrpVar = new amrp();
                            amrpVar.j(cnhVar2.d);
                            amrpVar.h(afvw.p);
                            q = amrpVar.g();
                        }
                        cnhVar2 = new cnh(cnhVar2.a, cnhVar2.b, cnhVar2.e, cnhVar2.f, q);
                    }
                }
                cnc dy = this.c.r() ? adyu.dy(bArr, cnhVar2.c, arndVar) : null;
                int i = 0;
                this.c.h = dy == null ? false : TextUtils.equals((CharSequence) dy.g.get("X-YouTube-cache-hit"), "true");
                cnm b2 = cnm.b(E, dy);
                if (this.C) {
                    p((aaqv) k(aaqv.class));
                    aaqu C = C();
                    C.a = Long.valueOf(d2 - d);
                    byte[] bArr3 = cnhVar2.b;
                    if (bArr3 != null) {
                        i = bArr3.length;
                    }
                    C.b(i);
                    r(C.a());
                }
                return b2;
            }
            return cnm.a(new cnb("Authentication changed while request was being made"));
        } catch (aoob e) {
            zga.d("Failed while attempting to deserialize network response", e);
            return cnm.a(new cnj(e));
        }
    }

    @Override // defpackage.yvo
    public final byte[] qm() {
        if (this.H == null) {
            aaru aaruVar = this.c;
            aaruVar.c();
            if (aaruVar.g != null) {
                this.H = D().toByteArray();
            } else {
                throw new IllegalArgumentException("Must set clickTrackingParams.");
            }
        }
        return this.H;
    }

    public final String t() {
        if (this.f23J == null) {
            Uri.Builder appendQueryParameter = (this.B ? (Uri) anaf.X(this.t.a()) : (Uri) anaf.X(this.t.b())).buildUpon().appendEncodedPath(this.t.f()).appendEncodedPath(this.c.m).appendQueryParameter("key", this.u);
            if (!TextUtils.isEmpty(this.v)) {
                appendQueryParameter.appendQueryParameter("asig", this.v);
            }
            for (afvo afvoVar : this.q) {
                this.c.j();
                afvoVar.a();
            }
            for (Map.Entry entry : this.c.j().entrySet()) {
                appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            if (this.L) {
                aart aartVar = this.x;
                if (aartVar.b()) {
                    aartVar.b.a(appendQueryParameter);
                }
            }
            this.f23J = appendQueryParameter.build().toString();
        }
        return this.f23J;
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final String u() {
        return this.c.l;
    }

    @Override // defpackage.afvw
    public final List v() {
        String str;
        ArrayList arrayList = new ArrayList();
        String simpleName = D().getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 15);
        sb.append("Request type: ");
        sb.append(simpleName);
        sb.append("\n");
        arrayList.add(sb.toString());
        if (this.c.q()) {
            str = !this.c.r() ? "CACHE DISABLED" : A() ? "CACHE HIT" : "CACHE MISS";
        } else {
            str = "CACHE READ DISABLED";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 9);
        sb2.append("Cached: ");
        sb2.append(str);
        sb2.append("\n");
        arrayList.add(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        try {
            sb3.append("curl ");
            Map f = f();
            for (String str2 : f.keySet()) {
                if (!str2.equals("Content-Type")) {
                    String str3 = (String) f.get(str2);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str3).length());
                    sb4.append("-H \"");
                    sb4.append(str2);
                    sb4.append(":");
                    sb4.append(str3);
                    sb4.append("\" ");
                    sb3.append(sb4.toString());
                }
            }
        } catch (cnb e) {
            zga.i("Curl command line not available", e);
        }
        String jSONObject = whu.V(D()).toString();
        sb3.append("-H \"Content-Type:application/json\" -d '");
        sb3.append(jSONObject.replace("'", "'\\''"));
        sb3.append("' '");
        sb3.append(t().replace("'", "'\\''"));
        sb3.append('\'');
        arrayList.addAll(zhq.q(sb3.toString()));
        return arrayList;
    }

    @Override // defpackage.afvw
    public final synchronized List w(cnh cnhVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String name = this.k.getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 16);
        sb.append("Response type: ");
        sb.append(name);
        sb.append("\n");
        arrayList.add(sb.toString());
        int i = cnhVar.a;
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("Status: ");
        sb2.append(i);
        sb2.append("\n");
        arrayList.add(sb2.toString());
        boolean z = this.c.h;
        StringBuilder sb3 = new StringBuilder(14);
        sb3.append("Cached: ");
        sb3.append(z);
        sb3.append("\n");
        arrayList.add(sb3.toString());
        for (String str : cnhVar.c.keySet()) {
            String str2 = (String) cnhVar.c.get(str);
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
            sb4.append("Header:");
            sb4.append(str);
            sb4.append(":");
            sb4.append(str2);
            sb4.append("\n");
            arrayList.add(sb4.toString());
        }
        if (cnhVar.a == 200) {
            try {
                int length = cnhVar.b.length;
                StringBuilder sb5 = new StringBuilder(46);
                sb5.append("Actual response length (as proto): ");
                sb5.append(length);
                arrayList.add(sb5.toString());
                arrayList.addAll(zhq.q(whu.V(E(cnhVar.b, this.k.getParserForType())).toString()));
            } catch (aoob e) {
                arrayList.add("Could not parse response. See earlier logcat.");
                zga.d("Could not parse response", e);
            }
        } else {
            String str3 = new String(cnhVar.b);
            arrayList.add(str3.length() != 0 ? "Error response: ".concat(str3) : new String("Error response: "));
        }
        return arrayList;
    }

    @Override // defpackage.yvo
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void ql(aooy aooyVar) {
        y();
        this.l.kZ(aooyVar);
    }

    public final void y() {
        this.H = null;
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final boolean z() {
        return this.c.o();
    }
}
