package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class astn extends aonm implements aooz {
    public static final astn a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public String d = "";

    static {
        astn astnVar = new astn();
        a = astnVar;
        aonm.registerDefaultInstance(astn.class, astnVar);
        b = aonm.newSingularGeneratedExtension(atpo.b, astnVar, astnVar, null, 318835310, aoqn.MESSAGE, astn.class);
    }

    private astn() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new astn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (astn.class) {
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
