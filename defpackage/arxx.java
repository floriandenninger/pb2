package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxx extends aonm implements aooz {
    public static final arxx a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        arxx arxxVar = new arxx();
        a = arxxVar;
        aonm.registerDefaultInstance(arxx.class, arxxVar);
    }

    private arxx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf096Თ嗢㷌\u0005\u0000\u0000\u0000\uf096Თြ\u0000︙ḭြ\u0000\uf24eḳြ\u0000\uf1b4⥶ြ\u0000嗢㷌ြ\u0000", new Object[]{"c", "b", atxz.class, atxw.class, atxx.class, atxv.class, atxy.class});
            case NEW_MUTABLE_INSTANCE:
                return new arxx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arxx.class) {
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
