package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aotz extends aonm implements aooz {
    public static final aotz a;
    private static volatile aopf g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;

    static {
        aotz aotzVar = new aotz();
        a = aotzVar;
        aonm.registerDefaultInstance(aotz.class, aotzVar);
    }

    private aotz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0006\f\u0004\u0000\u0000\u0000\u0006င\u0004\nဇ\u0007\u000bဇ\b\fင\t", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aotz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aotz.class) {
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
