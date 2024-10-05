package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avtf extends aonm implements aooz {
    public static final avtf a;
    private static volatile aopf f;
    public int b;
    public avta c;
    public int d;
    public int e;

    static {
        avtf avtfVar = new avtf();
        a = avtfVar;
        aonm.registerDefaultInstance(avtf.class, avtfVar);
    }

    private avtf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဌ\u0003", new Object[]{"b", "c", "d", avtr.a(), "e", avhw.t});
            case NEW_MUTABLE_INSTANCE:
                return new avtf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avtf.class) {
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
