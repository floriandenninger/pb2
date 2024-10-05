package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnm extends aonm implements aooz {
    public static final arnm a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arnm arnmVar = new arnm();
        a = arnmVar;
        aonm.registerDefaultInstance(arnm.class, arnmVar);
    }

    private arnm() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf5a1㮗\ue470䘟\u0002\u0000\u0000\u0002\uf5a1㮗ᐼ\u0000\ue470䘟ᐼ\u0000", new Object[]{"c", "b", atfp.class, aqgr.class});
            case NEW_MUTABLE_INSTANCE:
                return new arnm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arnm.class) {
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
