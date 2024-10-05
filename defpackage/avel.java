package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avel extends aonm implements aooz {
    public static final avel a;
    public static final aonk b;
    private static volatile aopf f;
    public String c = "";
    public String d = "";
    public aven e;
    private int g;

    static {
        avel avelVar = new avel();
        a = avelVar;
        aonm.registerDefaultInstance(avel.class, avelVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, avelVar, avelVar, null, 228172556, aoqn.MESSAGE, avel.class);
    }

    private avel() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"g", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avel();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avel.class) {
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
