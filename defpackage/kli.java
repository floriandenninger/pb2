package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kli implements fmy {
    public aupb a = aupb.SEEK_SOURCE_UNKNOWN;
    private final acra b;
    private long c;
    private boolean d;
    private final aadw e;

    public kli(acra acraVar, aadw aadwVar) {
        this.b = acraVar;
        this.e = aadwVar;
    }

    private final boolean c() {
        return evr.aW(this.e);
    }

    @Override // defpackage.fmy
    public final void a(long j) {
        aupb aupbVar;
        if (c()) {
            if (this.d) {
                aupbVar = aupb.SEEK_SOURCE_PICK_UP_PLAY_HEAD;
            } else {
                aupbVar = aupb.SEEK_SOURCE_SLIDE_ON_SCRUBBER_BAR;
            }
            aone createBuilder = asid.a.createBuilder();
            long j2 = this.c;
            createBuilder.copyOnWrite();
            asid asidVar = (asid) createBuilder.instance;
            asidVar.b |= 2;
            asidVar.d = (int) j2;
            createBuilder.copyOnWrite();
            asid asidVar2 = (asid) createBuilder.instance;
            asidVar2.b |= 4;
            asidVar2.e = (int) j;
            createBuilder.copyOnWrite();
            asid asidVar3 = (asid) createBuilder.instance;
            asidVar3.c = aupbVar.n;
            asidVar3.b |= 1;
            asid asidVar4 = (asid) createBuilder.build();
            aone createBuilder2 = asht.a.createBuilder();
            createBuilder2.copyOnWrite();
            asht ashtVar = (asht) createBuilder2.instance;
            asidVar4.getClass();
            ashtVar.G = asidVar4;
            ashtVar.c |= 67108864;
            this.b.I(3, new acqx(acsb.c(112394)), (asht) createBuilder2.build());
            this.a = aupbVar;
        }
    }

    @Override // defpackage.fmy
    public final void b(long j, boolean z) {
        if (c()) {
            this.c = j;
            this.d = z;
            this.b.n(new acqx(acsb.c(112394)));
        }
    }
}
