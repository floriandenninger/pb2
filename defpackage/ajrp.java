package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajrp {
    public final aumb a;
    public final atsx b;

    public ajrp(aumb aumbVar) {
        atsx atsxVar;
        this.a = aumbVar;
        atsy atsyVar = aumbVar.c;
        if (((atsyVar == null ? atsy.a : atsyVar).b & 1) != 0) {
            atsy atsyVar2 = aumbVar.c;
            atsxVar = (atsyVar2 == null ? atsy.a : atsyVar2).c;
            if (atsxVar == null) {
                atsxVar = atsx.a;
            }
        } else {
            atsxVar = null;
        }
        this.b = atsxVar;
    }

    public final apll a() {
        aplk aplkVar = this.a.h;
        if (aplkVar == null) {
            aplkVar = aplk.a;
        }
        if ((aplkVar.b & 2) == 0) {
            return null;
        }
        aplk aplkVar2 = this.a.h;
        if (aplkVar2 == null) {
            aplkVar2 = aplk.a;
        }
        apll apllVar = aplkVar2.c;
        return apllVar == null ? apll.a : apllVar;
    }
}
