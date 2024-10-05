package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class astw extends aonm implements aooz {
    public static final astw a;
    private static volatile aopf h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;

    static {
        astw astwVar = new astw();
        a = astwVar;
        aonm.registerDefaultInstance(astw.class, astwVar);
    }

    private astw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဂ\u0006", new Object[]{"b", "c", assi.m, "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new astw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (astw.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
