package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoht extends aonm implements aooz {
    public static final aoht a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public aohs f;
    public int c = 0;
    public String e = "";

    static {
        aoht aohtVar = new aoht();
        a = aohtVar;
        aonm.registerDefaultInstance(aoht.class, aohtVar);
    }

    private aoht() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002့\u0000\u0003ဉ\u0003\u0004ျ\u0000", new Object[]{"d", "c", "b", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aoht();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aoht.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
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
