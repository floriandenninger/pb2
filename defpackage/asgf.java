package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgf extends aonm implements aooz {
    public static final asgf a;
    private static volatile aopf d;
    public int b;
    public long c;
    private int e;

    static {
        asgf asgfVar = new asgf();
        a = asgfVar;
        aonm.registerDefaultInstance(asgf.class, asgfVar);
    }

    private asgf() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003င\u0002\u0005ဃ\u0003", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new asgf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asgf.class) {
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
