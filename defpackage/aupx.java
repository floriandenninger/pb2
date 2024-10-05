package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupx extends aonm implements aooz {
    public static final aupx a;
    private static volatile aopf e;
    public int b;
    public aqyg c;
    public int d;
    private apxf f;
    private byte g = 2;

    static {
        aupx aupxVar = new aupx();
        a = aupxVar;
        aonm.registerDefaultInstance(aupx.class, aupxVar);
    }

    private aupx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ဌ\u0002", new Object[]{"b", "f", "c", "d", aukz.u});
            case NEW_MUTABLE_INSTANCE:
                return new aupx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aupx.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
