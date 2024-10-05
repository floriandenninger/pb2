package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxo extends aonm implements aooz {
    public static final arxo a;
    private static volatile aopf g;
    public int b;
    public arnb c;
    public boolean f;
    private byte h = 2;
    public aony d = emptyProtobufList();
    public String e = "";

    static {
        arxo arxoVar = new arxo();
        a = arxoVar;
        aonm.registerDefaultInstance(arxo.class, arxoVar);
    }

    private arxo() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", arxu.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arxo();
            case NEW_BUILDER:
                return new aone((byte[][][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arxo.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
