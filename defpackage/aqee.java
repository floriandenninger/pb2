package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqee extends aonm implements aooz {
    public static final aqee a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apmh e;
    private apxf f;
    private apmh g;
    private aqyg h;
    private aqyg i;
    private apmh j;
    private apmh k;
    private aqyg l;
    private aqyg m;
    private aqyg n;
    private aqeh o;
    private aqef p;
    private apmh q;
    private aota r;
    private byte s = 2;

    static {
        aqee aqeeVar = new aqee();
        a = aqeeVar;
        aonm.registerDefaultInstance(aqee.class, aqeeVar);
    }

    private aqee() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000e\rᐉ\u0003\u000eᐉ\u000b\u000fᐉ\f\u0010ᐉ\r", new Object[]{"c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "r", "g", "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new aqee();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqee.class) {
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
