package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aobe extends aonm implements aooz {
    public static final aobe a;
    private static volatile aopf f;
    public int b;
    public long c;
    public aonx d;
    public aony e;

    static {
        aobe aobeVar = new aobe();
        a = aobeVar;
        aonm.registerDefaultInstance(aobe.class, aobeVar);
    }

    private aobe() {
        aonm.emptyProtobufList();
        this.d = emptyLongList();
        this.e = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"b", "e", aobd.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aobe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aobe.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
