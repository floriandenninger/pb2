package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arbc extends aonm implements aooz {
    public static final arbc a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aqyg d;
    public avgg e;
    public arba f;
    private aqyg i;
    private byte j = 2;
    public aony g = emptyProtobufList();

    static {
        arbc arbcVar = new arbc();
        a = arbcVar;
        aonm.registerDefaultInstance(arbc.class, arbcVar);
    }

    private arbc() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0004\u0005\u001b\u0006ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g", arbb.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arbc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arbc.class) {
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
