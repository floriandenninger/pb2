package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avux extends aonm implements aooz {
    private static final avux a;
    private static volatile aopf b;
    private int c;
    private Object e;
    private int g;
    private int h;
    private int d = 0;
    private String f = "";

    static {
        avux avuxVar = new avux();
        a = avuxVar;
        aonm.registerDefaultInstance(avux.class, avuxVar);
    }

    private avux() {
    }

    public static avuv a() {
        return (avuv) a.createBuilder();
    }

    public static /* synthetic */ avux b() {
        return a;
    }

    public void g(avut avutVar) {
        this.g = avutVar.h;
        this.c |= 2;
    }

    public void h(String str) {
        str.getClass();
        this.c |= 1;
        this.f = str;
    }

    public void i(avuu avuuVar) {
        this.h = avuuVar.f;
        this.c |= 4;
    }

    public void j(avuw avuwVar) {
        avuwVar.getClass();
        this.e = avuwVar;
        this.d = 3;
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ဌ\u0002", new Object[]{"e", "d", "c", "f", "g", avut.a(), avuw.class, "h", avuu.a()});
            case NEW_MUTABLE_INSTANCE:
                return new avux();
            case NEW_BUILDER:
                return new avuv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avux.class) {
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
