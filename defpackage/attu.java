package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class attu extends aonm implements aooz {
    public static final attu a;
    private static volatile aopf f;
    public int b;
    public aqyg d;
    public avgg e;
    private byte g = 2;
    public aony c = emptyProtobufList();

    static {
        attu attuVar = new attu();
        a = attuVar;
        aonm.registerDefaultInstance(attu.class, attuVar);
    }

    private attu() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"b", "c", avgg.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new attu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (attu.class) {
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
