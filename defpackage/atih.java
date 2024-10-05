package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atih extends aonm implements aooz {
    public static final atih a;
    private static volatile aopf b;
    private int c;
    private aota d;
    private aulq e;
    private aqyg f;
    private aqyg g;
    private aulq h;
    private apxf i;
    private aulq j;
    private byte k = 2;

    static {
        atih atihVar = new atih();
        a = atihVar;
        aonm.registerDefaultInstance(atih.class, atihVar);
    }

    private atih() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0006\u0012\u0007\u0000\u0000\u0007\u0006ᐉ\u0001\u000bᐉ\u0002\fᐉ\u0003\rᐉ\u0004\u0010ᐉ\u0005\u0011ᐉ\u0006\u0012ᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atih();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atih.class) {
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
