package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfd extends aonm implements aooz {
    public static final asfd a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asfd asfdVar = new asfd();
        a = asfdVar;
        aonm.registerDefaultInstance(asfd.class, asfdVar);
    }

    private asfd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf897ᢰ\ue1ab㯆\u0004\u0000\u0000\u0004\uf897ᢰᐼ\u0000\uf8afᢰᐼ\u0000\uedf1㣊ᐼ\u0000\ue1ab㯆ᐼ\u0000", new Object[]{"c", "b", aseu.class, asev.class, arag.class, asep.class});
            case NEW_MUTABLE_INSTANCE:
                return new asfd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asfd.class) {
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
