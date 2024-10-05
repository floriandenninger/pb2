package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aofv extends aonm implements aooz {
    public static final aofv a;
    private static volatile aopf e;
    public aofw b;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();

    static {
        aofv aofvVar = new aofv();
        a = aofvVar;
        aonm.registerDefaultInstance(aofv.class, aofvVar);
    }

    private aofv() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0004\t", new Object[]{"c", aofq.class, "d", aofu.class, "b"});
            case NEW_MUTABLE_INSTANCE:
                return new aofv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aofv.class) {
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
