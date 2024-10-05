package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jit implements amml {
    public final /* synthetic */ agnv a;
    private final /* synthetic */ int b;

    public /* synthetic */ jit(agnv agnvVar, int i) {
        this.b = i;
        this.a = agnvVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        agnz agnzVar;
        int i = this.b;
        boolean z = false;
        r1 = false;
        boolean z2 = false;
        r1 = false;
        boolean z3 = false;
        z = false;
        if (i == 0) {
            final agnv agnvVar = this.a;
            final aalc aalcVar = (aalc) obj;
            final int i2 = z ? 1 : 0;
            return new jhx() { // from class: jjn
                @Override // defpackage.jhx
                public final void a(Object obj2) {
                    if (i2 == 0) {
                        aalc aalcVar2 = aalcVar;
                        agnv agnvVar2 = agnvVar;
                        amsx amsxVar = jjo.a;
                        ((jju) obj2).p(aalcVar2, agnvVar2);
                        return;
                    }
                    aalc aalcVar3 = aalcVar;
                    agnv agnvVar3 = agnvVar;
                    amsx amsxVar2 = jjo.a;
                    ((jju) obj2).o(aalcVar3, agnvVar3);
                }
            };
        }
        final int i3 = 1;
        if (i == 1) {
            final agnv agnvVar2 = this.a;
            final aalc aalcVar2 = (aalc) obj;
            return new jhx() { // from class: jjn
                @Override // defpackage.jhx
                public final void a(Object obj2) {
                    if (i3 == 0) {
                        aalc aalcVar22 = aalcVar2;
                        agnv agnvVar22 = agnvVar2;
                        amsx amsxVar = jjo.a;
                        ((jju) obj2).p(aalcVar22, agnvVar22);
                        return;
                    }
                    aalc aalcVar3 = aalcVar2;
                    agnv agnvVar3 = agnvVar2;
                    amsx amsxVar2 = jjo.a;
                    ((jju) obj2).o(aalcVar3, agnvVar3);
                }
            };
        }
        if (i == 2) {
            return ammw.a(this.a, (Boolean) obj);
        }
        if (i == 3) {
            aqpb aqpbVar = (aqpb) obj;
            return Boolean.valueOf(aqpbVar == null ? this.a.y() : aqpbVar.d);
        }
        if (i == 4) {
            agnv agnvVar3 = this.a;
            Boolean bool = (Boolean) obj;
            if ((agnvVar3.i() == agnq.PLAYABLE || agnvVar3.v()) && !bool.booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (i == 5) {
            agnv agnvVar4 = this.a;
            Boolean bool2 = (Boolean) obj;
            if (bool2 != null && bool2.booleanValue()) {
                z3 = true;
            }
            if (agpr.e(agnvVar4, z3)) {
                if (agnvVar4.E()) {
                    return agnq.TRANSFER_PENDING_USER_APPROVAL;
                }
                if (agnvVar4.r()) {
                    return agnq.ERROR_PENDING_PLAYABILITY_ACTION;
                }
                if (agnvVar4.w()) {
                    return agnq.ERROR_NOT_PLAYABLE;
                }
                if (!z3) {
                    agnu agnuVar = agnvVar4.j;
                    if (agnuVar != null && agnvVar4.x()) {
                        if (agnuVar.f()) {
                            return agnq.ERROR_EXPIRED;
                        }
                        return agnq.ERROR_POLICY;
                    }
                    if (!agnvVar4.a()) {
                        return agnq.ERROR_STREAMS_MISSING;
                    }
                    agnf agnfVar = agnf.DELETED;
                    int ordinal = agnvVar4.l.ordinal();
                    if (ordinal == 5) {
                        return agnq.ERROR_DISK;
                    }
                    if (ordinal == 6) {
                        return agnq.ERROR_NETWORK;
                    }
                    if (ordinal == 14) {
                        return agnq.ERROR_STREAMS_OUT_OF_DATE;
                    }
                    return agnq.ERROR_GENERIC;
                }
                return agnq.ERROR_EXPIRED_RENTAL;
            }
            if (agnvVar4.b()) {
                return agnq.PLAYABLE;
            }
            if (!agnvVar4.s()) {
                if (agnvVar4.C()) {
                    return agnq.TRANSFER_PAUSED;
                }
                if (agnvVar4.B()) {
                    if (agnvVar4.z()) {
                        return agnq.ERROR_DISK_SD_CARD;
                    }
                    return agnq.TRANSFER_IN_PROGRESS;
                }
                if (agnvVar4.D() && (agnzVar = agnvVar4.o) != null) {
                    int i4 = agnzVar.c;
                    if ((i4 & 2) != 0) {
                        return agnq.TRANSFER_PENDING_NETWORK;
                    }
                    if ((i4 & 8) != 0) {
                        return agnq.TRANSFER_PENDING_WIFI;
                    }
                    if ((i4 & 4096) != 0) {
                        return agnq.TRANSFER_PENDING_STORAGE;
                    }
                }
                return agnq.TRANSFER_WAITING_IN_QUEUE;
            }
            return agnq.CANDIDATE;
        }
        agnv agnvVar5 = this.a;
        Boolean bool3 = (Boolean) obj;
        if (bool3 != null && bool3.booleanValue()) {
            z2 = true;
        }
        return Boolean.valueOf(agpr.e(agnvVar5, z2));
    }
}
