package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apdg extends aonm implements aooz {
    private static final apdg a;
    private static volatile aopf b;
    private int c;
    private int d;

    static {
        apdg apdgVar = new apdg();
        a = apdgVar;
        aonm.registerDefaultInstance(apdg.class, apdgVar);
    }

    private apdg() {
    }

    public static apdf a() {
        return (apdf) a.createBuilder();
    }

    public static /* synthetic */ apdg b() {
        return a;
    }

    public void d(apdh apdhVar) {
        this.d = apdhVar.c;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", apdh.a()});
            case NEW_MUTABLE_INSTANCE:
                return new apdg();
            case NEW_BUILDER:
                return new apdf();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apdg.class) {
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
