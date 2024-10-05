package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awiy extends whu {
    public final aone a;

    private awiy() {
        super(null);
        awjc awjcVar = awjc.a;
        throw null;
    }

    public awiy(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    public final /* bridge */ /* synthetic */ aakt a(aakv aakvVar) {
        return new awja((awjc) this.a.build(), aakvVar);
    }

    public final void b(Integer num, aucv aucvVar) {
        if (aucvVar == null) {
            return;
        }
        aone aoneVar = this.a;
        int intValue = num.intValue();
        aoneVar.copyOnWrite();
        awjc awjcVar = (awjc) aoneVar.instance;
        awjc awjcVar2 = awjc.a;
        aoot aootVar = awjcVar.n;
        if (!aootVar.b) {
            awjcVar.n = aootVar.a();
        }
        awjcVar.n.put(Integer.valueOf(intValue), aucvVar);
    }
}
