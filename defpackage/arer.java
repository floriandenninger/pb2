package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arer extends aonm implements aooz {
    public static final arer a;
    public static final aonk b;
    public static final aonk c;
    private static volatile aopf d;

    static {
        arer arerVar = new arer();
        a = arerVar;
        aonm.registerDefaultInstance(arer.class, arerVar);
        b = aonm.newSingularGeneratedExtension(arev.a, false, null, null, 177622921, aoqn.BOOL, Boolean.class);
        c = aonm.newSingularGeneratedExtension(arev.a, 0, null, null, 274703452, aoqn.INT32, Integer.class);
    }

    private arer() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new arer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arer.class) {
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
