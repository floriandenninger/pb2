package defpackage;

import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahaa implements Comparator {
    private final /* synthetic */ int g;
    public static final /* synthetic */ ahaa f = new ahaa(8);
    public static final /* synthetic */ ahaa e = new ahaa(7);
    public static final /* synthetic */ ahaa d = new ahaa(3);
    public static final /* synthetic */ ahaa c = new ahaa(2);
    public static final /* synthetic */ ahaa b = new ahaa(1);
    public static final /* synthetic */ ahaa a = new ahaa(0);

    public /* synthetic */ ahaa(int i) {
        this.g = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                return ahbj.g(ahab.a((atrx) obj, 0), ahab.a((atrx) obj2, 0));
            case 1:
                aqll aqllVar = (aqll) obj2;
                Comparator comparator = ahab.b;
                atrx b2 = atrx.b(((aqll) obj).d);
                if (b2 == null) {
                    b2 = atrx.UNKNOWN_FORMAT_TYPE;
                }
                atrx b3 = atrx.b(aqllVar.d);
                if (b3 == null) {
                    b3 = atrx.UNKNOWN_FORMAT_TYPE;
                }
                return comparator.compare(b2, b3);
            case 2:
                return -ahbj.g(ahab.a((atrx) obj, 0), ahab.a((atrx) obj2, 0));
            case 3:
                avgf avgfVar = (avgf) obj;
                avgf avgfVar2 = (avgf) obj2;
                int i = avgfVar2.d * avgfVar2.e;
                int i2 = avgfVar.d * avgfVar.e;
                if (i == i2) {
                    return 0;
                }
                return i >= i2 ? 1 : -1;
            case 4:
                return agpf.a((akzs) ((Map.Entry) obj).getValue(), (akzs) ((Map.Entry) obj2).getValue());
            case 5:
                anal a2 = anal.a(obj);
                anal a3 = anal.a(obj2);
                if (a2 == a3) {
                    int ordinal = a2.ordinal();
                    if (ordinal == 0) {
                        return ((Boolean) obj).compareTo((Boolean) obj2);
                    }
                    if (ordinal == 1) {
                        return ((String) obj).compareTo((String) obj2);
                    }
                    if (ordinal == 2) {
                        return ((Long) obj).compareTo((Long) obj2);
                    }
                    if (ordinal == 3) {
                        return ((Double) obj).compareTo((Double) obj2);
                    }
                    throw null;
                }
                return a2.compareTo(a3);
            case 6:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 7:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str == null) {
                    return str2 == null ? 0 : -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            case 8:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            default:
                Integer valueOf = Integer.valueOf(((Constructor) obj2).getParameterTypes().length);
                Integer valueOf2 = Integer.valueOf(((Constructor) obj).getParameterTypes().length);
                if (valueOf == valueOf2) {
                    return 0;
                }
                return valueOf.compareTo(valueOf2);
        }
    }
}
