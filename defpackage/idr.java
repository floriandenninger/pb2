package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class idr extends aonm implements aooz {
    public static final idr a;
    private static volatile aopf s;
    public int b;
    public boolean c;
    public boolean d;
    public long e;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean n;
    public int o;
    public float q;
    public aoot f = aoot.a;
    public aoot p = aoot.a;
    public aoot r = aoot.a;
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        idr idrVar = new idr();
        a = idrVar;
        aonm.registerDefaultInstance(idr.class, idrVar);
    }

    private idr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0011\u0000\u0000\u0001\u0012\u0011\u0003\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0002\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\bȈ\tȈ\n\u0007\u000b2\f\u0004\rȈ\u000e\u0004\u000f2\u0010\u0001\u00122", new Object[]{"c", "d", "e", "g", "h", "i", "j", "k", "m", "n", "f", idq.a, "b", "l", "o", "p", idp.a, "q", "r", ido.a});
            case NEW_MUTABLE_INSTANCE:
                return new idr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (idr.class) {
                        aopfVar = s;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            s = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
