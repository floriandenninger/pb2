package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoys extends aonm implements aooz {
    public static final aoys a;
    private static volatile aopf e;
    public int b;
    public aoyr c;
    public aowk d;

    static {
        aoys aoysVar = new aoys();
        a = aoysVar;
        aonm.registerDefaultInstance(aoys.class, aoysVar);
    }

    private aoys() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uea6f㋿\uea7e㋿\u0002\u0000\u0000\u0000\uea6f㋿ဉ\u0001\uea7e㋿ဉ\u0000", new Object[]{"b", "d", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aoys();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aoys.class) {
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
