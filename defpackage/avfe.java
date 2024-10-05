package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avfe extends aonm implements aooz {
    private static final avfe a;
    private static volatile aopf b;
    private int c;
    private int d;
    private String e = "";

    static {
        avfe avfeVar = new avfe();
        a = avfeVar;
        aonm.registerDefaultInstance(avfe.class, avfeVar);
    }

    private avfe() {
    }

    public static avfd a() {
        return (avfd) a.createBuilder();
    }

    public static /* synthetic */ avfe b() {
        return a;
    }

    public void e(int i) {
        this.c |= 1;
        this.d = i;
    }

    public void f(String str) {
        str.getClass();
        this.c |= 4;
        this.e = str;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဈ\u0002", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avfe();
            case NEW_BUILDER:
                return new avfd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avfe.class) {
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
