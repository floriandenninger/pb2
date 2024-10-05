package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aunf extends aonm implements aooz {
    private static final aunf a;
    private static volatile aopf b;
    private int c;
    private String d = "";
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private aqpo j;

    static {
        aunf aunfVar = new aunf();
        a = aunfVar;
        aonm.registerDefaultInstance(aunf.class, aunfVar);
    }

    private aunf() {
    }

    public static aune a() {
        return (aune) a.createBuilder();
    }

    public static /* synthetic */ void c(aunf aunfVar, String str) {
        aunfVar.k(str);
    }

    public static /* synthetic */ void d(aunf aunfVar, aunc auncVar) {
        aunfVar.l(auncVar);
    }

    public static /* synthetic */ void e(aunf aunfVar, boolean z) {
        aunfVar.j(false);
    }

    public static /* synthetic */ void f(aunf aunfVar, aqpo aqpoVar) {
        aunfVar.m(aqpoVar);
    }

    public static /* synthetic */ void g(aunf aunfVar, int i) {
        aunfVar.n(i);
    }

    public static /* synthetic */ void h(aunf aunfVar, int i) {
        aunfVar.o(i);
    }

    public static /* synthetic */ void i(aunf aunfVar, aund aundVar) {
        aunfVar.p(aundVar);
    }

    public void j(boolean z) {
        this.c |= 64;
        this.i = false;
    }

    public void k(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    public void l(aunc auncVar) {
        this.h = auncVar.d;
        this.c |= 16;
    }

    public void m(aqpo aqpoVar) {
        aqpoVar.getClass();
        this.j = aqpoVar;
        this.c |= 256;
    }

    public void n(int i) {
        this.c |= 2;
        this.e = i;
    }

    public void o(int i) {
        this.c |= 4;
        this.f = i;
    }

    public void p(aund aundVar) {
        this.g = aundVar.d;
        this.c |= 8;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0007ဇ\u0006\tဉ\b", new Object[]{"c", "d", "e", "f", "g", aund.a(), "h", aunc.a(), "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aunf();
            case NEW_BUILDER:
                return new aune();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aunf.class) {
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
