package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ehy implements amdt, amgl, axqj {
    private final efz a;
    private final ehy b;

    public ehy() {
    }

    public ehy(efz efzVar) {
        this.b = this;
        this.a = efzVar;
    }

    @Override // defpackage.amgl
    public final Set a() {
        return amvs.a;
    }

    @Override // defpackage.amdt
    public final eea b() {
        return new eea(this.a, this.b);
    }
}
