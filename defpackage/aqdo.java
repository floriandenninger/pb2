package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdo extends aonm implements aooz {
    public static final aqdo a;
    private static volatile aopf g;
    public int b;
    public boolean c;
    public aomf d = aomf.b;
    public boolean e;
    public boolean f;

    static {
        aqdo aqdoVar = new aqdo();
        a = aqdoVar;
        aonm.registerDefaultInstance(aqdo.class, aqdoVar);
    }

    private aqdo() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဇ\u0000\u0004ည\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqdo.class) {
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
