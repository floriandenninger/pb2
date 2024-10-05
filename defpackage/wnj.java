package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wnj implements wng {
    private volatile apck a;
    private List b;
    private List c;
    private apwy d;
    private final aadw e;

    static {
        TimeUnit.SECONDS.toMillis(15L);
    }

    public wnj(aadw aadwVar) {
        this.e = aadwVar;
    }

    private final apbn l() {
        if (this.d == null) {
            this.d = this.e.b();
        }
        apwy apwyVar = this.d;
        if (apwyVar == null || (apwyVar.b & 32) == 0) {
            return null;
        }
        apbn apbnVar = apwyVar.f;
        return apbnVar == null ? apbn.b : apbnVar;
    }

    private final apck m() {
        if (this.e.d()) {
            return this.e.a();
        }
        return this.a == null ? n() : this.a;
    }

    private final synchronized apck n() {
        if (this.a == null) {
            this.a = this.e.a();
        }
        return this.a;
    }

    @Override // defpackage.wng
    public final float a() {
        apbn l = l();
        if (l == null || (l.c & 131072) == 0) {
            return 0.0f;
        }
        return l.j;
    }

    @Override // defpackage.wng
    public final Object b() {
        apbn l = l();
        if (l == null || (l.c & 32768) == 0) {
            return null;
        }
        atud atudVar = l.i;
        return atudVar == null ? atud.a : atudVar;
    }

    @Override // defpackage.wng
    public final String c() {
        String str = m().g;
        return str.isEmpty() ? "googleads.g.doubleclick.net" : str;
    }

    @Override // defpackage.wng
    public final String d() {
        String str = m().h;
        return str.isEmpty() ? "/pagead/ads" : str;
    }

    @Override // defpackage.wng
    public final List e() {
        List list = this.c;
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            apbn l = l();
            if (l != null) {
                Iterator<E> it = new aonw(l.e, apbn.a).iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((apcm) it.next()).f));
                }
            }
            this.c = amru.o(arrayList);
        }
        return this.c;
    }

    @Override // defpackage.wng
    public final List f() {
        List list = this.b;
        if (list == null || list.isEmpty()) {
            this.b = new ArrayList();
            apbn l = l();
            if (l != null) {
                for (apec apecVar : l.d) {
                    List list2 = this.b;
                    apeb b = apeb.b(apecVar.b);
                    if (b == null) {
                        b = apeb.ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN;
                    }
                    list2.add(b);
                }
            }
        }
        return this.b;
    }

    @Override // defpackage.wng
    public final boolean g() {
        apbn l = l();
        if (l == null) {
            return false;
        }
        aovy aovyVar = l.f;
        if (aovyVar == null) {
            aovyVar = aovy.a;
        }
        return aovyVar.b;
    }

    @Override // defpackage.wng
    public final boolean h() {
        return m().i;
    }

    @Override // defpackage.wng
    public final boolean i() {
        apbn l = l();
        if (l == null) {
            return false;
        }
        return l.k;
    }

    @Override // defpackage.wng
    public final boolean j() {
        apbn l = l();
        if (l == null) {
            return false;
        }
        return l.g;
    }

    @Override // defpackage.wng
    public final boolean k() {
        apbn l = l();
        if (l == null) {
            return false;
        }
        return l.h;
    }
}
