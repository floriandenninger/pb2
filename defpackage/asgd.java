package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgd extends aonm implements aooz {
    public static final asgd a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asgd asgdVar = new asgd();
        a = asgdVar;
        aonm.registerDefaultInstance(asgd.class, asgdVar);
    }

    private asgd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf321Ẑ黎䄊\u0004\u0000\u0000\u0004\uf321Ẑᐼ\u0000\uf437Ἳᐼ\u0000ﮜ\u2dd7ᐼ\u0000黎䄊ᐼ\u0000", new Object[]{"c", "b", aqdt.class, awhq.class, atnc.class, aspb.class});
            case NEW_MUTABLE_INSTANCE:
                return new asgd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asgd.class) {
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
