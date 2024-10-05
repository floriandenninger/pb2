package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjq extends whu {
    public final aone a;

    private avjq() {
        super(null);
        avjt avjtVar = avjt.a;
        throw null;
    }

    public avjq(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final avjs a(aakv aakvVar) {
        return new avjs((avjt) this.a.build(), aakvVar);
    }

    public final void c(avjp avjpVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        avjt avjtVar = (avjt) aoneVar.instance;
        avjt avjtVar2 = avjt.a;
        avjtVar.g = avjpVar.m;
        avjtVar.c |= 4;
    }

    public final void d(avjo avjoVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        avjt avjtVar = (avjt) aoneVar.instance;
        avjt avjtVar2 = avjt.a;
        avjtVar.e = avjoVar.i;
        avjtVar.c |= 2;
    }
}
