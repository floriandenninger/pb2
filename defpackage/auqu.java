package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auqu extends aonm implements aooz {
    public static final auqu a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apxf f;
    private auqs g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aota k;
    private byte l = 2;

    static {
        auqu auquVar = new auqu();
        a = auquVar;
        aonm.registerDefaultInstance(auqu.class, auquVar);
    }

    private auqu() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\b\u0007ᐉ\t\bᐉ\n\u000bᐉ\u0005\rᐉ\u000b", new Object[]{"c", "d", "e", "f", "h", "i", "j", "g", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new auqu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (auqu.class) {
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
