package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awcj extends aonm implements aooz {
    public static final awcj a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awcj awcjVar = new awcj();
        a = awcjVar;
        aonm.registerDefaultInstance(awcj.class, awcjVar);
    }

    private awcj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf3bf៓\ue0ef㽪\u0004\u0000\u0000\u0004\uf3bf៓ᐼ\u0000ﱬ៓ᐼ\u0000\uea0c㪃ᐼ\u0000\ue0ef㽪ᐼ\u0000", new Object[]{"c", "b", awck.class, awdc.class, awcn.class, auxo.class});
            case NEW_MUTABLE_INSTANCE:
                return new awcj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awcj.class) {
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
