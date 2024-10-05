package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acul implements ayru {
    private final /* synthetic */ int c;
    public static final /* synthetic */ acul b = new acul(1);
    public static final /* synthetic */ acul a = new acul(0);

    private /* synthetic */ acul(int i) {
        this.c = i;
    }

    @Override // defpackage.ayru
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.c != 0) {
            ita itaVar = (ita) obj;
            return (!((Boolean) obj2).booleanValue() || ((Boolean) obj3).booleanValue() || ((Boolean) obj4).booleanValue()) ? itaVar : itg.d(itaVar);
        }
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        Boolean bool3 = (Boolean) obj4;
        boolean z = false;
        if ((!((Boolean) obj).booleanValue() || !bool.booleanValue()) && (!bool2.booleanValue() || !bool3.booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
