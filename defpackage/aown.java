package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aown extends aonm implements aooz {
    public static final aown a;
    private static volatile aopf e;
    public int b;
    public int c;
    public float d;

    static {
        aown aownVar = new aown();
        a = aownVar;
        aonm.registerDefaultInstance(aown.class, aownVar);
    }

    private aown() {
    }

    public static /* synthetic */ void a(aown aownVar) {
        aownVar.b |= 2;
        aownVar.d = 0.0f;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001", new Object[]{"b", "c", aouo.m, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aown();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aown.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
