package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atfv extends aonm implements aooz {
    private static final atfv a;
    private static volatile aopf b;
    private int c;
    private String d = "";
    private String e = "";

    static {
        atfv atfvVar = new atfv();
        a = atfvVar;
        aonm.registerDefaultInstance(atfv.class, atfvVar);
    }

    private atfv() {
    }

    public static atfu a() {
        return (atfu) a.createBuilder();
    }

    public static /* synthetic */ void c(atfv atfvVar, String str) {
        atfvVar.e(str);
    }

    public static /* synthetic */ void d(atfv atfvVar, String str) {
        atfvVar.f(str);
    }

    public void e(String str) {
        this.c |= 1;
        this.d = str;
    }

    public void f(String str) {
        this.c |= 2;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atfv();
            case NEW_BUILDER:
                return new atfu();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atfv.class) {
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
