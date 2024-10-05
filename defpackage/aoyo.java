package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoyo extends aonm implements aooz {
    public static final aoyo a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public String d = "";
    public boolean e;

    static {
        aoyo aoyoVar = new aoyo();
        a = aoyoVar;
        aonm.registerDefaultInstance(aoyo.class, aoyoVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, aoyoVar, aoyoVar, null, 167, aoqn.MESSAGE, aoyo.class);
    }

    private aoyo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aoyo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aoyo.class) {
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
