package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atmb extends aonm implements aooz {
    public static final atmb a;
    public static final aonk b;
    private static volatile aopf c;

    static {
        atmb atmbVar = new atmb();
        a = atmbVar;
        aonm.registerDefaultInstance(atmb.class, atmbVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, atmc.a, atmc.a, null, 94476261, aoqn.MESSAGE, atmc.class);
    }

    private atmb() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new atmb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (atmb.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
