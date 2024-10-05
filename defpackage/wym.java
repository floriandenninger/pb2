package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wym {
    private final wni a;
    private final Map b = new EnumMap(apae.class);
    private final Map c = new EnumMap(apac.class);
    private final Map d = new EnumMap(apah.class);
    private final ajoy e;

    public wym(wni wniVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = wniVar;
        this.e = ajoyVar;
    }

    public final synchronized String a(apac apacVar, String str) {
        String str2;
        int intValue = this.c.containsKey(apacVar) ? ((Integer) this.c.get(apacVar)).intValue() : 0;
        str2 = str + "_" + apacVar.name() + "_" + intValue;
        this.c.put(apacVar, Integer.valueOf(intValue + 1));
        return str2;
    }

    public final synchronized String b(apae apaeVar) {
        if (this.a.l) {
            int intValue = this.b.containsKey(apaeVar) ? ((Integer) this.b.get(apaeVar)).intValue() : 0;
            String str = apaeVar.name() + "_" + intValue;
            this.b.put(apaeVar, Integer.valueOf(intValue + 1));
            return str;
        }
        return this.e.x();
    }

    public final synchronized String c(apah apahVar) {
        String str;
        int intValue = this.d.containsKey(apahVar) ? ((Integer) this.d.get(apahVar)).intValue() : 0;
        str = apahVar.name() + "_" + intValue;
        this.d.put(apahVar, Integer.valueOf(intValue + 1));
        return str;
    }
}
