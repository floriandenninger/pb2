package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aunm extends aonm implements aooz {
    public static final aunm a;
    public static final aonk b;
    public static final aonk c;
    public static final aonk d;
    public static final aonk e;
    private static volatile aopf f;

    static {
        aunm aunmVar = new aunm();
        a = aunmVar;
        aonm.registerDefaultInstance(aunm.class, aunmVar);
        b = aonm.newSingularGeneratedExtension(aunn.a, false, null, null, 307091372, aoqn.BOOL, Boolean.class);
        c = aonm.newSingularGeneratedExtension(aunn.a, false, null, null, 308140915, aoqn.BOOL, Boolean.class);
        d = aonm.newSingularGeneratedExtension(aunn.a, 0, null, null, 320664538, aoqn.INT32, Integer.class);
        e = aonm.newSingularGeneratedExtension(aunn.a, 0, null, null, 338678567, aoqn.INT32, Integer.class);
    }

    private aunm() {
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
                return new aunm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aunm.class) {
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
