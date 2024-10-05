package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atwr extends aonm implements aooz {
    private static final atwr a;
    private static volatile aopf b;
    private int c;
    private String d = "";
    private aomf e = aomf.b;

    static {
        atwr atwrVar = new atwr();
        a = atwrVar;
        aonm.registerDefaultInstance(atwr.class, atwrVar);
    }

    private atwr() {
    }

    public static atwq a() {
        return (atwq) a.createBuilder();
    }

    public static /* synthetic */ atwr b() {
        return a;
    }

    public void e(String str) {
        this.c |= 1;
        this.d = str;
    }

    public void f(aomf aomfVar) {
        aomfVar.getClass();
        this.c |= 2;
        this.e = aomfVar;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atwr();
            case NEW_BUILDER:
                return new atwq();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atwr.class) {
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
