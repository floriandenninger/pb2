package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asnh extends aonm implements aooz {
    public static final asnh a;
    public static final aonk b;
    public static final aonk c;
    private static volatile aopf d;

    static {
        asnh asnhVar = new asnh();
        a = asnhVar;
        aonm.registerDefaultInstance(asnh.class, asnhVar);
        b = aonm.newSingularGeneratedExtension(asni.a, false, null, null, 116410864, aoqn.BOOL, Boolean.class);
        c = aonm.newSingularGeneratedExtension(asni.a, asno.LIKE, null, asno.d, 116390062, aoqn.ENUM, asno.class);
    }

    private asnh() {
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
                return new asnh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asnh.class) {
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
