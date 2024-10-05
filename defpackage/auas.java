package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auas extends aonm implements aooz {
    public static final auas a;
    private static volatile aopf b;
    private int c;
    private apxf d;
    private apxf e;
    private apxf f;
    private aqyg g;
    private aqyg h;
    private auda i;
    private auat j;
    private aota k;
    private byte l = 2;

    static {
        auas auasVar = new auas();
        a = auasVar;
        aonm.registerDefaultInstance(auas.class, auasVar);
    }

    private auas() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\r\b\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000b\rᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new auas();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (auas.class) {
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
