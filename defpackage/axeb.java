package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axeb extends aonm implements aooz {
    private static final axeb a;
    private static volatile aopf b;
    private int c;
    private int d;
    private aorp e;
    private int f;
    private boolean g;

    static {
        axeb axebVar = new axeb();
        a = axebVar;
        aonm.registerDefaultInstance(axeb.class, axebVar);
    }

    private axeb() {
    }

    public static axea a() {
        return (axea) a.createBuilder();
    }

    public static /* synthetic */ axeb b() {
        return a;
    }

    public void g(int i) {
        this.c |= 1;
        this.d = i;
    }

    public void h(boolean z) {
        this.c |= 8;
        this.g = z;
    }

    public void i(aorp aorpVar) {
        aorpVar.getClass();
        this.e = aorpVar;
        this.c |= 2;
    }

    public void j(axec axecVar) {
        this.f = axecVar.f;
        this.c |= 4;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"c", "d", "e", "f", axec.a(), "g"});
            case NEW_MUTABLE_INSTANCE:
                return new axeb();
            case NEW_BUILDER:
                return new axea();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axeb.class) {
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
