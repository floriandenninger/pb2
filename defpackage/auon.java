package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auon extends aonm implements aooz {
    public static final auon a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        auon auonVar = new auon();
        a = auonVar;
        aonm.registerDefaultInstance(auon.class, auonVar);
    }

    private auon() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue908㋉\uebb7㟫\u0002\u0000\u0000\u0002\ue908㋉ᐼ\u0000\uebb7㟫ᐼ\u0000", new Object[]{"c", "b", auok.class, atlv.class});
            case NEW_MUTABLE_INSTANCE:
                return new auon();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (auon.class) {
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
