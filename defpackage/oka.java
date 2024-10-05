package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oka extends fks implements fgk {
    private final fgm a;
    private final fgq b;
    private final gbh c;

    public oka(fln flnVar, fgm fgmVar, fgq fgqVar, gbh gbhVar) {
        super(flnVar);
        this.a = fgmVar;
        this.b = fgqVar;
        this.c = gbhVar;
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        if (this.b.g().i()) {
            this.c.c(false);
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        this.a.h(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.a.d(this);
    }
}
