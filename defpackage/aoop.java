package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoop implements aoow {
    private final aoow[] a;

    public aoop(aoow... aoowVarArr) {
        this.a = aoowVarArr;
    }

    @Override // defpackage.aoow
    public final aoov a(Class cls) {
        aoow[] aoowVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            aoow aoowVar = aoowVarArr[i];
            if (aoowVar.b(cls)) {
                return aoowVar.a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    @Override // defpackage.aoow
    public final boolean b(Class cls) {
        aoow[] aoowVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (aoowVarArr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
