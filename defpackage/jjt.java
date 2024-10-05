package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jjt extends jhl {
    private final azrw a;

    public jjt(azrw azrwVar) {
        this.a = azrwVar;
    }

    private static amru h(agnn agnnVar) {
        if (agnnVar == null) {
            return amru.q();
        }
        amrp f = amru.f();
        agnm agnmVar = agnnVar.b;
        agnm agnmVar2 = agnnVar.a;
        boolean z = agnnVar.e;
        if (agnmVar != null) {
            f.h(t(agnmVar, 2, z));
        }
        if (agnmVar2 != null) {
            f.h(t(agnmVar2, 3, z));
        }
        return f.g();
    }

    private static amsx i(amsx amsxVar) {
        avjo avjoVar;
        amsv i = amsx.i();
        amxd listIterator = amsxVar.listIterator();
        while (listIterator.hasNext()) {
            agnn agnnVar = (agnn) listIterator.next();
            String f = agnnVar.f();
            long j = agnnVar.c;
            if (j == 0) {
                avjoVar = avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE;
            } else if (j == agnnVar.d) {
                avjoVar = avjo.TRANSFER_STATE_COMPLETE;
            } else {
                avjoVar = avjo.TRANSFER_STATE_TRANSFERRING;
            }
            i.c(evr.bH(f, avjoVar, h(agnnVar), amlr.a));
        }
        return i.g();
    }

    private final amsx j(amsx amsxVar) {
        agjd d = ((agof) this.a.get()).a().d();
        amsv i = amsx.i();
        amxd listIterator = amsxVar.listIterator();
        while (listIterator.hasNext()) {
            agnn c = d.c((String) listIterator.next(), null);
            if (c != null) {
                i.c(c);
            }
        }
        return i.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.avjq k(defpackage.agnv r4) {
        /*
            agnf r0 = r4.l
            agnz r1 = r4.o
            agnf r2 = defpackage.agnf.DELETED
            int r0 = r0.ordinal()
            r2 = 12
            if (r0 == r2) goto L68
            r2 = 14
            if (r0 == r2) goto L68
            switch(r0) {
                case 1: goto L5e;
                case 2: goto L37;
                case 3: goto L68;
                case 4: goto L68;
                case 5: goto L29;
                case 6: goto L68;
                case 7: goto L68;
                case 8: goto L1f;
                default: goto L15;
            }
        L15:
            android.util.Pair r0 = new android.util.Pair
            avjo r1 = defpackage.avjo.TRANSFER_STATE_UNKNOWN
            amlr r2 = defpackage.amlr.a
            r0.<init>(r1, r2)
            goto L71
        L1f:
            android.util.Pair r0 = new android.util.Pair
            avjo r1 = defpackage.avjo.TRANSFER_STATE_PAUSED_BY_USER
            amlr r2 = defpackage.amlr.a
            r0.<init>(r1, r2)
            goto L71
        L29:
            android.util.Pair r0 = new android.util.Pair
            avjo r1 = defpackage.avjo.TRANSFER_STATE_FAILED
            avjp r2 = defpackage.avjp.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE
            ammv r2 = defpackage.ammv.j(r2)
            r0.<init>(r1, r2)
            goto L71
        L37:
            if (r1 != 0) goto L43
            android.util.Pair r0 = new android.util.Pair
            avjo r1 = defpackage.avjo.TRANSFER_STATE_UNKNOWN
            amlr r2 = defpackage.amlr.a
            r0.<init>(r1, r2)
            goto L71
        L43:
            android.util.Pair r0 = new android.util.Pair
            avjo r2 = r1.b
            agmx r1 = r1.g
            java.lang.String r3 = "sd_card_offline_disk_error"
            boolean r1 = r1.l(r3)
            if (r1 == 0) goto L58
            avjp r1 = defpackage.avjp.TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE
            ammv r1 = defpackage.ammv.j(r1)
            goto L5a
        L58:
            amlr r1 = defpackage.amlr.a
        L5a:
            r0.<init>(r2, r1)
            goto L71
        L5e:
            android.util.Pair r0 = new android.util.Pair
            avjo r1 = defpackage.avjo.TRANSFER_STATE_COMPLETE
            amlr r2 = defpackage.amlr.a
            r0.<init>(r1, r2)
            goto L71
        L68:
            android.util.Pair r0 = new android.util.Pair
            avjo r1 = defpackage.avjo.TRANSFER_STATE_FAILED
            amlr r2 = defpackage.amlr.a
            r0.<init>(r1, r2)
        L71:
            java.lang.Object r1 = r0.first
            avjo r1 = (defpackage.avjo) r1
            java.lang.Object r0 = r0.second
            ammv r0 = (defpackage.ammv) r0
            avjo r2 = defpackage.avjo.TRANSFER_STATE_UNKNOWN
            if (r1 != r2) goto L7f
            r4 = 0
            return r4
        L7f:
            java.lang.String r2 = r4.m()
            agnn r4 = r4.n
            amru r4 = h(r4)
            avjq r4 = defpackage.evr.bH(r2, r1, r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjt.k(agnv):avjq");
    }

    private final Map r() {
        return ((agof) this.a.get()).a().g().f();
    }

    private final void s(aalc aalcVar, agnv agnvVar) {
        avjq k = k(agnvVar);
        amsx i = i(j(evr.bU(r(), agnvVar.m())));
        if (k != null) {
            aalcVar.k(k);
        } else {
            aalcVar.g(fhe.x(agnvVar.m()));
        }
        amxd listIterator = i.listIterator();
        while (listIterator.hasNext()) {
            aalcVar.k((avjq) listIterator.next());
        }
    }

    private static auyr t(agnm agnmVar, int i, boolean z) {
        long j = agnmVar.d;
        long b = agnmVar.b();
        aone createBuilder = auyr.a.createBuilder();
        createBuilder.copyOnWrite();
        auyr auyrVar = (auyr) createBuilder.instance;
        auyrVar.b |= 1;
        auyrVar.c = j;
        createBuilder.copyOnWrite();
        auyr auyrVar2 = (auyr) createBuilder.instance;
        auyrVar2.b |= 2;
        auyrVar2.d = b;
        createBuilder.copyOnWrite();
        auyr auyrVar3 = (auyr) createBuilder.instance;
        auyrVar3.e = i - 1;
        auyrVar3.b |= 4;
        int i2 = j == b ? z ? 3 : 4 : 2;
        createBuilder.copyOnWrite();
        auyr auyrVar4 = (auyr) createBuilder.instance;
        auyrVar4.f = i2 - 1;
        auyrVar4.b |= 8;
        aomf byteString = agnmVar.b.a.toByteString();
        createBuilder.copyOnWrite();
        auyr auyrVar5 = (auyr) createBuilder.instance;
        auyrVar5.b |= 16;
        auyrVar5.g = byteString;
        return (auyr) createBuilder.build();
    }

    @Override // defpackage.jhl
    protected final amsx a(agsw agswVar) {
        amsv i = amsx.i();
        Map r = r();
        for (agnv agnvVar : agswVar.j()) {
            avjq k = k(agnvVar);
            if (k != null) {
                i.c(k);
            }
            i.j(i(j(evr.bU(r, agnvVar.m()))));
        }
        return i.g();
    }

    @Override // defpackage.jhl
    protected final void b(aalc aalcVar, agnv agnvVar) {
        s(aalcVar, agnvVar);
    }

    @Override // defpackage.jhl
    protected final void d(aalc aalcVar, agnv agnvVar) {
        s(aalcVar, agnvVar);
    }

    @Override // defpackage.jhl
    protected final void e(aalc aalcVar, String str) {
        aalcVar.g(fhe.x(str));
    }
}
