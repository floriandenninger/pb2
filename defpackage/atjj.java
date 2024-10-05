package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atjj extends aonh implements aoni {
    public static final atjj a;
    private static volatile aopf b;
    private int c;
    private atjk d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private asnj h;
    private atdf i;
    private aota j;
    private aqyg k;
    private atji m;
    private byte n = 2;

    static {
        atjj atjjVar = new atjj();
        a = atjjVar;
        aonm.registerDefaultInstance(atjj.class, atjjVar);
    }

    private atjj() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\b\tᐉ\u0005\u000bᐉ\u0007\rᐉ\u000b\u0010ᐉ\r", new Object[]{"c", "d", "e", "f", "g", "j", "h", "i", "k", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new atjj();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atjj.class) {
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
