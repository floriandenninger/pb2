package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class armc extends aonm implements aooz {
    public static final armc a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        armc armcVar = new armc();
        a = armcVar;
        aonm.registerDefaultInstance(armc.class, armcVar);
    }

    private armc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue809ᶳ\uf492䤳\u0002\u0000\u0000\u0002\ue809ᶳᐼ\u0000\uf492䤳ᐼ\u0000", new Object[]{"c", "b", apzx.class, aqrf.class});
            case NEW_MUTABLE_INSTANCE:
                return new armc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (armc.class) {
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
