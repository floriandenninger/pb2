package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class khb implements khn {
    static final Duration a = Duration.ofSeconds(5);
    public static final khl b = new khm(atxl.PLAYBACK_INTERRUPTION_TYPE_UNEXPECTED_BACKGROUND_SERVICE_DESTROYED);
    private final aypn c;

    public khb(aioc aiocVar, aypn aypnVar, aypn aypnVar2, aypn aypnVar3) {
        aypn C = aypn.C(aypnVar2, aypnVar3);
        this.c = aiocVar.t().b.A(khe.b).M(new kha(aypn.C(aypnVar.P(C), C.M(new kha(aypnVar, 1))), 0));
    }

    @Override // defpackage.khn
    public final aypn a() {
        return this.c.A(jtu.u);
    }
}
