package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apkr extends aonm implements aooz {
    public static final apkr a;
    private static volatile aopf f;
    public boolean b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        apkr apkrVar = new apkr();
        a = apkrVar;
        aonm.registerDefaultInstance(apkr.class, apkrVar);
    }

    private apkr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0001\u0002င\u0002\u0003င\u0003\u0004ဇ\u0000", new Object[]{"g", "c", "d", "e", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new apkr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apkr.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
