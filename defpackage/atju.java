package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atju extends aonh implements aoni {
    public static final atju a;
    private static volatile aopf b;
    private int c;
    private atjv d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private atdf h;
    private aota i;
    private atjt j;
    private byte k = 2;

    static {
        atju atjuVar = new atju();
        a = atjuVar;
        aonm.registerDefaultInstance(atju.class, atjuVar);
    }

    private atju() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\u0006\tᐉ\u0005\u000bᐉ\t", new Object[]{"c", "d", "e", "f", "g", "i", "h", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atju();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atju.class) {
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
