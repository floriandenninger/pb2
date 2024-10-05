package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgz extends aonm implements aooz {
    public static final asgz a;
    private static volatile aopf b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    static {
        asgz asgzVar = new asgz();
        a = asgzVar;
        aonm.registerDefaultInstance(asgz.class, asgzVar);
    }

    private asgz() {
    }

    public static /* synthetic */ void a(asgz asgzVar) {
        asgzVar.c |= 1;
        asgzVar.d = true;
    }

    public static /* synthetic */ void b(asgz asgzVar) {
        asgzVar.c |= 2;
        asgzVar.e = true;
    }

    public static /* synthetic */ void c(asgz asgzVar) {
        asgzVar.c |= 4;
        asgzVar.f = true;
    }

    public static /* synthetic */ void d(asgz asgzVar) {
        asgzVar.c |= 8;
        asgzVar.g = true;
    }

    public static /* synthetic */ void e(asgz asgzVar) {
        asgzVar.c |= 16;
        asgzVar.h = true;
    }

    public static /* synthetic */ void f(asgz asgzVar) {
        asgzVar.c |= 32;
        asgzVar.i = true;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asgz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (asgz.class) {
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
