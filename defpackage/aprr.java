package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aprr extends aonm implements aooz {
    public static final aprr a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aprr aprrVar = new aprr();
        a = aprrVar;
        aonm.registerDefaultInstance(aprr.class, aprrVar);
    }

    private aprr() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue288䍆ﭟꨵ\u0002\u0000\u0000\u0002\ue288䍆ᐼ\u0000ﭟꨵᐼ\u0000", new Object[]{"c", "b", aprq.class, aprp.class});
            case NEW_MUTABLE_INSTANCE:
                return new aprr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aprr.class) {
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
