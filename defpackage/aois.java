package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aois extends aonm implements aooz {
    public static final aois a;
    private static volatile aopf f;
    public int b;
    public aony c = emptyProtobufList();
    public aokw d;
    public aoii e;

    static {
        aois aoisVar = new aois();
        a = aoisVar;
        aonm.registerDefaultInstance(aois.class, aoisVar);
    }

    private aois() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", aojv.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aois();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aois.class) {
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
