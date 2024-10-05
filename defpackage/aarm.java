package defpackage;

import android.net.Uri;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aarm {
    public final aaea a;
    public final yta b;
    private final Set c;
    private final Set d;
    private final Set e;
    private final afqb f;
    private final String g;
    private final String h;
    private final amnv i;
    private final boolean j;
    private final boolean k;
    private final zfm l;
    private final shf m;
    private final afsy n;
    private final boolean o;
    private final aaqz p;
    private final azrw q;
    private final aftj r;
    private final boolean s;
    private final afxj t;

    public aarm(aftj aftjVar, Set set, Set set2, Set set3, afqb afqbVar, afqc afqcVar, ammv ammvVar, amnv amnvVar, boolean z, aadw aadwVar, zfm zfmVar, shf shfVar, afsy afsyVar, aaea aaeaVar, yta ytaVar, aaqz aaqzVar, azrw azrwVar, afxj afxjVar) {
        this.r = aftjVar;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = afqbVar;
        this.i = amnvVar;
        this.g = afqcVar.a();
        this.h = (String) ammvVar.e("");
        this.j = z;
        atej atejVar = aadwVar.b().k;
        avdy avdyVar = (atejVar == null ? atej.a : atejVar).x;
        avdw avdwVar = (avdyVar == null ? avdy.a : avdyVar).e;
        this.k = (avdwVar == null ? avdw.a : avdwVar).j;
        this.l = zfmVar;
        this.m = shfVar;
        this.n = afsyVar;
        this.a = aaeaVar;
        this.b = ytaVar;
        atfq atfqVar = aadwVar.b().o;
        this.o = (atfqVar == null ? atfq.a : atfqVar).d;
        this.p = aaqzVar;
        atfq atfqVar2 = aadwVar.b().o;
        this.s = (atfqVar2 == null ? atfq.a : atfqVar2).f;
        this.q = azrwVar;
        this.t = afxjVar;
    }

    public final aarn a(aaru aaruVar, aooy aooyVar, afwx afwxVar, ykr ykrVar, ykq ykqVar) {
        aars a = aart.a(this.l);
        a.a = new zfi() { // from class: aark
            @Override // defpackage.zfi
            public final void a(Object obj) {
                Uri.Builder builder = (Uri.Builder) obj;
                atfr atfrVar = aarm.this.a.a().f;
                if (atfrVar == null) {
                    atfrVar = atfr.a;
                }
                if (atfrVar.c) {
                    builder.appendQueryParameter("retry", "1");
                }
            }
        };
        return b(aaruVar, aooyVar, afwxVar, ykrVar, ykqVar, a.a());
    }

    public final aarn b(aaru aaruVar, aooy aooyVar, afwx afwxVar, ykr ykrVar, ykq ykqVar, aart aartVar) {
        aaruVar.getClass();
        afwx aarlVar = this.o ? new aarl(this, afwxVar) : afwxVar;
        aftj aftjVar = this.r;
        Set set = this.c;
        Set set2 = this.d;
        Set set3 = this.e;
        afqb afqbVar = this.f;
        String str = this.g;
        String str2 = this.h;
        yvn yvnVar = aaruVar.q;
        if (yvnVar == null) {
            yvnVar = (yvn) this.i.get();
        }
        aarn aarnVar = new aarn(aaruVar, aooyVar, aarlVar, aftjVar, set, set2, set3, afqbVar, str, str2, yvnVar, this.j, this.k, this.m, this.n, this.a, this.p, this.s, this.q, ykrVar, ykqVar, this.t, aartVar);
        aarnVar.h = aaruVar.r();
        yst ystVar = aaruVar.p;
        if (ystVar != null) {
            aarnVar.r(ystVar);
        }
        return aarnVar;
    }
}
