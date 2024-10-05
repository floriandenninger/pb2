package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aunh extends aonm implements aooz {
    private static final aunh a;
    private static volatile aopf b;
    private int c;
    private boolean d;
    private boolean e;
    private String f = "";

    static {
        aunh aunhVar = new aunh();
        a = aunhVar;
        aonm.registerDefaultInstance(aunh.class, aunhVar);
    }

    private aunh() {
    }

    public static aung a() {
        return (aung) a.createBuilder();
    }

    public static /* synthetic */ aunh b() {
        return a;
    }

    public void f(String str) {
        this.c |= 4;
        this.f = str;
    }

    public void g(boolean z) {
        this.c |= 1;
        this.d = true;
    }

    public void h(boolean z) {
        this.c |= 2;
        this.e = z;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aunh();
            case NEW_BUILDER:
                return new aung();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aunh.class) {
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
