package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axip extends aonm implements aooz {
    public static final axip a;
    private static volatile aopf g;
    public int b;
    public int c;
    public String d = "";
    public boolean e;
    public int f;

    static {
        axip axipVar = new axip();
        a = axipVar;
        aonm.registerDefaultInstance(axip.class, axipVar);
    }

    private axip() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"b", "c", axio.a(), "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new axip();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (axip.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
