package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avyj extends aonm implements aooz {
    public static final avyj a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private avyk e;
    private apxf f;
    private aqyg g;
    private apxf h;
    private aota i;
    private byte j = 2;

    static {
        avyj avyjVar = new avyj();
        a = avyjVar;
        aonm.registerDefaultInstance(avyj.class, avyjVar);
    }

    private avyj() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0004\u000f\u0006\u0000\u0000\u0006\u0004ᐉ\u0003\u0006ᐉ\u0005\u000bᐉ\u0007\fᐉ\b\rᐉ\t\u000fᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new avyj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avyj.class) {
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
