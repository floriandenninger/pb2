package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atux extends aonm implements aooz {
    public static final atux a;
    public static final aonk b;
    private static volatile aopf c;

    static {
        atux atuxVar = new atux();
        a = atuxVar;
        aonm.registerDefaultInstance(atux.class, atuxVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, atuxVar, atuxVar, null, 377026217, aoqn.MESSAGE, atux.class);
    }

    private atux() {
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
                return new atux();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (atux.class) {
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
