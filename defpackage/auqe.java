package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auqe extends aonm implements aooz {
    public static final auqe a;
    private static volatile aopf f;
    public int b;
    public int c;
    public aqyg d;
    private aota g;
    private byte h = 2;
    public aony e = emptyProtobufList();

    static {
        auqe auqeVar = new auqe();
        a = auqeVar;
        aonm.registerDefaultInstance(auqe.class, auqeVar);
    }

    private auqe() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001ဌ\u0000\u0002ᐉ\u0001\u0003Л\u0005ᐉ\u0002", new Object[]{"b", "c", auqy.a, "d", "e", auqk.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new auqe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (auqe.class) {
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
