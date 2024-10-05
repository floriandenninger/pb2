package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auxx extends aonm implements aooz {
    public static final auxx a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apmh f;
    private apmh g;
    private apmh h;
    private aqyg i;
    private apxf j;
    private aota k;
    private byte l = 2;

    static {
        auxx auxxVar = new auxx();
        a = auxxVar;
        aonm.registerDefaultInstance(auxx.class, auxxVar);
    }

    private auxx() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\b\u0011\b\u0000\u0000\b\bᐉ\u0007\tᐉ\t\nᐉ\n\u000bᐉ\u000b\fᐉ\f\rᐉ\u000e\u000fᐉ\u0010\u0011ᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "j", "k", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new auxx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (auxx.class) {
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
