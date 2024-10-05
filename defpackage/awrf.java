package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awrf extends aonm implements aooz {
    public static final awrf a;
    private static volatile aopf b;
    private int c;
    private awqh d;
    private awnw e;
    private awnw f;
    private awnw g;
    private awnw h;
    private awra i;
    private awnw j;
    private awnw k;
    private awnw l;
    private awqn m;
    private awqi n;
    private byte o = 2;

    static {
        awrf awrfVar = new awrf();
        a = awrfVar;
        aonm.registerDefaultInstance(awrf.class, awrfVar);
    }

    private awrf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0014\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0004ᐉ\u0004\u0006ᐉ\u0006\bᐉ\b\nᐉ\n\u000bᐉ\u000b\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0012ᐉ\u0011\u0014ᐉ\u0012", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new awrf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awrf.class) {
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
