package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxl extends aonm implements aooz {
    private static final avxl a;
    private static volatile aopf b;
    private int c = 0;
    private Object d;

    static {
        avxl avxlVar = new avxl();
        a = avxlVar;
        aonm.registerDefaultInstance(avxl.class, avxlVar);
    }

    private avxl() {
    }

    public static avxk a() {
        return (avxk) a.createBuilder();
    }

    public static /* synthetic */ void c(avxl avxlVar, avxj avxjVar) {
        avxlVar.d(avxjVar);
    }

    public void d(avxj avxjVar) {
        avxjVar.getClass();
        this.d = avxjVar;
        this.c = 1;
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"d", "c", avxj.class});
            case NEW_MUTABLE_INSTANCE:
                return new avxl();
            case NEW_BUILDER:
                return new avxk();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avxl.class) {
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
