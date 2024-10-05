package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awbs extends aonm implements aooz {
    public static final awbs a;
    public static final aonk b;
    public static final aonk c;
    private static volatile aopf d;

    static {
        awbs awbsVar = new awbs();
        a = awbsVar;
        aonm.registerDefaultInstance(awbs.class, awbsVar);
        b = aonm.newSingularGeneratedExtension(awcx.a, 0, null, null, 153514762, aoqn.INT32, Integer.class);
        c = aonm.newSingularGeneratedExtension(awcx.a, false, null, null, 167027722, aoqn.BOOL, Boolean.class);
    }

    private awbs() {
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
                return new awbs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awbs.class) {
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
