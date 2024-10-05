package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aous extends aonm implements aooz {
    private static final aous a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;
    private int f;

    static {
        aous aousVar = new aous();
        a = aousVar;
        aonm.registerDefaultInstance(aous.class, aousVar);
    }

    private aous() {
    }

    public static aour a() {
        return (aour) a.createBuilder();
    }

    public static /* synthetic */ aous b() {
        return a;
    }

    public void f(aoun aounVar) {
        this.e = aounVar.d;
        this.c |= 2;
    }

    public void g(aoup aoupVar) {
        this.f = aoupVar.d;
        this.c |= 4;
    }

    public void h(aouq aouqVar) {
        this.d = aouqVar.c;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"c", "d", aouq.a(), "e", aoun.a(), "f", aoup.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aous();
            case NEW_BUILDER:
                return new aour();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aous.class) {
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
