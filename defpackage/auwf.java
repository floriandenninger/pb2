package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auwf extends aonm implements aooz {
    public static final auwf a;
    private static volatile aopf f;
    public int b;
    public aqyg c;
    public aulq d;
    private aqyg g;
    private aota h;
    private apxf i;
    private aulq j;
    private byte k = 2;
    public aomf e = aomf.b;

    static {
        auwf auwfVar = new auwf();
        a = auwfVar;
        aonm.registerDefaultInstance(auwf.class, auwfVar);
    }

    private auwf() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "g", "d", "h", "e", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new auwf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (auwf.class) {
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
