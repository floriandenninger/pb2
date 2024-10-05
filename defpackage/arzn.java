package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arzn extends aonm implements aooz {
    public static final arzn a;
    private static volatile aopf f;
    public int b;
    public arnd c;
    public arzo e;
    private aota g;
    private aulp h;
    private byte i = 2;
    public aomf d = aomf.b;

    static {
        arzn arznVar = new arzn();
        a = arznVar;
        aonm.registerDefaultInstance(arzn.class, arznVar);
    }

    private arzn() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0001\u0007ည\u0002", new Object[]{"b", "c", "e", "h", "g", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new arzn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arzn.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
