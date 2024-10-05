package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arlp extends aonm implements aooz {
    public static final arlp a;
    private static volatile aopf c;
    public aony b = aonm.emptyProtobufList();

    static {
        arlp arlpVar = new arlp();
        a = arlpVar;
        aonm.registerDefaultInstance(arlp.class, arlpVar);
    }

    private arlp() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new arlp();
            case NEW_BUILDER:
                return new aone((short[]) null, (float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (arlp.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
