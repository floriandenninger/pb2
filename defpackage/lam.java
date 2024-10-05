package defpackage;

import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lam implements ykl {
    final /* synthetic */ lan a;

    public lam(lan lanVar) {
        this.a = lanVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zfl a = this.a.a.a(exc);
        this.a.B.b(a.a, true);
        evr.bX(this.a.C, a.b);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        List list = (List) obj2;
        if (this.a.c.y()) {
            this.a.C.G(acsb.b(122502), acrs.DEFAULT, null);
        }
        if (list.size() == 0) {
            lan lanVar = this.a;
            ajpd ajpdVar = lanVar.b;
            aone createBuilder = apib.a.createBuilder();
            aone createBuilder2 = apic.a.createBuilder();
            createBuilder2.copyOnWrite();
            apic apicVar = (apic) createBuilder2.instance;
            apicVar.c = 1;
            apicVar.b |= 1;
            createBuilder.copyOnWrite();
            apib apibVar = (apib) createBuilder.instance;
            apic apicVar2 = (apic) createBuilder2.build();
            apicVar2.getClass();
            apibVar.j = apicVar2;
            apibVar.b |= 256;
            aone createBuilder3 = apid.a.createBuilder();
            arfr arfrVar = arfr.EMPTY_SEARCH;
            createBuilder3.copyOnWrite();
            apid apidVar = (apid) createBuilder3.instance;
            apidVar.c = arfrVar.pV;
            apidVar.b |= 1;
            createBuilder.copyOnWrite();
            apib apibVar2 = (apib) createBuilder.instance;
            apid apidVar2 = (apid) createBuilder3.build();
            apidVar2.getClass();
            apibVar2.d = apidVar2;
            apibVar2.c = 3;
            aqyg g = ajcq.g(lanVar.A.getString(R.string.no_saved_videos_found));
            createBuilder.copyOnWrite();
            apib apibVar3 = (apib) createBuilder.instance;
            g.getClass();
            apibVar3.e = g;
            apibVar3.b |= 1;
            ajpdVar.add((apib) createBuilder.build());
        } else {
            this.a.b.addAll(list);
        }
        this.a.B.a();
    }
}
