package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aojy extends aonm implements aooz {
    public static final aojy a;
    private static volatile aopf f;
    public int b;
    public String c = "";
    public aokh d;
    public aoku e;

    static {
        aojy aojyVar = new aojy();
        a = aojyVar;
        aonm.registerDefaultInstance(aojy.class, aojyVar);
    }

    private aojy() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aojy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aojy.class) {
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
