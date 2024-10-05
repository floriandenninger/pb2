package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axeg extends aonm implements aooz {
    private static final axeg a;
    private static volatile aopf b;
    private int c;
    private String d = "";
    private float e;

    static {
        axeg axegVar = new axeg();
        a = axegVar;
        aonm.registerDefaultInstance(axeg.class, axegVar);
    }

    private axeg() {
    }

    public static axef a() {
        return (axef) a.createBuilder();
    }

    public static /* synthetic */ axeg b() {
        return a;
    }

    public void e(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    public void f(float f) {
        this.c |= 2;
        this.e = f;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new axeg();
            case NEW_BUILDER:
                return new axef();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axeg.class) {
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
