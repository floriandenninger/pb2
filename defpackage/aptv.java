package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aptv extends aonm implements aooz {
    public static final aptv a;
    private static volatile aopf e;
    public int b;
    public int c;
    public apty d;

    static {
        aptv aptvVar = new aptv();
        a = aptvVar;
        aonm.registerDefaultInstance(aptv.class, aptvVar);
    }

    private aptv() {
        emptyProtobufList();
        emptyLongList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", apqr.k, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aptv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aptv.class) {
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
