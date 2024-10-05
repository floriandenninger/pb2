package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dvi extends aonm implements aooz {
    private static final dvi a;
    private static volatile aopf b;
    private int c;
    private long e;
    private int m;
    private String d = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private String k = "";
    private aony l = emptyProtobufList();

    static {
        dvi dviVar = new dvi();
        a = dviVar;
        aonm.registerDefaultInstance(dvi.class, dviVar);
    }

    private dvi() {
    }

    public static dvf a() {
        return (dvf) a.createBuilder();
    }

    public static /* synthetic */ dvi b() {
        return a;
    }

    public void j(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    public void k(String str) {
        this.c |= 16;
        this.h = str;
    }

    public void l(String str) {
        this.c |= 1024;
        this.k = str;
    }

    public void m(String str) {
        str.getClass();
        this.c |= 8;
        this.g = str;
    }

    public void n(dvh dvhVar) {
        this.m = dvhVar.d;
        this.c |= 2048;
    }

    public void o(long j) {
        this.c |= 2;
        this.e = j;
    }

    public void p(String str) {
        str.getClass();
        this.c |= 4;
        this.f = str;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u000bဈ\n\rဌ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "k", "m", dvh.b()});
            case NEW_MUTABLE_INSTANCE:
                return new dvi();
            case NEW_BUILDER:
                return new dvf();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (dvi.class) {
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
