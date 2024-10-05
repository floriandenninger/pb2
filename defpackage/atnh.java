package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atnh extends aonm implements aooz {
    public static final atnh a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public String d = "";

    static {
        atnh atnhVar = new atnh();
        a = atnhVar;
        aonm.registerDefaultInstance(atnh.class, atnhVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, atnhVar, atnhVar, null, 251308734, aoqn.MESSAGE, atnh.class);
    }

    private atnh() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new atnh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (atnh.class) {
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
