package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mjx implements mjz {
    private final /* synthetic */ int c;
    public static final /* synthetic */ mjx b = new mjx(1);
    public static final /* synthetic */ mjx a = new mjx(0);

    private /* synthetic */ mjx(int i) {
        this.c = i;
    }

    @Override // defpackage.mjz
    public final boolean a(Object obj, Object obj2) {
        if (this.c == 0) {
            atvw atvwVar = (atvw) obj;
            atvw atvwVar2 = (atvw) obj2;
            aqyg aqygVar = atvwVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            aqyg aqygVar2 = atvwVar2.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            if (!aqygVar.equals(aqygVar2)) {
                return false;
            }
            arfs arfsVar = atvwVar.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfs arfsVar2 = atvwVar2.g;
            if (arfsVar2 == null) {
                arfsVar2 = arfs.a;
            }
            if (!arfsVar.equals(arfsVar2)) {
                return false;
            }
            aulq aulqVar = atvwVar.l;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aulq aulqVar2 = atvwVar2.l;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            return aulqVar.equals(aulqVar2);
        }
        atvt atvtVar = (atvt) obj2;
        arfs arfsVar3 = ((atvt) obj).g;
        if (arfsVar3 == null) {
            arfsVar3 = arfs.a;
        }
        arfs arfsVar4 = atvtVar.g;
        if (arfsVar4 == null) {
            arfsVar4 = arfs.a;
        }
        return arfsVar3.equals(arfsVar4);
    }
}
