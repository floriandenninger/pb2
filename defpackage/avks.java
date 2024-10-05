package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avks extends aonm implements aooz {
    public static final avks a;
    private static volatile aopf e;
    public aqyg b;
    public aqyg c;
    private int f;
    private byte g = 2;
    public aony d = emptyProtobufList();

    static {
        avks avksVar = new avks();
        a = avksVar;
        aonm.registerDefaultInstance(avks.class, avksVar);
    }

    private avks() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л", new Object[]{"f", "b", "c", "d", aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new avks();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (avks.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
