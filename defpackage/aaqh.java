package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aaqh {
    public static aaea e;
    private String a;
    private final Boolean c;
    private int d;
    protected Map f;
    public byte[] g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public final String l;
    public final String m;
    public final afsx n;
    public final Optional o;
    public yst p;
    public yvn q;
    private volatile aone s;
    private final ajoy t;
    public int r = 1;
    private final Object b = new Object();

    public aaqh(String str, ajoy ajoyVar, afsx afsxVar, int i, boolean z, Optional optional, String str2, Boolean bool, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = 1;
        this.m = str;
        ajoyVar.getClass();
        this.t = ajoyVar;
        afsxVar.getClass();
        this.n = afsxVar;
        this.d = i;
        this.i = z;
        this.l = str2;
        this.c = bool;
        this.o = optional;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int f(int i) {
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public static String i(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void t(String... strArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                i++;
            }
        }
        amkq.N(i == 1);
    }

    public String b() {
        return "NO_CACHE_KEY_VALUE";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r1.d == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afpi g() {
        /*
            r3 = this;
            afpi r0 = new afpi
            r0.<init>()
            java.lang.String r1 = r3.m
            java.lang.String r2 = "serviceName"
            r0.c(r2, r1)
            aaea r1 = defpackage.aaqh.e
            if (r1 == 0) goto L1e
            arfd r1 = r1.a()
            atfr r1 = r1.f
            if (r1 != 0) goto L1a
            atfr r1 = defpackage.atfr.a
        L1a:
            boolean r1 = r1.d
            if (r1 != 0) goto L29
        L1e:
            byte[] r1 = r3.g
            if (r1 != 0) goto L24
            byte[] r1 = defpackage.aaef.b
        L24:
            java.lang.String r2 = "clickTrackingParams"
            r0.e(r2, r1)
        L29:
            afsx r1 = r3.n
            java.lang.String r1 = r1.b()
            java.lang.String r2 = "identity"
            r0.c(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaqh.g():afpi");
    }

    public amru h() {
        return amru.q();
    }

    public Map j() {
        if (this.f == null) {
            this.f = new HashMap();
        }
        return this.f;
    }

    public final void k() {
        m(aaef.b);
    }

    public final void l(aomf aomfVar) {
        amkq.E(aomfVar != null);
        this.g = aomfVar.I();
    }

    public final void m(byte[] bArr) {
        bArr.getClass();
        this.g = bArr;
    }

    public final void n(String str) {
        zhq.m(str);
        this.a = str;
    }

    public final boolean o() {
        return this.c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p() {
        return true;
    }

    public final boolean q() {
        return this.d == 3;
    }

    public final boolean r() {
        return this.d != 1;
    }

    public final void s(int i) {
        if (i != 1 && "NO_CACHE_KEY_VALUE".equals(b())) {
            throw new UnsupportedOperationException("You must override getCacheKey() in order to use forced caching.");
        }
        this.d = i;
    }

    public final aone u() {
        if (this.s == null) {
            synchronized (this.b) {
                if (this.s == null) {
                    aone t = this.t.t();
                    arng arngVar = ((arnb) t.instance).e;
                    if (arngVar == null) {
                        arngVar = arng.a;
                    }
                    aone builder = arngVar.toBuilder();
                    if (this.n.w()) {
                        String e2 = this.n.e();
                        builder.copyOnWrite();
                        arng arngVar2 = (arng) builder.instance;
                        arngVar2.b |= 8;
                        arngVar2.c = e2;
                    }
                    Boolean bool = this.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        builder.copyOnWrite();
                        arng arngVar3 = (arng) builder.instance;
                        arngVar3.b |= 4096;
                        arngVar3.e = booleanValue;
                    }
                    t.copyOnWrite();
                    arnb arnbVar = (arnb) t.instance;
                    arng arngVar4 = (arng) builder.build();
                    arngVar4.getClass();
                    arnbVar.e = arngVar4;
                    arnbVar.b |= 4;
                    if (this.g != null) {
                        aone createBuilder = armu.a.createBuilder();
                        aomf x = aomf.x(this.g);
                        createBuilder.copyOnWrite();
                        armu armuVar = (armu) createBuilder.instance;
                        armuVar.b |= 1;
                        armuVar.c = x;
                        t.copyOnWrite();
                        arnb arnbVar2 = (arnb) t.instance;
                        armu armuVar2 = (armu) createBuilder.build();
                        armuVar2.getClass();
                        arnbVar2.g = armuVar2;
                        arnbVar2.b |= 32;
                    }
                    if (!TextUtils.isEmpty(this.a)) {
                        String str = this.a;
                        t.copyOnWrite();
                        arnb arnbVar3 = (arnb) t.instance;
                        str.getClass();
                        arnbVar3.b |= 64;
                        arnbVar3.h = str;
                    }
                    armz armzVar = ((arnb) t.instance).c;
                    if (armzVar == null) {
                        armzVar = armz.a;
                    }
                    aone builder2 = armzVar.toBuilder();
                    int i = this.r;
                    if (i != 1) {
                        builder2.copyOnWrite();
                        armz armzVar2 = (armz) builder2.instance;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        armzVar2.z = i2;
                        armzVar2.c |= 131072;
                    }
                    String str2 = this.k;
                    if (str2 != null) {
                        builder2.copyOnWrite();
                        armz armzVar3 = (armz) builder2.instance;
                        armzVar3.b |= 2097152;
                        armzVar3.m = str2;
                    }
                    t.copyOnWrite();
                    arnb arnbVar4 = (arnb) t.instance;
                    armz armzVar4 = (armz) builder2.build();
                    armzVar4.getClass();
                    arnbVar4.c = armzVar4;
                    arnbVar4.b |= 1;
                    if (this.j) {
                        arnc arncVar = ((arnb) t.instance).f;
                        if (arncVar == null) {
                            arncVar = arnc.a;
                        }
                        aone builder3 = arncVar.toBuilder();
                        builder3.copyOnWrite();
                        arnc arncVar2 = (arnc) builder3.instance;
                        arncVar2.b |= 8192;
                        arncVar2.c = true;
                        t.copyOnWrite();
                        arnb arnbVar5 = (arnb) t.instance;
                        arnc arncVar3 = (arnc) builder3.build();
                        arncVar3.getClass();
                        arnbVar5.f = arncVar3;
                        arnbVar5.b |= 16;
                    }
                    this.s = t;
                }
            }
        }
        return this.s;
    }
}
