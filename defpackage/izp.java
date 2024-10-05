package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class izp implements ynk {
    public final /* synthetic */ afwx a;
    private final /* synthetic */ int b;

    public /* synthetic */ izp(afwx afwxVar, int i) {
        this.b = i;
        this.a = afwxVar;
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            b((Throwable) obj);
            return;
        }
        if (i == 1) {
            b((Throwable) obj);
            return;
        }
        if (i == 2) {
            b((Throwable) obj);
        } else if (i != 3) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ynk
    public final void b(Throwable th) {
        cnq cnqVar;
        int i = this.b;
        if (i == 0) {
            afwx afwxVar = this.a;
            if (th instanceof cnq) {
                cnqVar = (cnq) th;
            } else {
                cnqVar = new cnq(th);
            }
            afwxVar.kY(cnqVar);
            return;
        }
        if (i == 1) {
            afwx afwxVar2 = this.a;
            int i2 = gpy.c;
            if (th instanceof cnq) {
                afwxVar2.kY((cnq) th);
                return;
            } else {
                zga.d("Error getting GetSettingsResponseModel", th);
                return;
            }
        }
        if (i == 2) {
            afwx afwxVar3 = this.a;
            int i3 = xra.a;
            afwxVar3.kY((cnq) th);
        } else {
            if (i == 3) {
                afwx afwxVar4 = this.a;
                int i4 = abbn.a;
                if (th instanceof cnq) {
                    afwxVar4.kY((cnq) th);
                    return;
                } else {
                    afwxVar4.kY(new cnq(th));
                    return;
                }
            }
            afwx afwxVar5 = this.a;
            int i5 = abcw.a;
            if (th instanceof cnq) {
                afwxVar5.kY((cnq) th);
            } else {
                afwxVar5.kY(new cnq(th));
            }
        }
    }
}
