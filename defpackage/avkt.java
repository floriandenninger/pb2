package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avkt extends aonm implements aooz {
    public static final avkt a;
    private static volatile aopf d;
    public aulq c;
    private int e;
    private aota f;
    private byte g = 2;
    public aony b = emptyProtobufList();

    static {
        avkt avktVar = new avkt();
        a = avktVar;
        aonm.registerDefaultInstance(avkt.class, avktVar);
    }

    private avkt() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"e", "b", aulq.class, "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avkt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avkt.class) {
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
