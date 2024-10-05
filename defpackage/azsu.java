package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azsu extends azum implements azty {
    private final /* synthetic */ int h;
    public static final azsu g = new azsu(6);
    public static final azsu f = new azsu(5);
    public static final azsu e = new azsu(4);
    public static final azsu d = new azsu(3);
    public static final azsu c = new azsu(2);
    public static final azsu b = new azsu(1);
    public static final azsu a = new azsu(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azsu(int i) {
        super(2);
        this.h = i;
    }

    @Override // defpackage.azty
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.h;
        if (i == 0) {
            azsv azsvVar = (azsv) obj;
            azss azssVar = (azss) obj2;
            azsvVar.getClass();
            azsv minusKey = azsvVar.minusKey(azssVar.getKey());
            if (minusKey == azsw.a) {
                return azssVar;
            }
            azsr azsrVar = (azsr) minusKey.get(azsr.a);
            if (azsrVar == null) {
                return new azsp(minusKey, azssVar);
            }
            azsv minusKey2 = minusKey.minusKey(azsr.a);
            if (minusKey2 == azsw.a) {
                return new azsp(azssVar, azsrVar);
            }
            return new azsp(new azsp(minusKey2, azssVar), azsrVar);
        }
        if (i == 1) {
            String str = (String) obj;
            azss azssVar2 = (azss) obj2;
            str.getClass();
            if (str.length() == 0) {
                return azssVar2.toString();
            }
            return str + ", " + azssVar2;
        }
        if (i == 2) {
            return Boolean.valueOf(azul.c(obj, obj2));
        }
        if (i == 3) {
            return Integer.valueOf(((Number) obj).intValue() + 1);
        }
        if (i == 4) {
            azss azssVar3 = (azss) obj2;
            if (!(azssVar3 instanceof azwm)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? azssVar3 : Integer.valueOf(intValue + 1);
        }
        if (i == 5) {
            azwm azwmVar = (azwm) obj;
            azss azssVar4 = (azss) obj2;
            if (azwmVar != null) {
                return azwmVar;
            }
            if (azssVar4 instanceof azwm) {
                return (azwm) azssVar4;
            }
            return null;
        }
        baaf baafVar = (baaf) obj;
        azss azssVar5 = (azss) obj2;
        baafVar.getClass();
        if (azssVar5 instanceof azwm) {
            azwm azwmVar2 = (azwm) azssVar5;
            Object a2 = azwmVar2.a(baafVar.a);
            Object[] objArr = baafVar.b;
            int i2 = baafVar.c;
            objArr[i2] = a2;
            azwm[] azwmVarArr = baafVar.d;
            baafVar.c = i2 + 1;
            azwmVarArr[i2] = azwmVar2;
        }
        return baafVar;
    }
}
