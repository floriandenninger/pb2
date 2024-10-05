package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akxx implements ykq {
    private final /* synthetic */ int f;
    public static final /* synthetic */ akxx e = new akxx(4);
    public static final /* synthetic */ akxx d = new akxx(3);
    public static final /* synthetic */ akxx c = new akxx(2);
    public static final /* synthetic */ akxx b = new akxx(1);
    public static final /* synthetic */ akxx a = new akxx(0);

    private /* synthetic */ akxx(int i) {
        this.f = i;
    }

    @Override // defpackage.ykq
    public final Object a(Object obj) {
        int i = this.f;
        if (i == 0) {
            arnd arndVar = ((asdq) obj).b;
            return arndVar == null ? arnd.a : arndVar;
        }
        if (i == 1) {
            arnd arndVar2 = ((asdn) obj).c;
            return arndVar2 == null ? arnd.a : arndVar2;
        }
        if (i == 2) {
            arnd arndVar3 = ((asds) obj).b;
            return arndVar3 == null ? arnd.a : arndVar3;
        }
        if (i != 3) {
            arnd arndVar4 = ((asdy) obj).c;
            return arndVar4 == null ? arnd.a : arndVar4;
        }
        arnd arndVar5 = ((asdu) obj).b;
        return arndVar5 == null ? arnd.a : arndVar5;
    }
}
