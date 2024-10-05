package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avmq extends aonm implements aooz {
    public static final avmq a;
    private static volatile aopf f;
    public int b;
    public aurw d;
    private avms g;
    private aulq h;
    private aulq i;
    private aulq j;
    private aota k;
    private byte l = 2;
    public aony c = emptyProtobufList();
    public aony e = emptyProtobufList();

    static {
        avmq avmqVar = new avmq();
        a = avmqVar;
        aonm.registerDefaultInstance(avmq.class, avmqVar);
    }

    private avmq() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0002\u0007\u0001Л\u0004ᐉ\u0001\u0007\u001b\bᐉ\u0005\nᐉ\u0000\u000bᐉ\u0002\fᐉ\u0003\rᐉ\u0004", new Object[]{"b", "c", aurv.class, "d", "e", aurn.class, "k", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new avmq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avmq.class) {
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
