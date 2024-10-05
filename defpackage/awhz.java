package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhz extends aonm implements aooz {
    public static final awhz a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public String d = "";
    public boolean e;

    static {
        awhz awhzVar = new awhz();
        a = awhzVar;
        aonm.registerDefaultInstance(awhz.class, awhzVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, awhzVar, awhzVar, null, 291, aoqn.MESSAGE, awhz.class);
    }

    private awhz() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awhz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awhz.class) {
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
