package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auqk extends aonm implements aooz {
    public static final auqk a;
    private static volatile aopf e;
    public aqyg b;
    public boolean d;
    private int f;
    private aqyg g;
    private byte h = 2;
    public aony c = emptyProtobufList();

    static {
        auqk auqkVar = new auqk();
        a = auqkVar;
        aonm.registerDefaultInstance(auqk.class, auqkVar);
    }

    private auqk() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ᐉ\u0001\u0002Л\u0003ᐉ\u0000\u0004ဇ\u0002", new Object[]{"f", "g", "c", auqd.class, "b", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new auqk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (auqk.class) {
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
