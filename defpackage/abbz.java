package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abbz extends aaru {
    public String a;
    public String b;
    public String c;
    public asas d;
    public asad s;
    public boolean t;
    public final List u;
    public String v;
    public int w;
    private String x;
    private final aone y;

    public abbz(ajoy ajoyVar, afsx afsxVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("search", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        this.u = new ArrayList();
        this.w = 1;
        this.i = z;
        this.y = arzy.a.createBuilder();
        k();
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        aone createBuilder = asag.a.createBuilder();
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            asag asagVar = (asag) createBuilder.instance;
            asagVar.b |= 4;
            asagVar.e = str;
        }
        String str2 = this.c;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            asag asagVar2 = (asag) createBuilder.instance;
            asagVar2.b |= 4096;
            asagVar2.k = str2;
        }
        aone aoneVar = this.y;
        if (aoneVar != null) {
            createBuilder.copyOnWrite();
            asag asagVar3 = (asag) createBuilder.instance;
            arzy arzyVar = (arzy) aoneVar.build();
            arzyVar.getClass();
            asagVar3.h = arzyVar;
            asagVar3.b |= 32;
        }
        String str3 = this.x;
        if (str3 != null) {
            createBuilder.copyOnWrite();
            asag asagVar4 = (asag) createBuilder.instance;
            asagVar4.b |= 2;
            asagVar4.d = str3;
        }
        asad asadVar = this.s;
        if (asadVar != null) {
            createBuilder.copyOnWrite();
            asag asagVar5 = (asag) createBuilder.instance;
            asagVar5.i = asadVar;
            asagVar5.b |= 64;
        }
        createBuilder.copyOnWrite();
        asag asagVar6 = (asag) createBuilder.instance;
        asagVar6.g = 0;
        asagVar6.b |= 16;
        String str4 = this.a;
        if (str4 != null) {
            createBuilder.copyOnWrite();
            asag asagVar7 = (asag) createBuilder.instance;
            asagVar7.b |= 8;
            asagVar7.f = str4;
        }
        List list = this.u;
        createBuilder.copyOnWrite();
        asag asagVar8 = (asag) createBuilder.instance;
        aonu aonuVar = asagVar8.n;
        if (!aonuVar.c()) {
            asagVar8.n = aonm.mutableCopy(aonuVar);
        }
        aolo.addAll((Iterable) list, (List) asagVar8.n);
        asas asasVar = this.d;
        if (asasVar != null) {
            createBuilder.copyOnWrite();
            asag asagVar9 = (asag) createBuilder.instance;
            asagVar9.j = asasVar;
            asagVar9.b |= 1024;
        }
        String str5 = this.v;
        if (str5 != null) {
            createBuilder.copyOnWrite();
            asag asagVar10 = (asag) createBuilder.instance;
            asagVar10.b |= 8388608;
            asagVar10.m = str5;
        }
        if (!TextUtils.isEmpty(null)) {
            aone createBuilder2 = aqxm.a.createBuilder();
            createBuilder2.copyOnWrite();
            throw null;
        }
        if (!TextUtils.isEmpty(null)) {
            aone createBuilder3 = aqxn.a.createBuilder();
            createBuilder3.copyOnWrite();
            throw null;
        }
        if (TextUtils.isEmpty(null)) {
            boolean z = this.t;
            createBuilder.copyOnWrite();
            asag asagVar11 = (asag) createBuilder.instance;
            asagVar11.b |= 262144;
            asagVar11.l = z;
            int i = this.w;
            if (i != 1) {
                createBuilder.copyOnWrite();
                asag asagVar12 = (asag) createBuilder.instance;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                asagVar12.o = i2;
                asagVar12.b |= 16777216;
            }
            return createBuilder;
        }
        aone createBuilder4 = aqxn.a.createBuilder();
        createBuilder4.copyOnWrite();
        throw null;
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi g = g();
        g.c("query", this.x);
        g.c("params", this.b);
        g.c("conversationId", this.c);
        g.c("continuation", this.a);
        g.e("filterOptions", ((arzy) this.y.build()).toByteArray());
        asad asadVar = this.s;
        if (asadVar != null) {
            g.e("searchFormData", asadVar.toByteArray());
        }
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        t(this.x, this.a);
    }

    public final void d(String str) {
        this.x = i(str);
    }
}
