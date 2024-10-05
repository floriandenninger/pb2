package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnn extends whu {
    public final aone a;

    private aqnn() {
        super(null);
        aqnr aqnrVar = aqnr.a;
        throw null;
    }

    public aqnn(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aqnp a(aakv aakvVar) {
        return new aqnp((aqnr) this.a.build(), aakvVar);
    }

    public final void c(aqnq aqnqVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqnr aqnrVar = (aqnr) aoneVar.instance;
        aqnr aqnrVar2 = aqnr.a;
        aqnqVar.getClass();
        aqnrVar.e = aqnqVar;
        aqnrVar.d = 7;
    }

    public final void d(Integer num) {
        aone aoneVar = this.a;
        int intValue = num.intValue();
        aoneVar.copyOnWrite();
        aqnr aqnrVar = (aqnr) aoneVar.instance;
        aqnr aqnrVar2 = aqnr.a;
        aqnrVar.c |= 1024;
        aqnrVar.n = intValue;
    }
}
