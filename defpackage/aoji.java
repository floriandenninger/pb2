package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoji extends aonm implements aooz {
    public static final aoji a;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public long d;

    static {
        aoji aojiVar = new aoji();
        a = aojiVar;
        aonm.registerDefaultInstance(aoji.class, aojiVar);
    }

    private aoji() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0000\u0006ဈ\u0002\u0007ဂ\u0003", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aoji();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aoji.class) {
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
