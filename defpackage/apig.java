package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apig extends aonm implements aooz {
    public static final aonv a = new uct(10);
    public static final apig b;
    private static volatile aopf g;
    public int c;
    public aonu d = emptyIntList();
    public int e;
    public int f;

    static {
        apig apigVar = new apig();
        b = apigVar;
        aonm.registerDefaultInstance(apig.class, apigVar);
    }

    private apig() {
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
                return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002င\u0000\u0003င\u0001", new Object[]{"c", "d", aphz.a(), "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apig();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apig.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
