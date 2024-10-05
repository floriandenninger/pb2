package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqcr extends aonm implements aooz {
    public static final aqcr a;
    private static volatile aopf e;
    public int b;
    public aony c = emptyProtobufList();
    public int d;

    static {
        aqcr aqcrVar = new aqcr();
        a = aqcrVar;
        aonm.registerDefaultInstance(aqcr.class, aqcrVar);
    }

    private aqcr() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003င\u0000", new Object[]{"b", "c", aqct.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqcr();
            case NEW_BUILDER:
                return new aone((int[][][]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqcr.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
