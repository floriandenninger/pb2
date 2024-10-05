package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aubn extends aonm implements aooz {
    public static final aubn a;
    private static volatile aopf e;
    public int b;
    public aqyg c;
    private byte f = 2;
    public aony d = emptyProtobufList();

    static {
        aubn aubnVar = new aubn();
        a = aubnVar;
        aonm.registerDefaultInstance(aubn.class, aubnVar);
    }

    private aubn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002ᐉ\u0001\u0003Л", new Object[]{"b", "c", "d", aubm.class});
            case NEW_MUTABLE_INSTANCE:
                return new aubn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aubn.class) {
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
