package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ansn extends aonm implements aooz {
    private static final ansn a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;

    static {
        ansn ansnVar = new ansn();
        a = ansnVar;
        aonm.registerDefaultInstance(ansn.class, ansnVar);
    }

    private ansn() {
    }

    public static ansm a() {
        return (ansm) a.createBuilder();
    }

    public static /* synthetic */ ansn b() {
        return a;
    }

    public void e(int i) {
        this.c |= 1;
        this.d = i;
    }

    public void f(ansl anslVar) {
        this.e = anslVar.g;
        this.c |= 2;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", "e", ansl.b()});
            case NEW_MUTABLE_INSTANCE:
                return new ansn();
            case NEW_BUILDER:
                return new ansm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ansn.class) {
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
