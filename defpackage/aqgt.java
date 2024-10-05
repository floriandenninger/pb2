package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqgt extends aonm implements aooz {
    public static final aqgt a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqgt aqgtVar = new aqgt();
        a = aqgtVar;
        aonm.registerDefaultInstance(aqgt.class, aqgtVar);
    }

    private aqgt() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue80a⺣\ue80a⺣\u0001\u0000\u0000\u0001\ue80a⺣ᐼ\u0000", new Object[]{"c", "b", apzd.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqgt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqgt.class) {
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
