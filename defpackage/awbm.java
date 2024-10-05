package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awbm extends aonm implements aooz {
    private static final awbm a;
    private static volatile aopf b;
    private int c;
    private boolean d;

    static {
        awbm awbmVar = new awbm();
        a = awbmVar;
        aonm.registerDefaultInstance(awbm.class, awbmVar);
    }

    private awbm() {
    }

    public static awbl a() {
        return (awbl) a.createBuilder();
    }

    public static /* synthetic */ void c(awbm awbmVar, boolean z) {
        awbmVar.d(z);
    }

    public void d(boolean z) {
        this.c |= 1;
        this.d = z;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awbm();
            case NEW_BUILDER:
                return new awbl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awbm.class) {
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
