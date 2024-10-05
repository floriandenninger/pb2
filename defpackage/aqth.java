package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqth extends aonm implements aooz {
    public static final aqth a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqth aqthVar = new aqth();
        a = aqthVar;
        aonm.registerDefaultInstance(aqth.class, aqthVar);
    }

    private aqth() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue856㊰搜䞻\u0003\u0000\u0000\u0001\ue856㊰ᐼ\u0000ﾼ㌡ြ\u0000搜䞻ြ\u0000", new Object[]{"c", "b", aqtg.class, aqti.class, aqtj.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqth();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqth.class) {
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
