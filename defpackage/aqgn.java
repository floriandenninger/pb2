package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqgn extends aonh implements aoni {
    public static final aqgn a;
    private static volatile aopf d;
    private int e;
    private aota f;
    private byte g = 2;
    public aomf b = aomf.b;
    public aony c = emptyProtobufList();

    static {
        aqgn aqgnVar = new aqgn();
        a = aqgnVar;
        aonm.registerDefaultInstance(aqgn.class, aqgnVar);
    }

    private aqgn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ည\u0001\u0003Л", new Object[]{"e", "f", "b", "c", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqgn();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqgn.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
