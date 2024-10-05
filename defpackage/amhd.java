package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amhd extends aonm implements aooz {
    public static final amhd a;
    private static volatile aopf g;
    public int b;
    public long e;
    public long c = -1;
    public aony d = emptyProtobufList();
    public aonu f = emptyIntList();

    static {
        amhd amhdVar = new amhd();
        a = amhdVar;
        aonm.registerDefaultInstance(amhd.class, amhdVar);
    }

    private amhd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004\u0016", new Object[]{"b", "c", "d", amhc.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amhd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (amhd.class) {
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
