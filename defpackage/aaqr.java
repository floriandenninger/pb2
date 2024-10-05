package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaqr implements aarz {
    public static final aaqq a = new aaqp(0);
    private final amnv b;

    public aaqr(amnv amnvVar) {
        this.b = amnvVar;
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        armz armzVar = ((arnb) aoneVar.instance).c;
        if (armzVar == null) {
            armzVar = armz.a;
        }
        aone builder = armzVar.toBuilder();
        builder.mergeFrom((aonm) this.b.get());
        aoneVar.copyOnWrite();
        arnb arnbVar = (arnb) aoneVar.instance;
        armz armzVar2 = (armz) builder.build();
        armzVar2.getClass();
        arnbVar.c = armzVar2;
        arnbVar.b |= 1;
    }
}
