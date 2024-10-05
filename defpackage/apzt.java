package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apzt extends aonm implements aooz {
    public static final apzt a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apzt apztVar = new apzt();
        a = apztVar;
        aonm.registerDefaultInstance(apzt.class, apztVar);
    }

    private apzt() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue952⒡\ue952⒡\u0001\u0000\u0000\u0001\ue952⒡ᐼ\u0000", new Object[]{"c", "b", auwh.class});
            case NEW_MUTABLE_INSTANCE:
                return new apzt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (apzt.class) {
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
