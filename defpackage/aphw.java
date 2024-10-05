package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aphw extends aonm implements aooz {
    private static final aphw a;
    private static volatile aopf b;
    private int c;
    private int d;

    static {
        aphw aphwVar = new aphw();
        a = aphwVar;
        aonm.registerDefaultInstance(aphw.class, aphwVar);
    }

    private aphw() {
    }

    public static aphv a() {
        return (aphv) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        this.c |= 1;
        this.d = i;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aphw();
            case NEW_BUILDER:
                return new aphv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aphw.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
