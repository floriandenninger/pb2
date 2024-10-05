package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aauc extends aaru {
    public int A;
    private String B;
    private String C;
    private final String D;
    public final List a;
    public boolean b;
    public String c;
    public String d;
    public aqej s;
    public arjp t;
    public final List u;
    public atnd v;
    public boolean w;
    public arju x;
    public aqkg y;
    public atbc z;

    public aauc(ajoy ajoyVar, afsx afsxVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("browse", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        this.a = new ArrayList();
        this.b = false;
        this.c = "";
        this.B = "";
        this.d = "";
        this.s = null;
        this.u = new ArrayList();
        this.A = 1;
        this.D = Locale.getDefault().toString();
        this.i = z;
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        aong aongVar = (aong) arjt.a.createBuilder();
        boolean z = this.b;
        aongVar.copyOnWrite();
        arjt arjtVar = (arjt) aongVar.instance;
        arjtVar.b |= 8192;
        arjtVar.i = z;
        boolean z2 = this.w;
        aongVar.copyOnWrite();
        arjt arjtVar2 = (arjt) aongVar.instance;
        arjtVar2.b |= 4194304;
        arjtVar2.m = z2;
        if (!TextUtils.isEmpty(this.c)) {
            String str = this.c;
            aongVar.copyOnWrite();
            arjt arjtVar3 = (arjt) aongVar.instance;
            str.getClass();
            arjtVar3.b |= 2;
            arjtVar3.d = str;
        }
        if (!TextUtils.isEmpty(this.B)) {
            String str2 = this.B;
            aongVar.copyOnWrite();
            arjt arjtVar4 = (arjt) aongVar.instance;
            str2.getClass();
            arjtVar4.b |= 16;
            arjtVar4.g = str2;
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str3 = this.d;
            aongVar.copyOnWrite();
            arjt arjtVar5 = (arjt) aongVar.instance;
            str3.getClass();
            arjtVar5.b |= 8;
            arjtVar5.f = str3;
        }
        if (!TextUtils.isEmpty(this.C)) {
            String str4 = this.C;
            aongVar.copyOnWrite();
            arjt arjtVar6 = (arjt) aongVar.instance;
            str4.getClass();
            arjtVar6.b |= 4;
            arjtVar6.e = str4;
        }
        int i = this.A;
        if (i != 1) {
            aongVar.copyOnWrite();
            arjt arjtVar7 = (arjt) aongVar.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            arjtVar7.p = i2;
            arjtVar7.b |= 8388608;
        }
        List list = this.u;
        aongVar.copyOnWrite();
        arjt arjtVar8 = (arjt) aongVar.instance;
        aony aonyVar = arjtVar8.o;
        if (!aonyVar.c()) {
            arjtVar8.o = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) arjtVar8.o);
        atnd atndVar = this.v;
        if (atndVar != null) {
            aongVar.copyOnWrite();
            arjt arjtVar9 = (arjt) aongVar.instance;
            arjtVar9.h = atndVar;
            arjtVar9.b |= 2048;
        }
        if (!TextUtils.isEmpty(null)) {
            aone createBuilder = aqxm.a.createBuilder();
            createBuilder.copyOnWrite();
            throw null;
        }
        if (!TextUtils.isEmpty(null)) {
            aone createBuilder2 = aqxn.a.createBuilder();
            createBuilder2.copyOnWrite();
            throw null;
        }
        if (TextUtils.isEmpty(null)) {
            arjp arjpVar = this.t;
            if (arjpVar != null) {
                aongVar.copyOnWrite();
                arjt arjtVar10 = (arjt) aongVar.instance;
                arjtVar10.j = arjpVar;
                arjtVar10.b |= 65536;
            }
            aqej aqejVar = this.s;
            if (aqejVar != null) {
                aongVar.copyOnWrite();
                arjt arjtVar11 = (arjt) aongVar.instance;
                arjtVar11.k = aqejVar;
                arjtVar11.b |= 2097152;
            }
            List list2 = this.a;
            aongVar.copyOnWrite();
            arjt arjtVar12 = (arjt) aongVar.instance;
            aonu aonuVar = arjtVar12.n;
            if (!aonuVar.c()) {
                arjtVar12.n = aonm.mutableCopy(aonuVar);
            }
            aolo.addAll((Iterable) list2, (List) arjtVar12.n);
            arju arjuVar = this.x;
            if (arjuVar != null) {
                aongVar.copyOnWrite();
                arjt arjtVar13 = (arjt) aongVar.instance;
                arjtVar13.r = arjuVar;
                arjtVar13.b |= 134217728;
            }
            aqkg aqkgVar = this.y;
            if (aqkgVar != null) {
                aongVar.copyOnWrite();
                arjt arjtVar14 = (arjt) aongVar.instance;
                arjtVar14.q = aqkgVar;
                arjtVar14.b |= 67108864;
            }
            atbc atbcVar = this.z;
            if (atbcVar != null) {
                aongVar.copyOnWrite();
                arjt arjtVar15 = (arjt) aongVar.instance;
                arjtVar15.s = atbcVar;
                arjtVar15.b |= 536870912;
            }
            return aongVar;
        }
        aone createBuilder3 = aqxn.a.createBuilder();
        createBuilder3.copyOnWrite();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    @Override // defpackage.aaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r6 = this;
            afpi r0 = r6.g()
            java.lang.String r1 = r6.c
            java.lang.String r2 = "browseId"
            r0.c(r2, r1)
            java.lang.String r1 = r6.D
            java.lang.String r2 = "language"
            r0.c(r2, r1)
            java.lang.String r1 = r6.B
            java.lang.String r2 = "continuation"
            r0.c(r2, r1)
            arjp r1 = r6.t
            if (r1 == 0) goto L60
            int r2 = r1.b
            r3 = 347924010(0x14bce62a, float:1.9073933E-26)
            if (r2 != r3) goto L29
            java.lang.Object r1 = r1.c
            arka r1 = (defpackage.arka) r1
            goto L2b
        L29:
            arka r1 = defpackage.arka.a
        L2b:
            aony r1 = r1.b
            int r1 = r1.size()
            if (r1 <= 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            arjp r2 = r6.t
            int r4 = r2.b
            if (r4 != r3) goto L43
            java.lang.Object r2 = r2.c
            arka r2 = (defpackage.arka) r2
            goto L45
        L43:
            arka r2 = defpackage.arka.a
        L45:
            aony r2 = r2.b
            java.util.Iterator r2 = r2.iterator()
        L4b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            goto L4b
        L5b:
            java.lang.String r1 = r1.toString()
            goto L62
        L60:
            java.lang.String r1 = ""
        L62:
            java.lang.String r2 = "filteredBrowseParamsFormData"
            r0.c(r2, r1)
            java.lang.String r1 = r6.C
            java.lang.String r2 = "params"
            r0.c(r2, r1)
            java.lang.String r1 = r6.d
            java.lang.String r2 = "query"
            r0.c(r2, r1)
            boolean r1 = r6.b
            java.lang.String r2 = "offline"
            r0.d(r2, r1)
            java.lang.String r1 = "forceAdUrls"
            java.lang.String r2 = "null"
            r0.c(r1, r2)
            java.lang.String r1 = "forceAdKeyword"
            r3 = 0
            r0.c(r1, r3)
            java.lang.String r1 = "forceViralAdResponseUrl"
            r0.c(r1, r3)
            java.lang.String r1 = "forcePresetAd"
            r0.c(r1, r3)
            boolean r1 = r6.w
            java.lang.String r3 = "extendedPermissions"
            r0.d(r3, r1)
            atnd r1 = r6.v
            if (r1 == 0) goto Lc2
            aone r1 = r1.toBuilder()
            r1.copyOnWrite()
            aonm r3 = r1.instance
            atnd r3 = (defpackage.atnd) r3
            int r4 = r3.b
            r4 = r4 & (-5)
            r3.b = r4
            r4 = 0
            r3.d = r4
            aonm r1 = r1.build()
            atnd r1 = (defpackage.atnd) r1
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "browseNotificationsParams"
            r0.c(r3, r1)
        Lc2:
            java.lang.String r1 = r6.k
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto Lcf
            java.lang.String r3 = "rawDeviceId"
            r0.c(r3, r1)
        Lcf:
            java.lang.String r1 = "musicBrowseRequestDeepLinkUrl"
            r0.c(r1, r2)
            java.lang.String r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aauc.b():java.lang.String");
    }

    @Override // defpackage.aaqh
    protected final void c() {
        t(this.c, this.B);
    }

    public final void d(String str) {
        this.c = i(str);
    }

    public final void e(ajce ajceVar) {
        this.B = i(ajceVar.b());
        m(ajceVar.d());
    }

    @Override // defpackage.aaqh
    public final amru h() {
        return amru.r(this.c);
    }

    public final void v(String str) {
        this.C = i(str);
    }
}
