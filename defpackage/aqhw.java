package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqhw extends aonm implements aooz {
    public static final aqhw a;
    private static volatile aopf d;
    public boolean b;
    public boolean c;
    private int e;

    static {
        aqhw aqhwVar = new aqhw();
        a = aqhwVar;
        aonm.registerDefaultInstance(aqhw.class, aqhwVar);
    }

    private aqhw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0006ဇ\u0005", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqhw.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
