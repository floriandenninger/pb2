package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqga extends aonm implements aooz {
    public static final aqga a;
    private static volatile aopf b;
    private int c;
    private aqgc d;
    private aqyg e;
    private aota f;
    private aqgb g;
    private apmh h;
    private aqyg i;
    private aqyg j;
    private byte k = 2;

    static {
        aqga aqgaVar = new aqga();
        a = aqgaVar;
        aonm.registerDefaultInstance(aqga.class, aqgaVar);
    }

    private aqga() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001ᐉ\t\u0003ᐉ\n\u0005ᐉ\u0007\u0006ᐉ\b\bᐉ\u0003\nᐉ\u0006\rᐉ\u0000", new Object[]{"c", "i", "j", "g", "h", "e", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqga();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqga.class) {
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
