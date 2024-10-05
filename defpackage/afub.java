package defpackage;

import j$.time.Duration;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afub extends afvw implements afum {
    public final afsx a;
    public final shf b;
    public final String c;
    public final long k;
    public final long l;
    public final List m;
    public final Set n;
    private final String q;
    private final Set r;
    private final byte[] s;
    private final Map t;
    private final afve u;

    public afub(int i, String str, String str2, long j, long j2, List list, byte[] bArr, Map map, cnk cnkVar, Set set, shf shfVar, int i2, afsx afsxVar, String str3, afve afveVar) {
        super(i, str, cnkVar);
        boolean z = true;
        amkq.N(i != 1 || (map == null && bArr == null));
        if (map != null && bArr != null) {
            z = false;
        }
        amkq.N(z);
        this.f = new cne((int) Duration.ofSeconds(i2).toMillis(), 0, 0.0f);
        this.h = false;
        str2.getClass();
        this.c = str2;
        this.k = j;
        this.l = j2;
        this.m = list;
        this.s = bArr;
        this.t = map;
        this.r = set;
        this.b = shfVar;
        afsxVar.getClass();
        this.a = afsxVar;
        this.q = str3;
        afveVar.getClass();
        this.u = afveVar;
        this.n = new HashSet();
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final afsx e() {
        return this.a;
    }

    @Override // defpackage.yvo
    public final Map f() {
        HashMap hashMap = new HashMap();
        for (afvb afvbVar : this.r) {
            if (this.u.a(afvbVar.a())) {
                this.n.add(afvbVar.a());
                try {
                    afvbVar.b(hashMap, this);
                } catch (cnb e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("HttpPingRequest: AuthFailureError");
                    sb.append(valueOf);
                    zga.b(sb.toString());
                }
            }
        }
        return hashMap;
    }

    @Override // defpackage.yvo
    public final void o(cnq cnqVar) {
        cnh cnhVar = cnqVar.b;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        return cnm.b(null, null);
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
    }

    @Override // defpackage.yvo
    public final byte[] qm() {
        byte[] bArr = this.s;
        if (bArr != null) {
            return bArr;
        }
        Map map = this.t;
        if (map == null || map.isEmpty()) {
            return null;
        }
        try {
            return ysi.d(this.t, "UTF-8").c();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final String u() {
        return this.q;
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final boolean z() {
        return this.q != null;
    }
}
