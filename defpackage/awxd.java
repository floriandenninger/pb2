package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxd extends aonm implements aooz {
    public static final awxd a;
    private static volatile aopf e;
    public int b;
    public awxf c;
    public aony d = emptyProtobufList();

    static {
        awxd awxdVar = new awxd();
        a = awxdVar;
        aonm.registerDefaultInstance(awxd.class, awxdVar);
    }

    private awxd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", awxe.class});
            case NEW_MUTABLE_INSTANCE:
                return new awxd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awxd.class) {
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
