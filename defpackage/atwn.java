package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atwn extends aonm implements aooz {
    private static final aonv a = new atpn(4);
    private static final atwn b;
    private static volatile aopf c;
    private aonu d = emptyIntList();

    static {
        atwn atwnVar = new atwn();
        b = atwnVar;
        aonm.registerDefaultInstance(atwn.class, atwnVar);
    }

    private atwn() {
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
                return newMessageInfo(b, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new atwn();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (atwn.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
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
