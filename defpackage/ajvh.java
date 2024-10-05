package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajvh implements ajwv {
    private static final ammy a = new ajvg(0);
    private final ammv b;

    public ajvh() {
        this(amlr.a);
    }

    public ajvh(ammv ammvVar) {
        this.b = ammvVar;
    }

    @Override // defpackage.ajwv
    public final /* bridge */ /* synthetic */ void b(Object obj, ajwu ajwuVar) {
        askg askgVar = (askg) obj;
        if ((askgVar.c & 268435456) == 0) {
            aooy Z = whu.Z(askgVar);
            if (Z != null) {
                ajwuVar.a(akbc.m(this.b, Z));
                return;
            }
            return;
        }
        ausu ausuVar = askgVar.W;
        if (ausuVar == null) {
            ausuVar = ausu.a;
        }
        ausw auswVar = ausuVar.r;
        if (auswVar == null) {
            auswVar = ausw.a;
        }
        if ((auswVar.b & 4) != 0) {
            ajwuVar.a(new aaly(ausuVar));
            return;
        }
        ausw auswVar2 = ausuVar.r;
        if (auswVar2 == null) {
            auswVar2 = ausw.a;
        }
        if ((auswVar2.b & 8) != 0) {
            ajwuVar.a(new aamj(ausuVar));
        }
    }

    @Override // defpackage.ajwv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ajwv
    public final ammy e() {
        return a;
    }
}
