package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgw extends aonm implements aooz {
    public static final asgw a;
    private static volatile aopf b;
    private int c;
    private boolean d;

    static {
        asgw asgwVar = new asgw();
        a = asgwVar;
        aonm.registerDefaultInstance(asgw.class, asgwVar);
    }

    private asgw() {
    }

    public static /* synthetic */ void a(asgw asgwVar) {
        asgwVar.c |= 1;
        asgwVar.d = true;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new asgw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (asgw.class) {
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
