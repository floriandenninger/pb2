package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqll extends aonm implements aooz {
    public static final aqll a;
    private static volatile aopf h;
    public int b;
    public int d;
    public int f;
    public boolean g;
    public String c = "";
    public String e = "";

    static {
        aqll aqllVar = new aqll();
        a = aqllVar;
        aonm.registerDefaultInstance(aqll.class, aqllVar);
    }

    private aqll() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", atrx.a(), "e", "f", atrv.a(), "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqll();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqll.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
