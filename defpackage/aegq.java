package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aegq extends aonm implements aooz {
    public static final aegq a;
    private static volatile aopf f;
    public int b;
    public int c;
    public int d;
    public aony e = emptyProtobufList();

    static {
        aegq aegqVar = new aegq();
        a = aegqVar;
        aonm.registerDefaultInstance(aegq.class, aegqVar);
    }

    private aegq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဍ\u0000\u0002ဍ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", aegl.class});
            case NEW_MUTABLE_INSTANCE:
                return new aegq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aegq.class) {
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
