package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aofr extends aonm implements aooz {
    public static final aofr a;
    private static volatile aopf d;
    public aony b = emptyProtobufList();
    public aony c;

    static {
        aofr aofrVar = new aofr();
        a = aofrVar;
        aonm.registerDefaultInstance(aofr.class, aofrVar);
    }

    private aofr() {
        emptyProtobufList();
        emptyProtobufList();
        this.c = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0002\u0000\u0001\u001b\u0004\u001b", new Object[]{"b", aofv.class, "c", aoft.class});
            case NEW_MUTABLE_INSTANCE:
                return new aofr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aofr.class) {
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
