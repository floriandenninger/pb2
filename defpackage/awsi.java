package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsi extends aonm implements aooz {
    private static final awsi a;
    private static volatile aopf b;
    private int c;
    private awsn d;

    static {
        awsi awsiVar = new awsi();
        a = awsiVar;
        aonm.registerDefaultInstance(awsi.class, awsiVar);
    }

    private awsi() {
    }

    public static awsh a() {
        return (awsh) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(awsn awsnVar) {
        this.d = awsnVar;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awsi();
            case NEW_BUILDER:
                return new awsh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awsi.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
