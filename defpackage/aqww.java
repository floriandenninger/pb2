package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqww extends aonm implements aooz {
    private static final aqww a;
    private static volatile aopf b;
    private int c;
    private aqwy e;
    private aqwx f;
    private int g;
    private int h;
    private String d = "";
    private String i = "";

    static {
        aqww aqwwVar = new aqww();
        a = aqwwVar;
        aonm.registerDefaultInstance(aqww.class, aqwwVar);
    }

    private aqww() {
    }

    public static aqwv a() {
        return (aqwv) a.createBuilder();
    }

    public static /* synthetic */ void c(aqww aqwwVar, String str) {
        aqwwVar.k(str);
    }

    public static /* synthetic */ void d(aqww aqwwVar, aqxl aqxlVar) {
        aqwwVar.l(aqxlVar);
    }

    public static /* synthetic */ void e(aqww aqwwVar, int i) {
        aqwwVar.h(i);
    }

    public static /* synthetic */ void f(aqww aqwwVar, aqwy aqwyVar) {
        aqwwVar.i(aqwyVar);
    }

    public static /* synthetic */ void g(aqww aqwwVar, aqwx aqwxVar) {
        aqwwVar.j(aqwxVar);
    }

    public void h(int i) {
        this.c |= 16;
        this.h = i;
    }

    public void i(aqwy aqwyVar) {
        aqwyVar.getClass();
        this.e = aqwyVar;
        this.c |= 2;
    }

    public void j(aqwx aqwxVar) {
        this.f = aqwxVar;
        this.c |= 4;
    }

    public void k(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    public void l(aqxl aqxlVar) {
        this.g = aqxlVar.r;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005င\u0004", new Object[]{"c", "d", "e", "f", "g", aqxl.a(), "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqww();
            case NEW_BUILDER:
                return new aqwv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqww.class) {
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
