package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auts extends aonm implements aooz {
    public static final auts a;
    public static final aonk b;
    private static volatile aopf f;
    public String c = "";
    public String d = "";
    public boolean e;
    private int g;

    static {
        auts autsVar = new auts();
        a = autsVar;
        aonm.registerDefaultInstance(auts.class, autsVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, autsVar, autsVar, null, 262904603, aoqn.MESSAGE, auts.class);
    }

    private auts() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003", new Object[]{"g", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new auts();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (auts.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
