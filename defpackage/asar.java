package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asar extends aonm implements aooz {
    public static final asar a;
    private static volatile aopf g;
    public int b;
    public int c;
    public int d;
    public aonu e = emptyIntList();
    public int f;

    static {
        asar asarVar = new asar();
        a = asarVar;
        aonm.registerDefaultInstance(asar.class, asarVar);
    }

    private asar() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001င\u0000\u0002ဋ\u0001\u0003\u001d\u0005ဌ\u0003", new Object[]{"b", "c", "d", "e", "f", asaq.c});
            case NEW_MUTABLE_INSTANCE:
                return new asar();
            case NEW_BUILDER:
                return new aone((short[][][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asar.class) {
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
