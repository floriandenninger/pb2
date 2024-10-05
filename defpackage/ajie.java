package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajie implements syl {
    private static void b(ajgg ajggVar, acsa acsaVar) {
        ajggVar.j(new ajid(ajggVar, acsaVar));
    }

    private static void d(ajgg ajggVar, acsa acsaVar) {
        ajggVar.p(new ajic(ajggVar, acsaVar, 0));
    }

    private static boolean f(long j, int i) {
        return (j & ((long) (i + (-1)))) > 0;
    }

    @Override // defpackage.syl
    public final aomu a() {
        return asul.b;
    }

    @Override // defpackage.syn
    public final /* bridge */ /* synthetic */ void c(dhe dheVar, sxc sxcVar, String str, Object obj, sxs sxsVar, swt swtVar) {
        asuh asuhVar;
        acqx acqxVar;
        long j;
        asul asulVar = (asul) obj;
        if (!(sxsVar instanceof ajgg)) {
            zga.l("Missing YouTube element builder!");
            return;
        }
        ajgg ajggVar = (ajgg) sxsVar;
        boolean pY = asulVar.pY(asuk.a);
        if (pY) {
            asuhVar = (asuh) asulVar.pX(asuk.a);
        } else {
            asuhVar = asuh.b;
        }
        if (pY) {
            acqxVar = new acqx(asuhVar);
        } else {
            acqxVar = new acqx(asulVar.c);
        }
        if (pY) {
            if ((asuhVar.c & 2) != 0) {
                awau awauVar = asuhVar.e;
                if (awauVar == null) {
                    awauVar = awau.a;
                }
                j = awauVar.c;
            } else {
                j = 0;
            }
            if (j <= 0) {
                d(ajggVar, acqxVar);
                b(ajggVar, acqxVar);
                return;
            }
            if (f(j, 2)) {
                ajggVar.i(new ajic(ajggVar, acqxVar, 1));
            }
            if (f(j, 5)) {
                d(ajggVar, acqxVar);
            }
            if (f(j, 9)) {
                b(ajggVar, acqxVar);
                return;
            }
            return;
        }
        d(ajggVar, acqxVar);
    }

    @Override // defpackage.syn
    public final /* synthetic */ void e(sxs sxsVar) {
        throw null;
    }
}
