package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awho extends aonm implements aooz {
    public static final awho a;
    public static final aonk b;
    public static final aonk c;
    public static final aonk d;
    private static volatile aopf e;

    static {
        awho awhoVar = new awho();
        a = awhoVar;
        aonm.registerDefaultInstance(awho.class, awhoVar);
        b = aonm.newSingularGeneratedExtension(awhn.a, false, null, null, 1000, aoqn.BOOL, Boolean.class);
        c = aonm.newSingularGeneratedExtension(awhn.a, 0L, null, null, 1001, aoqn.INT64, Long.class);
        d = aonm.newSingularGeneratedExtension(awhn.a, "", null, null, 1002, aoqn.STRING, String.class);
    }

    private awho() {
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
                return new awho();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awho.class) {
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
