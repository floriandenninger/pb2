package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arsq extends aonm implements aooz {
    public static final arsq a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public boolean d;
    public boolean f;
    public arsr g;
    private byte i = 2;
    public aony e = emptyProtobufList();

    static {
        arsq arsqVar = new arsq();
        a = arsqVar;
        aonm.registerDefaultInstance(arsq.class, arsqVar);
    }

    private arsq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0002\u0001ᐉ\u0000\u0003ဇ\u0001\u0004Л\u0006ဇ\u0003\bဉ\u0005", new Object[]{"b", "c", "d", "e", aovq.class, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arsq();
            case NEW_BUILDER:
                return new aone((char[][]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arsq.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
