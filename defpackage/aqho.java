package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqho extends aonm implements aooz {
    public static final aqho a;
    private static volatile aopf b;
    private int c;
    private aqhn d;
    private aqhn e;
    private aqhn f;
    private byte g = 2;

    static {
        aqho aqhoVar = new aqho();
        a = aqhoVar;
        aonm.registerDefaultInstance(aqho.class, aqhoVar);
    }

    private aqho() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0000\u0000\u0003\u0007ᐉ\u0000\bᐉ\u0001\tᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqho();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqho.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
