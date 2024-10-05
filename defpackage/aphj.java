package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aphj extends aonm implements aooz {
    public static final aphj a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private apxf h;
    private aryr i;
    private aqyg j;
    private aota k;
    private asnj l;
    private apmn m;
    private atdf n;
    private byte o = 2;

    static {
        aphj aphjVar = new aphj();
        a = aphjVar;
        aonm.registerDefaultInstance(aphj.class, aphjVar);
    }

    private aphj() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u0010\u000b\u0000\u0000\u000b\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\n\nᐉ\u000b\fᐉ\r\u000eᐉ\u000f\u000fᐉ\u0007\u0010ᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "i", "j", "k", "l", "n", "h", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aphj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aphj.class) {
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
