package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqfd extends aonm implements aooz {
    public static final aqfd a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apmh e;
    private aulq f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private apxf j;
    private aota k;
    private byte l = 2;

    static {
        aqfd aqfdVar = new aqfd();
        a = aqfdVar;
        aonm.registerDefaultInstance(aqfd.class, aqfdVar);
    }

    private aqfd() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\b\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\b\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\u000bᐉ\u0007\fᐉ\u0002", new Object[]{"c", "d", "e", "k", "g", "h", "i", "j", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqfd.class) {
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
