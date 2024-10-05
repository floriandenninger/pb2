package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywz {
    public final amml a;
    public final amml b;

    public ywz(final Object obj, final Enum r4, final amri amriVar) {
        amml ammlVar = new amml() { // from class: ywj
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                amri amriVar2 = amri.this;
                Enum r1 = r4;
                Enum r3 = (Enum) amriVar2.get(obj2);
                return r3 == null ? r1 : r3;
            }
        };
        this.b = new amml() { // from class: ywk
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                amri amriVar2 = amri.this;
                Object obj3 = obj;
                Object obj4 = ((amvi) amriVar2).e.get((Enum) obj2);
                return obj4 == null ? obj3 : obj4;
            }
        };
        this.a = ammlVar;
        r4.getClass();
        obj.getClass();
        Enum[] enumArr = (Enum[]) r4.getDeclaringClass().getEnumConstants();
        enumArr.getClass();
        amkq.F(enumArr.length == ((amvi) amriVar).d + (!amriVar.containsValue(r4) ? 1 : 0), "uncovered enums in stringToEnumMap");
    }
}
