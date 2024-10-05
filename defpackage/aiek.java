package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiek implements aijo {
    private final ywr b;
    private final aaea c;
    private ammv d = amlr.a;
    public ammv a = amlr.a;

    public aiek(aaea aaeaVar, ywr ywrVar) {
        this.c = aaeaVar;
        this.b = ywrVar;
    }

    private final synchronized void c() {
        if (this.d.h()) {
            ((ayqx) this.d.c()).qc();
            this.d = amlr.a;
            this.a = amlr.a;
        }
    }

    public final synchronized void b() {
        if (this.d.h()) {
            return;
        }
        this.d = ammv.j(this.b.d().G().X(new ayrs() { // from class: aiej
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aiek.this.a = ammv.j((awvr) obj);
            }
        }));
    }

    @Override // defpackage.aijo
    public final void qZ(aijr aijrVar) {
        atcl atclVar = this.c.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        if (atcmVar.g <= 0) {
            if (this.d.h()) {
                c();
            }
        } else if (!this.d.h()) {
            b();
        }
        if (this.d.h() && this.a.h()) {
            awvr awvrVar = (awvr) this.a.d(advx.t);
            aone createBuilder = aryq.a.createBuilder();
            avzr b = avzr.b(awvrVar.n);
            if (b == null) {
                b = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            createBuilder.copyOnWrite();
            aryq aryqVar = (aryq) createBuilder.instance;
            aryqVar.d = b.e;
            aryqVar.b |= 2;
            avzr b2 = avzr.b(awvrVar.m);
            if (b2 == null) {
                b2 = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            createBuilder.copyOnWrite();
            aryq aryqVar2 = (aryq) createBuilder.instance;
            aryqVar2.c = b2.e;
            aryqVar2.b |= 1;
            long j = awvrVar.o;
            createBuilder.copyOnWrite();
            aryq aryqVar3 = (aryq) createBuilder.instance;
            aryqVar3.b |= 4;
            aryqVar3.e = j;
            final aryq aryqVar4 = (aryq) createBuilder.build();
            aijrVar.z = aryqVar4;
            aijrVar.d(new aijq() { // from class: aiei
                @Override // defpackage.aijq
                public final void a(afpi afpiVar) {
                    afpiVar.e("videoQualitySettingParams", aryq.this.toByteArray());
                }
            });
        }
    }
}
