package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avpq extends aonm implements aooz {
    public static final avpq a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apmh f;
    private apmh g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private apmh l;
    private apmh m;
    private apmh n;
    private aqyg o;
    private aqyg p;
    private apmh q;
    private aota r;
    private byte s = 2;

    static {
        avpq avpqVar = new avpq();
        a = avpqVar;
        aonm.registerDefaultInstance(avpq.class, avpqVar);
    }

    private avpq() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0012\u000f\u0000\u0000\u000f\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0010\tᐉ\u0005\nᐉ\u0006\u000bᐉ\u0007\fᐉ\b\rᐉ\t\u000eᐉ\n\u000fᐉ\u000b\u0010ᐉ\f\u0011ᐉ\r\u0012ᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "r", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new avpq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avpq.class) {
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
