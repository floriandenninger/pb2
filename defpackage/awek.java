package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awek extends aonm implements aooz {
    public static final awek a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        awek awekVar = new awek();
        a = awekVar;
        aonm.registerDefaultInstance(awek.class, awekVar);
    }

    private awek() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\u0001\u0012\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0007ြ\u0000\bြ\u0000\u000eြ\u0000\u0012ြ\u0000", new Object[]{"c", "b", awer.class, awej.class, awet.class, awep.class, awex.class, awes.class, awei.class});
            case NEW_MUTABLE_INSTANCE:
                return new awek();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awek.class) {
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
