package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqwd extends aonm implements aooz {
    public static final aqwd a;
    private static volatile aopf b;
    private int c;
    private aqwb d;
    private byte e = 2;

    static {
        aqwd aqwdVar = new aqwd();
        a = aqwdVar;
        aonm.registerDefaultInstance(aqwd.class, aqwdVar);
    }

    private aqwd() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf828ᢍ\uf828ᢍ\u0001\u0000\u0000\u0001\uf828ᢍᐉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqwd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqwd.class) {
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
