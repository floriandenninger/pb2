package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awcc extends aonm implements aooz {
    public static final awcc a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awcc awccVar = new awcc();
        a = awccVar;
        aonm.registerDefaultInstance(awcc.class, awccVar);
    }

    private awcc() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue113㪐\uf492䤳\u0003\u0000\u0000\u0003\ue113㪐ᐼ\u0000ￛ㸼ᐼ\u0000\uf492䤳ᐼ\u0000", new Object[]{"c", "b", awcl.class, auxq.class, aqrf.class});
            case NEW_MUTABLE_INSTANCE:
                return new awcc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awcc.class) {
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
