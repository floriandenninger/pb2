package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsj extends aonm implements aooz {
    public static final atsj a;
    private static volatile aopf c;
    public aquz b;
    private int d;

    static {
        atsj atsjVar = new atsj();
        a = atsjVar;
        aonm.registerDefaultInstance(atsj.class, atsjVar);
    }

    private atsj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf6f3ᮒ\uf6f3ᮒ\u0001\u0000\u0000\u0000\uf6f3ᮒဉ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new atsj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (atsj.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
