package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arrp extends aonm implements aooz {
    public static final arrp a;
    private static volatile aopf e;
    public Object c;
    public arnd d;
    private int f;
    public int b = 0;
    private byte g = 2;

    static {
        arrp arrpVar = new arrp();
        a = arrpVar;
        aonm.registerDefaultInstance(arrp.class, arrpVar);
    }

    private arrp() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000", new Object[]{"c", "b", "f", "d", apxf.class, apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new arrp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (arrp.class) {
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
