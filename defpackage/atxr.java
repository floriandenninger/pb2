package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atxr extends aonm implements aooz {
    private static final atxr a;
    private static volatile aopf b;
    private int c;
    private String d = "";
    private float e;
    private float f;

    static {
        atxr atxrVar = new atxr();
        a = atxrVar;
        aonm.registerDefaultInstance(atxr.class, atxrVar);
    }

    private atxr() {
    }

    public static atxq a() {
        return (atxq) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        this.c |= 1;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(float f) {
        this.c |= 4;
        this.f = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f) {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atxr();
            case NEW_BUILDER:
                return new atxq();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atxr.class) {
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
