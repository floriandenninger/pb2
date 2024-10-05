package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aocs extends aonm implements aooz {
    public static final aocs a;
    private static volatile aopf d;
    public aony b = aonm.emptyProtobufList();
    public aony c = aonm.emptyProtobufList();

    static {
        aocs aocsVar = new aocs();
        a = aocsVar;
        aonm.registerDefaultInstance(aocs.class, aocsVar);
    }

    private aocs() {
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0003\u0006\u0002\u0000\u0002\u0000\u0003Ț\u0006Ț", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aocs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aocs.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
