package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhh extends aonm implements aooz {
    public static final awhh a;
    private static volatile aopf d;
    public aony b = aonm.emptyProtobufList();
    public aony c = emptyProtobufList();

    static {
        awhh awhhVar = new awhh();
        a = awhhVar;
        aonm.registerDefaultInstance(awhh.class, awhhVar);
    }

    private awhh() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001a\u0003\u001b", new Object[]{"b", "c", awhg.class});
            case NEW_MUTABLE_INSTANCE:
                return new awhh();
            case NEW_BUILDER:
                return new aone((byte[]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awhh.class) {
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
