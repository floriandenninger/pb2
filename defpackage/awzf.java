package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awzf extends aonm implements aooz {
    public static final awzf a;
    private static volatile aopf f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        awzf awzfVar = new awzf();
        a = awzfVar;
        aonm.registerDefaultInstance(awzf.class, awzfVar);
    }

    private awzf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0002\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001ွ\u0000\u0002ျ\u0000\u0004ွ\u0001\u0005ျ\u0001", new Object[]{"c", "b", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awzf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awzf.class) {
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
