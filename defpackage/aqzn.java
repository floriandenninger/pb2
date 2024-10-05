package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqzn extends aonm implements aooz {
    public static final aqzn a;
    private static volatile aopf g;
    public int b;
    public aqyg c;
    public aulq f;
    private aulq h;
    private aota i;
    private byte j = 2;
    public aomf d = aomf.b;
    public aony e = emptyProtobufList();

    static {
        aqzn aqznVar = new aqzn();
        a = aqznVar;
        aonm.registerDefaultInstance(aqzn.class, aqznVar);
    }

    private aqzn() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005Л\u0006ᐉ\u0004", new Object[]{"b", "c", "h", "i", "d", "e", aulq.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqzn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqzn.class) {
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
