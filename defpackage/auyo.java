package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auyo extends aonm implements aooz {
    public static final auyo a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public int d;
    public String e = "";

    static {
        auyo auyoVar = new auyo();
        a = auyoVar;
        aonm.registerDefaultInstance(auyo.class, auyoVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, auyoVar, auyoVar, null, 355549603, aoqn.MESSAGE, auyo.class);
    }

    private auyo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", auye.d, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new auyo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (auyo.class) {
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
