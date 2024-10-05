package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awfi extends aonm implements aooz {
    private static final awfi a;
    private static volatile aopf b;
    private int c;
    private int d;
    private long e;
    private int g;
    private int h;
    private long i;
    private int j;
    private String f = "";
    private String k = "";

    static {
        awfi awfiVar = new awfi();
        a = awfiVar;
        aonm.registerDefaultInstance(awfi.class, awfiVar);
    }

    private awfi() {
    }

    public static awfh a() {
        return (awfh) a.createBuilder();
    }

    public static /* synthetic */ awfi b() {
        return a;
    }

    public void k(String str) {
        str.getClass();
        this.c |= 512;
        this.k = str;
    }

    public void l(String str) {
        str.getClass();
        this.c |= 8;
        this.f = str;
    }

    public void m(long j) {
        this.c |= 64;
        this.i = j;
    }

    public void n(long j) {
        this.c |= 2;
        this.e = j;
    }

    public void o(int i) {
        this.c |= 16;
        this.g = i;
    }

    public void p(int i) {
        this.c |= 32;
        this.h = i;
    }

    public void q(awfk awfkVar) {
        this.j = awfkVar.f;
        this.c |= 256;
    }

    public void r(awfj awfjVar) {
        this.d = awfjVar.y;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005င\u0004\u0006ဂ\u0006\bဌ\b\tဈ\t\nင\u0005", new Object[]{"c", "d", awfj.a(), "e", "f", "g", "i", "j", awfk.a(), "k", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awfi();
            case NEW_BUILDER:
                return new awfh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awfi.class) {
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
