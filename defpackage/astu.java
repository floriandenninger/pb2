package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class astu extends aonm implements aooz {
    public static final astu a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public aulq d;
    public aulq e;
    public aulq f;
    public aqyg h;
    public aulq i;
    private byte k = 2;
    public aony g = emptyProtobufList();

    static {
        astu astuVar = new astu();
        a = astuVar;
        aonm.registerDefaultInstance(astu.class, astuVar);
    }

    private astu() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0007\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0005\bᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", aulq.class, "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new astu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (astu.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
