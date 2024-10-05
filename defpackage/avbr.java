package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avbr extends aonm implements aooz {
    public static final avbr a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        avbr avbrVar = new avbr();
        a = avbrVar;
        aonm.registerDefaultInstance(avbr.class, avbrVar);
    }

    private avbr() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဿ\u0000", new Object[]{"c", "b", avbq.class, avbs.class, avbu.a()});
            case NEW_MUTABLE_INSTANCE:
                return new avbr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avbr.class) {
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
