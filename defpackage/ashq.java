package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ashq extends aonm implements aooz {
    public static final ashq a;
    private static volatile aopf b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    static {
        ashq ashqVar = new ashq();
        a = ashqVar;
        aonm.registerDefaultInstance(ashq.class, ashqVar);
    }

    private ashq() {
    }

    public static /* synthetic */ void a(ashq ashqVar) {
        ashqVar.c |= 1;
        ashqVar.d = true;
    }

    public static /* synthetic */ void b(ashq ashqVar) {
        ashqVar.c |= 2;
        ashqVar.e = true;
    }

    public static /* synthetic */ void c(ashq ashqVar) {
        ashqVar.c |= 4;
        ashqVar.f = true;
    }

    public static /* synthetic */ void d(ashq ashqVar) {
        ashqVar.c |= 8;
        ashqVar.g = true;
    }

    public static /* synthetic */ void e(ashq ashqVar) {
        ashqVar.c |= 16;
        ashqVar.h = true;
    }

    public static /* synthetic */ void f(ashq ashqVar) {
        ashqVar.c |= 32;
        ashqVar.i = true;
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
                return new ashq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ashq.class) {
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
