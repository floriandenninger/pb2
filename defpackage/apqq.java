package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apqq extends aonm implements aooz {
    public static final apqq a;
    public static final aonk b;
    private static volatile aopf c;

    static {
        apqq apqqVar = new apqq();
        a = apqqVar;
        aonm.registerDefaultInstance(apqq.class, apqqVar);
        b = aonm.newSingularGeneratedExtension(apqt.a, apqu.a, apqu.a, null, 123258328, aoqn.MESSAGE, apqu.class);
    }

    private apqq() {
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
                return new apqq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (apqq.class) {
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
