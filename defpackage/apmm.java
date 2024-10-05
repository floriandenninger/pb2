package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apmm extends aonm implements aooz {
    public static final apmm a;
    private static volatile aopf b;
    private int c;
    private apmj d;
    private byte e = 2;

    static {
        apmm apmmVar = new apmm();
        a = apmmVar;
        aonm.registerDefaultInstance(apmm.class, apmmVar);
    }

    private apmm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uee86㲉\uee86㲉\u0001\u0000\u0000\u0001\uee86㲉ᐉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apmm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apmm.class) {
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
