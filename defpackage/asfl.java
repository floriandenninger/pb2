package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfl extends aonm implements aooz {
    public static final asfl a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asfl asflVar = new asfl();
        a = asflVar;
        aonm.registerDefaultInstance(asfl.class, asflVar);
    }

    private asfl() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue18f㻥\ue923䶡\u0002\u0000\u0000\u0002\ue18f㻥ᐼ\u0000\ue923䶡ᐼ\u0000", new Object[]{"c", "b", atqe.class, aqzh.class});
            case NEW_MUTABLE_INSTANCE:
                return new asfl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asfl.class) {
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
