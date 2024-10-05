package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoja extends aonm implements aooz {
    public static final aoja a;
    private static volatile aopf e;
    public aony b = emptyProtobufList();
    public long c;
    public long d;
    private int f;

    static {
        aoja aojaVar = new aoja();
        a = aojaVar;
        aonm.registerDefaultInstance(aoja.class, aojaVar);
    }

    private aoja() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0001\u0000\u0004ဂ\u0000\u0005ဂ\u0001\u0007\u001b", new Object[]{"f", "c", "d", "b", aokh.class});
            case NEW_MUTABLE_INSTANCE:
                return new aoja();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aoja.class) {
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
