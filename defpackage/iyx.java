package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iyx implements acru {
    private final izd a;

    public iyx(izd izdVar) {
        this.a = izdVar;
    }

    @Override // defpackage.acru
    public final void a(asgt asgtVar) {
        aomf aomfVar;
        awav awavVar = asgtVar.d;
        if (awavVar == null) {
            awavVar = awav.a;
        }
        if ((awavVar.b & 1) != 0) {
            awav awavVar2 = asgtVar.d;
            if (awavVar2 == null) {
                awavVar2 = awav.a;
            }
            aomfVar = awavVar2.c;
        } else {
            awav awavVar3 = asgtVar.d;
            if (awavVar3 == null) {
                awavVar3 = awav.a;
            }
            awav awavVar4 = awavVar3.g;
            if (awavVar4 == null) {
                awavVar4 = awav.a;
            }
            if ((awavVar4.b & 1) != 0) {
                awav awavVar5 = asgtVar.d;
                if (awavVar5 == null) {
                    awavVar5 = awav.a;
                }
                awav awavVar6 = awavVar5.g;
                if (awavVar6 == null) {
                    awavVar6 = awav.a;
                }
                aomfVar = awavVar6.c;
            } else {
                aomfVar = null;
            }
        }
        if (aomfVar != null) {
            this.a.b(aomfVar);
        }
    }

    @Override // defpackage.acru
    public final void b() {
    }
}
