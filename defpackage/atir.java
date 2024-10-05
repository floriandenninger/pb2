package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atir extends aonm implements aooz {
    public static final atir a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aulq i;
    private aulq j;
    private aulq k;
    private aulq l;
    private aulq m;
    private aulq n;
    private aota o;
    private apxf p;
    private byte q = 2;

    static {
        atir atirVar = new atir();
        a = atirVar;
        aonm.registerDefaultInstance(atir.class, atirVar);
    }

    private atir() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0006\u0004ᐉ\b\u0005ᐉ\t\u0006ᐉ\n\u0007ᐉ\u000b\tᐉ\u0004\nᐉ\u0005\rᐉ\u0001\u000eᐉ\r\u000fᐉ\u0003\u0010ᐉ\u0007", new Object[]{"c", "d", "f", "j", "l", "m", "n", "o", "h", "i", "e", "p", "g", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new atir();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atir.class) {
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
