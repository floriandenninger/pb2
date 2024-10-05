package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atvu extends aonm implements aooz {
    public static final atvu a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atvu atvuVar = new atvu();
        a = atvuVar;
        aonm.registerDefaultInstance(atvu.class, atvuVar);
    }

    private atvu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf3e4\u2e6e\uf174韏\u0004\u0000\u0000\u0003\uf3e4\u2e6eᐼ\u0000\uf3fbヺᐼ\u0000祥䌤ᐼ\u0000\uf174韏ြ\u0000", new Object[]{"c", "b", atmn.class, arej.class, avrs.class, avru.class});
            case NEW_MUTABLE_INSTANCE:
                return new atvu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atvu.class) {
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
