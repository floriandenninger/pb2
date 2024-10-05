package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdi extends aonm implements aooz {
    public static final aqdi a;
    public static final aonk b;
    private static volatile aopf d;
    public String c = "";
    private int e;

    static {
        aqdi aqdiVar = new aqdi();
        a = aqdiVar;
        aonm.registerDefaultInstance(aqdi.class, aqdiVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, aqdiVar, aqdiVar, null, 289084567, aoqn.MESSAGE, aqdi.class);
    }

    private aqdi() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqdi.class) {
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
