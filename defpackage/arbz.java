package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arbz extends aonm implements aooz {
    private static final arbz a;
    private static volatile aopf b;
    private int c;
    private int d;

    static {
        arbz arbzVar = new arbz();
        a = arbzVar;
        aonm.registerDefaultInstance(arbz.class, arbzVar);
    }

    private arbz() {
    }

    public static arby a() {
        return (arby) a.createBuilder();
    }

    public static /* synthetic */ void c(arbz arbzVar, arbx arbxVar) {
        arbzVar.d(arbxVar);
    }

    public void d(arbx arbxVar) {
        this.d = arbxVar.f;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", arbx.a()});
            case NEW_MUTABLE_INSTANCE:
                return new arbz();
            case NEW_BUILDER:
                return new arby();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arbz.class) {
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
